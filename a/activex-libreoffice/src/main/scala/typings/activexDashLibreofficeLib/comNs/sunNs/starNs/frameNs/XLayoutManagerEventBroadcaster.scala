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

object XLayoutManagerEventBroadcaster {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    addLayoutManagerEventListener: js.Function1[XLayoutManagerListener, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeLayoutManagerEventListener: js.Function1[XLayoutManagerListener, scala.Unit]
  ): XLayoutManagerEventBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = acquire, addLayoutManagerEventListener = addLayoutManagerEventListener, queryInterface = queryInterface, release = release, removeLayoutManagerEventListener = removeLayoutManagerEventListener)
  
    __obj.asInstanceOf[XLayoutManagerEventBroadcaster]
  }
}

