package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to attach an output device to the object.
  *
  * This kind of object is called view-object.
  */
trait XView
  extends StObject
     with XInterface {
  
  /** returns the output device which was set using the method {@link XView.setGraphics()} . */
  var Graphics: XGraphics
  
  /**
    * returns the size of the object in device units.
    *
    * A device must be set before.
    */
  val Size: typings.activexLibreoffice.com_.sun.star.awt.Size
  
  /**
    * draws the object at the specified position.
    *
    * If the output should be clipped, the caller has to set the clipping region.
    */
  def draw(nX: Double, nY: Double): Unit
  
  /** returns the output device which was set using the method {@link XView.setGraphics()} . */
  def getGraphics(): XGraphics
  
  /**
    * returns the size of the object in device units.
    *
    * A device must be set before.
    */
  def getSize(): typings.activexLibreoffice.com_.sun.star.awt.Size
  
  /** sets the output device. */
  def setGraphics(aDevice: XGraphics): Boolean
  
  /**
    * sets the zoom factor.
    *
    * The zoom factor only affects the content of the view, not the size.
    */
  def setZoom(fZoomX: Double, fZoomY: Double): Unit
}
object XView {
  
  inline def apply(
    Graphics: XGraphics,
    Size: Size,
    acquire: () => Unit,
    draw: (Double, Double) => Unit,
    getGraphics: () => XGraphics,
    getSize: () => Size,
    queryInterface: `type` => Any,
    release: () => Unit,
    setGraphics: XGraphics => Boolean,
    setZoom: (Double, Double) => Unit
  ): XView = {
    val __obj = js.Dynamic.literal(Graphics = Graphics.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), draw = js.Any.fromFunction2(draw), getGraphics = js.Any.fromFunction0(getGraphics), getSize = js.Any.fromFunction0(getSize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setGraphics = js.Any.fromFunction1(setGraphics), setZoom = js.Any.fromFunction2(setZoom))
    __obj.asInstanceOf[XView]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XView] (val x: Self) extends AnyVal {
    
    inline def setDraw(value: (Double, Double) => Unit): Self = StObject.set(x, "draw", js.Any.fromFunction2(value))
    
    inline def setGetGraphics(value: () => XGraphics): Self = StObject.set(x, "getGraphics", js.Any.fromFunction0(value))
    
    inline def setGetSize(value: () => Size): Self = StObject.set(x, "getSize", js.Any.fromFunction0(value))
    
    inline def setGraphics(value: XGraphics): Self = StObject.set(x, "Graphics", value.asInstanceOf[js.Any])
    
    inline def setSetGraphics(value: XGraphics => Boolean): Self = StObject.set(x, "setGraphics", js.Any.fromFunction1(value))
    
    inline def setSetZoom(value: (Double, Double) => Unit): Self = StObject.set(x, "setZoom", js.Any.fromFunction2(value))
    
    inline def setSize(value: Size): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
  }
}
