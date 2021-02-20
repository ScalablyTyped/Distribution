package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceNowConnectorProfileProperties extends StObject {
  
  /**
    *  The location of the ServiceNow resource. 
    */
  var instanceUrl: InstanceUrl = js.native
}
object ServiceNowConnectorProfileProperties {
  
  @scala.inline
  def apply(instanceUrl: InstanceUrl): ServiceNowConnectorProfileProperties = {
    val __obj = js.Dynamic.literal(instanceUrl = instanceUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceNowConnectorProfileProperties]
  }
  
  @scala.inline
  implicit class ServiceNowConnectorProfilePropertiesMutableBuilder[Self <: ServiceNowConnectorProfileProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceUrl(value: InstanceUrl): Self = StObject.set(x, "instanceUrl", value.asInstanceOf[js.Any])
  }
}
