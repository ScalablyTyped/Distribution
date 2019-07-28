package typings.acmeDashClient.clientMod

import typings.acmeDashClient.acmeDashClientStrings.deactivated
import typings.acmeDashClient.acmeDashClientStrings.expired
import typings.acmeDashClient.acmeDashClientStrings.invalid
import typings.acmeDashClient.acmeDashClientStrings.pending
import typings.acmeDashClient.acmeDashClientStrings.revoked
import typings.acmeDashClient.acmeDashClientStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Authorization extends HasStatus {
  var challenges: js.Array[Challenge]
  var expires: js.UndefOr[String] = js.undefined
  var identifier: Identifier
  @JSName("status")
  var status_Authorization: pending | valid | invalid | deactivated | expired | revoked
  var url: String
  var wildcard: js.UndefOr[Boolean] = js.undefined
}

object Authorization {
  @scala.inline
  def apply(
    challenges: js.Array[Challenge],
    identifier: Identifier,
    status: pending | valid | invalid | deactivated | expired | revoked,
    url: String,
    expires: String = null,
    wildcard: js.UndefOr[Boolean] = js.undefined
  ): Authorization = {
    val __obj = js.Dynamic.literal(challenges = challenges, identifier = identifier, status = status.asInstanceOf[js.Any], url = url)
    if (expires != null) __obj.updateDynamic("expires")(expires)
    if (!js.isUndefined(wildcard)) __obj.updateDynamic("wildcard")(wildcard)
    __obj.asInstanceOf[Authorization]
  }
}

