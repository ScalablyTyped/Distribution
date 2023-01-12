package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.Point
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The {@link XCustomShapeHandle} */
trait XCustomShapeHandle
  extends StObject
     with XInterface {
  
  /**
    * is getting the actual handle position
    * @returns a the actual handle position
    */
  val Position: Point
  
  /**
    * is getting the actual handle position
    * @returns a the actual handle position
    */
  def getPosition(): Point
  
  /** is setting a new position for the handle */
  def setControllerPosition(aPoint: Point): Unit
}
object XCustomShapeHandle {
  
  inline def apply(
    Position: Point,
    acquire: () => Unit,
    getPosition: () => Point,
    queryInterface: `type` => Any,
    release: () => Unit,
    setControllerPosition: Point => Unit
  ): XCustomShapeHandle = {
    val __obj = js.Dynamic.literal(Position = Position.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getPosition = js.Any.fromFunction0(getPosition), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setControllerPosition = js.Any.fromFunction1(setControllerPosition))
    __obj.asInstanceOf[XCustomShapeHandle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XCustomShapeHandle] (val x: Self) extends AnyVal {
    
    inline def setGetPosition(value: () => Point): Self = StObject.set(x, "getPosition", js.Any.fromFunction0(value))
    
    inline def setPosition(value: Point): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
    
    inline def setSetControllerPosition(value: Point => Unit): Self = StObject.set(x, "setControllerPosition", js.Any.fromFunction1(value))
  }
}
