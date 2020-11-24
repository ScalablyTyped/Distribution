package typings.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessLogSettings extends js.Object {
  
  /**
    * The ARN of the CloudWatch Logs log group to receive access logs.
    */
  var DestinationArn: js.UndefOr[Arn] = js.native
  
  /**
    * A single line format of the access logs of data, as specified by selected $context variables. The format must include at least $context.requestId.
    */
  var Format: js.UndefOr[StringWithLengthBetween1And1024] = js.native
}
object AccessLogSettings {
  
  @scala.inline
  def apply(): AccessLogSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessLogSettings]
  }
  
  @scala.inline
  implicit class AccessLogSettingsOps[Self <: AccessLogSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDestinationArn(value: Arn): Self = this.set("DestinationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationArn: Self = this.set("DestinationArn", js.undefined)
    
    @scala.inline
    def setFormat(value: StringWithLengthBetween1And1024): Self = this.set("Format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("Format", js.undefined)
  }
}
