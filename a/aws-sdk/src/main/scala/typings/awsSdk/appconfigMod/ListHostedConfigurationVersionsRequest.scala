package typings.awsSdk.appconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListHostedConfigurationVersionsRequest extends js.Object {
  /**
    * The application ID.
    */
  var ApplicationId: Id = js.native
  /**
    * The configuration profile ID.
    */
  var ConfigurationProfileId: Id = js.native
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.appconfigMod.MaxResults] = js.native
  /**
    * A token to start the list. Use this token to get the next set of results. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.appconfigMod.NextToken] = js.native
}

object ListHostedConfigurationVersionsRequest {
  @scala.inline
  def apply(ApplicationId: Id, ConfigurationProfileId: Id): ListHostedConfigurationVersionsRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], ConfigurationProfileId = ConfigurationProfileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListHostedConfigurationVersionsRequest]
  }
  @scala.inline
  implicit class ListHostedConfigurationVersionsRequestOps[Self <: ListHostedConfigurationVersionsRequest] (val x: Self) extends AnyVal {
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
    def setApplicationId(value: Id): Self = this.set("ApplicationId", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfigurationProfileId(value: Id): Self = this.set("ConfigurationProfileId", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

