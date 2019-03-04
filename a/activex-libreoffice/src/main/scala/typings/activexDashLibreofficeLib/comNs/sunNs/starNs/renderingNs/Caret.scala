package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This structure contains the caret information.
  *
  * This structure is used from the {@link XTextLayout} interface to transport information regarding a text caret.
  * @since OOo 2.0
  */
trait Caret extends js.Object {
  /**
    * The angle of the caret.
    *
    * This member contains the rotation angle of the caret in degrees, with 0 denoting an unrotated caret (the unrotated caret orientation depends on the
    * writing mode, horizontally or vertically). The rotation angle is positive for counter-clockwise rotations.
    */
  var CaretAngle: scala.Double
  /**
    * This contains the main caret index.
    *
    * The main caret index corresponds to the insert position when inserting text in the layout's main text direction.
    */
  var MainCaretIndex: scala.Double
  /**
    * This contains the secondary caret index.
    *
    * The secondary caret index, when different from the main caret index, corresponds to the insert position when inserting text at a direction change
    * opposite to the layout's main text direction.
    */
  var SecondaryCaretIndex: scala.Double
}

object Caret {
  @scala.inline
  def apply(CaretAngle: scala.Double, MainCaretIndex: scala.Double, SecondaryCaretIndex: scala.Double): Caret = {
    val __obj = js.Dynamic.literal(CaretAngle = CaretAngle, MainCaretIndex = MainCaretIndex, SecondaryCaretIndex = SecondaryCaretIndex)
  
    __obj.asInstanceOf[Caret]
  }
}

