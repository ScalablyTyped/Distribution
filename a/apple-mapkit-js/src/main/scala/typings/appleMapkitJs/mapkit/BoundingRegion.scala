package typings.appleMapkitJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A rectangular area on a map, defined by coordinates of the rectangle's
  * northeast and southwest corners.
  */
trait BoundingRegion extends js.Object {
  /**
    * The east longitude of the bounding region.
    */
  var eastLongitude: Double
  /**
    * The north latitude of the bounding region.
    */
  var northLatitude: Double
  /**
    * The south latitude of the bounding region.
    */
  var southLatitude: Double
  /**
    * The west longitude of the bounding region.
    */
  var westLongitude: Double
  /**
    * Returns a copy of the calling bounding region.
    */
  def copy(): BoundingRegion
  /**
    * Returns the coordinate region that corresponds to the calling bounding region.
    */
  def toCoordinateRegion(): CoordinateRegion
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
}

