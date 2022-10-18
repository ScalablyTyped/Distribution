package typings.awsSdk.clientsCodedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListApplicationsInput extends StObject {
  
  /**
    * An identifier returned from the previous list applications call. It can be used to return the next set of applications in the list.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListApplicationsInput {
  
  inline def apply(): ListApplicationsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListApplicationsInput]
  }
  
  extension [Self <: ListApplicationsInput](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
