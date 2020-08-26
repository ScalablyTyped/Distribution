package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateConferenceProviderRequest extends js.Object {
  /**
    * The ARN of the conference provider.
    */
  var ConferenceProviderArn: Arn = js.native
  /**
    * The type of the conference provider.
    */
  var ConferenceProviderType: typings.awsSdk.alexaforbusinessMod.ConferenceProviderType = js.native
  /**
    * The IP endpoint and protocol for calling.
    */
  var IPDialIn: js.UndefOr[typings.awsSdk.alexaforbusinessMod.IPDialIn] = js.native
  /**
    * The meeting settings for the conference provider.
    */
  var MeetingSetting: typings.awsSdk.alexaforbusinessMod.MeetingSetting = js.native
  /**
    * The information for PSTN conferencing.
    */
  var PSTNDialIn: js.UndefOr[typings.awsSdk.alexaforbusinessMod.PSTNDialIn] = js.native
}

object UpdateConferenceProviderRequest {
  @scala.inline
  def apply(
    ConferenceProviderArn: Arn,
    ConferenceProviderType: ConferenceProviderType,
    MeetingSetting: MeetingSetting
  ): UpdateConferenceProviderRequest = {
    val __obj = js.Dynamic.literal(ConferenceProviderArn = ConferenceProviderArn.asInstanceOf[js.Any], ConferenceProviderType = ConferenceProviderType.asInstanceOf[js.Any], MeetingSetting = MeetingSetting.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConferenceProviderRequest]
  }
  @scala.inline
  implicit class UpdateConferenceProviderRequestOps[Self <: UpdateConferenceProviderRequest] (val x: Self) extends AnyVal {
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
    def setConferenceProviderArn(value: Arn): Self = this.set("ConferenceProviderArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setConferenceProviderType(value: ConferenceProviderType): Self = this.set("ConferenceProviderType", value.asInstanceOf[js.Any])
    @scala.inline
    def setMeetingSetting(value: MeetingSetting): Self = this.set("MeetingSetting", value.asInstanceOf[js.Any])
    @scala.inline
    def setIPDialIn(value: IPDialIn): Self = this.set("IPDialIn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIPDialIn: Self = this.set("IPDialIn", js.undefined)
    @scala.inline
    def setPSTNDialIn(value: PSTNDialIn): Self = this.set("PSTNDialIn", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePSTNDialIn: Self = this.set("PSTNDialIn", js.undefined)
  }
  
}

