package typings.appleMapkitJsBrowser.mapkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object representing the latitude and longitude for a point on the
  * Earth's surface.
  */
trait Coordinate extends StObject {
  
  /**
    * Returns a copy of the coordinate.
    */
  def copy(): Coordinate
  
  /**
    * Returns a Boolean value indicating whether two coordinates are equal.
    */
  def equals(anotherCoordinate: Coordinate): Boolean
  
  /**
    * The latitude in degrees.
    */
  var latitude: Double
  
  /**
    * The longitude in degrees.
    */
  var longitude: Double
  
  /**
    * Returns the map point that corresponds to the coordinate.
    */
  def toMapPoint(): MapPoint
  
  /**
    * Returns the unwrapped map point that corresponds to the coordinate.
    */
  def toUnwrappedMapPoint(): MapPoint
}
object Coordinate {
  
  @scala.inline
  def apply(
    copy: () => Coordinate,
    equals_ : Coordinate => Boolean,
    latitude: Double,
    longitude: Double,
    toMapPoint: () => MapPoint,
    toUnwrappedMapPoint: () => MapPoint
  ): Coordinate = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction0(copy), latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], toMapPoint = js.Any.fromFunction0(toMapPoint), toUnwrappedMapPoint = js.Any.fromFunction0(toUnwrappedMapPoint))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[Coordinate]
  }
  
  @scala.inline
  implicit class CoordinateMutableBuilder[Self <: Coordinate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCopy(value: () => Coordinate): Self = StObject.set(x, "copy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEquals_(value: Coordinate => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToMapPoint(value: () => MapPoint): Self = StObject.set(x, "toMapPoint", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToUnwrappedMapPoint(value: () => MapPoint): Self = StObject.set(x, "toUnwrappedMapPoint", js.Any.fromFunction0(value))
  }
}
