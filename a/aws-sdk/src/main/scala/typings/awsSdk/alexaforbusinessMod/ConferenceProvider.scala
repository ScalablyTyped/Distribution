package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConferenceProvider extends js.Object {
  /**
    * The ARN of the newly created conference provider.
    */
  var Arn: js.UndefOr[typings.awsSdk.alexaforbusinessMod.Arn] = js.native
  /**
    * The IP endpoint and protocol for calling.
    */
  var IPDialIn: js.UndefOr[typings.awsSdk.alexaforbusinessMod.IPDialIn] = js.native
  /**
    * The meeting settings for the conference provider.
    */
  var MeetingSetting: js.UndefOr[typings.awsSdk.alexaforbusinessMod.MeetingSetting] = js.native
  /**
    * The name of the conference provider.
    */
  var Name: js.UndefOr[ConferenceProviderName] = js.native
  /**
    * The information for PSTN conferencing.
    */
  var PSTNDialIn: js.UndefOr[typings.awsSdk.alexaforbusinessMod.PSTNDialIn] = js.native
  /**
    * The type of conference providers.
    */
  var Type: js.UndefOr[ConferenceProviderType] = js.native
}

object ConferenceProvider {
  @scala.inline
  def apply(): ConferenceProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConferenceProvider]
  }
  @scala.inline
  implicit class ConferenceProviderOps[Self <: ConferenceProvider] (val x: Self) extends AnyVal {
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
    def setArn(value: Arn): Self = this.set("Arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    @scala.inline
    def setIPDialIn(value: IPDialIn): Self = this.set("IPDialIn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIPDialIn: Self = this.set("IPDialIn", js.undefined)
    @scala.inline
    def setMeetingSetting(value: MeetingSetting): Self = this.set("MeetingSetting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeetingSetting: Self = this.set("MeetingSetting", js.undefined)
    @scala.inline
    def setName(value: ConferenceProviderName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setPSTNDialIn(value: PSTNDialIn): Self = this.set("PSTNDialIn", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePSTNDialIn: Self = this.set("PSTNDialIn", js.undefined)
    @scala.inline
    def setType(value: ConferenceProviderType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
  
}

