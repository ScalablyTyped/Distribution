package typings.awsDashSdk.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderMatchMethod extends js.Object {
  /**
    * The header value sent by the client must match the specified value exactly.
    */
  var exact: js.UndefOr[HeaderMatch] = js.undefined
  /**
    * The header value sent by the client must begin with the specified characters.
    */
  var prefix: js.UndefOr[HeaderMatch] = js.undefined
  /**
    * The object that specifies the range of numbers within which the header value sent by the client
    must be included.
    */
  var range: js.UndefOr[MatchRange] = js.undefined
  /**
    * The header value sent by the client must include the specified characters.
    */
  var regex: js.UndefOr[HeaderMatch] = js.undefined
  /**
    * The header value sent by the client must end with the specified characters.
    */
  var suffix: js.UndefOr[HeaderMatch] = js.undefined
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
    if (exact != null) __obj.updateDynamic("exact")(exact)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (range != null) __obj.updateDynamic("range")(range)
    if (regex != null) __obj.updateDynamic("regex")(regex)
    if (suffix != null) __obj.updateDynamic("suffix")(suffix)
    __obj.asInstanceOf[HeaderMatchMethod]
  }
}

