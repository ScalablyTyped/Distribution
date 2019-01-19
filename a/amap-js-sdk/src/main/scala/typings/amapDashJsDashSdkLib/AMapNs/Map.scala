package typings
package amapDashJsDashSdkLib.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.Map")
@js.native
class Map protected () extends EventBindable {
  def this(mapDiv: java.lang.String) = this()
  def this(mapDiv: java.lang.String, opts: MapOptions) = this()
  def add(overlayers: js.Array[_]): scala.Unit = js.native
  def addControl(obj: js.Any): scala.Unit = js.native
  def clearInfoWindow(): scala.Unit = js.native
  def clearLimitBounds(): scala.Unit = js.native
  def clearMap(): scala.Unit = js.native
  def containerToLngLat(pixel: Pixel, level: scala.Double): LngLat = js.native
  def destroy(): scala.Unit = js.native
  def getAllOverlays(`type`: java.lang.String): js.Array[Marker] | js.Array[Circle] | js.Array[Polygon] | js.Array[Polyline] = js.native
  def getBounds(): Bounds = js.native
  def getCenter(): LngLat = js.native
  def getCity(callback: js.Function1[/* result */ amapDashJsDashSdkLib.Anon_City, scala.Unit]): scala.Unit = js.native
  def getDefaultCursor(): java.lang.String = js.native
  def getFeatures(): js.Array[java.lang.String] = js.native
  def getLang(): java.lang.String = js.native
  def getLayers(): js.Array[TileLayer] = js.native
  def getLimitBounds(): Bounds = js.native
  def getMapStyle(): java.lang.String = js.native
  def getResolution(point: LngLat): scala.Double = js.native
  def getRotation(): scala.Double = js.native
  def getScale(dpi: scala.Double): scala.Double = js.native
  def getSize(): Size = js.native
  def getStatus(): js.Any = js.native
  def getZoom(): scala.Double = js.native
  def getlabelzIndex(): scala.Double = js.native
  def lngLatToContainer(lnglat: LngLat, level: scala.Double): Pixel = js.native
  def lnglatToPixel(lnglat: LngLat, level: scala.Double): Pixel = js.native
  def panBy(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def panTo(position: LngLat): scala.Unit = js.native
  def pixelToLngLat(pixel: Pixel, level: scala.Double): LngLat = js.native
  def plugin(name: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def plugin(name: js.Array[java.lang.String], callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def remove(overlayers: js.Array[_]): scala.Unit = js.native
  def removeControl(obj: js.Any): scala.Unit = js.native
  def setBounds(bound: Bounds): scala.Unit = js.native
  def setCenter(position: LngLat): scala.Unit = js.native
  def setCity(city: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def setDefaultCursor(cursor: java.lang.String): scala.Unit = js.native
  def setDefaultLayer(layer: TileLayer): scala.Unit = js.native
  def setFeatures(features: js.Array[java.lang.String]): scala.Unit = js.native
  def setFitView(): scala.Unit = js.native
  def setFitView(overlayList: js.Array[_]): scala.Unit = js.native
  def setLang(lang: java.lang.String): scala.Unit = js.native
  def setLayers(layers: js.Array[TileLayer]): scala.Unit = js.native
  def setLimitBounds(bound: Bounds): scala.Unit = js.native
  def setMapStyle(style: java.lang.String): scala.Unit = js.native
  def setRotation(rotation: scala.Double): scala.Unit = js.native
  def setStatus(status: js.Any): scala.Unit = js.native
  def setZoom(level: scala.Double): scala.Unit = js.native
  def setZoomAndCenter(zoomLevel: scala.Double, center: LngLat): scala.Unit = js.native
  def setlabelzIndex(index: scala.Double): scala.Unit = js.native
  def zoomIn(): scala.Unit = js.native
  def zoomOut(): scala.Unit = js.native
}

