package typings.activexLibreoffice.com_.sun.star.presentation

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.Rectangle
import typings.activexLibreoffice.com_.sun.star.awt.XMouseListener
import typings.activexLibreoffice.com_.sun.star.awt.XMouseMotionListener
import typings.activexLibreoffice.com_.sun.star.awt.XPaintListener
import typings.activexLibreoffice.com_.sun.star.geometry.AffineMatrix2D
import typings.activexLibreoffice.com_.sun.star.geometry.IntegerSize2D
import typings.activexLibreoffice.com_.sun.star.rendering.XSpriteCanvas
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.activexLibreoffice.com_.sun.star.util.XModifyListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * View interface to display slide show presentations on.
  *
  * This interface provides the necessary methods to enable an {@link XSlideShow} interface to display a presentation. The slide show can be displayed
  * simultaneously on multiple views
  * @since OOo 2.4
  */
@js.native
trait XSlideShowView extends XInterface {
  
  /**
    * Get view canvas.
    *
    * This method gets the underlying XCanvas to display on this view.
    * @returns XSpriteCanvas to display on. Must be valid, and the same object, as long as this view is added to any slide show.
    */
  val Canvas: XSpriteCanvas = js.native
  
  /** Get rectangle defining area inside of canvas device which this slide show view uses. */
  val CanvasArea: Rectangle = js.native
  
  /**
    * Query the current transformation matrix for this view.
    *
    * This method returns the transformation matrix of the view. When notified via the transformation change listener, the show will be displayed using the
    * new transformation.
    * @returns the view transformation matrix. Note that the slide show itself will paint all slides as one-by-one boxes, one therefore has to at least provide
    */
  val Transformation: AffineMatrix2D = js.native
  
  /**
    * Query the current translation offset used to fill the physical screen while keeping aspect ratio.
    *
    * This method returns the translation offset of the view of the view.
    * @returns the slideshowview will be transformed in order to fill the physical screen while keeping the aspect ratio. In order to do so, we need to add a bl
    */
  val TranslationOffset: IntegerSize2D = js.native
  
  /**
    * Add a mouse listener to the view.
    *
    * This method registers a listener with the view, which will get called every time the mouse is clicked on the view.
    * @param xListener Listener interface to call when the mouse is clicked on the view.
    */
  def addMouseListener(xListener: XMouseListener): Unit = js.native
  
  /**
    * Add a mouse motion listener to the view.
    *
    * This method registers a listener with the view, which will get called every time the mouse is moved on the view.
    * @param xListener Listener interface to call when the mouse is moved on the view.
    */
  def addMouseMotionListener(xListener: XMouseMotionListener): Unit = js.native
  
  /**
    * Add a listener to get notified when this view needs a repaint.
    *
    * This method registers a listener with the view, which will get called every time the view needs an update of their screen representation.
    * @param xListener Listener interface to call when the view needs a repaint.
    */
  def addPaintListener(xListener: XPaintListener): Unit = js.native
  
  /**
    * Add a listener to get notified when the transformation matrix changes.
    *
    * This method registers a listener with the view, which will get called every time the transformation matrix changes.
    * @param xListener Listener interface to call when the transformation matrix changes.
    */
  def addTransformationChangedListener(xListener: XModifyListener): Unit = js.native
  
  /**
    * This method clears the whole view area.
    *
    * The slide show uses this method to fully erase the view content. Since the slide show has no notion of view size, this is the only reliable way to
    * wholly clear the view.
    */
  def clear(): Unit = js.native
  
  /**
    * Get view canvas.
    *
    * This method gets the underlying XCanvas to display on this view.
    * @returns XSpriteCanvas to display on. Must be valid, and the same object, as long as this view is added to any slide show.
    */
  def getCanvas(): XSpriteCanvas = js.native
  
  /** Get rectangle defining area inside of canvas device which this slide show view uses. */
  def getCanvasArea(): Rectangle = js.native
  
  /**
    * Query the current transformation matrix for this view.
    *
    * This method returns the transformation matrix of the view. When notified via the transformation change listener, the show will be displayed using the
    * new transformation.
    * @returns the view transformation matrix. Note that the slide show itself will paint all slides as one-by-one boxes, one therefore has to at least provide
    */
  def getTransformation(): AffineMatrix2D = js.native
  
  /**
    * Query the current translation offset used to fill the physical screen while keeping aspect ratio.
    *
    * This method returns the translation offset of the view of the view.
    * @returns the slideshowview will be transformed in order to fill the physical screen while keeping the aspect ratio. In order to do so, we need to add a bl
    */
  def getTranslationOffset(): IntegerSize2D = js.native
  
  /**
    * Revoke a previously registered mouse listener.
    * @param xListener Listener interface to revoke from being called.
    */
  def removeMouseListener(xListener: XMouseListener): Unit = js.native
  
  /**
    * Revoke a previously registered mouse move listener.
    * @param xListener Listener interface to revoke from being called.
    */
  def removeMouseMotionListener(xListener: XMouseMotionListener): Unit = js.native
  
  /**
    * Revoke a previously registered paint listener.
    * @param xListener Listener interface to revoke from being called.
    */
  def removePaintListener(xListener: XPaintListener): Unit = js.native
  
  /**
    * Revoke a previously registered transformation matrix change listener.
    * @param xListener Listener interface to revoke from being called.
    */
  def removeTransformationChangedListener(xListener: XModifyListener): Unit = js.native
  
  /**
    * Change the mouse cursor currently in effect.
    *
    * This method changes the mouse cursor currently in effect, for this view.
    * @param nPointerShape New mouse cursor shape to display for this view. Must be from the {@link com.sun.star.awt.SystemPointer} constant group.
    */
  def setMouseCursor(nPointerShape: Double): Unit = js.native
}
object XSlideShowView {
  
  @scala.inline
  def apply(
    Canvas: XSpriteCanvas,
    CanvasArea: Rectangle,
    Transformation: AffineMatrix2D,
    TranslationOffset: IntegerSize2D,
    acquire: () => Unit,
    addMouseListener: XMouseListener => Unit,
    addMouseMotionListener: XMouseMotionListener => Unit,
    addPaintListener: XPaintListener => Unit,
    addTransformationChangedListener: XModifyListener => Unit,
    clear: () => Unit,
    getCanvas: () => XSpriteCanvas,
    getCanvasArea: () => Rectangle,
    getTransformation: () => AffineMatrix2D,
    getTranslationOffset: () => IntegerSize2D,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeMouseListener: XMouseListener => Unit,
    removeMouseMotionListener: XMouseMotionListener => Unit,
    removePaintListener: XPaintListener => Unit,
    removeTransformationChangedListener: XModifyListener => Unit,
    setMouseCursor: Double => Unit
  ): XSlideShowView = {
    val __obj = js.Dynamic.literal(Canvas = Canvas.asInstanceOf[js.Any], CanvasArea = CanvasArea.asInstanceOf[js.Any], Transformation = Transformation.asInstanceOf[js.Any], TranslationOffset = TranslationOffset.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addMouseListener = js.Any.fromFunction1(addMouseListener), addMouseMotionListener = js.Any.fromFunction1(addMouseMotionListener), addPaintListener = js.Any.fromFunction1(addPaintListener), addTransformationChangedListener = js.Any.fromFunction1(addTransformationChangedListener), clear = js.Any.fromFunction0(clear), getCanvas = js.Any.fromFunction0(getCanvas), getCanvasArea = js.Any.fromFunction0(getCanvasArea), getTransformation = js.Any.fromFunction0(getTransformation), getTranslationOffset = js.Any.fromFunction0(getTranslationOffset), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeMouseListener = js.Any.fromFunction1(removeMouseListener), removeMouseMotionListener = js.Any.fromFunction1(removeMouseMotionListener), removePaintListener = js.Any.fromFunction1(removePaintListener), removeTransformationChangedListener = js.Any.fromFunction1(removeTransformationChangedListener), setMouseCursor = js.Any.fromFunction1(setMouseCursor))
    __obj.asInstanceOf[XSlideShowView]
  }
  
  @scala.inline
  implicit class XSlideShowViewMutableBuilder[Self <: XSlideShowView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddMouseListener(value: XMouseListener => Unit): Self = StObject.set(x, "addMouseListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddMouseMotionListener(value: XMouseMotionListener => Unit): Self = StObject.set(x, "addMouseMotionListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddPaintListener(value: XPaintListener => Unit): Self = StObject.set(x, "addPaintListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddTransformationChangedListener(value: XModifyListener => Unit): Self = StObject.set(x, "addTransformationChangedListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCanvas(value: XSpriteCanvas): Self = StObject.set(x, "Canvas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanvasArea(value: Rectangle): Self = StObject.set(x, "CanvasArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCanvas(value: () => XSpriteCanvas): Self = StObject.set(x, "getCanvas", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCanvasArea(value: () => Rectangle): Self = StObject.set(x, "getCanvasArea", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTransformation(value: () => AffineMatrix2D): Self = StObject.set(x, "getTransformation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTranslationOffset(value: () => IntegerSize2D): Self = StObject.set(x, "getTranslationOffset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveMouseListener(value: XMouseListener => Unit): Self = StObject.set(x, "removeMouseListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveMouseMotionListener(value: XMouseMotionListener => Unit): Self = StObject.set(x, "removeMouseMotionListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemovePaintListener(value: XPaintListener => Unit): Self = StObject.set(x, "removePaintListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveTransformationChangedListener(value: XModifyListener => Unit): Self = StObject.set(x, "removeTransformationChangedListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMouseCursor(value: Double => Unit): Self = StObject.set(x, "setMouseCursor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTransformation(value: AffineMatrix2D): Self = StObject.set(x, "Transformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslationOffset(value: IntegerSize2D): Self = StObject.set(x, "TranslationOffset", value.asInstanceOf[js.Any])
  }
}
