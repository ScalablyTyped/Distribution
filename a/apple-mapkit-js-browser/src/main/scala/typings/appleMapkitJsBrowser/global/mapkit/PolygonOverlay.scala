package typings.appleMapkitJsBrowser.global.mapkit

import typings.appleMapkitJsBrowser.mapkit.StylesOverlayOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An overlay made up of one or more points, forming a closed shape.
  */
@JSGlobal("mapkit.PolygonOverlay")
@js.native
class PolygonOverlay protected ()
  extends typings.appleMapkitJsBrowser.mapkit.PolygonOverlay {
  /**
    * Creates a polygon overlay with an array of points and style options.
    *
    * @param points The points in the polygon as an array of arrays of
    * Coordinate, or an array of Coordinate. If it's the latter,
    * the array is auto-wrapped by an enclosing array.
    * @param options An object literal of options with which to initialize the
    * polygon.
    */
  def this(points: js.Array[typings.appleMapkitJsBrowser.mapkit.Coordinate]) = this()
  def this(points: js.Array[typings.appleMapkitJsBrowser.mapkit.Coordinate], options: StylesOverlayOptions) = this()
}
