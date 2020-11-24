package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutAppInstanceStreamingConfigurationsRequest extends js.Object {
  
  /**
    * The ARN of the app instance.
    */
  var AppInstanceArn: ChimeArn = js.native
  
  /**
    * The streaming configurations set for an app instance.
    */
  var AppInstanceStreamingConfigurations: AppInstanceStreamingConfigurationList = js.native
}
object PutAppInstanceStreamingConfigurationsRequest {
  
  @scala.inline
  def apply(
    AppInstanceArn: ChimeArn,
    AppInstanceStreamingConfigurations: AppInstanceStreamingConfigurationList
  ): PutAppInstanceStreamingConfigurationsRequest = {
    val __obj = js.Dynamic.literal(AppInstanceArn = AppInstanceArn.asInstanceOf[js.Any], AppInstanceStreamingConfigurations = AppInstanceStreamingConfigurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutAppInstanceStreamingConfigurationsRequest]
  }
  
  @scala.inline
  implicit class PutAppInstanceStreamingConfigurationsRequestOps[Self <: PutAppInstanceStreamingConfigurationsRequest] (val x: Self) extends AnyVal {
    
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
    def setAppInstanceArn(value: ChimeArn): Self = this.set("AppInstanceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppInstanceStreamingConfigurationsVarargs(value: AppInstanceStreamingConfiguration*): Self = this.set("AppInstanceStreamingConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setAppInstanceStreamingConfigurations(value: AppInstanceStreamingConfigurationList): Self = this.set("AppInstanceStreamingConfigurations", value.asInstanceOf[js.Any])
  }
}
