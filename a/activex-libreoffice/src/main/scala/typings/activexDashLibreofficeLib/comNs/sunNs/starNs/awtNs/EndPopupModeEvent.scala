package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies an end pop-up mode event. */
trait EndPopupModeEvent
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject {
  /** specifies the new position of the floating window in frame coordinates if bTearoff is `TRUE` */
  var FloatingPosition: Point
  /**
    * specifies how the pop-up mode was ended `TRUE` means the window should be teared-off and positioned at FloatingPosition `FALSE` means the window was
    * closed
    */
  var bTearoff: scala.Boolean
}

object EndPopupModeEvent {
  @scala.inline
  def apply(
    FloatingPosition: Point,
    Source: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    bTearoff: scala.Boolean
  ): EndPopupModeEvent = {
    val __obj = js.Dynamic.literal(FloatingPosition = FloatingPosition, Source = Source, bTearoff = bTearoff)
  
    __obj.asInstanceOf[EndPopupModeEvent]
  }
}

