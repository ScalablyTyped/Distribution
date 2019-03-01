package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Invisibles extends js.Object {
  /**
    *  Character used to render carriage return characters (for Microsoft-style line
    *  endings) when the `Show Invisibles` setting is enabled.
    */
  var cr: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  /**
    *  Character used to render newline characters (\n) when the `Show Invisibles`
    *  setting is enabled.
    */
  var eol: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  /**
    *  Character used to render leading and trailing space characters when the
    *  `Show Invisibles` setting is enabled.
    */
  var space: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  /**
    *  Character used to render hard tab characters (\t) when the `Show Invisibles`
    *  setting is enabled.
    */
  var tab: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
}

object Invisibles {
  @scala.inline
  def apply(
    cr: scala.Boolean | java.lang.String = null,
    eol: scala.Boolean | java.lang.String = null,
    space: scala.Boolean | java.lang.String = null,
    tab: scala.Boolean | java.lang.String = null
  ): Invisibles = {
    val __obj = js.Dynamic.literal()
    if (cr != null) __obj.updateDynamic("cr")(cr.asInstanceOf[js.Any])
    if (eol != null) __obj.updateDynamic("eol")(eol.asInstanceOf[js.Any])
    if (space != null) __obj.updateDynamic("space")(space.asInstanceOf[js.Any])
    if (tab != null) __obj.updateDynamic("tab")(tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[Invisibles]
  }
}

