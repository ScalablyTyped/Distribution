package typings.appleMapkitJsBrowser.mapkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A rectangular area on a map, defined by coordinates of the rectangle's
  * northeast and southwest corners.
  */
@js.native
trait BoundingRegion extends StObject {
  
  /**
    * Returns a copy of the calling bounding region.
    */
  def copy(): BoundingRegion = js.native
  
  /**
    * The east longitude of the bounding region.
    */
  var eastLongitude: Double = js.native
  
  /**
    * The north latitude of the bounding region.
    */
  var northLatitude: Double = js.native
  
  /**
    * The south latitude of the bounding region.
    */
  var southLatitude: Double = js.native
  
  /**
    * Returns the coordinate region that corresponds to the calling bounding region.
    */
  def toCoordinateRegion(): CoordinateRegion = js.native
  
  /**
    * The west longitude of the bounding region.
    */
  var westLongitude: Double = js.native
}
object BoundingRegion {
  
  @scala.inline
  def apply(
    copy: () => BoundingRegion,
    eastLongitude: Double,
    northLatitude: Double,
    southLatitude: Double,
    toCoordinateRegion: () => CoordinateRegion,
    westLongitude: Double
  ): BoundingRegion = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction0(copy), eastLongitude = eastLongitude.asInstanceOf[js.Any], northLatitude = northLatitude.asInstanceOf[js.Any], southLatitude = southLatitude.asInstanceOf[js.Any], toCoordinateRegion = js.Any.fromFunction0(toCoordinateRegion), westLongitude = westLongitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoundingRegion]
  }
  
  @scala.inline
  implicit class BoundingRegionMutableBuilder[Self <: BoundingRegion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCopy(value: () => BoundingRegion): Self = StObject.set(x, "copy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEastLongitude(value: Double): Self = StObject.set(x, "eastLongitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNorthLatitude(value: Double): Self = StObject.set(x, "northLatitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSouthLatitude(value: Double): Self = StObject.set(x, "southLatitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToCoordinateRegion(value: () => CoordinateRegion): Self = StObject.set(x, "toCoordinateRegion", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWestLongitude(value: Double): Self = StObject.set(x, "westLongitude", value.asInstanceOf[js.Any])
  }
}
