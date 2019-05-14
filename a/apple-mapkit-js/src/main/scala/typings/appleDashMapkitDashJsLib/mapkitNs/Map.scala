package typings
package appleDashMapkitDashJsLib.mapkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("mapkit.Map")
@js.native
class Map () extends js.Object {
  def this(parent: java.lang.String) = this()
  def this(parent: stdLib.HTMLElement) = this()
  def this(parent: java.lang.String, options: MapConstructorOptions) = this()
  def this(parent: stdLib.HTMLElement, options: MapConstructorOptions) = this()
  var annotations: js.Array[Annotation] = js.native
  var center: Coordinate = js.native
  var colorScheme: appleDashMapkitDashJsLib.mapkitNs.MapNs.ColorSchemes = js.native
  val element: stdLib.Element = js.native
  var isRotationEnabled: scala.Boolean = js.native
  var isScrollEnabled: scala.Boolean = js.native
  var isZoomEnabled: scala.Boolean = js.native
  var mapType: appleDashMapkitDashJsLib.mapkitNs.MapNs.MapTypes = js.native
  var overlays: js.Array[Overlay] = js.native
  var padding: Padding = js.native
  var region: CoordinateRegion = js.native
  var rotation: scala.Double = js.native
  var selectedAnnotation: Annotation = js.native
  var selectedOverlay: Overlay = js.native
  var showsCompass: scala.Boolean = js.native
  var showsMapTypeControl: scala.Boolean = js.native
  var showsPointsOfInterest: scala.Boolean = js.native
  var showsScale: scala.Boolean = js.native
  var showsUserLocation: scala.Boolean = js.native
  var showsUserLocationControl: scala.Boolean = js.native
  var showsZoomControl: scala.Boolean = js.native
  var tileOverlays: js.Array[TileOverlay] = js.native
  var tintColor: java.lang.String = js.native
  var tracksUserLocation: scala.Boolean = js.native
  val userLocationAnnotation: Annotation = js.native
  var visibleMapRect: MapRect = js.native
  def addAnnotation(annotation: Annotation): Annotation = js.native
  def addAnnotations(annotations: js.Array[Annotation]): js.Array[Annotation] = js.native
  def addEventListener(`type`: java.lang.String, listener: js.Function1[/* type */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def addEventListener(
    `type`: java.lang.String,
    listener: js.Function1[/* type */ java.lang.String, scala.Unit],
    thisObject: js.Any
  ): scala.Unit = js.native
  def addOverlay(overlay: Overlay): Overlay = js.native
  def addOverlays(overlays: js.Array[Overlay]): js.Array[Overlay] = js.native
  def addTileOverlay(tileOverlay: TileOverlay): TileOverlay = js.native
  def addTileOverlays(tileOverlays: js.Array[TileOverlay]): js.Array[TileOverlay] = js.native
  def annotationsInMapRect(mapRect: MapRect): js.Array[Annotation] = js.native
  def convertCoordinateToPointOnPage(coordinate: Coordinate): stdLib.DOMPoint = js.native
  def convertPointOnPageToCoordinate(point: stdLib.DOMPoint): Coordinate = js.native
  def destroy(): scala.Unit = js.native
  def overlaysAtPoint(point: stdLib.DOMPoint): js.Array[Overlay] = js.native
  def removeAnnotation(annotation: Annotation): Annotation = js.native
  def removeAnnotations(annotations: js.Array[Annotation]): js.Array[Annotation] = js.native
  def removeEventListener(`type`: java.lang.String, listener: js.Function1[/* type */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def removeEventListener(
    `type`: java.lang.String,
    listener: js.Function1[/* type */ java.lang.String, scala.Unit],
    thisObject: js.Any
  ): scala.Unit = js.native
  def removeOverlay(overlay: Overlay): Overlay = js.native
  def removeOverlays(overlays: js.Array[Overlay]): js.Array[Overlay] = js.native
  def removeTileOverlay(tileOverlay: TileOverlay): TileOverlay = js.native
  def removeTileOverlays(tileOverlays: js.Array[TileOverlay]): js.Array[TileOverlay] = js.native
  def showItems(items: js.Array[Annotation | Overlay]): js.Array[Annotation] | js.Array[Overlay] = js.native
  def showItems(items: js.Array[Annotation | Overlay], options: MapShowItemsOptions): js.Array[Annotation] | js.Array[Overlay] = js.native
  def topOverlayAtPoint(point: stdLib.DOMPoint): Overlay = js.native
}

