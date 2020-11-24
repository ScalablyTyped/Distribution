package typings.appleMapkitJsBrowser.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A rectangular area on a map, defined by coordinates of the rectangle's
  * northeast and southwest corners.
  */
@js.native
trait BoundingRegion extends js.Object {
  
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
  implicit class BoundingRegionOps[Self <: BoundingRegion] (val x: Self) extends AnyVal {
    
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
    def setCopy(value: () => BoundingRegion): Self = this.set("copy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEastLongitude(value: Double): Self = this.set("eastLongitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNorthLatitude(value: Double): Self = this.set("northLatitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSouthLatitude(value: Double): Self = this.set("southLatitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToCoordinateRegion(value: () => CoordinateRegion): Self = this.set("toCoordinateRegion", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWestLongitude(value: Double): Self = this.set("westLongitude", value.asInstanceOf[js.Any])
  }
}
