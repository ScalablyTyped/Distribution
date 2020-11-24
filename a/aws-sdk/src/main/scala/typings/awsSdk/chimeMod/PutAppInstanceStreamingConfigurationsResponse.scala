package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutAppInstanceStreamingConfigurationsResponse extends js.Object {
  
  /**
    * The streaming configurations of an app instance.
    */
  var AppInstanceStreamingConfigurations: js.UndefOr[AppInstanceStreamingConfigurationList] = js.native
}
object PutAppInstanceStreamingConfigurationsResponse {
  
  @scala.inline
  def apply(): PutAppInstanceStreamingConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutAppInstanceStreamingConfigurationsResponse]
  }
  
  @scala.inline
  implicit class PutAppInstanceStreamingConfigurationsResponseOps[Self <: PutAppInstanceStreamingConfigurationsResponse] (val x: Self) extends AnyVal {
    
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
    def setAppInstanceStreamingConfigurationsVarargs(value: AppInstanceStreamingConfiguration*): Self = this.set("AppInstanceStreamingConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setAppInstanceStreamingConfigurations(value: AppInstanceStreamingConfigurationList): Self = this.set("AppInstanceStreamingConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppInstanceStreamingConfigurations: Self = this.set("AppInstanceStreamingConfigurations", js.undefined)
  }
}
