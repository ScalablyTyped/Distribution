package typings.activexLibreoffice.com_.sun.star.chart2

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.Point
import typings.activexLibreoffice.com_.sun.star.awt.Size
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** this interface is used for a wrapper of objects implementing the service {@link com.sun.star.drawing.Shape} */
trait XChartShape
  extends StObject
     with XInterface {
  
  /** the method corresponds to the identical methods of the interface {@link com.sun.star.drawing.XShape} */
  var Position: Point
  
  /** the method corresponds to the identical methods of the interface {@link com.sun.star.drawing.XShape} ??????????? deprecated */
  val ShapeType: String
  
  /** the method corresponds to the identical methods of the interface {@link com.sun.star.drawing.XShape} */
  var Size: typings.activexLibreoffice.com_.sun.star.awt.Size
  
  /** the method corresponds to the identical methods of the interface {@link com.sun.star.drawing.XShape} */
  def getPosition(): Point
  
  /** the method corresponds to the identical methods of the interface {@link com.sun.star.beans.XPropertySet} */
  def getPropertyValue(PropertyName: String): js.Any
  
  /** the method corresponds to the identical methods of the interface {@link com.sun.star.drawing.XShape} ??????????? deprecated */
  def getShapeType(): String
  
  /** the method corresponds to the identical methods of the interface {@link com.sun.star.drawing.XShape} */
  def getSize(): Size
  
  /** the method corresponds to the identical methods of the interface {@link com.sun.star.drawing.XShape} */
  def setPosition(aPosition: Point): Unit
  
  /** the method corresponds to the identical methods of the interface {@link com.sun.star.beans.XPropertySet} */
  def setPropertyValue(aPropertyName: String, aValue: js.Any): Unit
  
  /** the method corresponds to the identical methods of the interface {@link com.sun.star.drawing.XShape} */
  def setSize(aSize: Size): Unit
}
object XChartShape {
  
  inline def apply(
    Position: Point,
    ShapeType: String,
    Size: Size,
    acquire: () => Unit,
    getPosition: () => Point,
    getPropertyValue: String => js.Any,
    getShapeType: () => String,
    getSize: () => Size,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setPosition: Point => Unit,
    setPropertyValue: (String, js.Any) => Unit,
    setSize: Size => Unit
  ): XChartShape = {
    val __obj = js.Dynamic.literal(Position = Position.asInstanceOf[js.Any], ShapeType = ShapeType.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getPosition = js.Any.fromFunction0(getPosition), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getShapeType = js.Any.fromFunction0(getShapeType), getSize = js.Any.fromFunction0(getSize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setPosition = js.Any.fromFunction1(setPosition), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setSize = js.Any.fromFunction1(setSize))
    __obj.asInstanceOf[XChartShape]
  }
  
  extension [Self <: XChartShape](x: Self) {
    
    inline def setGetPosition(value: () => Point): Self = StObject.set(x, "getPosition", js.Any.fromFunction0(value))
    
    inline def setGetPropertyValue(value: String => js.Any): Self = StObject.set(x, "getPropertyValue", js.Any.fromFunction1(value))
    
    inline def setGetShapeType(value: () => String): Self = StObject.set(x, "getShapeType", js.Any.fromFunction0(value))
    
    inline def setGetSize(value: () => Size): Self = StObject.set(x, "getSize", js.Any.fromFunction0(value))
    
    inline def setPosition(value: Point): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
    
    inline def setSetPosition(value: Point => Unit): Self = StObject.set(x, "setPosition", js.Any.fromFunction1(value))
    
    inline def setSetPropertyValue(value: (String, js.Any) => Unit): Self = StObject.set(x, "setPropertyValue", js.Any.fromFunction2(value))
    
    inline def setSetSize(value: Size => Unit): Self = StObject.set(x, "setSize", js.Any.fromFunction1(value))
    
    inline def setShapeType(value: String): Self = StObject.set(x, "ShapeType", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Size): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
  }
}
