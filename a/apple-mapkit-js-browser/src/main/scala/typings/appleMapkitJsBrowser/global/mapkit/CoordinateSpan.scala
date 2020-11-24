package typings.appleMapkitJsBrowser.global.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The width and height of a map region.
  */
@JSGlobal("mapkit.CoordinateSpan")
@js.native
class CoordinateSpan protected ()
  extends typings.appleMapkitJsBrowser.mapkit.CoordinateSpan {
  /**
    * Creates a new coordinate span object with the specified latitude and
    * longitude deltas.
    *
    * @param latitudeDelta The amount of north-to-south distance (measured in
    * degrees) to display on the map.
    * @param longitudeDelta The amount of east-to-west distance (measured in
    * degrees) to display for the map region.
    */
  def this(latitudeDelta: Double, longitudeDelta: Double) = this()
}
