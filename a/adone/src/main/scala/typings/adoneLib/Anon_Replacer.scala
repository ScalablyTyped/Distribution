package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_Replacer extends js.Object {
  /**
                   * Wheter to append a newline
                   */
  var newline: js.UndefOr[scala.Boolean] = js.undefined
  /**
                   * A function that alters the behavior of the stringification process,
                   * or an array of String and Number objects that serve as a whitelist
                   * for selecting/filtering the properties of the value object to be included in the JSON string
                   */
  var replacer: js.UndefOr[adoneLib.adoneNs.dataNs.jsonNs.INs.Replacer] = js.undefined
  /**
                   * A String or Number object that's used to insert white space into the output JSON string for readability purposes
                   */
  var space: js.UndefOr[java.lang.String] = js.undefined
}

