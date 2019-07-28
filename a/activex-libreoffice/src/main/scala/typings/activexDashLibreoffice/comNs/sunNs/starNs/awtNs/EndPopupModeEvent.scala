package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies an end pop-up mode event. */
trait EndPopupModeEvent extends EventObject {
  /** specifies the new position of the floating window in frame coordinates if bTearoff is `TRUE` */
  var FloatingPosition: Point
  /**
    * specifies how the pop-up mode was ended `TRUE` means the window should be teared-off and positioned at FloatingPosition `FALSE` means the window was
    * closed
    */
  var bTearoff: Boolean
}

object EndPopupModeEvent {
  @scala.inline
  def apply(FloatingPosition: Point, Source: XInterface, bTearoff: Boolean): EndPopupModeEvent = {
    val __obj = js.Dynamic.literal(FloatingPosition = FloatingPosition, Source = Source, bTearoff = bTearoff)
  
    __obj.asInstanceOf[EndPopupModeEvent]
  }
}

