package typings.amapJsApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object AMap {
  type BezierCurve[ExtraData] = typings.amapJsApi.AMap.BezierCurve_[ExtraData]
  type Buildings = typings.amapJsApi.AMap.Buildings_
  type Circle[ExtraData] = typings.amapJsApi.AMap.Circle_[ExtraData]
  type ContextMenu[ExtraData] = typings.amapJsApi.AMap.ContextMenu_[ExtraData]
  type Ellipse[ExtraData] = typings.amapJsApi.AMap.Ellipse_[ExtraData]
  type Event_[N /* <: java.lang.String */, V] = typings.amapJsApi.AnonType[N] with (typings.amapJsApi.AnonValue[V] | js.Object | V)
  type GeoJSON[ExtraData] = typings.amapJsApi.AMap.GeoJSON_[ExtraData]
  type Icon = typings.amapJsApi.AMap.Icon_
  type InfoWindow[ExtraData] = typings.amapJsApi.AMap.InfoWindow_[ExtraData]
  type LabelMarker[ExtraData] = typings.amapJsApi.AMap.LabelMarker_[ExtraData]
  type LabelsLayer = typings.amapJsApi.AMap.LabelsLayer_
  type Layer = typings.amapJsApi.AMap.Layer_
  type LocationValue = typings.amapJsApi.AMap.LngLat | (js.Tuple2[scala.Double, scala.Double])
  type Map = typings.amapJsApi.AMap.Map_
  type MapsEvent[N /* <: java.lang.String */, I] = typings.amapJsApi.AMap.Event_[N, typings.amapJsApi.AnonLnglat[I]]
  type Marker[ExtraData] = typings.amapJsApi.AMap.Marker_[ExtraData]
  type MarkerShape = typings.amapJsApi.AMap.MarkerShape_
  type MassMarks[D /* <: typings.amapJsApi.AMap.MassMarks.Data */] = typings.amapJsApi.AMap.MassMarks_[D]
  type MediaLayer[E /* <: typings.std.HTMLElement */] = typings.amapJsApi.AMap.MediaLayer_[E]
  type Merge[O, T] = O with T
  type Omit[T, E /* <: /* keyof T */ java.lang.String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in std.Exclude<keyof T, E> ]: T[K]}
    */ typings.amapJsApi.amapJsApiStrings.Omit with org.scalablytyped.runtime.TopLevel[T]
  type OptionalKey[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: -? undefined extends T[K]? K : never}[keyof T] */ js.Any
  type Overlay[ExtraData] = typings.amapJsApi.AMap.Overlay_[ExtraData]
  type PathOverlay[ExtraData] = typings.amapJsApi.AMap.PathOverlay_[ExtraData]
  type Polygon[ExtraData] = typings.amapJsApi.AMap.Polygon_[ExtraData]
  type Polyline[ExtraData] = typings.amapJsApi.AMap.Polyline_[ExtraData]
  type Rectangle[ExtraData] = typings.amapJsApi.AMap.Rectangle_[ExtraData]
  type ShapeOverlay[ExtraData] = typings.amapJsApi.AMap.ShapeOverlay_[ExtraData]
  type SizeValue = typings.amapJsApi.AMap.Size | (js.Tuple2[scala.Double, scala.Double])
  type Text[ExtraData] = typings.amapJsApi.AMap.Text_[ExtraData]
  type TileLayer = typings.amapJsApi.AMap.TileLayer_
  type View2D = typings.amapJsApi.AMap.View2D_
}
