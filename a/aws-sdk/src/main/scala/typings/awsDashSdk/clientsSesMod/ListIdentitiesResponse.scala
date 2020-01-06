package typings.awsDashSdk.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListIdentitiesResponse extends js.Object {
  /**
    * A list of identities.
    */
  var Identities: IdentityList = js.native
  /**
    * The token used for pagination.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSesMod.NextToken] = js.native
}

object ListIdentitiesResponse {
  @scala.inline
  def apply(Identities: IdentityList, NextToken: NextToken = null): ListIdentitiesResponse = {
    val __obj = js.Dynamic.literal(Identities = Identities.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIdentitiesResponse]
  }
}

