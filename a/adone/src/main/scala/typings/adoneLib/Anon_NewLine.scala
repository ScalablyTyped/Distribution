package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NewLine extends js.Object {
  var newLine: js.UndefOr[java.lang.String] = js.undefined
}

trait Anon_Newline extends js.Object {
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

object Anon_NewLine {
  @scala.inline
  def apply(newLine: java.lang.String = null): Anon_NewLine = {
    val __obj = js.Dynamic.literal()
    if (newLine != null) __obj.updateDynamic("newLine")(newLine)
    __obj.asInstanceOf[Anon_NewLine]
  }
}

object Anon_Newline {
  @scala.inline
  def apply(
    newline: js.UndefOr[scala.Boolean] = js.undefined,
    replacer: adoneLib.adoneNs.dataNs.jsonNs.INs.Replacer = null,
    space: java.lang.String = null
  ): Anon_Newline = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(newline)) __obj.updateDynamic("newline")(newline)
    if (replacer != null) __obj.updateDynamic("replacer")(replacer.asInstanceOf[js.Any])
    if (space != null) __obj.updateDynamic("space")(space)
    __obj.asInstanceOf[Anon_Newline]
  }
}

