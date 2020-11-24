package typings.appleMapkitJsBrowser.global.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A rectangular area on a map defined by a center coordinate and a span,
  * expressed in degrees of latitude and longitude.
  */
@JSGlobal("mapkit.CoordinateRegion")
@js.native
class CoordinateRegion protected ()
  extends typings.appleMapkitJsBrowser.mapkit.CoordinateRegion {
  /**
    * Creates A rectangular geographic region centered around a latitude and
    * longitude coordinate.
    *
    * @param center Coordinate that is center point of the region.
    * @param span A CoordinateSpan that represents the amount of map to
    * display. The span also defines the current zoom level used by the map object.
    */
  def this(
    center: typings.appleMapkitJsBrowser.mapkit.Coordinate,
    span: typings.appleMapkitJsBrowser.mapkit.CoordinateSpan
  ) = this()
}
