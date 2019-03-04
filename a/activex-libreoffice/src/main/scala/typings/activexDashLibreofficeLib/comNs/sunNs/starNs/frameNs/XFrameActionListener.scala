package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * has to be provided if an object wants to receive events when several things happen to components within frames of the desktop frame tree.
  *
  * E.g., you can receive events of instantiation/destruction and activation/deactivation of components.
  * @see XFrame.addFrameActionListener()
  * @see XFrame.removeFrameActionListener()
  */
trait XFrameActionListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /**
    * is called whenever any action occurs to a component within a frame.
    * @param Action describes the detected frame action for which the listener can react
    */
  def frameAction(Action: FrameActionEvent): scala.Unit
}

object XFrameActionListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    frameAction: js.Function1[FrameActionEvent, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XFrameActionListener = {
    val __obj = js.Dynamic.literal(acquire = acquire, disposing = disposing, frameAction = frameAction, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XFrameActionListener]
  }
}

