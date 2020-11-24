package typings.activexLibreoffice.com_.sun.star.chart

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * gives access to 3D elements of a three-dimensional chart.
  * @see Dim3DDiagram
  */
@js.native
trait X3DDisplay extends XInterface {
  
  /**
    * @returns the properties of the floor.  This is only valid for three-dimensional diagrams.
    * @see ChartArea
    */
  val Floor: XPropertySet = js.native
  
  /**
    * @returns the properties of the diagram wall(s).  This specifies the properties of the two side walls of the chart scene.  Note that this property is also
    * @see ChartArea
    */
  val Wall: XPropertySet = js.native
  
  /**
    * @returns the properties of the floor.  This is only valid for three-dimensional diagrams.
    * @see ChartArea
    */
  def getFloor(): XPropertySet = js.native
  
  /**
    * @returns the properties of the diagram wall(s).  This specifies the properties of the two side walls of the chart scene.  Note that this property is also
    * @see ChartArea
    */
  def getWall(): XPropertySet = js.native
}
object X3DDisplay {
  
  @scala.inline
  def apply(
    Floor: XPropertySet,
    Wall: XPropertySet,
    acquire: () => Unit,
    getFloor: () => XPropertySet,
    getWall: () => XPropertySet,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): X3DDisplay = {
    val __obj = js.Dynamic.literal(Floor = Floor.asInstanceOf[js.Any], Wall = Wall.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getFloor = js.Any.fromFunction0(getFloor), getWall = js.Any.fromFunction0(getWall), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[X3DDisplay]
  }
  
  @scala.inline
  implicit class X3DDisplayOps[Self <: X3DDisplay] (val x: Self) extends AnyVal {
    
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
    def setFloor(value: XPropertySet): Self = this.set("Floor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWall(value: XPropertySet): Self = this.set("Wall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetFloor(value: () => XPropertySet): Self = this.set("getFloor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetWall(value: () => XPropertySet): Self = this.set("getWall", js.Any.fromFunction0(value))
  }
}
