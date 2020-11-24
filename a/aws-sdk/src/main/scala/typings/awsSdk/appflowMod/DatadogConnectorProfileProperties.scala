package typings.awsSdk.appflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatadogConnectorProfileProperties extends js.Object {
  
  /**
    *  The location of the Datadog resource. 
    */
  var instanceUrl: InstanceUrl = js.native
}
object DatadogConnectorProfileProperties {
  
  @scala.inline
  def apply(instanceUrl: InstanceUrl): DatadogConnectorProfileProperties = {
    val __obj = js.Dynamic.literal(instanceUrl = instanceUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatadogConnectorProfileProperties]
  }
  
  @scala.inline
  implicit class DatadogConnectorProfilePropertiesOps[Self <: DatadogConnectorProfileProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInstanceUrl(value: InstanceUrl): Self = this.set("instanceUrl", value.asInstanceOf[js.Any])
  }
}
