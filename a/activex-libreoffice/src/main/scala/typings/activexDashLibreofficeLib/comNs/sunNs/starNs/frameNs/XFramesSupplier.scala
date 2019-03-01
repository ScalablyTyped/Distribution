package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to sub frames of current one
  * @see XFrames
  */
trait XFramesSupplier extends XFrame {
  /**
    * gets the current active frame of this container (not of any other available supplier)
    *
    * This may be the frame itself. The active frame is defined as the frame which contains (recursively) the window with the focus. If no window within the
    * frame contains the focus, this method returns the last frame which had the focus. If no containing window ever had the focus, the first frame within
    * this frame is returned.
    * @returns the {@link Frame} which is active within this frame.
    */
  var ActiveFrame: XFrame
  /**
    * provides access to this container and to all other {@link XFramesSupplier} which are available from this node of frame tree
    * @returns the collection of frames which is represented by a {@link FramesContainer} .
    */
  val Frames: XFrames
  /**
    * gets the current active frame of this container (not of any other available supplier)
    *
    * This may be the frame itself. The active frame is defined as the frame which contains (recursively) the window with the focus. If no window within the
    * frame contains the focus, this method returns the last frame which had the focus. If no containing window ever had the focus, the first frame within
    * this frame is returned.
    * @returns the {@link Frame} which is active within this frame.
    */
  def getActiveFrame(): XFrame
  /**
    * provides access to this container and to all other {@link XFramesSupplier} which are available from this node of frame tree
    * @returns the collection of frames which is represented by a {@link FramesContainer} .
    */
  def getFrames(): XFrames
  /**
    * is called on activation of a direct sub-frame.
    *
    * This method is only allowed to be called by a sub-frame according to {@link XFrame.activate()} or {@link XFramesSupplier.setActiveFrame()} . After
    * this call {@link XFramesSupplier.getActiveFrame()} will return the frame specified by **Frame** .
    *
    * In general this method first calls the method {@link XFramesSupplier.setActiveFrame()} at the creator frame with **this** as the current argument.
    * Then it broadcasts the {@link FrameActionEvent} FrameAction::FRAME_ACTIVATED.
    *
    * Note: Given parameter **Frame** must already exist inside the container (e.g., inserted by using {@link XFrames.append()} )
    * @param Frame the new active child frame inside this container
    */
  def setActiveFrame(Frame: XFrame): scala.Unit
}

object XFramesSupplier {
  @scala.inline
  def apply(
    ActiveFrame: XFrame,
    ComponentWindow: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow,
    ContainerWindow: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow,
    Controller: XController,
    Creator: XFramesSupplier,
    Frames: XFrames,
    Name: java.lang.String,
    acquire: js.Function0[scala.Unit],
    activate: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    addFrameActionListener: js.Function1[XFrameActionListener, scala.Unit],
    contextChanged: js.Function0[scala.Unit],
    deactivate: js.Function0[scala.Unit],
    dispose: js.Function0[scala.Unit],
    findFrame: js.Function2[java.lang.String, scala.Double, XFrame],
    getActiveFrame: js.Function0[XFrame],
    getComponentWindow: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow],
    getContainerWindow: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow],
    getController: js.Function0[XController],
    getCreator: js.Function0[XFramesSupplier],
    getFrames: js.Function0[XFrames],
    getName: js.Function0[java.lang.String],
    initialize: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow, scala.Unit],
    isActive: js.Function0[scala.Boolean],
    isTop: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    removeFrameActionListener: js.Function1[XFrameActionListener, scala.Unit],
    setActiveFrame: js.Function1[XFrame, scala.Unit],
    setComponent: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow, 
      XController, 
      scala.Boolean
    ],
    setCreator: js.Function1[XFramesSupplier, scala.Unit],
    setName: js.Function1[java.lang.String, scala.Unit]
  ): XFramesSupplier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ActiveFrame")(ActiveFrame)
    __obj.updateDynamic("ComponentWindow")(ComponentWindow)
    __obj.updateDynamic("ContainerWindow")(ContainerWindow)
    __obj.updateDynamic("Controller")(Controller)
    __obj.updateDynamic("Creator")(Creator)
    __obj.updateDynamic("Frames")(Frames)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("activate")(activate)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("addFrameActionListener")(addFrameActionListener)
    __obj.updateDynamic("contextChanged")(contextChanged)
    __obj.updateDynamic("deactivate")(deactivate)
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("findFrame")(findFrame)
    __obj.updateDynamic("getActiveFrame")(getActiveFrame)
    __obj.updateDynamic("getComponentWindow")(getComponentWindow)
    __obj.updateDynamic("getContainerWindow")(getContainerWindow)
    __obj.updateDynamic("getController")(getController)
    __obj.updateDynamic("getCreator")(getCreator)
    __obj.updateDynamic("getFrames")(getFrames)
    __obj.updateDynamic("getName")(getName)
    __obj.updateDynamic("initialize")(initialize)
    __obj.updateDynamic("isActive")(isActive)
    __obj.updateDynamic("isTop")(isTop)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("removeFrameActionListener")(removeFrameActionListener)
    __obj.updateDynamic("setActiveFrame")(setActiveFrame)
    __obj.updateDynamic("setComponent")(setComponent)
    __obj.updateDynamic("setCreator")(setCreator)
    __obj.updateDynamic("setName")(setName)
    __obj.asInstanceOf[XFramesSupplier]
  }
}

