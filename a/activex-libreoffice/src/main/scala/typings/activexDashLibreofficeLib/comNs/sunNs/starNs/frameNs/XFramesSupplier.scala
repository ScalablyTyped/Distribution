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
    acquire: () => scala.Unit,
    activate: () => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    addFrameActionListener: XFrameActionListener => scala.Unit,
    contextChanged: () => scala.Unit,
    deactivate: () => scala.Unit,
    dispose: () => scala.Unit,
    findFrame: (java.lang.String, scala.Double) => XFrame,
    getActiveFrame: () => XFrame,
    getComponentWindow: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow,
    getContainerWindow: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow,
    getController: () => XController,
    getCreator: () => XFramesSupplier,
    getFrames: () => XFrames,
    getName: () => java.lang.String,
    initialize: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow => scala.Unit,
    isActive: () => scala.Boolean,
    isTop: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    removeFrameActionListener: XFrameActionListener => scala.Unit,
    setActiveFrame: XFrame => scala.Unit,
    setComponent: (activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow, XController) => scala.Boolean,
    setCreator: XFramesSupplier => scala.Unit,
    setName: java.lang.String => scala.Unit
  ): XFramesSupplier = {
    val __obj = js.Dynamic.literal(ActiveFrame = ActiveFrame, ComponentWindow = ComponentWindow, ContainerWindow = ContainerWindow, Controller = Controller, Creator = Creator, Frames = Frames, Name = Name, acquire = js.Any.fromFunction0(acquire), activate = js.Any.fromFunction0(activate), addEventListener = js.Any.fromFunction1(addEventListener), addFrameActionListener = js.Any.fromFunction1(addFrameActionListener), contextChanged = js.Any.fromFunction0(contextChanged), deactivate = js.Any.fromFunction0(deactivate), dispose = js.Any.fromFunction0(dispose), findFrame = js.Any.fromFunction2(findFrame), getActiveFrame = js.Any.fromFunction0(getActiveFrame), getComponentWindow = js.Any.fromFunction0(getComponentWindow), getContainerWindow = js.Any.fromFunction0(getContainerWindow), getController = js.Any.fromFunction0(getController), getCreator = js.Any.fromFunction0(getCreator), getFrames = js.Any.fromFunction0(getFrames), getName = js.Any.fromFunction0(getName), initialize = js.Any.fromFunction1(initialize), isActive = js.Any.fromFunction0(isActive), isTop = js.Any.fromFunction0(isTop), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removeFrameActionListener = js.Any.fromFunction1(removeFrameActionListener), setActiveFrame = js.Any.fromFunction1(setActiveFrame), setComponent = js.Any.fromFunction2(setComponent), setCreator = js.Any.fromFunction1(setCreator), setName = js.Any.fromFunction1(setName))
  
    __obj.asInstanceOf[XFramesSupplier]
  }
}

