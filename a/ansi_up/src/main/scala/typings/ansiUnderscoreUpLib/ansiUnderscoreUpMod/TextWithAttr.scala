package typings
package ansiUnderscoreUpLib.ansiUnderscoreUpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextWithAttr extends js.Object {
  var bg: AU_Color
  var bold: scala.Boolean
  var fg: AU_Color
  var text: java.lang.String
}

object TextWithAttr {
  @scala.inline
  def apply(bg: AU_Color, bold: scala.Boolean, fg: AU_Color, text: java.lang.String): TextWithAttr = {
    val __obj = js.Dynamic.literal(bg = bg, bold = bold, fg = fg, text = text)
  
    __obj.asInstanceOf[TextWithAttr]
  }
}

