package typings
package acmeDashClientLib.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Authorization extends HasStatus {
  var challenges: js.Array[Challenge]
  var expires: js.UndefOr[java.lang.String] = js.undefined
  var identifier: Identifier
  @JSName("status")
  var status_Authorization: acmeDashClientLib.acmeDashClientLibStrings.pending | acmeDashClientLib.acmeDashClientLibStrings.valid | acmeDashClientLib.acmeDashClientLibStrings.invalid | acmeDashClientLib.acmeDashClientLibStrings.deactivated | acmeDashClientLib.acmeDashClientLibStrings.expired | acmeDashClientLib.acmeDashClientLibStrings.revoked
  var url: java.lang.String
  var wildcard: js.UndefOr[scala.Boolean] = js.undefined
}

object Authorization {
  @scala.inline
  def apply(
    challenges: js.Array[Challenge],
    identifier: Identifier,
    status: acmeDashClientLib.acmeDashClientLibStrings.pending | acmeDashClientLib.acmeDashClientLibStrings.valid | acmeDashClientLib.acmeDashClientLibStrings.invalid | acmeDashClientLib.acmeDashClientLibStrings.deactivated | acmeDashClientLib.acmeDashClientLibStrings.expired | acmeDashClientLib.acmeDashClientLibStrings.revoked,
    url: java.lang.String,
    expires: java.lang.String = null,
    wildcard: js.UndefOr[scala.Boolean] = js.undefined
  ): Authorization = {
    val __obj = js.Dynamic.literal(challenges = challenges, identifier = identifier, status = status.asInstanceOf[js.Any], url = url)
    if (expires != null) __obj.updateDynamic("expires")(expires)
    if (!js.isUndefined(wildcard)) __obj.updateDynamic("wildcard")(wildcard)
    __obj.asInstanceOf[Authorization]
  }
}

