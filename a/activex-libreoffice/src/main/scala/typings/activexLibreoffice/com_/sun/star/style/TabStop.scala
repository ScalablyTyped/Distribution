package typings.activexLibreoffice.com_.sun.star.style

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This structure is used to specify a single tabulator stop. */
trait TabStop extends js.Object {
  /** This field specifies the alignment of the text range before the tabulator. */
  var Alignment: TabAlign
  /** This field specifies which delimiter is used for the decimal. */
  var DecimalChar: String
  /** This field specifies the character that is used to fill up the space between the text in the text range and the tabulators. */
  var FillChar: String
  /** This field specifies the position of the tabulator in relation to the left border. */
  var Position: Double
}

object TabStop {
  @scala.inline
  def apply(Alignment: TabAlign, DecimalChar: String, FillChar: String, Position: Double): TabStop = {
    val __obj = js.Dynamic.literal(Alignment = Alignment.asInstanceOf[js.Any], DecimalChar = DecimalChar.asInstanceOf[js.Any], FillChar = FillChar.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabStop]
  }
}

