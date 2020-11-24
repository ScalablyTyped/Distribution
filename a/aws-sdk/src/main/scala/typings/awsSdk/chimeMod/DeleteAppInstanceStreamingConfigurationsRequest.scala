package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteAppInstanceStreamingConfigurationsRequest extends js.Object {
  
  /**
    * The ARN of the streaming configurations being deleted.
    */
  var AppInstanceArn: ChimeArn = js.native
}
object DeleteAppInstanceStreamingConfigurationsRequest {
  
  @scala.inline
  def apply(AppInstanceArn: ChimeArn): DeleteAppInstanceStreamingConfigurationsRequest = {
    val __obj = js.Dynamic.literal(AppInstanceArn = AppInstanceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAppInstanceStreamingConfigurationsRequest]
  }
  
  @scala.inline
  implicit class DeleteAppInstanceStreamingConfigurationsRequestOps[Self <: DeleteAppInstanceStreamingConfigurationsRequest] (val x: Self) extends AnyVal {
    
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
  }
}
