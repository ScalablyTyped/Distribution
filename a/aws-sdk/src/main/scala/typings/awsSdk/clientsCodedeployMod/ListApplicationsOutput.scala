package typings.awsSdk.clientsCodedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListApplicationsOutput extends StObject {
  
  /**
    * A list of application names.
    */
  var applications: js.UndefOr[ApplicationsList] = js.undefined
  
  /**
    * If a large amount of information is returned, an identifier is also returned. It can be used in a subsequent list applications call to return the next set of applications in the list.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListApplicationsOutput {
  
  inline def apply(): ListApplicationsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListApplicationsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListApplicationsOutput] (val x: Self) extends AnyVal {
    
    inline def setApplications(value: ApplicationsList): Self = StObject.set(x, "applications", value.asInstanceOf[js.Any])
    
    inline def setApplicationsUndefined: Self = StObject.set(x, "applications", js.undefined)
    
    inline def setApplicationsVarargs(value: ApplicationName*): Self = StObject.set(x, "applications", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
