package typings.appleMapkitJs.global.mapkit

import typings.appleMapkitJs.mapkit.MarkerAnnotationConstructorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates a marker annotation at the coordinate location with provided options.
  */
@JSGlobal("mapkit.MarkerAnnotation")
@js.native
class MarkerAnnotation protected ()
  extends typings.appleMapkitJs.mapkit.MarkerAnnotation {
  /**
    * Creates a marker annotation at the coordinate location with provided options.
    *
    * @param coordinate The coordinate at which this annotation should appear.
    * @param options A hash of properties with which to initialize the annotation.
    */
  def this(coordinate: typings.appleMapkitJs.mapkit.Coordinate) = this()
  def this(coordinate: typings.appleMapkitJs.mapkit.Coordinate, options: MarkerAnnotationConstructorOptions) = this()
}

