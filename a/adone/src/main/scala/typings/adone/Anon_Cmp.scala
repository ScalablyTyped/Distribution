package typings.adone

import typings.adone.adoneNs.dataNs.jsonNs.INs.CompareFunction
import typings.adone.adoneNs.dataNs.jsonNs.INs.Replacer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cmp extends js.Object {
  /**
    * Custom comparison function for object keys
    */
  var cmp: js.UndefOr[CompareFunction] = js.undefined
  /**
    * Whether to allow circular JSON structure
    */
  var cycles: js.UndefOr[Boolean] = js.undefined
  /**
    * A function that alters the behavior of the stringification process,
    * or an array of String and Number objects that serve as a whitelist
    * for selecting/filtering the properties of the value object to be included in the JSON string
    */
  var replacer: js.UndefOr[Replacer] = js.undefined
  /**
    * Indent spaces for pretty-printing
    */
  var space: js.UndefOr[String] = js.undefined
}

object Anon_Cmp {
  @scala.inline
  def apply(
    cmp: CompareFunction = null,
    cycles: js.UndefOr[Boolean] = js.undefined,
    replacer: Replacer = null,
    space: String = null
  ): Anon_Cmp = {
    val __obj = js.Dynamic.literal()
    if (cmp != null) __obj.updateDynamic("cmp")(cmp)
    if (!js.isUndefined(cycles)) __obj.updateDynamic("cycles")(cycles)
    if (replacer != null) __obj.updateDynamic("replacer")(replacer.asInstanceOf[js.Any])
    if (space != null) __obj.updateDynamic("space")(space)
    __obj.asInstanceOf[Anon_Cmp]
  }
}

