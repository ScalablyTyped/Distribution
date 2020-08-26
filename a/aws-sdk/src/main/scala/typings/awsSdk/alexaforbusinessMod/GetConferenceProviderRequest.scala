package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetConferenceProviderRequest extends js.Object {
  /**
    * The ARN of the newly created conference provider.
    */
  var ConferenceProviderArn: Arn = js.native
}

object GetConferenceProviderRequest {
  @scala.inline
  def apply(ConferenceProviderArn: Arn): GetConferenceProviderRequest = {
    val __obj = js.Dynamic.literal(ConferenceProviderArn = ConferenceProviderArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConferenceProviderRequest]
  }
  @scala.inline
  implicit class GetConferenceProviderRequestOps[Self <: GetConferenceProviderRequest] (val x: Self) extends AnyVal {
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
  }
  
}

