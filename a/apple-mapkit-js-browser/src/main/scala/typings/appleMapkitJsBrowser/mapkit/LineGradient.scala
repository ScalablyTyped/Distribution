package typings.appleMapkitJsBrowser.mapkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A line that displays with a gradient along the length of the line.
  */
trait LineGradient extends StObject {
  
  /**
    * Adds a color transition point to the gradient.
    *
    * @param offset The unit distance at which to add the color.
    * @param color The CSS color at the transition point.
    */
  def addColorStop(offset: Double, color: String): Unit
  
  /**
    * Adds a color transition at the index point in the list of points within a polyline.
    *
    * @param index A valid index into a polyline’s points.
    * @param color The CSS color at the index point.
    */
  def addColorStopAtIndex(index: Double, color: String): Unit
}
object LineGradient {
  
  inline def apply(addColorStop: (Double, String) => Unit, addColorStopAtIndex: (Double, String) => Unit): LineGradient = {
    val __obj = js.Dynamic.literal(addColorStop = js.Any.fromFunction2(addColorStop), addColorStopAtIndex = js.Any.fromFunction2(addColorStopAtIndex))
    __obj.asInstanceOf[LineGradient]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LineGradient] (val x: Self) extends AnyVal {
    
    inline def setAddColorStop(value: (Double, String) => Unit): Self = StObject.set(x, "addColorStop", js.Any.fromFunction2(value))
    
    inline def setAddColorStopAtIndex(value: (Double, String) => Unit): Self = StObject.set(x, "addColorStopAtIndex", js.Any.fromFunction2(value))
  }
}
