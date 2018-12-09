package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_ReplacerCmp extends js.Object {
  /**
                   * Custom comparison function for object keys
                   */
  var cmp: js.UndefOr[adoneLib.adoneNs.dataNs.jsonNs.INs.CompareFunction] = js.undefined
  /**
                   * Whether to allow circular JSON structure
                   */
  var cycles: js.UndefOr[scala.Boolean] = js.undefined
  /**
                   * A function that alters the behavior of the stringification process,
                   * or an array of String and Number objects that serve as a whitelist
                   * for selecting/filtering the properties of the value object to be included in the JSON string
                   */
  var replacer: js.UndefOr[adoneLib.adoneNs.dataNs.jsonNs.INs.Replacer] = js.undefined
  /**
                   * Indent spaces for pretty-printing
                   */
  var space: js.UndefOr[java.lang.String] = js.undefined
}

