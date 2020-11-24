package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAppInstanceStreamingConfigurationsResponse extends js.Object {
  
  /**
    * The streaming settings.
    */
  var AppInstanceStreamingConfigurations: js.UndefOr[AppInstanceStreamingConfigurationList] = js.native
}
object GetAppInstanceStreamingConfigurationsResponse {
  
  @scala.inline
  def apply(): GetAppInstanceStreamingConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAppInstanceStreamingConfigurationsResponse]
  }
  
  @scala.inline
  implicit class GetAppInstanceStreamingConfigurationsResponseOps[Self <: GetAppInstanceStreamingConfigurationsResponse] (val x: Self) extends AnyVal {
    
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
