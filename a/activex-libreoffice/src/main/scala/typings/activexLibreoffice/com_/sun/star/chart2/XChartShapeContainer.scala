package typings.activexLibreoffice.com_.sun.star.chart2

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.drawing.XShape
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XChartShapeContainer extends XInterface {
  
  val Shape: XShape = js.native
  
  /** a renderer creates ChartShapes and adds it to this container */
  def addShape(xShape: XShape): Unit = js.native
  
  def getShape(): XShape = js.native
  
  /** a renderer can remove ChartShapes from this container (e.g. if the visible range has changed) */
  def removeShape(xShape: XShape): Unit = js.native
}
object XChartShapeContainer {
  
  @scala.inline
  def apply(
    Shape: XShape,
    acquire: () => Unit,
    addShape: XShape => Unit,
    getShape: () => XShape,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeShape: XShape => Unit
  ): XChartShapeContainer = {
    val __obj = js.Dynamic.literal(Shape = Shape.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addShape = js.Any.fromFunction1(addShape), getShape = js.Any.fromFunction0(getShape), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeShape = js.Any.fromFunction1(removeShape))
    __obj.asInstanceOf[XChartShapeContainer]
  }
  
  @scala.inline
  implicit class XChartShapeContainerMutableBuilder[Self <: XChartShapeContainer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddShape(value: XShape => Unit): Self = StObject.set(x, "addShape", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetShape(value: () => XShape): Self = StObject.set(x, "getShape", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveShape(value: XShape => Unit): Self = StObject.set(x, "removeShape", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShape(value: XShape): Self = StObject.set(x, "Shape", value.asInstanceOf[js.Any])
  }
}
