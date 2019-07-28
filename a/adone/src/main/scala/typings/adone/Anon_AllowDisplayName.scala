package typings.adone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowDisplayName extends js.Object {
  /**
    * Whether to allow email addresses with display names ("Name <local@domain>"")
    */
  var allowDisplayName: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to allow UTF8 characters in the local part
    */
  var allowUtf8LocalPart: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to require display name
    */
  var requireDisplayName: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to require top-level domain, default `true`
    */
  var requireTld: js.UndefOr[Boolean] = js.undefined
}

object Anon_AllowDisplayName {
  @scala.inline
  def apply(
    allowDisplayName: js.UndefOr[Boolean] = js.undefined,
    allowUtf8LocalPart: js.UndefOr[Boolean] = js.undefined,
    requireDisplayName: js.UndefOr[Boolean] = js.undefined,
    requireTld: js.UndefOr[Boolean] = js.undefined
  ): Anon_AllowDisplayName = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowDisplayName)) __obj.updateDynamic("allowDisplayName")(allowDisplayName)
    if (!js.isUndefined(allowUtf8LocalPart)) __obj.updateDynamic("allowUtf8LocalPart")(allowUtf8LocalPart)
    if (!js.isUndefined(requireDisplayName)) __obj.updateDynamic("requireDisplayName")(requireDisplayName)
    if (!js.isUndefined(requireTld)) __obj.updateDynamic("requireTld")(requireTld)
    __obj.asInstanceOf[Anon_AllowDisplayName]
  }
}

