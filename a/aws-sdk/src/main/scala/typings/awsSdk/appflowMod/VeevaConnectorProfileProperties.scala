package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VeevaConnectorProfileProperties extends StObject {
  
  /**
    *  The location of the Veeva resource. 
    */
  var instanceUrl: InstanceUrl = js.native
}
object VeevaConnectorProfileProperties {
  
  @scala.inline
  def apply(instanceUrl: InstanceUrl): VeevaConnectorProfileProperties = {
    val __obj = js.Dynamic.literal(instanceUrl = instanceUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[VeevaConnectorProfileProperties]
  }
  
  @scala.inline
  implicit class VeevaConnectorProfilePropertiesMutableBuilder[Self <: VeevaConnectorProfileProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceUrl(value: InstanceUrl): Self = StObject.set(x, "instanceUrl", value.asInstanceOf[js.Any])
  }
}
