package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceNowConnectorProfileProperties extends StObject {
  
  /**
    *  The location of the ServiceNow resource. 
    */
  var instanceUrl: InstanceUrl
}
object ServiceNowConnectorProfileProperties {
  
  inline def apply(instanceUrl: InstanceUrl): ServiceNowConnectorProfileProperties = {
    val __obj = js.Dynamic.literal(instanceUrl = instanceUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceNowConnectorProfileProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServiceNowConnectorProfileProperties] (val x: Self) extends AnyVal {
    
    inline def setInstanceUrl(value: InstanceUrl): Self = StObject.set(x, "instanceUrl", value.asInstanceOf[js.Any])
  }
}
