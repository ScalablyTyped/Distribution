package typings.awsDashSdk.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListEmailIdentitiesResponse extends js.Object {
  /**
    * An array that includes all of the identities associated with your Amazon Pinpoint account.
    */
  var EmailIdentities: js.UndefOr[IdentityInfoList] = js.undefined
  /**
    * A token that indicates that there are additional configuration sets to list. To view additional configuration sets, issue another request to ListEmailIdentities, and pass this token in the NextToken parameter.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsPinpointemailMod.NextToken] = js.undefined
}

object ListEmailIdentitiesResponse {
  @scala.inline
  def apply(EmailIdentities: IdentityInfoList = null, NextToken: NextToken = null): ListEmailIdentitiesResponse = {
    val __obj = js.Dynamic.literal()
    if (EmailIdentities != null) __obj.updateDynamic("EmailIdentities")(EmailIdentities)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListEmailIdentitiesResponse]
  }
}

