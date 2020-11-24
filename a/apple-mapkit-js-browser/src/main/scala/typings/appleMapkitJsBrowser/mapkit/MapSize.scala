package typings.appleMapkitJsBrowser.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A pair of values in map units that define the width and height of a
  * projected coordinate span.
  */
@js.native
trait MapSize extends js.Object {
  
  /**
    * Returns a copy of a map size.
    */
  def copy(): MapSize = js.native
  
  /**
    * Indicates whether two map sizes are equal.
    *
    * @param anotherSize The map size to equate to.
    */
  def equals(anotherSize: MapSize): Boolean = js.native
  
  /**
    * The height value, in map point units.
    */
  var height: Double = js.native
  
  /**
    * The width value, in map point units.
    */
  var width: Double = js.native
}
object MapSize {
  
  @scala.inline
  def apply(copy: () => MapSize, equals: MapSize => Boolean, height: Double, width: Double): MapSize = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction0(copy), equals = js.Any.fromFunction1(equals), height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapSize]
  }
  
  @scala.inline
  implicit class MapSizeOps[Self <: MapSize] (val x: Self) extends AnyVal {
    
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
    def setCopy(value: () => MapSize): Self = this.set("copy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEquals(value: MapSize => Boolean): Self = this.set("equals", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
}
