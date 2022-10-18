package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VeevaConnectorProfileProperties extends StObject {
  
  /**
    *  The location of the Veeva resource. 
    */
  var instanceUrl: InstanceUrl
}
object VeevaConnectorProfileProperties {
  
  inline def apply(instanceUrl: InstanceUrl): VeevaConnectorProfileProperties = {
    val __obj = js.Dynamic.literal(instanceUrl = instanceUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[VeevaConnectorProfileProperties]
  }
  
  extension [Self <: VeevaConnectorProfileProperties](x: Self) {
    
    inline def setInstanceUrl(value: InstanceUrl): Self = StObject.set(x, "instanceUrl", value.asInstanceOf[js.Any])
  }
}
