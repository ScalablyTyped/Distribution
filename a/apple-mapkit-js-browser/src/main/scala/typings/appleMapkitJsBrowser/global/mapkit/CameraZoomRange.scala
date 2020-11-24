package typings.appleMapkitJsBrowser.global.mapkit

import typings.appleMapkitJsBrowser.mapkit.CameraZoomRangeConstructorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A minimum and maximum camera distance as meters from the center of the map.
  */
@JSGlobal("mapkit.CameraZoomRange")
@js.native
class CameraZoomRange protected ()
  extends typings.appleMapkitJsBrowser.mapkit.CameraZoomRange {
  def this(minCameraDistance: Double) = this()
  /**
    * Describes the minimum and maximum camera distance in meters.
    */
  def this(minCameraDistance: CameraZoomRangeConstructorOptions) = this()
  def this(minCameraDistance: Double, maxCameraDistance: Double) = this()
  def this(minCameraDistance: CameraZoomRangeConstructorOptions, maxCameraDistance: Double) = this()
}
