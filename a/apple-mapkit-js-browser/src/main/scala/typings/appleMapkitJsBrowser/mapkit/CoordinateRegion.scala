package typings.appleMapkitJsBrowser.mapkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A rectangular area on a map defined by a center coordinate and a span,
  * expressed in degrees of latitude and longitude.
  */
trait CoordinateRegion extends StObject {
  
  /**
    * The center point of the region.
    */
  var center: Coordinate
  
  /**
    * Returns a copy of the calling coordinate region.
    */
  def copy(): CoordinateRegion
  
  /**
    * Returns a Boolean value indicating whether two regions are equal.
    */
  def equals(anotherRegion: CoordinateRegion): Boolean
  
  /**
    * The distance provided in meters or the longest distance derived from the center point to the region’s bounding box.
    */
  val radius: Double
  
  /**
    * The horizontal and vertical span representing the amount of map to display.
    */
  var span: CoordinateSpan
  
  /**
    * Returns the bounding region that corresponds to the calling coordinate region.
    */
  def toBoundingRegion(): BoundingRegion
  
  /**
    * Returns the map rectangle that corresponds to the calling coordinate region.
    */
  def toMapRect(): MapRect
}
object CoordinateRegion {
  
  inline def apply(
    center: Coordinate,
    copy: () => CoordinateRegion,
    equals_ : CoordinateRegion => Boolean,
    radius: Double,
    span: CoordinateSpan,
    toBoundingRegion: () => BoundingRegion,
    toMapRect: () => MapRect
  ): CoordinateRegion = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], copy = js.Any.fromFunction0(copy), radius = radius.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], toBoundingRegion = js.Any.fromFunction0(toBoundingRegion), toMapRect = js.Any.fromFunction0(toMapRect))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[CoordinateRegion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoordinateRegion] (val x: Self) extends AnyVal {
    
    inline def setCenter(value: Coordinate): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setCopy(value: () => CoordinateRegion): Self = StObject.set(x, "copy", js.Any.fromFunction0(value))
    
    inline def setEquals_(value: CoordinateRegion => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setSpan(value: CoordinateSpan): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
    
    inline def setToBoundingRegion(value: () => BoundingRegion): Self = StObject.set(x, "toBoundingRegion", js.Any.fromFunction0(value))
    
    inline def setToMapRect(value: () => MapRect): Self = StObject.set(x, "toMapRect", js.Any.fromFunction0(value))
  }
}
