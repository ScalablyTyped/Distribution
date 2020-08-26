package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlexaForBusinessMetadata extends js.Object {
  /**
    * The ARN of the room resource.
    */
  var AlexaForBusinessRoomArn: js.UndefOr[SensitiveString] = js.native
  /**
    * Starts or stops Alexa for Business.
    */
  var IsAlexaForBusinessEnabled: js.UndefOr[Boolean] = js.native
}

object AlexaForBusinessMetadata {
  @scala.inline
  def apply(): AlexaForBusinessMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlexaForBusinessMetadata]
  }
  @scala.inline
  implicit class AlexaForBusinessMetadataOps[Self <: AlexaForBusinessMetadata] (val x: Self) extends AnyVal {
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
    def setAlexaForBusinessRoomArn(value: SensitiveString): Self = this.set("AlexaForBusinessRoomArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlexaForBusinessRoomArn: Self = this.set("AlexaForBusinessRoomArn", js.undefined)
    @scala.inline
    def setIsAlexaForBusinessEnabled(value: Boolean): Self = this.set("IsAlexaForBusinessEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsAlexaForBusinessEnabled: Self = this.set("IsAlexaForBusinessEnabled", js.undefined)
  }
  
}

