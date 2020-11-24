package typings.appleMapkitJsBrowser.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A line that displays with a gradient along the length of the line.
  */
@js.native
trait LineGradient extends js.Object {
  
  /**
    * Adds a color transition point to the gradient.
    *
    * @param offset The unit distance at which to add the color.
    * @param color The CSS color at the transition point.
    */
  def addColorStop(offset: Double, color: String): Unit = js.native
  
  /**
    * Adds a color transition at the index point in the list of points within a polyline.
    *
    * @param index A valid index into a polyline’s points.
    * @param color The CSS color at the index point.
    */
  def addColorStopAtIndex(index: Double, color: String): Unit = js.native
}
object LineGradient {
  
  @scala.inline
  def apply(addColorStop: (Double, String) => Unit, addColorStopAtIndex: (Double, String) => Unit): LineGradient = {
    val __obj = js.Dynamic.literal(addColorStop = js.Any.fromFunction2(addColorStop), addColorStopAtIndex = js.Any.fromFunction2(addColorStopAtIndex))
    __obj.asInstanceOf[LineGradient]
  }
  
  @scala.inline
  implicit class LineGradientOps[Self <: LineGradient] (val x: Self) extends AnyVal {
    
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
    def setAddColorStop(value: (Double, String) => Unit): Self = this.set("addColorStop", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAddColorStopAtIndex(value: (Double, String) => Unit): Self = this.set("addColorStopAtIndex", js.Any.fromFunction2(value))
  }
}
