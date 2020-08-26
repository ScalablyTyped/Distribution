package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConferencePreference extends js.Object {
  /**
    * The ARN of the default conference provider.
    */
  var DefaultConferenceProviderArn: js.UndefOr[Arn] = js.native
}

object ConferencePreference {
  @scala.inline
  def apply(): ConferencePreference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConferencePreference]
  }
  @scala.inline
  implicit class ConferencePreferenceOps[Self <: ConferencePreference] (val x: Self) extends AnyVal {
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
    def setDefaultConferenceProviderArn(value: Arn): Self = this.set("DefaultConferenceProviderArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultConferenceProviderArn: Self = this.set("DefaultConferenceProviderArn", js.undefined)
  }
  
}

