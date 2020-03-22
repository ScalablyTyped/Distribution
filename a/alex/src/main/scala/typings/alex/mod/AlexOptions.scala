package typings.alex.mod

import typings.alex.alexNumbers.`0`
import typings.alex.alexNumbers.`1`
import typings.alex.alexNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlexOptions extends js.Object {
  /** an array of rules (the default is []) */
  var allow: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * When turned on (`true`), pairs such as `he` and `she` and `garbageman` or `garbagewoman` are seen as errors.
    * When turned off (`false`, the default), such pairs are okay
    */
  var noBinary: js.UndefOr[Boolean] = js.undefined
  /**
    * the minimum rating (including) that you want to check for.
    * If you set it to 1 (maybe) then it will warn for level 1 and 2 (likely) profanities,
    * but not for level 0 (unlikely).
    */
  var profanitySureness: js.UndefOr[`0` | `1` | `2`] = js.undefined
}

object AlexOptions {
  @scala.inline
  def apply(
    allow: js.Array[String] = null,
    noBinary: js.UndefOr[Boolean] = js.undefined,
    profanitySureness: `0` | `1` | `2` = null
  ): AlexOptions = {
    val __obj = js.Dynamic.literal()
    if (allow != null) __obj.updateDynamic("allow")(allow.asInstanceOf[js.Any])
    if (!js.isUndefined(noBinary)) __obj.updateDynamic("noBinary")(noBinary.asInstanceOf[js.Any])
    if (profanitySureness != null) __obj.updateDynamic("profanitySureness")(profanitySureness.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlexOptions]
  }
}

