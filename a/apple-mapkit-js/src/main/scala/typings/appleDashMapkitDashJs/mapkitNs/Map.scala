package typings.appleDashMapkitDashJs.mapkitNs

import typings.appleDashMapkitDashJs.mapkitNs.MapNs.ColorSchemes
import typings.appleDashMapkitDashJs.mapkitNs.MapNs.MapTypes
import typings.std.DOMPoint
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("mapkit.Map")
@js.native
class Map () extends js.Object {
  def this(parent: String) = this()
  def this(parent: HTMLElement) = this()
  def this(parent: String, options: MapConstructorOptions) = this()
  def this(parent: HTMLElement, options: MapConstructorOptions) = this()
  var annotations: js.Array[Annotation] = js.native
  var center: Coordinate = js.native
  var colorScheme: ColorSchemes = js.native
  val element: Element = js.native
  var isRotationEnabled: Boolean = js.native
  var isScrollEnabled: Boolean = js.native
  var isZoomEnabled: Boolean = js.native
  var mapType: MapTypes = js.native
  var overlays: js.Array[Overlay] = js.native
  var padding: Padding = js.native
  var region: CoordinateRegion = js.native
  var rotation: Double = js.native
  var selectedAnnotation: Annotation = js.native
  var selectedOverlay: Overlay = js.native
  var showsCompass: Boolean = js.native
  var showsMapTypeControl: Boolean = js.native
  var showsPointsOfInterest: Boolean = js.native
  var showsScale: Boolean = js.native
  var showsUserLocation: Boolean = js.native
  var showsUserLocationControl: Boolean = js.native
  var showsZoomControl: Boolean = js.native
  var tileOverlays: js.Array[TileOverlay] = js.native
  var tintColor: String = js.native
  var tracksUserLocation: Boolean = js.native
  val userLocationAnnotation: Annotation = js.native
  var visibleMapRect: MapRect = js.native
  def addAnnotation(annotation: Annotation): Annotation = js.native
  def addAnnotations(annotations: js.Array[Annotation]): js.Array[Annotation] = js.native
  def addEventListener(`type`: String, listener: js.Function1[/* type */ String, Unit]): Unit = js.native
  def addEventListener(`type`: String, listener: js.Function1[/* type */ String, Unit], thisObject: js.Any): Unit = js.native
  def addOverlay(overlay: Overlay): Overlay = js.native
  def addOverlays(overlays: js.Array[Overlay]): js.Array[Overlay] = js.native
  def addTileOverlay(tileOverlay: TileOverlay): TileOverlay = js.native
  def addTileOverlays(tileOverlays: js.Array[TileOverlay]): js.Array[TileOverlay] = js.native
  def annotationsInMapRect(mapRect: MapRect): js.Array[Annotation] = js.native
  def convertCoordinateToPointOnPage(coordinate: Coordinate): DOMPoint = js.native
  def convertPointOnPageToCoordinate(point: DOMPoint): Coordinate = js.native
  def destroy(): Unit = js.native
  def overlaysAtPoint(point: DOMPoint): js.Array[Overlay] = js.native
  def removeAnnotation(annotation: Annotation): Annotation = js.native
  def removeAnnotations(annotations: js.Array[Annotation]): js.Array[Annotation] = js.native
  def removeEventListener(`type`: String, listener: js.Function1[/* type */ String, Unit]): Unit = js.native
  def removeEventListener(`type`: String, listener: js.Function1[/* type */ String, Unit], thisObject: js.Any): Unit = js.native
  def removeOverlay(overlay: Overlay): Overlay = js.native
  def removeOverlays(overlays: js.Array[Overlay]): js.Array[Overlay] = js.native
  def removeTileOverlay(tileOverlay: TileOverlay): TileOverlay = js.native
  def removeTileOverlays(tileOverlays: js.Array[TileOverlay]): js.Array[TileOverlay] = js.native
  def showItems(items: js.Array[Annotation | Overlay]): js.Array[Annotation | Overlay] = js.native
  def showItems(items: js.Array[Annotation | Overlay], options: MapShowItemsOptions): js.Array[Annotation | Overlay] = js.native
  def topOverlayAtPoint(point: DOMPoint): Overlay = js.native
}

