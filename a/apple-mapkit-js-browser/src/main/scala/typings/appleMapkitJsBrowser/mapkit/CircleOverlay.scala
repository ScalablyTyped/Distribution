package typings.appleMapkitJsBrowser.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A circular overlay with a configurable radius, centered on a specific
  * geographic coordinate.
  */
@js.native
trait CircleOverlay extends Overlay {
  
  /**
    * The coordinate of the circle overlay's center.
    */
  var coordinate: Coordinate = js.native
  
  /**
    * The circle overlay's radius in meters.
    */
  var radius: Double = js.native
}
