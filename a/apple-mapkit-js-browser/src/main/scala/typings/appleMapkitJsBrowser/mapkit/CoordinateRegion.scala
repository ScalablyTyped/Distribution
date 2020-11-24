package typings.appleMapkitJsBrowser.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A rectangular area on a map defined by a center coordinate and a span,
  * expressed in degrees of latitude and longitude.
  */
@js.native
trait CoordinateRegion extends js.Object {
  
  /**
    * The center point of the region.
    */
  var center: Coordinate = js.native
  
  /**
    * Returns a copy of the calling coordinate region.
    */
  def copy(): CoordinateRegion = js.native
  
  /**
    * Returns a Boolean value indicating whether two regions are equal.
    */
  def equals(anotherRegion: CoordinateRegion): Boolean = js.native
  
  /**
    * The distance provided in meters or the longest distance derived from the center point to the region’s bounding box.
    */
  val radius: Double = js.native
  
  /**
    * The horizontal and vertical span representing the amount of map to display.
    */
  var span: CoordinateSpan = js.native
  
  /**
    * Returns the bounding region that corresponds to the calling coordinate region.
    */
  def toBoundingRegion(): BoundingRegion = js.native
  
  /**
    * Returns the map rectangle that corresponds to the calling coordinate region.
    */
  def toMapRect(): MapRect = js.native
}
object CoordinateRegion {
  
  @scala.inline
  def apply(
    center: Coordinate,
    copy: () => CoordinateRegion,
    equals: CoordinateRegion => Boolean,
    radius: Double,
    span: CoordinateSpan,
    toBoundingRegion: () => BoundingRegion,
    toMapRect: () => MapRect
  ): CoordinateRegion = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], copy = js.Any.fromFunction0(copy), equals = js.Any.fromFunction1(equals), radius = radius.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], toBoundingRegion = js.Any.fromFunction0(toBoundingRegion), toMapRect = js.Any.fromFunction0(toMapRect))
    __obj.asInstanceOf[CoordinateRegion]
  }
  
  @scala.inline
  implicit class CoordinateRegionOps[Self <: CoordinateRegion] (val x: Self) extends AnyVal {
    
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
    def setCenter(value: Coordinate): Self = this.set("center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopy(value: () => CoordinateRegion): Self = this.set("copy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEquals(value: CoordinateRegion => Boolean): Self = this.set("equals", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpan(value: CoordinateSpan): Self = this.set("span", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToBoundingRegion(value: () => BoundingRegion): Self = this.set("toBoundingRegion", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToMapRect(value: () => MapRect): Self = this.set("toMapRect", js.Any.fromFunction0(value))
  }
}
