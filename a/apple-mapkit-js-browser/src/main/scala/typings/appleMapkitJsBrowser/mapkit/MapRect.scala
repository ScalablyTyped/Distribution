package typings.appleMapkitJsBrowser.mapkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A rectangular area on a two-dimensional map projection.
  */
trait MapRect extends StObject {
  
  /**
    * Returns a copy of a map rectangle.
    */
  def copy(): MapRect
  
  /**
    * Indicates whether two map rectangles are equal.
    *
    * @param anotherRect The map rectangle to equate to.
    */
  def equals(anotherRect: MapRect): Boolean
  
  /**
    * The maximum x-axis value of a rectangle.
    */
  var maxX: Double
  
  /**
    * The maximum y-axis value of a rectangle.
    */
  var maxY: Double
  
  /**
    * The mid-point along the x-axis of a rectangle.
    */
  var midX: Double
  
  /**
    * The mid-point along the y-axis of a rectangle.
    */
  var midY: Double
  
  /**
    * The minimum x-axis value of a rectangle.
    */
  var minX: Double
  
  /**
    * The minimum y-axis value of a rectangle.
    */
  var minY: Double
  
  /**
    * The origin point of a rectangle.
    */
  var origin: MapPoint
  
  /**
    * @param scaleFactor The scale factor.
    * @param scaleCenter The center map point for scaling.
    */
  def scale(scaleFactor: Double, scaleCenter: MapPoint): MapRect
  
  /**
    * The width and height of a rectangle, starting from the origin point.
    */
  var size: MapSize
  
  /**
    * Returns the region that corresponds to a map rectangle.
    */
  def toCoordinateRegion(): CoordinateRegion
}
object MapRect {
  
  inline def apply(
    copy: () => MapRect,
    equals_ : MapRect => Boolean,
    maxX: Double,
    maxY: Double,
    midX: Double,
    midY: Double,
    minX: Double,
    minY: Double,
    origin: MapPoint,
    scale: (Double, MapPoint) => MapRect,
    size: MapSize,
    toCoordinateRegion: () => CoordinateRegion
  ): MapRect = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction0(copy), maxX = maxX.asInstanceOf[js.Any], maxY = maxY.asInstanceOf[js.Any], midX = midX.asInstanceOf[js.Any], midY = midY.asInstanceOf[js.Any], minX = minX.asInstanceOf[js.Any], minY = minY.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], scale = js.Any.fromFunction2(scale), size = size.asInstanceOf[js.Any], toCoordinateRegion = js.Any.fromFunction0(toCoordinateRegion))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[MapRect]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MapRect] (val x: Self) extends AnyVal {
    
    inline def setCopy(value: () => MapRect): Self = StObject.set(x, "copy", js.Any.fromFunction0(value))
    
    inline def setEquals_(value: MapRect => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setMaxX(value: Double): Self = StObject.set(x, "maxX", value.asInstanceOf[js.Any])
    
    inline def setMaxY(value: Double): Self = StObject.set(x, "maxY", value.asInstanceOf[js.Any])
    
    inline def setMidX(value: Double): Self = StObject.set(x, "midX", value.asInstanceOf[js.Any])
    
    inline def setMidY(value: Double): Self = StObject.set(x, "midY", value.asInstanceOf[js.Any])
    
    inline def setMinX(value: Double): Self = StObject.set(x, "minX", value.asInstanceOf[js.Any])
    
    inline def setMinY(value: Double): Self = StObject.set(x, "minY", value.asInstanceOf[js.Any])
    
    inline def setOrigin(value: MapPoint): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setScale(value: (Double, MapPoint) => MapRect): Self = StObject.set(x, "scale", js.Any.fromFunction2(value))
    
    inline def setSize(value: MapSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setToCoordinateRegion(value: () => CoordinateRegion): Self = StObject.set(x, "toCoordinateRegion", js.Any.fromFunction0(value))
  }
}
