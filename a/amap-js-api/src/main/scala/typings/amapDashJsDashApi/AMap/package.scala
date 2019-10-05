package typings.amapDashJsDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object AMap {
  import typings.amapDashJsDashApi.AMap.MassMarks.Data
  import typings.std.HTMLElement

  type BezierCurve[ExtraData] = BezierCurve_[ExtraData]
  type Buildings = Buildings_
  type Circle[ExtraData] = Circle_[ExtraData]
  type ContextMenu[ExtraData] = ContextMenu_[ExtraData]
  type Ellipse[ExtraData] = Ellipse_[ExtraData]
  type GeoJSON[ExtraData] = GeoJSON_[ExtraData]
  type Icon = Icon_
  type InfoWindow[ExtraData] = InfoWindow_[ExtraData]
  type LabelMarker[ExtraData] = LabelMarker_[ExtraData]
  type LabelsLayer = LabelsLayer_
  type Layer = Layer_
  type LocationValue = LngLat | (js.Tuple2[Double, Double])
  type Map = Map_
  type Marker[ExtraData] = Marker_[ExtraData]
  type MarkerShape = MarkerShape_
  type MassMarks[D /* <: Data */] = MassMarks_[D]
  type MediaLayer[E /* <: HTMLElement */] = MediaLayer_[E]
  type Merge[O, T] = O with T
  type Omit[T, E /* <: String */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in std.Exclude<keyof T, E> ]: T[K]}
    */ typings.amapDashJsDashApi.amapDashJsDashApiStrings.Omit with T
  type OptionalKey[T] = /* import warning: ImportType.apply Failed type conversion: {[ K in keyof T ]: -? undefined extends T[K]? K : never}[keyof T] */ js.Any
  type Overlay[ExtraData] = Overlay_[ExtraData]
  type PathOverlay[ExtraData] = PathOverlay_[ExtraData]
  type Polygon[ExtraData] = Polygon_[ExtraData]
  type Polyline[ExtraData] = Polyline_[ExtraData]
  type Rectangle[ExtraData] = Rectangle_[ExtraData]
  type ShapeOverlay[ExtraData] = ShapeOverlay_[ExtraData]
  type SizeValue = Size | (js.Tuple2[Double, Double])
  type Text[ExtraData] = Text_[ExtraData]
  type TileLayer = TileLayer_
  type View2D = View2D_
}
