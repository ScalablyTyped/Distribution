package typings.awsSdk.clientsPanoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListApplicationInstancesResponse extends StObject {
  
  /**
    * A list of application instances.
    */
  var ApplicationInstances: js.UndefOr[typings.awsSdk.clientsPanoramaMod.ApplicationInstances] = js.undefined
  
  /**
    * A pagination token that's included if more results are available.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsPanoramaMod.NextToken] = js.undefined
}
object ListApplicationInstancesResponse {
  
  inline def apply(): ListApplicationInstancesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListApplicationInstancesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListApplicationInstancesResponse] (val x: Self) extends AnyVal {
    
    inline def setApplicationInstances(value: ApplicationInstances): Self = StObject.set(x, "ApplicationInstances", value.asInstanceOf[js.Any])
    
    inline def setApplicationInstancesUndefined: Self = StObject.set(x, "ApplicationInstances", js.undefined)
    
    inline def setApplicationInstancesVarargs(value: ApplicationInstance*): Self = StObject.set(x, "ApplicationInstances", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
