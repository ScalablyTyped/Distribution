package typings.appleDashMapkitDashJs.mapkitNs

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoJSONDelegate extends js.Object {
  def geoJSONDidComplete(result: ItemCollection, geoJSON: js.Any): Unit = js.native
  def geoJSONDidError(error: Error, geoJSON: js.Any): Unit = js.native
  def itemForFeature(item: Annotation, geoJSON: js.Any): ItemType = js.native
  def itemForFeature(item: ItemCollection, geoJSON: js.Any): ItemType = js.native
  def itemForFeature(item: Overlay, geoJSON: js.Any): ItemType = js.native
  def itemForFeatureCollection(itemCollection: ItemCollection, geoJSON: js.Any): ItemType = js.native
  def itemForLineString(overlay: PolylineOverlay, geoJSON: js.Any): ItemType = js.native
  def itemForMultiLineString(itemCollection: ItemCollection, geoJSON: js.Any): ItemType = js.native
  def itemForMultiPoint(itemCollection: ItemCollection, geoJSON: js.Any): ItemType = js.native
  def itemForMultiPolygon(itemCollection: ItemCollection, geoJSON: js.Any): ItemType = js.native
  def itemForPoint(coordinate: Coordinate, geoJSON: js.Any): ItemType = js.native
  def itemForPolygon(overlay: PolygonOverlay, geoJSON: js.Any): ItemType = js.native
  def styleForOverlay(overlay: Overlay, geoJSON: js.Any): Style = js.native
}

