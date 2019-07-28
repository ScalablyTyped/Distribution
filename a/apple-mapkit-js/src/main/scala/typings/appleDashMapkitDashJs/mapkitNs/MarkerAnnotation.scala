package typings.appleDashMapkitDashJs.mapkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("mapkit.MarkerAnnotation")
@js.native
class MarkerAnnotation protected () extends Annotation {
  def this(coordinate: Coordinate) = this()
  def this(coordinate: Coordinate, options: MarkerAnnotationConstructorOptions) = this()
  var color: String = js.native
  var glyphColor: String = js.native
  var glyphImage: js.Any = js.native
  var glyphText: String = js.native
  var selectedGlyphImage: js.Any = js.native
  var subtitleVisibility: FeatureVisibility = js.native
  var titleVisibility: FeatureVisibility = js.native
}

