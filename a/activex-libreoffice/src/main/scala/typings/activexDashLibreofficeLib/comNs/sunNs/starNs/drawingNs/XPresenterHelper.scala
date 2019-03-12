package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface is a collection of functions that were necessary to implement larger parts of the presenter screen as extension. The methods of this
  * interface give access to services that could only be implemented in the Office core, not in an extension.
  *
  * As the presenter screen is no extension any more, this hack can go again; it just needs clean-up.
  */
trait XPresenterHelper extends js.Object {
  /**
    * Capture the mouse so that no other window will receive mouse events. Note that this is a potentially dangerous method. Not calling releaseMouse
    * eventually can lead to an unresponsive application.
    * @param xWindow The window for which mouse events will be notified even when the mouse pointer moves outside the window or over other windows.
    */
  def captureMouse(xWindow: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow): scala.Unit
  /**
    * Create a new canvas for the given window.
    * @param xWindow The canvas is created for this window. Must not be `NULL`
    * @param nRequestedCanvasFeatureList List of requested features that the new canvas should (has to) provide. Use only values from the {@link CanvasFeature
    * @param sOptionalCanvasServiceName When an explicit service name is given then a new object of this service is created. This service name lets the caller
    */
  def createCanvas(
    xWindow: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow,
    nRequestedCanvasFeatureList: scala.Double,
    sOptionalCanvasServiceName: java.lang.String
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.XCanvas
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
    xUpdateCanvas: activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.XSpriteCanvas,
    xUpdateWindow: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow,
    xSharedCanvas: activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.XCanvas,
    xSharedWindow: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow,
    xWindow: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.XCanvas
  /**
    * Create a new window as child window of the given parent window.
    * @param xParentWindow The parent window of the new window.
    * @param bCreateSystemChildWindow When `TRUE` then the new window will be a system window that, in the context of the presenter screen, can not be painted
    * @param bInitiallyVisible When `TRUE` the new window will be visible from the start, i.e. a window listener will not receive a windowShown signal.
    * @param bEnableChildTransparentMode When `TRUE` the parent window is painted behind its child windows. This is one half of allowing child windows to be t
    * @param bEnableParentClip When `TRUE` then the parent window is not clipped where its child windows are painted. This is the other half of allowing child
    */
  def createWindow(
    xParentWindow: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow,
    bCreateSystemChildWindow: scala.Boolean,
    bInitiallyVisible: scala.Boolean,
    bEnableChildTransparentMode: scala.Boolean,
    bEnableParentClip: scala.Boolean
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow
  /** Return the bounding box of the given child window relative to the direct or indirect parent window. */
  def getWindowExtentsRelative(
    xChildWindow: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow,
    xParentWindow: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle
  /**
    * Load a bitmap with a given ID.
    * @param id The ID of the bitmap.
    * @param xCanvas The bitmap is created to be compatible, and possibly optimized, for this canvas.
    */
  def loadBitmap(id: java.lang.String, xCanvas: activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.XCanvas): activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.XBitmap
  /**
    * Release a previously captured mouse.
    * @param xWindow The window from which the mouse will be released.
    */
  def releaseMouse(xWindow: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow): scala.Unit
  /**
    * Move the specified window to the top of its stacking order. As a result the window will be painted over all its overlapping siblings.
    * @param xWindow This window will be moved to the top of its stacking order.
    */
  def toTop(xWindow: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow): scala.Unit
}

object XPresenterHelper {
  @scala.inline
  def apply(
    captureMouse: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow => scala.Unit,
    createCanvas: (activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow, scala.Double, java.lang.String) => activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.XCanvas,
    createSharedCanvas: (activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.XSpriteCanvas, activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow, activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.XCanvas, activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow, activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow) => activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.XCanvas,
    createWindow: (activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow, scala.Boolean, scala.Boolean, scala.Boolean, scala.Boolean) => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow,
    getWindowExtentsRelative: (activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow, activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow) => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle,
    loadBitmap: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.XCanvas) => activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.XBitmap,
    releaseMouse: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow => scala.Unit,
    toTop: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow => scala.Unit
  ): XPresenterHelper = {
    val __obj = js.Dynamic.literal(captureMouse = js.Any.fromFunction1(captureMouse), createCanvas = js.Any.fromFunction3(createCanvas), createSharedCanvas = js.Any.fromFunction5(createSharedCanvas), createWindow = js.Any.fromFunction5(createWindow), getWindowExtentsRelative = js.Any.fromFunction2(getWindowExtentsRelative), loadBitmap = js.Any.fromFunction2(loadBitmap), releaseMouse = js.Any.fromFunction1(releaseMouse), toTop = js.Any.fromFunction1(toTop))
  
    __obj.asInstanceOf[XPresenterHelper]
  }
}

