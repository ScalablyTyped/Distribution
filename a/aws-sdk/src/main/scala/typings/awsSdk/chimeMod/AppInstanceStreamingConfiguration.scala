package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppInstanceStreamingConfiguration extends js.Object {
  
  /**
    * The data type of the app instance.
    */
  var AppInstanceDataType: typings.awsSdk.chimeMod.AppInstanceDataType = js.native
  
  /**
    * The resource ARN.
    */
  var ResourceArn: Arn = js.native
}
object AppInstanceStreamingConfiguration {
  
  @scala.inline
  def apply(AppInstanceDataType: AppInstanceDataType, ResourceArn: Arn): AppInstanceStreamingConfiguration = {
    val __obj = js.Dynamic.literal(AppInstanceDataType = AppInstanceDataType.asInstanceOf[js.Any], ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppInstanceStreamingConfiguration]
  }
  
  @scala.inline
  implicit class AppInstanceStreamingConfigurationOps[Self <: AppInstanceStreamingConfiguration] (val x: Self) extends AnyVal {
    
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
    def setAppInstanceDataType(value: AppInstanceDataType): Self = this.set("AppInstanceDataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceArn(value: Arn): Self = this.set("ResourceArn", value.asInstanceOf[js.Any])
  }
}
