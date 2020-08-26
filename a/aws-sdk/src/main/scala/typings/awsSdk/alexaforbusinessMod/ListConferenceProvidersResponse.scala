package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListConferenceProvidersResponse extends js.Object {
  /**
    * The conference providers.
    */
  var ConferenceProviders: js.UndefOr[ConferenceProvidersList] = js.native
  /**
    * The tokens used for pagination.
    */
  var NextToken: js.UndefOr[typings.awsSdk.alexaforbusinessMod.NextToken] = js.native
}

object ListConferenceProvidersResponse {
  @scala.inline
  def apply(): ListConferenceProvidersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListConferenceProvidersResponse]
  }
  @scala.inline
  implicit class ListConferenceProvidersResponseOps[Self <: ListConferenceProvidersResponse] (val x: Self) extends AnyVal {
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
    def setConferenceProvidersVarargs(value: ConferenceProvider*): Self = this.set("ConferenceProviders", js.Array(value :_*))
    @scala.inline
    def setConferenceProviders(value: ConferenceProvidersList): Self = this.set("ConferenceProviders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConferenceProviders: Self = this.set("ConferenceProviders", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

