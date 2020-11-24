package typings.appleMapkitJsBrowser.global.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A rectangular area on a map, defined by coordinates of the rectangle's
  * northeast and southwest corners.
  */
@JSGlobal("mapkit.BoundingRegion")
@js.native
class BoundingRegion protected ()
  extends typings.appleMapkitJsBrowser.mapkit.BoundingRegion {
  /**
    * Creates a rectangular bounding region defined by the latitude and
    * longitude coordinates of the rectangle's northeast and southwest corners.
    *
    * @param northLatitude The north latitude of the bounding region.
    * @param eastLongitude The east longitude of the bounding region.
    * @param southLatitude The south latitude of the bounding region.
    * @param westLongitude The west longitude of the bounding region.
    */
  def this(northLatitude: Double, eastLongitude: Double, southLatitude: Double, westLongitude: Double) = this()
}
