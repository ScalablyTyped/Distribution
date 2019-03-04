package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a window event. */
trait WindowEvent
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject {
  /**
    * specifies the inset from the bottom.
    *
    * The inset is the distance between the outer and the inner window, that means the bottom inset is the height of the bottom border.
    */
  var BottomInset: scala.Double
  /** specifies the outer (total) height of the window. */
  var Height: scala.Double
  /**
    * specifies the inset from the left.
    *
    * The inset is the distance between the outer and the inner window, that means the left inset is the width of the left border.
    */
  var LeftInset: scala.Double
  /**
    * specifies the inset from the right.
    *
    * The inset is the distance between the outer and the inner window, that means the right inset is the width of the right border.
    */
  var RightInset: scala.Double
  /**
    * specifies the inset from the top.
    *
    * The inset is the distance between the outer and the inner window, that means the top inset is the height of the top border.
    */
  var TopInset: scala.Double
  /** specifies the outer (total) width of the window. */
  var Width: scala.Double
  /** specifies the outer x position of the window. */
  var X: scala.Double
  /** specifies the outer y position of the window. */
  var Y: scala.Double
}

object WindowEvent {
  @scala.inline
  def apply(
    BottomInset: scala.Double,
    Height: scala.Double,
    LeftInset: scala.Double,
    RightInset: scala.Double,
    Source: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    TopInset: scala.Double,
    Width: scala.Double,
    X: scala.Double,
    Y: scala.Double
  ): WindowEvent = {
    val __obj = js.Dynamic.literal(BottomInset = BottomInset, Height = Height, LeftInset = LeftInset, RightInset = RightInset, Source = Source, TopInset = TopInset, Width = Width, X = X, Y = Y)
  
    __obj.asInstanceOf[WindowEvent]
  }
}

