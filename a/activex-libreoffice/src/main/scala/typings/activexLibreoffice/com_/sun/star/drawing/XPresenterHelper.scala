package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.com_.sun.star.awt.Rectangle
import typings.activexLibreoffice.com_.sun.star.awt.XWindow
import typings.activexLibreoffice.com_.sun.star.rendering.XBitmap
import typings.activexLibreoffice.com_.sun.star.rendering.XCanvas
import typings.activexLibreoffice.com_.sun.star.rendering.XSpriteCanvas
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface is a collection of functions that were necessary to implement larger parts of the presenter screen as extension. The methods of this
  * interface give access to services that could only be implemented in the Office core, not in an extension.
  *
  * As the presenter screen is no extension any more, this hack can go again; it just needs clean-up.
  */
@js.native
trait XPresenterHelper extends js.Object {
  /**
    * Capture the mouse so that no other window will receive mouse events. Note that this is a potentially dangerous method. Not calling releaseMouse
    * eventually can lead to an unresponsive application.
    * @param xWindow The window for which mouse events will be notified even when the mouse pointer moves outside the window or over other windows.
    */
  def captureMouse(xWindow: XWindow): Unit = js.native
  /**
    * Create a new canvas for the given window.
    * @param xWindow The canvas is created for this window. Must not be `NULL`
    * @param nRequestedCanvasFeatureList List of requested features that the new canvas should (has to) provide. Use only values from the {@link CanvasFeature
    * @param sOptionalCanvasServiceName When an explicit service name is given then a new object of this service is created. This service name lets the caller
    */
  def createCanvas(xWindow: XWindow, nRequestedCanvasFeatureList: Double, sOptionalCanvasServiceName: String): XCanvas = js.native
  /**
    * Create a new canvas for the given window. The new canvas is a wrapper around the given shared canvas. The wrapper only modifies the origin in all
    * output and clipping methods.
    * @param xUpdateCanvas This canvas is used to call updateScreen() on. May be `NULL`
    * @param xUpdateWindow The window that belongs to the update canvas. May also be `NULL` (is expected to b `NULL` whenever xUpdateCanvas is.)
    * @param xSharedCanvas The canvas that is shared by the wrapper.
    * @param xSharedWindow The window of the shared canvas. This is used to determine the proper offset.
    * @param xWindow The canvas is created for this window. Must not be `NULL`
    */
  def createSharedCanvas(
    xUpdateCanvas: XSpriteCanvas,
    xUpdateWindow: XWindow,
    xSharedCanvas: XCanvas,
    xSharedWindow: XWindow,
    xWindow: XWindow
  ): XCanvas = js.native
  /**
    * Create a new window as child window of the given parent window.
    * @param xParentWindow The parent window of the new window.
    * @param bCreateSystemChildWindow When `TRUE` then the new window will be a system window that, in the context of the presenter screen, can not be painted
    * @param bInitiallyVisible When `TRUE` the new window will be visible from the start, i.e. a window listener will not receive a windowShown signal.
    * @param bEnableChildTransparentMode When `TRUE` the parent window is painted behind its child windows. This is one half of allowing child windows to be t
    * @param bEnableParentClip When `TRUE` then the parent window is not clipped where its child windows are painted. This is the other half of allowing child
    */
  def createWindow(
    xParentWindow: XWindow,
    bCreateSystemChildWindow: Boolean,
    bInitiallyVisible: Boolean,
    bEnableChildTransparentMode: Boolean,
    bEnableParentClip: Boolean
  ): XWindow = js.native
  /** Return the bounding box of the given child window relative to the direct or indirect parent window. */
  def getWindowExtentsRelative(xChildWindow: XWindow, xParentWindow: XWindow): Rectangle = js.native
  /**
    * Load a bitmap with a given ID.
    * @param id The ID of the bitmap.
    * @param xCanvas The bitmap is created to be compatible, and possibly optimized, for this canvas.
    */
  def loadBitmap(id: String, xCanvas: XCanvas): XBitmap = js.native
  /**
    * Release a previously captured mouse.
    * @param xWindow The window from which the mouse will be released.
    */
  def releaseMouse(xWindow: XWindow): Unit = js.native
  /**
    * Move the specified window to the top of its stacking order. As a result the window will be painted over all its overlapping siblings.
    * @param xWindow This window will be moved to the top of its stacking order.
    */
  def toTop(xWindow: XWindow): Unit = js.native
}

object XPresenterHelper {
  @scala.inline
  def apply(
    captureMouse: XWindow => Unit,
    createCanvas: (XWindow, Double, String) => XCanvas,
    createSharedCanvas: (XSpriteCanvas, XWindow, XCanvas, XWindow, XWindow) => XCanvas,
    createWindow: (XWindow, Boolean, Boolean, Boolean, Boolean) => XWindow,
    getWindowExtentsRelative: (XWindow, XWindow) => Rectangle,
    loadBitmap: (String, XCanvas) => XBitmap,
    releaseMouse: XWindow => Unit,
    toTop: XWindow => Unit
  ): XPresenterHelper = {
    val __obj = js.Dynamic.literal(captureMouse = js.Any.fromFunction1(captureMouse), createCanvas = js.Any.fromFunction3(createCanvas), createSharedCanvas = js.Any.fromFunction5(createSharedCanvas), createWindow = js.Any.fromFunction5(createWindow), getWindowExtentsRelative = js.Any.fromFunction2(getWindowExtentsRelative), loadBitmap = js.Any.fromFunction2(loadBitmap), releaseMouse = js.Any.fromFunction1(releaseMouse), toTop = js.Any.fromFunction1(toTop))
    __obj.asInstanceOf[XPresenterHelper]
  }
  @scala.inline
  implicit class XPresenterHelperOps[Self <: XPresenterHelper] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCaptureMouse(value: XWindow => Unit): Self = this.set("captureMouse", js.Any.fromFunction1(value))
    @scala.inline
    def setCreateCanvas(value: (XWindow, Double, String) => XCanvas): Self = this.set("createCanvas", js.Any.fromFunction3(value))
    @scala.inline
    def setCreateSharedCanvas(value: (XSpriteCanvas, XWindow, XCanvas, XWindow, XWindow) => XCanvas): Self = this.set("createSharedCanvas", js.Any.fromFunction5(value))
    @scala.inline
    def setCreateWindow(value: (XWindow, Boolean, Boolean, Boolean, Boolean) => XWindow): Self = this.set("createWindow", js.Any.fromFunction5(value))
    @scala.inline
    def setGetWindowExtentsRelative(value: (XWindow, XWindow) => Rectangle): Self = this.set("getWindowExtentsRelative", js.Any.fromFunction2(value))
    @scala.inline
    def setLoadBitmap(value: (String, XCanvas) => XBitmap): Self = this.set("loadBitmap", js.Any.fromFunction2(value))
    @scala.inline
    def setReleaseMouse(value: XWindow => Unit): Self = this.set("releaseMouse", js.Any.fromFunction1(value))
    @scala.inline
    def setToTop(value: XWindow => Unit): Self = this.set("toTop", js.Any.fromFunction1(value))
  }
  
}

