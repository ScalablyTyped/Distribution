package typings.appleMapkitJsBrowser.mapkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A location on a map when the Earth's surface is projected onto a
  * two-dimensional surface.
  */
trait MapPoint extends StObject {
  
  /**
    * Returns a copy of a map point.
    */
  def copy(): MapPoint
  
  /**
    * Indicates whether two map points are equal.
    *
    * @param anotherPoint A map point to use for comparison.
    */
  def equals(anotherPoint: MapPoint): Boolean
  
  /**
    * Returns a coordinate containing the latitude and longitude corresponding
    * to a map point.
    */
  def toCoordinate(): Coordinate
  
  /**
    * The location of the point along the x-axis of the map.
    */
  var x: Double
  
  /**
    * The location of the point along the y-axis of the map.
    */
  var y: Double
}
object MapPoint {
  
  inline def apply(
    copy: () => MapPoint,
    equals_ : MapPoint => Boolean,
    toCoordinate: () => Coordinate,
    x: Double,
    y: Double
  ): MapPoint = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction0(copy), toCoordinate = js.Any.fromFunction0(toCoordinate), x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[MapPoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MapPoint] (val x: Self) extends AnyVal {
    
    inline def setCopy(value: () => MapPoint): Self = StObject.set(x, "copy", js.Any.fromFunction0(value))
    
    inline def setEquals_(value: MapPoint => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setToCoordinate(value: () => Coordinate): Self = StObject.set(x, "toCoordinate", js.Any.fromFunction0(value))
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
