package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * View interface to display slide show presentations on.
  *
  * This interface provides the necessary methods to enable an {@link XSlideShow} interface to display a presentation. The slide show can be displayed
  * simultaneously on multiple views
  * @since OOo 2.4
  */
trait XSlideShowView
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Get view canvas.
    *
    * This method gets the underlying XCanvas to display on this view.
    * @returns XSpriteCanvas to display on. Must be valid, and the same object, as long as this view is added to any slide show.
    */
  val Canvas: activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.XSpriteCanvas
  /** Get rectangle defining area inside of canvas device which this slide show view uses. */
  val CanvasArea: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle
  /**
    * Query the current transformation matrix for this view.
    *
    * This method returns the transformation matrix of the view. When notified via the transformation change listener, the show will be displayed using the
    * new transformation.
    * @returns the view transformation matrix. Note that the slide show itself will paint all slides as one-by-one boxes, one therefore has to at least provide
    */
  val Transformation: activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.AffineMatrix2D
  /**
    * Query the current translation offset used to fill the physical screen while keeping aspect ratio.
    *
    * This method returns the translation offset of the view of the view.
    * @returns the slideshowview will be transformed in order to fill the physical screen while keeping the aspect ratio. In order to do so, we need to add a bl
    */
  val TranslationOffset: activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.IntegerSize2D
  /**
    * Add a mouse listener to the view.
    *
    * This method registers a listener with the view, which will get called every time the mouse is clicked on the view.
    * @param xListener Listener interface to call when the mouse is clicked on the view.
    */
  def addMouseListener(xListener: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XMouseListener): scala.Unit
  /**
    * Add a mouse motion listener to the view.
    *
    * This method registers a listener with the view, which will get called every time the mouse is moved on the view.
    * @param xListener Listener interface to call when the mouse is moved on the view.
    */
  def addMouseMotionListener(xListener: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XMouseMotionListener): scala.Unit
  /**
    * Add a listener to get notified when this view needs a repaint.
    *
    * This method registers a listener with the view, which will get called every time the view needs an update of their screen representation.
    * @param xListener Listener interface to call when the view needs a repaint.
    */
  def addPaintListener(xListener: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XPaintListener): scala.Unit
  /**
    * Add a listener to get notified when the transformation matrix changes.
    *
    * This method registers a listener with the view, which will get called every time the transformation matrix changes.
    * @param xListener Listener interface to call when the transformation matrix changes.
    */
  def addTransformationChangedListener(xListener: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifyListener): scala.Unit
  /**
    * This method clears the whole view area.
    *
    * The slide show uses this method to fully erase the view content. Since the slide show has no notion of view size, this is the only reliable way to
    * wholly clear the view.
    */
  def clear(): scala.Unit
  /**
    * Get view canvas.
    *
    * This method gets the underlying XCanvas to display on this view.
    * @returns XSpriteCanvas to display on. Must be valid, and the same object, as long as this view is added to any slide show.
    */
  def getCanvas(): activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.XSpriteCanvas
  /** Get rectangle defining area inside of canvas device which this slide show view uses. */
  def getCanvasArea(): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle
  /**
    * Query the current transformation matrix for this view.
    *
    * This method returns the transformation matrix of the view. When notified via the transformation change listener, the show will be displayed using the
    * new transformation.
    * @returns the view transformation matrix. Note that the slide show itself will paint all slides as one-by-one boxes, one therefore has to at least provide
    */
  def getTransformation(): activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.AffineMatrix2D
  /**
    * Query the current translation offset used to fill the physical screen while keeping aspect ratio.
    *
    * This method returns the translation offset of the view of the view.
    * @returns the slideshowview will be transformed in order to fill the physical screen while keeping the aspect ratio. In order to do so, we need to add a bl
    */
  def getTranslationOffset(): activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.IntegerSize2D
  /**
    * Revoke a previously registered mouse listener.
    * @param xListener Listener interface to revoke from being called.
    */
  def removeMouseListener(xListener: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XMouseListener): scala.Unit
  /**
    * Revoke a previously registered mouse move listener.
    * @param xListener Listener interface to revoke from being called.
    */
  def removeMouseMotionListener(xListener: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XMouseMotionListener): scala.Unit
  /**
    * Revoke a previously registered paint listener.
    * @param xListener Listener interface to revoke from being called.
    */
  def removePaintListener(xListener: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XPaintListener): scala.Unit
  /**
    * Revoke a previously registered transformation matrix change listener.
    * @param xListener Listener interface to revoke from being called.
    */
  def removeTransformationChangedListener(xListener: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifyListener): scala.Unit
  /**
    * Change the mouse cursor currently in effect.
    *
    * This method changes the mouse cursor currently in effect, for this view.
    * @param nPointerShape New mouse cursor shape to display for this view. Must be from the {@link com.sun.star.awt.SystemPointer} constant group.
    */
  def setMouseCursor(nPointerShape: scala.Double): scala.Unit
}

object XSlideShowView {
  @scala.inline
  def apply(
    Canvas: activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.XSpriteCanvas,
    CanvasArea: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle,
    Transformation: activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.AffineMatrix2D,
    TranslationOffset: activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.IntegerSize2D,
    acquire: js.Function0[scala.Unit],
    addMouseListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XMouseListener, scala.Unit],
    addMouseMotionListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XMouseMotionListener, 
      scala.Unit
    ],
    addPaintListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XPaintListener, scala.Unit],
    addTransformationChangedListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifyListener, scala.Unit],
    clear: js.Function0[scala.Unit],
    getCanvas: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.XSpriteCanvas],
    getCanvasArea: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle],
    getTransformation: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.AffineMatrix2D],
    getTranslationOffset: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.IntegerSize2D],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeMouseListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XMouseListener, scala.Unit],
    removeMouseMotionListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XMouseMotionListener, 
      scala.Unit
    ],
    removePaintListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XPaintListener, scala.Unit],
    removeTransformationChangedListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifyListener, scala.Unit],
    setMouseCursor: js.Function1[scala.Double, scala.Unit]
  ): XSlideShowView = {
    val __obj = js.Dynamic.literal(Canvas = Canvas, CanvasArea = CanvasArea, Transformation = Transformation, TranslationOffset = TranslationOffset, acquire = acquire, addMouseListener = addMouseListener, addMouseMotionListener = addMouseMotionListener, addPaintListener = addPaintListener, addTransformationChangedListener = addTransformationChangedListener, clear = clear, getCanvas = getCanvas, getCanvasArea = getCanvasArea, getTransformation = getTransformation, getTranslationOffset = getTranslationOffset, queryInterface = queryInterface, release = release, removeMouseListener = removeMouseListener, removeMouseMotionListener = removeMouseMotionListener, removePaintListener = removePaintListener, removeTransformationChangedListener = removeTransformationChangedListener, setMouseCursor = setMouseCursor)
  
    __obj.asInstanceOf[XSlideShowView]
  }
}

