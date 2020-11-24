package typings.activexLibreoffice.com_.sun.star.chart2

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.drawing.XShape
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
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
  implicit class XChartShapeContainerOps[Self <: XChartShapeContainer] (val x: Self) extends AnyVal {
    
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
    def setShape(value: XShape): Self = this.set("Shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddShape(value: XShape => Unit): Self = this.set("addShape", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetShape(value: () => XShape): Self = this.set("getShape", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveShape(value: XShape => Unit): Self = this.set("removeShape", js.Any.fromFunction1(value))
  }
}
