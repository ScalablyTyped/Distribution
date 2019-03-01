package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * a frame object can be considered to be an "anchor" object where a component can be attached to.
  *
  * A frame can be (it's not a must!) a part of a frame tree. If not this frame won't be accessible by using the API. This mode make sense for previews.
  * The root node of the tree can be a {@link Desktop} implementation.
  * @see Desktop
  */
trait XFrame
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent {
  /**
    * provides access to the component window
    *
    * Note: Don't dispose this window - the frame is the owner of it.
    * @returns the current visible component in this frame ;  or `NULL` if no one currently exist
    * @see XFrame.setComponent()
    */
  val ComponentWindow: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow
  /**
    * provides access to the container window of the frame.
    *
    * Normally this is used as the parent window of the component window.
    * @returns the container window of this frame
    * @see XFrame.initialize()
    */
  val ContainerWindow: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow
  /**
    * provides access to the controller
    *
    * Note: Don't dispose it - the frame is the owner of it. Use {@link XController.getFrame()} to dispose the frame after you the controller agreed with a
    * {@link XController.suspend()} call.
    * @returns the current controller within this frame ;  or `NULL` if no one currently exist
    * @see XFrame.setComponent()
    */
  val Controller: XController
  /**
    * provides access to the creator (parent) of this frame
    * @returns the frame container that created and contains this frame.
    * @see XFrame.setCreator()
    */
  var Creator: XFramesSupplier
  /**
    * access to the name property of this frame
    * @returns the programmatic name of this frame.
    * @see XFrame.setName()
    */
  var Name: java.lang.String
  /**
    * activates this frame and thus the component within.
    *
    * At first the frame sets itself as the active frame of its creator by calling {@link XFramesSupplier.setActiveFrame()} , then it broadcasts an {@link
    * FrameActionEvent} with FrameAction::FRAME_ACTIVATED. The component within this frame may listen to this event to grab the focus on activation; for
    * simple components this can be done by the {@link FrameLoader} .
    *
    * Finally, most frames may grab the focus to one of its windows or forward the activation to a sub-frame.
    * @see XFrame.deactivate()
    * @see XFrame.isActive()
    */
  def activate(): scala.Unit
  /**
    * registers an event listener, which will be called when certain things happen to the components within this frame or within sub-frames of this frame.
    *
    * E.g., it is possible to determine instantiation/destruction and activation/deactivation of components.
    * @param xListener specifies the listener which will be informed
    * @see XFrame.removeFrameActionListener()
    */
  def addFrameActionListener(xListener: XFrameActionListener): scala.Unit
  /**
    * notifies the frame that the context of the controller within this frame changed (i.e. the selection).
    *
    * According to a call to this interface, the frame calls {@link XFrameActionListener.frameAction()} with FrameAction::CONTEXT_CHANGED to all listeners
    * which are registered using {@link XFrame.addFrameActionListener()} . For external controllers this event can be used to requery dispatches.
    * @see XFrameEventListener
    * @see FrameAction
    * @see XFrame.addFrameActionListener()
    */
  def contextChanged(): scala.Unit
  /**
    * is called by the creator frame when another sub-frame gets activated.
    *
    * At first the frame deactivates its active sub-frame, if any. Then broadcasts a {@link FrameActionEvent} with FrameAction::FRAME_DEACTIVATING.
    * @see XFrame.activate()
    * @see XFrame.isActive()
    */
  def deactivate(): scala.Unit
  /**
    * searches for a frame with the specified name.
    *
    * Frames may contain other frames (e.g., a frameset) and may be contained in other frames. This hierarchy is searched with this method. First some
    * special names are taken into account, i.e. "", "_self", "_top", "_blank" etc. **SearchFlags** is ignored when comparing these names with
    * **TargetFrameName** ; further steps are controlled by **SearchFlags** . If allowed, the name of the frame itself is compared with the desired one, and
    * then ( again if allowed ) the method is called for all children of the frame. Finally may be called for the siblings and then for parent frame (if
    * allowed).
    *
    * List of special target names: {{table here, see documentation}}
    *
    * If no frame with the given name is found, a new top frame is created; if this is allowed by a special flag {@link FrameSearchFlag.CREATE} . The new
    * frame also gets the desired name.
    * @param aTargetFrameName identify (a) a special target ("_blank","_self" ...) or(b) any well known frame to search it inside the current hierarchy
    * @param nSearchFlags optional parameter to regulate search if no special target was used for **TargetFrameName**
    * @see FrameSearchFlag
    */
  def findFrame(aTargetFrameName: java.lang.String, nSearchFlags: scala.Double): XFrame
  /**
    * provides access to the component window
    *
    * Note: Don't dispose this window - the frame is the owner of it.
    * @returns the current visible component in this frame ;  or `NULL` if no one currently exist
    * @see XFrame.setComponent()
    */
  def getComponentWindow(): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow
  /**
    * provides access to the container window of the frame.
    *
    * Normally this is used as the parent window of the component window.
    * @returns the container window of this frame
    * @see XFrame.initialize()
    */
  def getContainerWindow(): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow
  /**
    * provides access to the controller
    *
    * Note: Don't dispose it - the frame is the owner of it. Use {@link XController.getFrame()} to dispose the frame after you the controller agreed with a
    * {@link XController.suspend()} call.
    * @returns the current controller within this frame ;  or `NULL` if no one currently exist
    * @see XFrame.setComponent()
    */
  def getController(): XController
  /**
    * provides access to the creator (parent) of this frame
    * @returns the frame container that created and contains this frame.
    * @see XFrame.setCreator()
    */
  def getCreator(): XFramesSupplier
  /**
    * access to the name property of this frame
    * @returns the programmatic name of this frame.
    * @see XFrame.setName()
    */
  def getName(): java.lang.String
  /**
    * is called to initialize the frame within a window - the container window.
    *
    * This window will be used as parent for the component window and to support some UI relevant features of the frame service. Note: Re-parenting mustn't
    * supported by a real frame implementation! It's designed for initializing - not for setting.
    *
    * This frame will take over ownership of the window referred from **xWindow** . Thus, the previous owner is not allowed to dispose this window anymore.
    * @param xWindow the new container window
    * @see XFrame.getContainerWindow()
    */
  def initialize(xWindow: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow): scala.Unit
  /**
    * determines if the frame is active.
    * @returns `TRUE` for active or UI active frames ; `FALSE` otherwise
    * @see XFrame.activate()
    * @see XFrame.deactivate()
    */
  def isActive(): scala.Boolean
  /**
    * determines if the frame is a top frame.
    *
    * In general a top frame is the frame which is a direct child of a task frame or which does not have a parent. Possible frame searches must stop the
    * search at such a frame unless the flag {@link FrameSearchFlag.TASKS} is set.
    * @returns `TRUE` if frame supports top frame specification ; `FALSE` otherwise
    */
  def isTop(): scala.Boolean
  /**
    * unregisters an event listener
    * @param xListener specifies the listener which won't be informed any longer
    * @see XFrame.addFrameActionListener()
    */
  def removeFrameActionListener(xListener: XFrameActionListener): scala.Unit
  /**
    * sets a new component into the frame or release an existing one from a frame.
    * @param xComponentWindow the window of the new component or `NULL` for release  A valid component window should be a child of the frame container window.
    * @param xController the controller of the new component or `NULL` for release  Simple components may implement a {@link com.sun.star.awt.XWindow} only. I
    * @returns `TRUE` if setting of new component or release of an existing one was successfully ; `FALSE` otherwise (especially, if an existing controller disa
    * @see XFrame.getComponentWindow()
    * @see XFrame.getContainerWindow()
    * @see XFrame.getController()
    */
  def setComponent(
    xComponentWindow: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow,
    xController: XController
  ): scala.Boolean
  /**
    * sets the frame container that created this frame.
    *
    * Only the creator is allowed to call this method. But creator doesn't mean the implementation which creates this instance ... it means the parent frame
    * of the frame hierarchy. Because; normally a frame should be created by using the API and is necessary for searches inside the tree (e.g. {@link
    * XFrame.findFrame()} )
    * @param Creator the creator (parent) of this frame
    * @see XFrame.getCreator()
    */
  def setCreator(Creator: XFramesSupplier): scala.Unit
  /**
    * sets the name of the frame.
    *
    * Normally the name of the frame is set initially (e.g. by the creator). The name of a frame will be used for identifying it if a frame search was
    * started. These searches can be forced by: {@link XFrame.findFrame()}{@link XDispatchProvider.queryDispatch()}{@link
    * XComponentLoader.loadComponentFromURL()} Note: Special targets like "_blank", "_self" etc. are not allowed. That's why frame names shouldn't start
    * with a sign "_".
    * @param aName the new programmatic name of this frame
    * @see XFrame.findFrame()
    * @see XFrame.getName()
    * @see XDispatchProvider
    * @see XComponentLoader
    */
  def setName(aName: java.lang.String): scala.Unit
}

object XFrame {
  @scala.inline
  def apply(
    ComponentWindow: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow,
    ContainerWindow: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow,
    Controller: XController,
    Creator: XFramesSupplier,
    Name: java.lang.String,
    acquire: js.Function0[scala.Unit],
    activate: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    addFrameActionListener: js.Function1[XFrameActionListener, scala.Unit],
    contextChanged: js.Function0[scala.Unit],
    deactivate: js.Function0[scala.Unit],
    dispose: js.Function0[scala.Unit],
    findFrame: js.Function2[java.lang.String, scala.Double, XFrame],
    getComponentWindow: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow],
    getContainerWindow: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow],
    getController: js.Function0[XController],
    getCreator: js.Function0[XFramesSupplier],
    getName: js.Function0[java.lang.String],
    initialize: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow, scala.Unit],
    isActive: js.Function0[scala.Boolean],
    isTop: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    removeFrameActionListener: js.Function1[XFrameActionListener, scala.Unit],
    setComponent: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow, 
      XController, 
      scala.Boolean
    ],
    setCreator: js.Function1[XFramesSupplier, scala.Unit],
    setName: js.Function1[java.lang.String, scala.Unit]
  ): XFrame = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ComponentWindow")(ComponentWindow)
    __obj.updateDynamic("ContainerWindow")(ContainerWindow)
    __obj.updateDynamic("Controller")(Controller)
    __obj.updateDynamic("Creator")(Creator)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("activate")(activate)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("addFrameActionListener")(addFrameActionListener)
    __obj.updateDynamic("contextChanged")(contextChanged)
    __obj.updateDynamic("deactivate")(deactivate)
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("findFrame")(findFrame)
    __obj.updateDynamic("getComponentWindow")(getComponentWindow)
    __obj.updateDynamic("getContainerWindow")(getContainerWindow)
    __obj.updateDynamic("getController")(getController)
    __obj.updateDynamic("getCreator")(getCreator)
    __obj.updateDynamic("getName")(getName)
    __obj.updateDynamic("initialize")(initialize)
    __obj.updateDynamic("isActive")(isActive)
    __obj.updateDynamic("isTop")(isTop)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("removeFrameActionListener")(removeFrameActionListener)
    __obj.updateDynamic("setComponent")(setComponent)
    __obj.updateDynamic("setCreator")(setCreator)
    __obj.updateDynamic("setName")(setName)
    __obj.asInstanceOf[XFrame]
  }
}

