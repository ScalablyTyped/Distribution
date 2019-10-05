package typings.amapDashJsDashSdk.AMap

import typings.amapDashJsDashSdk.Anon_City
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.Map")
@js.native
class Map protected () extends EventBindable {
  def this(mapDiv: String) = this()
  def this(mapDiv: String, opts: MapOptions) = this()
  def add(overlayers: js.Array[_]): Unit = js.native
  def addControl(obj: js.Any): Unit = js.native
  def clearInfoWindow(): Unit = js.native
  def clearLimitBounds(): Unit = js.native
  def clearMap(): Unit = js.native
  def containerToLngLat(pixel: Pixel, level: Double): LngLat = js.native
  def destroy(): Unit = js.native
  def getAllOverlays(`type`: String): js.Array[Circle | Marker | Polygon | Polyline] = js.native
  def getBounds(): Bounds = js.native
  def getCenter(): LngLat = js.native
  def getCity(callback: js.Function1[/* result */ Anon_City, Unit]): Unit = js.native
  def getDefaultCursor(): String = js.native
  def getFeatures(): js.Array[String] = js.native
  def getLang(): String = js.native
  def getLayers(): js.Array[TileLayer] = js.native
  def getLimitBounds(): Bounds = js.native
  def getMapStyle(): String = js.native
  def getResolution(point: LngLat): Double = js.native
  def getRotation(): Double = js.native
  def getScale(dpi: Double): Double = js.native
  def getSize(): Size = js.native
  def getStatus(): js.Any = js.native
  def getZoom(): Double = js.native
  def getlabelzIndex(): Double = js.native
  def lngLatToContainer(lnglat: LngLat, level: Double): Pixel = js.native
  def lnglatToPixel(lnglat: LngLat, level: Double): Pixel = js.native
  def panBy(x: Double, y: Double): Unit = js.native
  def panTo(position: LngLat): Unit = js.native
  def pixelToLngLat(pixel: Pixel, level: Double): LngLat = js.native
  def plugin(name: String, callback: js.Function0[Unit]): Unit = js.native
  def plugin(name: js.Array[String], callback: js.Function0[Unit]): Unit = js.native
  def remove(overlayers: js.Array[_]): Unit = js.native
  def removeControl(obj: js.Any): Unit = js.native
  def setBounds(bound: Bounds): Unit = js.native
  def setCenter(position: LngLat): Unit = js.native
  def setCity(city: String, callback: js.Function0[Unit]): Unit = js.native
  def setDefaultCursor(cursor: String): Unit = js.native
  def setDefaultLayer(layer: TileLayer): Unit = js.native
  def setFeatures(features: js.Array[String]): Unit = js.native
  def setFitView(): Unit = js.native
  def setFitView(overlayList: js.Array[_]): Unit = js.native
  def setLang(lang: String): Unit = js.native
  def setLayers(layers: js.Array[TileLayer]): Unit = js.native
  def setLimitBounds(bound: Bounds): Unit = js.native
  def setMapStyle(style: String): Unit = js.native
  def setRotation(rotation: Double): Unit = js.native
  def setStatus(status: js.Any): Unit = js.native
  def setZoom(level: Double): Unit = js.native
  def setZoomAndCenter(zoomLevel: Double, center: LngLat): Unit = js.native
  def setlabelzIndex(index: Double): Unit = js.native
  def zoomIn(): Unit = js.native
  def zoomOut(): Unit = js.native
}

