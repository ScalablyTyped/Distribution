package typings.appleMapkitJsBrowser.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object representing the latitude and longitude for a point on the
  * Earth's surface.
  */
@js.native
trait Coordinate extends js.Object {
  
  /**
    * Returns a copy of the coordinate.
    */
  def copy(): Coordinate = js.native
  
  /**
    * Returns a Boolean value indicating whether two coordinates are equal.
    */
  def equals(anotherCoordinate: Coordinate): Boolean = js.native
  
  /**
    * The latitude in degrees.
    */
  var latitude: Double = js.native
  
  /**
    * The longitude in degrees.
    */
  var longitude: Double = js.native
  
  /**
    * Returns the map point that corresponds to the coordinate.
    */
  def toMapPoint(): MapPoint = js.native
  
  /**
    * Returns the unwrapped map point that corresponds to the coordinate.
    */
  def toUnwrappedMapPoint(): MapPoint = js.native
}
object Coordinate {
  
  @scala.inline
  def apply(
    copy: () => Coordinate,
    equals: Coordinate => Boolean,
    latitude: Double,
    longitude: Double,
    toMapPoint: () => MapPoint,
    toUnwrappedMapPoint: () => MapPoint
  ): Coordinate = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction0(copy), equals = js.Any.fromFunction1(equals), latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], toMapPoint = js.Any.fromFunction0(toMapPoint), toUnwrappedMapPoint = js.Any.fromFunction0(toUnwrappedMapPoint))
    __obj.asInstanceOf[Coordinate]
  }
  
  @scala.inline
  implicit class CoordinateOps[Self <: Coordinate] (val x: Self) extends AnyVal {
    
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
    def setCopy(value: () => Coordinate): Self = this.set("copy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEquals(value: Coordinate => Boolean): Self = this.set("equals", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLatitude(value: Double): Self = this.set("latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitude(value: Double): Self = this.set("longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToMapPoint(value: () => MapPoint): Self = this.set("toMapPoint", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToUnwrappedMapPoint(value: () => MapPoint): Self = this.set("toUnwrappedMapPoint", js.Any.fromFunction0(value))
  }
}
