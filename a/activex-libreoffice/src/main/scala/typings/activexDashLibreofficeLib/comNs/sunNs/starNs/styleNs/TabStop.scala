package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This structure is used to specify a single tabulator stop. */
trait TabStop extends js.Object {
  /** This field specifies the alignment of the text range before the tabulator. */
  var Alignment: TabAlign
  /** This field specifies which delimiter is used for the decimal. */
  var DecimalChar: java.lang.String
  /** This field specifies the character that is used to fill up the space between the text in the text range and the tabulators. */
  var FillChar: java.lang.String
  /** This field specifies the position of the tabulator in relation to the left border. */
  var Position: scala.Double
}

object TabStop {
  @scala.inline
  def apply(
    Alignment: TabAlign,
    DecimalChar: java.lang.String,
    FillChar: java.lang.String,
    Position: scala.Double
  ): TabStop = {
    val __obj = js.Dynamic.literal(Alignment = Alignment, DecimalChar = DecimalChar, FillChar = FillChar, Position = Position)
  
    __obj.asInstanceOf[TabStop]
  }
}

