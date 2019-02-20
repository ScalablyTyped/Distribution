package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to receive events from a layout manager.
  * @see com.sun.star.frame.LayoutManager
  * @since OOo 2.0
  */
trait XLayoutManagerEventBroadcaster
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * adds a layout manager event listener to the object's listener list.
    * @param aLayoutManagerListener a listener that wants to receive events regarding user interface elements that are controlled by a layout manager.
    */
  def addLayoutManagerEventListener(aLayoutManagerListener: XLayoutManagerListener): scala.Unit
  /**
    * removes a layout manager event listener from the object's listener list.
    * @param aLayoutManagerListener a listener that don't want to receive events regarding user interface elements that are controlled by a layout manager.
    */
  def removeLayoutManagerEventListener(aLayoutManagerListener: XLayoutManagerListener): scala.Unit
}

