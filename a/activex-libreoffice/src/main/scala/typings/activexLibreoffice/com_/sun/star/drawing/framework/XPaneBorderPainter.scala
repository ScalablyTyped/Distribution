package typings.activexLibreoffice.com_.sun.star.drawing.framework

import typings.activexLibreoffice.com_.sun.star.awt.Point
import typings.activexLibreoffice.com_.sun.star.awt.Rectangle
import typings.activexLibreoffice.com_.sun.star.rendering.XCanvas
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Paint the border around a rectangular region, typically a pane.
  *
  * Calling objects have to be able to derive inner bounding boxes of the border from the outer ones and inner ones from outer ones. This conversion and
  * the painting of the border involves three rectangles. The inner and outer bounding box of the border. This is a logical bounding box which the paint
  * methods may paint over. The center box is the third rectangle. This is the actual border between outer and inner background color or bitmap and it is
  * used for placing the bitmaps that are used paint the border. The inner sides and corners are places relative to this center box, i.e. when not further
  * offsets are given then the upper left corner bitmap is painted with its lower right at the upper left of the center box.
  */
trait XPaneBorderPainter extends StObject {
  
  /**
    * Enlarge the given rectangle by the size of the specified part of the border. This method can be used to convert an inner bounding box into the center
    * box or the outer bounding box.
    * @param sPaneBorderStyleName The pane style defines the sizes of the border.
    * @param aRectangle This rectangle will be converted into a larger one. This should be the center box or the inner bounding box of the border.
    * @param eBorderType The part of the border to add to the given rectangle. Use INNER_BORDER to convert an inner bounding box into the center box or TOTAL_
    */
  def addBorder(sPaneBorderStyleName: String, aRectangle: Rectangle, eBorderType: BorderType): Rectangle
  
  /**
    * Return the offset of a call out anchor with respect to the outer border. This value is used when the call out is realized by a fixed bitmap in order
    * to determine the size and/or location of the outer border for a given call out.
    */
  def getCalloutOffset(sPaneBorderStyleName: String): Point
  
  /**
    * Paint the border around a pane.
    * @param sPaneBorderStyleName The pane style to use for painting the border.
    * @param xCanvas The canvas onto which the border is painted.
    * @param aOuterBorderRectangle The outer bounding box of the border. Use addBorder to convert the bounding box of a pane (the inner bounding box of the bo
    * @param aRepaintArea The area in which the border has to be repainted. The clip rectangle.
    * @param sTitle The pane title. Supply an empty string for panes without title. It is the responsibility of the caller to supply a title only for pane bor
    */
  def paintBorder(
    sPaneBorderStyleName: String,
    xCanvas: XCanvas,
    aOuterBorderRectangle: Rectangle,
    aRepaintArea: Rectangle,
    sTitle: String
  ): Unit
  
  /**
    * Paint the border around a pane where the border includes a call out that is anchored at the given point. Most arguments have the same meaning as in
    * the {@link paintBorder()} .
    * @param sPaneBorderStyleName See description in {@link paintBorder} .
    * @param xCanvas See description in {@link paintBorder} .
    * @param aOuterBorderRectangle See description in {@link paintBorder} .
    * @param aRepaintArea See description in {@link paintBorder} .
    * @param sTitle See description in {@link paintBorder} .
    * @param aCalloutAnchor The anchor point of the call out. It is usually located outside the border.
    * @see paintBorder
    */
  def paintBorderWithCallout(
    sPaneBorderStyleName: String,
    xCanvas: XCanvas,
    aOuterBorderRectangle: Rectangle,
    aRepaintArea: Rectangle,
    sTitle: String,
    aCalloutAnchor: Point
  ): Unit
  
  /**
    * Shrink the given rectangle by the size of the specified part of the border. This method can be used to convert an outer bounding box into the center
    * box or the inner bounding box.
    * @param sPaneBorderStyleName The pane style defines the sizes of the border.
    * @param aRectangle This rectangle will be converted into a smaller one that lies inside it. It should be the center box or the outer bounding box of the
    * @param eBorderType The part of the border to remove from the given rectangle. Use OUTER_BORDER to convert an outer bounding box into the center box or T
    */
  def removeBorder(sPaneBorderStyleName: String, aRectangle: Rectangle, eBorderType: BorderType): Rectangle
}
object XPaneBorderPainter {
  
  @scala.inline
  def apply(
    addBorder: (String, Rectangle, BorderType) => Rectangle,
    getCalloutOffset: String => Point,
    paintBorder: (String, XCanvas, Rectangle, Rectangle, String) => Unit,
    paintBorderWithCallout: (String, XCanvas, Rectangle, Rectangle, String, Point) => Unit,
    removeBorder: (String, Rectangle, BorderType) => Rectangle
  ): XPaneBorderPainter = {
    val __obj = js.Dynamic.literal(addBorder = js.Any.fromFunction3(addBorder), getCalloutOffset = js.Any.fromFunction1(getCalloutOffset), paintBorder = js.Any.fromFunction5(paintBorder), paintBorderWithCallout = js.Any.fromFunction6(paintBorderWithCallout), removeBorder = js.Any.fromFunction3(removeBorder))
    __obj.asInstanceOf[XPaneBorderPainter]
  }
  
  @scala.inline
  implicit class XPaneBorderPainterMutableBuilder[Self <: XPaneBorderPainter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddBorder(value: (String, Rectangle, BorderType) => Rectangle): Self = StObject.set(x, "addBorder", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetCalloutOffset(value: String => Point): Self = StObject.set(x, "getCalloutOffset", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPaintBorder(value: (String, XCanvas, Rectangle, Rectangle, String) => Unit): Self = StObject.set(x, "paintBorder", js.Any.fromFunction5(value))
    
    @scala.inline
    def setPaintBorderWithCallout(value: (String, XCanvas, Rectangle, Rectangle, String, Point) => Unit): Self = StObject.set(x, "paintBorderWithCallout", js.Any.fromFunction6(value))
    
    @scala.inline
    def setRemoveBorder(value: (String, Rectangle, BorderType) => Rectangle): Self = StObject.set(x, "removeBorder", js.Any.fromFunction3(value))
  }
}
