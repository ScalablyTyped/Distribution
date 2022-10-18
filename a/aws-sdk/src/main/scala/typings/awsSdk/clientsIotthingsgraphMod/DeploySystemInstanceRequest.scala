package typings.awsSdk.clientsIotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploySystemInstanceRequest extends StObject {
  
  /**
    * The ID of the system instance. This value is returned by the CreateSystemInstance action. The ID should be in the following format.  urn:tdm:REGION/ACCOUNT ID/default:deployment:DEPLOYMENTNAME 
    */
  var id: js.UndefOr[Urn] = js.undefined
}
object DeploySystemInstanceRequest {
  
  inline def apply(): DeploySystemInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploySystemInstanceRequest]
  }
  
  extension [Self <: DeploySystemInstanceRequest](x: Self) {
    
    inline def setId(value: Urn): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
