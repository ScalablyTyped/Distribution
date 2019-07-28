package typings.appleDashMapkitDashJs.mapkitNs

import typings.std.DOMPoint
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("mapkit.Annotation")
@js.native
class Annotation protected () extends _ItemType {
  def this(
    coordinate: Coordinate,
    factory: js.Function2[/* coordinate */ Coordinate, /* options */ AnnotationConstructorOptions, Element]
  ) = this()
  def this(
    coordinate: Coordinate,
    factory: js.Function2[/* coordinate */ Coordinate, /* options */ AnnotationConstructorOptions, Element],
    options: AnnotationConstructorOptions
  ) = this()
  var accessibilityLabel: String = js.native
  var anchorOffset: DOMPoint = js.native
  var animates: Boolean = js.native
  var appearanceAnimation: String = js.native
  var callout: AnnotationCalloutDelegate = js.native
  var calloutEnabled: Boolean = js.native
  var calloutOffset: DOMPoint = js.native
  var clusteringIdentifier: String = js.native
  var collisionMode: String = js.native
  var data: js.Any = js.native
  var displayPriority: Double = js.native
  var draggable: Boolean = js.native
  var eastLongitude: Double = js.native
  var enabled: Boolean = js.native
  var northLatitude: Double = js.native
  var padding: Padding = js.native
  var selected: Boolean = js.native
  var size: js.Object = js.native
  var southLatitude: Double = js.native
  var subtitle: String = js.native
  var title: String = js.native
  var visible: Boolean = js.native
  var westLongitude: Double = js.native
  def addEventListener(`type`: String, listener: js.Function1[/* type */ String, Unit]): Unit = js.native
  def addEventListener(`type`: String, listener: js.Function1[/* type */ String, Unit], thisObject: js.Any): Unit = js.native
  def copy(): BoundingRegion = js.native
  def removeEventListener(`type`: String, listener: js.Function1[/* type */ String, Unit]): Unit = js.native
  def removeEventListener(`type`: String, listener: js.Function1[/* type */ String, Unit], thisObject: js.Any): Unit = js.native
  def toCoordinateRegion(): CoordinateRegion = js.native
}

