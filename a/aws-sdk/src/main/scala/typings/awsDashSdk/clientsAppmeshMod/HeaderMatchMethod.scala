package typings.awsDashSdk.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeaderMatchMethod extends js.Object {
  /**
    * The value sent by the client must match the specified value exactly.
    */
  var exact: js.UndefOr[HeaderMatch] = js.native
  /**
    * The value sent by the client must begin with the specified characters.
    */
  var prefix: js.UndefOr[HeaderMatch] = js.native
  /**
    * An object that represents the range of values to match on.
    */
  var range: js.UndefOr[MatchRange] = js.native
  /**
    * The value sent by the client must include the specified characters.
    */
  var regex: js.UndefOr[HeaderMatch] = js.native
  /**
    * The value sent by the client must end with the specified characters.
    */
  var suffix: js.UndefOr[HeaderMatch] = js.native
}

object HeaderMatchMethod {
  @scala.inline
  def apply(
    exact: HeaderMatch = null,
    prefix: HeaderMatch = null,
    range: MatchRange = null,
    regex: HeaderMatch = null,
    suffix: HeaderMatch = null
  ): HeaderMatchMethod = {
    val __obj = js.Dynamic.literal()
    if (exact != null) __obj.updateDynamic("exact")(exact.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (regex != null) __obj.updateDynamic("regex")(regex.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderMatchMethod]
  }
}

