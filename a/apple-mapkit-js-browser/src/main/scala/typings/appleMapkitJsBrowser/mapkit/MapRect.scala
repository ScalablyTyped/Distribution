package typings.appleMapkitJsBrowser.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A rectangular area on a two-dimensional map projection.
  */
@js.native
trait MapRect extends js.Object {
  
  /**
    * Returns a copy of a map rectangle.
    */
  def copy(): MapRect = js.native
  
  /**
    * Indicates whether two map rectangles are equal.
    *
    * @param anotherRect The map rectangle to equate to.
    */
  def equals(anotherRect: MapRect): Boolean = js.native
  
  /**
    * The maximum x-axis value of a rectangle.
    */
  var maxX: Double = js.native
  
  /**
    * The maximum y-axis value of a rectangle.
    */
  var maxY: Double = js.native
  
  /**
    * The mid-point along the x-axis of a rectangle.
    */
  var midX: Double = js.native
  
  /**
    * The mid-point along the y-axis of a rectangle.
    */
  var midY: Double = js.native
  
  /**
    * The minimum x-axis value of a rectangle.
    */
  var minX: Double = js.native
  
  /**
    * The minimum y-axis value of a rectangle.
    */
  var minY: Double = js.native
  
  /**
    * The origin point of a rectangle.
    */
  var origin: MapPoint = js.native
  
  /**
    * @param scaleFactor The scale factor.
    * @param scaleCenter The center map point for scaling.
    */
  def scale(scaleFactor: Double, scaleCenter: MapPoint): MapRect = js.native
  
  /**
    * The width and height of a rectangle, starting from the origin point.
    */
  var size: MapSize = js.native
  
  /**
    * Returns the region that corresponds to a map rectangle.
    */
  def toCoordinateRegion(): CoordinateRegion = js.native
}
object MapRect {
  
  @scala.inline
  def apply(
    copy: () => MapRect,
    equals: MapRect => Boolean,
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
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction0(copy), equals = js.Any.fromFunction1(equals), maxX = maxX.asInstanceOf[js.Any], maxY = maxY.asInstanceOf[js.Any], midX = midX.asInstanceOf[js.Any], midY = midY.asInstanceOf[js.Any], minX = minX.asInstanceOf[js.Any], minY = minY.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], scale = js.Any.fromFunction2(scale), size = size.asInstanceOf[js.Any], toCoordinateRegion = js.Any.fromFunction0(toCoordinateRegion))
    __obj.asInstanceOf[MapRect]
  }
  
  @scala.inline
  implicit class MapRectOps[Self <: MapRect] (val x: Self) extends AnyVal {
    
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
    def setCopy(value: () => MapRect): Self = this.set("copy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEquals(value: MapRect => Boolean): Self = this.set("equals", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMaxX(value: Double): Self = this.set("maxX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxY(value: Double): Self = this.set("maxY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMidX(value: Double): Self = this.set("midX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMidY(value: Double): Self = this.set("midY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinX(value: Double): Self = this.set("minX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinY(value: Double): Self = this.set("minY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigin(value: MapPoint): Self = this.set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScale(value: (Double, MapPoint) => MapRect): Self = this.set("scale", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSize(value: MapSize): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToCoordinateRegion(value: () => CoordinateRegion): Self = this.set("toCoordinateRegion", js.Any.fromFunction0(value))
  }
}
