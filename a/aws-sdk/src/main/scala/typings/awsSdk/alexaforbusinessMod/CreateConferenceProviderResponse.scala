package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateConferenceProviderResponse extends js.Object {
  /**
    * The ARN of the newly-created conference provider.
    */
  var ConferenceProviderArn: js.UndefOr[Arn] = js.native
}

object CreateConferenceProviderResponse {
  @scala.inline
  def apply(): CreateConferenceProviderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateConferenceProviderResponse]
  }
  @scala.inline
  implicit class CreateConferenceProviderResponseOps[Self <: CreateConferenceProviderResponse] (val x: Self) extends AnyVal {
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
    def deleteConferenceProviderArn: Self = this.set("ConferenceProviderArn", js.undefined)
  }
  
}

