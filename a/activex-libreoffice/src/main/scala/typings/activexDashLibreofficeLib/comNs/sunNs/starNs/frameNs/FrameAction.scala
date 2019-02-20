package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FrameAction extends js.Object

/**
  * these are the events which can happen to the components in frames of the desktop
  *
  * Interest listener can get information about loaded/reloaded or unloaded components into a {@link Frame} .
  * @see XFrame
  * @see XFrameActionListener
  * @see FrameActionEvent
  */
@JSGlobal("com.sun.star.frame.FrameAction")
@js.native
object FrameAction extends js.Object {
  /**
    * an event of this kind is broadcast whenever a component is attached to a frame
    *
    * This is almost the same as the instantiation of the component within that frame. The component is attached to the frame immediately before this event
    * is broadcast.
    * @see XFrame.setComponent()
    */
  @js.native
  sealed trait COMPONENT_ATTACHED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.FrameAction
  
  /**
    * an event of this kind is broadcast whenever a component is detaching from a frame
    *
    * This is quite the same as the destruction of the component which was in that frame. At the moment when the event is broadcast the component is still
    * attached to the frame but in the next moment it won't.
    * @see XFrame.setComponent()
    */
  @js.native
  sealed trait COMPONENT_DETACHING
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.FrameAction
  
  /**
    * an event of this kind is broadcast whenever a component is attached to a new model.
    *
    * In this case the component remains the same but operates on a new model component.
    */
  @js.native
  sealed trait COMPONENT_REATTACHED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.FrameAction
  
  /**
    * an event of this kind is broadcast whenever a component changes its internal context (i.e., the selection).
    *
    * If the activation status within a frame changes, this counts as a context change too.
    * @see XFrame.contextChanged()
    */
  @js.native
  sealed trait CONTEXT_CHANGED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.FrameAction
  
  /**
    * an event of this kind is broadcast whenever a component gets activated
    *
    * Activations are broadcast from the top component which was not active before, down to the inner most component.
    * @see XFrame.activate()
    */
  @js.native
  sealed trait FRAME_ACTIVATED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.FrameAction
  
  /**
    * an event of this kind is broadcasted immediately before the component is deactivated
    *
    * Deactivations are broadcast from the innermost component which does not stay active up to the outer most component which does not stay active.
    * @see XFrame.deactivate()
    */
  @js.native
  sealed trait FRAME_DEACTIVATING
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.FrameAction
  
  /**
    * an event of this kind is broadcast by an active frame when it is getting UI control (tool control).
    * @see XFrame.activate()
    */
  @js.native
  sealed trait FRAME_UI_ACTIVATED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.FrameAction
  
  /**
    * an event of this kind is broadcast by an active frame when it is losing UI control (tool control).
    * @see XFrame.deactivate()
    */
  @js.native
  sealed trait FRAME_UI_DEACTIVATING
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.FrameAction
  
  /* 0 */ val COMPONENT_ATTACHED: COMPONENT_ATTACHED with scala.Double = js.native
  /* 1 */ val COMPONENT_DETACHING: COMPONENT_DETACHING with scala.Double = js.native
  /* 2 */ val COMPONENT_REATTACHED: COMPONENT_REATTACHED with scala.Double = js.native
  /* 5 */ val CONTEXT_CHANGED: CONTEXT_CHANGED with scala.Double = js.native
  /* 3 */ val FRAME_ACTIVATED: FRAME_ACTIVATED with scala.Double = js.native
  /* 4 */ val FRAME_DEACTIVATING: FRAME_DEACTIVATING with scala.Double = js.native
  /* 6 */ val FRAME_UI_ACTIVATED: FRAME_UI_ACTIVATED with scala.Double = js.native
  /* 7 */ val FRAME_UI_DEACTIVATING: FRAME_UI_DEACTIVATING with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.FrameAction with scala.Double
  ] = js.native
}

