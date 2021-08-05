package typings.appleMapkitJsBrowser.mapkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The width and height of a map region.
  */
trait CoordinateSpan extends StObject {
  
  /**
    * Returns a copy of the coordinate span.
    */
  def copy(): CoordinateSpan
  
  /**
    * Returns a Boolean value that indicates whether two spans are equal.
    */
  def equals(anotherSpan: CoordinateSpan): Boolean
  
  /**
    * The amount of north-to-south distance (measured in degrees) to display on
    * the map.
    */
  var latitudeDelta: Double
  
  /**
    * The amount of east-to-west distance (measured in degrees) to display for
    * the map region.
    */
  var longitudeDelta: Double
}
object CoordinateSpan {
  
  inline def apply(
    copy: () => CoordinateSpan,
    equals_ : CoordinateSpan => Boolean,
    latitudeDelta: Double,
    longitudeDelta: Double
  ): CoordinateSpan = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction0(copy), latitudeDelta = latitudeDelta.asInstanceOf[js.Any], longitudeDelta = longitudeDelta.asInstanceOf[js.Any])
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[CoordinateSpan]
  }
  
  extension [Self <: CoordinateSpan](x: Self) {
    
    inline def setCopy(value: () => CoordinateSpan): Self = StObject.set(x, "copy", js.Any.fromFunction0(value))
    
    inline def setEquals_(value: CoordinateSpan => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setLatitudeDelta(value: Double): Self = StObject.set(x, "latitudeDelta", value.asInstanceOf[js.Any])
    
    inline def setLongitudeDelta(value: Double): Self = StObject.set(x, "longitudeDelta", value.asInstanceOf[js.Any])
  }
}
