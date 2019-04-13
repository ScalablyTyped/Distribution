package typings
package awsDashSdkLib.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListIdentitiesResponse extends js.Object {
  /**
    * A list of identities.
    */
  var Identities: IdentityList
  /**
    * The token used for pagination.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object ListIdentitiesResponse {
  @scala.inline
  def apply(Identities: IdentityList, NextToken: NextToken = null): ListIdentitiesResponse = {
    val __obj = js.Dynamic.literal(Identities = Identities)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListIdentitiesResponse]
  }
}

