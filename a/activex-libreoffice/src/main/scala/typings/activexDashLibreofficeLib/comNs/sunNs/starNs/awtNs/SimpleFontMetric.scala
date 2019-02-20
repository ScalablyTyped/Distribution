package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** describes the general metrics of a certain font. */
trait SimpleFontMetric extends js.Object {
  /**
    * specifies the portion of a lower case character that rises above the height of the character "x" of the font.
    *
    * For example, the letters "b", "d", "h", "k" and "l" have an ascent unequal to 0.
    *
    * The ascent is measured in pixels, thus the font metric is device dependent.
    */
  var Ascent: scala.Double
  /**
    * specifies the portion of a letter falling below the baseline.
    *
    * For example, the letters "g", "p", and "y" have a descent unequal to 0.
    *
    * The descent is measured in pixels, thus the font metric is device dependent.
    */
  var Descent: scala.Double
  /** specifies the code of the first printable character in the font. */
  var FirstChar: java.lang.String
  /** specifies the code of the last printable character in the font. */
  var LastChar: java.lang.String
  /**
    * specifies the vertical space between lines of this font; it is also called internal line spacing.
    *
    * The leading is measured in pixels, thus the font metric is device dependent.
    */
  var Leading: scala.Double
  /**
    * specifies the slant of the characters (italic).
    *
    * The slant is measured in degrees from 0 to 359.
    */
  var Slant: scala.Double
}

