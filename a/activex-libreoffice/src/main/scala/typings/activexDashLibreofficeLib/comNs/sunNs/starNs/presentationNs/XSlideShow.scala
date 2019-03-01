package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Slide show interface to perform slide show presentations.
  *
  * This interface provides the necessary methods to run and control a slide show from a given set of XDrawPage slides. The slide show can be displayed
  * simultaneously on multiple targets.
  *
  * Note: To control a running slide show inside a presentation, please use {@link XPresentation2} and {@link XSlideShowController} .
  * @since OOo 3.0
  */
trait XSlideShow
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Query the currently displayed slide.
    * @returns the instance of the current slide. If there's no slide show running at the moment, this method returns an empty reference.
    */
  val CurrentSlide: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XDrawPage
  /**
    * Add a shape event listener.
    *
    * This method adds a listener to the slide show, which will get notified when a mouse click is performed on the given shape. This can be used by clients
    * of the slide show to trigger external actions, such as jumps to different slides.
    * @param xListener Listener to add.
    * @param xShape {@link Shape} to register a listener for.
    */
  def addShapeEventListener(
    xListener: XShapeEventListener,
    xShape: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape
  ): scala.Unit
  /**
    * Add a slide show listener.
    *
    * This method adds a listener to the slide show, which will get notified when a registered shape is clicked upon, or a new slide is about to be
    * displayed. Note that the listeners will **not** be notified, when the slide change is directly requested by one of the nextSlide(), previousSlide() or
    * {@link displaySlide()} methods.
    * @param xListener Listener to add.
    */
  def addSlideShowListener(xListener: XSlideShowListener): scala.Unit
  /**
    * Add a view to the slide show.
    *
    * This method adds a view to the slide show. After successful completion of this method, the slide show will be visible on the added view, scaled
    * according to the view's output area.
    * @param xView The view to add
    * @returns `TRUE` , if the view has been successfully added. Otherwise, `FALSE` is returned (e.g. if the view is already added).
    */
  def addView(xView: XSlideShowView): scala.Boolean
  /**
    * Jump to the given slide.
    *
    * This method ends all effects on the current slide, displays a possible slide transition, followed by the given slide. If the current slide is equal to
    * the requested slide here, this method does nothing (this especially means, that any currently active effects will remain running).
    * @param xSlide The slide to display.
    * @param xDrawPages For future use.
    * @param AnimationNode The animation node determine the animations to display.
    * @param aProperties Sequence of property values, which influence the way the slide is displayed. Currently, the following values are recognized: name: Pr
    */
  def displaySlide(
    xSlide: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XDrawPage,
    xDrawPages: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XDrawPagesSupplier,
    AnimationNode: activexDashLibreofficeLib.comNs.sunNs.starNs.animationsNs.XAnimationNode,
    aProperties: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): scala.Unit
  /**
    * Query the currently displayed slide.
    * @returns the instance of the current slide. If there's no slide show running at the moment, this method returns an empty reference.
    */
  def getCurrentSlide(): activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XDrawPage
  /**
    * Trigger the next effect of the slide show.
    *
    * This method triggers the next effect on the currently displayed slide. If there is currently no slide show running, this method does nothing. If there
    * are no more effects on the current slide, a possible slide transition effect is issued and the next slide is displayed.
    * @returns `TRUE` , if the next effect was successfully triggered. This method returns `FALSE` , if there is no show running, the last effect on the last sl
    */
  def nextEffect(): scala.Boolean
  /**
    * Change the pause state of the slide show.
    *
    * This method either pauses the slide show (all currently running effects are stopped), or starts a previously stopped show again (all paused effects
    * start again).
    * @param bPauseShow When `TRUE` , the show is paused. When `FALSE` , and the show was paused, it starts running at the paused position again.
    * @returns `TRUE` , if the requested action was successfully performed.
    */
  def pause(bPauseShow: scala.Boolean): scala.Boolean
  /**
    * Undo the last effect in the main sequence of the slide show.
    *
    * The current slide is displayed as if the last user-triggered effect has never been triggered. If there is no previous effect on the current slide then
    * slideEnded(true) is called at the registered {@link XSlideShowListener} objects, which can then trigger a change to the previous slide. Note that this
    * command is executed asynchronously. Multiple calls to {@link update()} may be necessary to complete its execution. If there is currently no slide show
    * running, this method does nothing.
    * @returns `TRUE` , if the previous effect was successfully triggered. This method returns `FALSE` , if there is no show running, the first effect on the fi
    */
  def previousEffect(): scala.Boolean
  /**
    * Register drawn polygons in presentation mode
    * @param xDocFactory
    */
  def registerUserPaintPolygons(xDocFactory: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XMultiServiceFactory): scala.Unit
  /**
    * Revoke a previously registered shape event listener.
    * @param xListener Listener interface to revoke from being called.
    * @param xShape {@link Shape} for which the listener should be revoked.
    */
  def removeShapeEventListener(
    xListener: XShapeEventListener,
    xShape: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape
  ): scala.Unit
  /**
    * Revoke a previously registered slide show listener.
    * @param xListener Listener interface to revoke from being called.
    */
  def removeSlideShowListener(xListener: XSlideShowListener): scala.Unit
  /**
    * Remove view from the slide show.
    *
    * This method removes the given view from the slide show. After successful completion of this method, the slide show will cease to display on this view.
    * @param xView View to remove
    * @returns `TRUE` , if the view was successfully removed, `FALSE` otherwise (e.g. if the view was not added in the first place).
    */
  def removeView(xView: XSlideShowView): scala.Boolean
  /**
    * Change a property of the slide show.
    * @param aShowProperty Property values, which influence the way the slides are shown. Note that this might possibly be a subset of what is supported on sh
    */
  def setProperty(aShowProperty: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue): scala.Boolean
  /**
    * Set a special mouse cursor for a shape.
    *
    * This method requests the slide show to display a special cursor, whenever the mouse is hovering over the given shape.
    * @param xShape {@link Shape} to display a special mouse cursor.
    * @param nPointerShape Type of mouse cursor to display. Must be one of the {@link com.sun.star.awt.SystemPointer} values.
    */
  def setShapeCursor(xShape: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape, nPointerShape: scala.Double): scala.Unit
  /**
    * Start a shape-intrinsic animation or activity.
    *
    * This method starts an animation or activity intrinsic to the given shape. Shape-intrinsic activities are things like video playback for multimedia
    * shapes, sounds, GIF animations and drawing layer animations (flipping between shapes in a group, or scroll text).
    * @param xShape The shape to start the activity for
    */
  def startShapeActivity(xShape: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape): scala.Boolean
  /**
    * Stop a shape-intrinsic animation or activity.
    *
    * This method stops an animation or activity intrinsic to the given shape. Shape-intrinsic activities are things like video playback for multimedia
    * shapes, sounds, GIF animations and drawing layer animations (flipping between shapes in a group, or scroll text).
    * @param xShape The shape to stop the activity for
    */
  def stopShapeActivity(xShape: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape): scala.Boolean
  /**
    * Update the animations.
    *
    * This method updates all currently active slide animations. The {@link XSlideShow} implementations do not render animations automatically, but must be
    * called from their clients. This allows for various update mechanisms to be employed, ranging from a dedicated rendering thread, over timer-based
    * updates, to rendering in an idle function. Either way, the client of this interface decide about the details.
    * @param nNextTimeout Via this value, the implementation can return a timeout value, denoting the maximal time span that must not be exceeded from the ret
    * @returns `TRUE` , if further update calls are required. If `FALSE` is returned, no further update calls are necessary, until anyone of the other interface
    */
  def update(nNextTimeout: js.Array[scala.Double]): scala.Boolean
}

object XSlideShow {
  @scala.inline
  def apply(
    CurrentSlide: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XDrawPage,
    acquire: js.Function0[scala.Unit],
    addShapeEventListener: js.Function2[
      XShapeEventListener, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape, 
      scala.Unit
    ],
    addSlideShowListener: js.Function1[XSlideShowListener, scala.Unit],
    addView: js.Function1[XSlideShowView, scala.Boolean],
    displaySlide: js.Function4[
      activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XDrawPage, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XDrawPagesSupplier, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.animationsNs.XAnimationNode, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      scala.Unit
    ],
    getCurrentSlide: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XDrawPage],
    nextEffect: js.Function0[scala.Boolean],
    pause: js.Function1[scala.Boolean, scala.Boolean],
    previousEffect: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    registerUserPaintPolygons: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XMultiServiceFactory, 
      scala.Unit
    ],
    release: js.Function0[scala.Unit],
    removeShapeEventListener: js.Function2[
      XShapeEventListener, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape, 
      scala.Unit
    ],
    removeSlideShowListener: js.Function1[XSlideShowListener, scala.Unit],
    removeView: js.Function1[XSlideShowView, scala.Boolean],
    setProperty: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue, scala.Boolean],
    setShapeCursor: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape, 
      scala.Double, 
      scala.Unit
    ],
    startShapeActivity: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape, scala.Boolean],
    stopShapeActivity: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape, scala.Boolean],
    update: js.Function1[js.Array[scala.Double], scala.Boolean]
  ): XSlideShow = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CurrentSlide")(CurrentSlide)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addShapeEventListener")(addShapeEventListener)
    __obj.updateDynamic("addSlideShowListener")(addSlideShowListener)
    __obj.updateDynamic("addView")(addView)
    __obj.updateDynamic("displaySlide")(displaySlide)
    __obj.updateDynamic("getCurrentSlide")(getCurrentSlide)
    __obj.updateDynamic("nextEffect")(nextEffect)
    __obj.updateDynamic("pause")(pause)
    __obj.updateDynamic("previousEffect")(previousEffect)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("registerUserPaintPolygons")(registerUserPaintPolygons)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeShapeEventListener")(removeShapeEventListener)
    __obj.updateDynamic("removeSlideShowListener")(removeSlideShowListener)
    __obj.updateDynamic("removeView")(removeView)
    __obj.updateDynamic("setProperty")(setProperty)
    __obj.updateDynamic("setShapeCursor")(setShapeCursor)
    __obj.updateDynamic("startShapeActivity")(startShapeActivity)
    __obj.updateDynamic("stopShapeActivity")(stopShapeActivity)
    __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[XSlideShow]
  }
}

