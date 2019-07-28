package typings.ansiDashStyles.escapeDashCodeMod.EscapeCodeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorType extends js.Object {
  /**
    * 16 color ansi code
    */
  var ansi: Conversions
  /**
    * truecolor(16 million color) ansi code
    */
  var ansi16m: Conversions
  /**
    * 256 color ansi code
    */
  var ansi256: Conversions
}

object ColorType {
  @scala.inline
  def apply(ansi: Conversions, ansi16m: Conversions, ansi256: Conversions): ColorType = {
    val __obj = js.Dynamic.literal(ansi = ansi, ansi16m = ansi16m, ansi256 = ansi256)
  
    __obj.asInstanceOf[ColorType]
  }
}

