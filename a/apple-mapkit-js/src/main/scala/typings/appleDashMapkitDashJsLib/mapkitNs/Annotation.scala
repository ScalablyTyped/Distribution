package typings
package appleDashMapkitDashJsLib.mapkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("mapkit.Annotation")
@js.native
class Annotation protected () extends _ItemType {
  def this(coordinate: Coordinate, factory: js.Function2[
      /* coordinate */ Coordinate, 
      /* options */ AnnotationConstructorOptions, 
      stdLib.Element
    ]) = this()
  def this(coordinate: Coordinate, factory: js.Function2[
      /* coordinate */ Coordinate, 
      /* options */ AnnotationConstructorOptions, 
      stdLib.Element
    ], options: AnnotationConstructorOptions) = this()
  var accessibilityLabel: java.lang.String = js.native
  var anchorOffset: stdLib.DOMPoint = js.native
  var animates: scala.Boolean = js.native
  var appearanceAnimation: java.lang.String = js.native
  var callout: AnnotationCalloutDelegate = js.native
  var calloutEnabled: scala.Boolean = js.native
  var calloutOffset: stdLib.DOMPoint = js.native
  var clusteringIdentifier: java.lang.String = js.native
  var collisionMode: java.lang.String = js.native
  var data: js.Any = js.native
  var displayPriority: scala.Double = js.native
  var draggable: scala.Boolean = js.native
  var eastLongitude: scala.Double = js.native
  var enabled: scala.Boolean = js.native
  var northLatitude: scala.Double = js.native
  var padding: Padding = js.native
  var selected: scala.Boolean = js.native
  var size: js.Object = js.native
  var southLatitude: scala.Double = js.native
  var subtitle: java.lang.String = js.native
  var title: java.lang.String = js.native
  var visible: scala.Boolean = js.native
  var westLongitude: scala.Double = js.native
  def addEventListener(`type`: java.lang.String, listener: js.Function1[/* type */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def addEventListener(
    `type`: java.lang.String,
    listener: js.Function1[/* type */ java.lang.String, scala.Unit],
    thisObject: js.Any
  ): scala.Unit = js.native
  def copy(): BoundingRegion = js.native
  def removeEventListener(`type`: java.lang.String, listener: js.Function1[/* type */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def removeEventListener(
    `type`: java.lang.String,
    listener: js.Function1[/* type */ java.lang.String, scala.Unit],
    thisObject: js.Any
  ): scala.Unit = js.native
  def toCoordinateRegion(): CoordinateRegion = js.native
}

