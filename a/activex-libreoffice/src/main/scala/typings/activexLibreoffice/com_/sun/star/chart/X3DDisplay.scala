package typings.activexLibreoffice.com_.sun.star.chart

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * gives access to 3D elements of a three-dimensional chart.
  * @see Dim3DDiagram
  */
trait X3DDisplay
  extends StObject
     with XInterface {
  
  /**
    * @returns the properties of the floor.  This is only valid for three-dimensional diagrams.
    * @see ChartArea
    */
  val Floor: XPropertySet
  
  /**
    * @returns the properties of the diagram wall(s).  This specifies the properties of the two side walls of the chart scene.  Note that this property is also
    * @see ChartArea
    */
  val Wall: XPropertySet
  
  /**
    * @returns the properties of the floor.  This is only valid for three-dimensional diagrams.
    * @see ChartArea
    */
  def getFloor(): XPropertySet
  
  /**
    * @returns the properties of the diagram wall(s).  This specifies the properties of the two side walls of the chart scene.  Note that this property is also
    * @see ChartArea
    */
  def getWall(): XPropertySet
}
object X3DDisplay {
  
  inline def apply(
    Floor: XPropertySet,
    Wall: XPropertySet,
    acquire: () => Unit,
    getFloor: () => XPropertySet,
    getWall: () => XPropertySet,
    queryInterface: `type` => Any,
    release: () => Unit
  ): X3DDisplay = {
    val __obj = js.Dynamic.literal(Floor = Floor.asInstanceOf[js.Any], Wall = Wall.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getFloor = js.Any.fromFunction0(getFloor), getWall = js.Any.fromFunction0(getWall), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[X3DDisplay]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: X3DDisplay] (val x: Self) extends AnyVal {
    
    inline def setFloor(value: XPropertySet): Self = StObject.set(x, "Floor", value.asInstanceOf[js.Any])
    
    inline def setGetFloor(value: () => XPropertySet): Self = StObject.set(x, "getFloor", js.Any.fromFunction0(value))
    
    inline def setGetWall(value: () => XPropertySet): Self = StObject.set(x, "getWall", js.Any.fromFunction0(value))
    
    inline def setWall(value: XPropertySet): Self = StObject.set(x, "Wall", value.asInstanceOf[js.Any])
  }
}
