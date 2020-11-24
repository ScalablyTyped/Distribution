package typings.amapJsApi.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.amapJsApi.AMap.BezierCurve.Options
import typings.amapJsApi.AMap.LocationValue
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofAMap extends js.Object {
  
  var ArrayBounds: Instantiable1[/* bounds */ js.Array[LocationValue], typings.amapJsApi.AMap.ArrayBounds] = js.native
  
  val BezierCurve: Instantiable1[
    /* options */ Options[/* import warning: RewrittenClass.unapply cls was tparam ExtraData */ js.Any], 
    typings.amapJsApi.AMap.BezierCurve[js.Object]
  ] = js.native
  
  var Bounds: Instantiable1[
    /* coords */ js.UndefOr[js.Tuple4[Double, Double, Double, Double]], 
    typings.amapJsApi.AMap.Bounds
  ] = js.native
  
  val Browser: TypeofBrowser = js.native
  
  val Buildings: Instantiable1[
    /* opts */ js.UndefOr[typings.amapJsApi.AMap.Buildings.Options], 
    typings.amapJsApi.AMap.Buildings
  ] = js.native
  
  var CanvasLayer: Instantiable0[typings.amapJsApi.AMap.CanvasLayer] = js.native
  
  val Circle: Instantiable1[
    /* options */ js.UndefOr[
      typings.amapJsApi.AMap.Circle.Options[/* import warning: RewrittenClass.unapply cls was tparam ExtraData */ js.Any]
    ], 
    typings.amapJsApi.AMap.Circle[js.Object]
  ] = js.native
  
  /**
    * 圆点标记
    */
  var CircleMarker: Instantiable0[typings.amapJsApi.AMap.CircleMarker[js.Object]] = js.native
  
  val ContextMenu: Instantiable1[
    /* options */ js.UndefOr[typings.amapJsApi.AMap.ContextMenu.Options], 
    typings.amapJsApi.AMap.ContextMenu[js.Object]
  ] = js.native
  
  val DomUtil: TypeofDomUtil = js.native
  
  val Ellipse: Instantiable1[
    /* options */ js.UndefOr[
      typings.amapJsApi.AMap.Ellipse.Options[/* import warning: RewrittenClass.unapply cls was tparam ExtraData */ js.Any]
    ], 
    typings.amapJsApi.AMap.Ellipse[js.Object]
  ] = js.native
  
  var EventEmitter: Instantiable0[typings.amapJsApi.AMap.EventEmitter] = js.native
  
  val GeoJSON: Instantiable1[
    /* options */ js.UndefOr[typings.amapJsApi.AMap.GeoJSON.Options], 
    typings.amapJsApi.AMap.GeoJSON[js.Object]
  ] = js.native
  
  val GeometryUtil: TypeofGeometryUtil = js.native
  
  val Icon: Instantiable1[
    /* options */ js.UndefOr[typings.amapJsApi.AMap.Icon.Options], 
    typings.amapJsApi.AMap.Icon
  ] = js.native
  
  /**
    * 图片图层
    */
  var ImageLayer: Instantiable0[typings.amapJsApi.AMap.ImageLayer] = js.native
  
  val InfoWindow: Instantiable1[
    /* options */ js.UndefOr[typings.amapJsApi.AMap.InfoWindow.Options[js.Any]], 
    typings.amapJsApi.AMap.InfoWindow[js.Object]
  ] = js.native
  
  val LabelMarker: Instantiable1[
    /* options */ js.UndefOr[typings.amapJsApi.AMap.LabelMarker.Options[js.Any]], 
    typings.amapJsApi.AMap.LabelMarker[js.Object]
  ] = js.native
  
  val LabelsLayer: Instantiable1[
    /* options */ js.UndefOr[typings.amapJsApi.AMap.LabelsLayer.Options], 
    typings.amapJsApi.AMap.LabelsLayer
  ] = js.native
  
  val Layer: Instantiable0[typings.amapJsApi.AMap.Layer] = js.native
  
  var LayerGroup: Instantiable1[
    /* layers */ (/* import warning: RewrittenClass.unapply cls was tparam L */ js.Any) | (js.Array[/* import warning: RewrittenClass.unapply cls was tparam L */ js.Any]), 
    typings.amapJsApi.AMap.LayerGroup[js.Object]
  ] = js.native
  
  var LngLat: Instantiable3[
    /* lng */ Double, 
    /* lat */ Double, 
    /* noAutofix */ js.UndefOr[Boolean], 
    typings.amapJsApi.AMap.LngLat
  ] = js.native
  
  val Map: Instantiable2[
    /* container */ String | HTMLElement, 
    /* opts */ js.UndefOr[typings.amapJsApi.AMap.Map.Options], 
    typings.amapJsApi.AMap.Map
  ] = js.native
  
  val Marker: Instantiable1[
    /* options */ js.UndefOr[
      typings.amapJsApi.AMap.Marker.Options[/* import warning: RewrittenClass.unapply cls was tparam ExtraData */ js.Any]
    ], 
    typings.amapJsApi.AMap.Marker[js.Object]
  ] = js.native
  
  val MarkerShape: Instantiable1[
    /* options */ typings.amapJsApi.AMap.MarkerShape.Options, 
    typings.amapJsApi.AMap.MarkerShape
  ] = js.native
  
  val MassMarks: Instantiable2[
    /* data */ (js.Array[/* import warning: RewrittenClass.unapply cls was tparam D */ js.Any]) | String, 
    /* opts */ typings.amapJsApi.AMap.MassMarks.Options, 
    typings.amapJsApi.AMap.MassMarks[typings.amapJsApi.AMap.MassMarks.Data]
  ] = js.native
  
  val MediaLayer: Instantiable1[
    /* options */ js.UndefOr[typings.amapJsApi.AMap.MediaLayer.Options], 
    typings.amapJsApi.AMap.MediaLayer[HTMLElement]
  ] = js.native
  
  val Overlay: Instantiable1[
    /* options */ js.UndefOr[typings.amapJsApi.AMap.Overlay.Options[js.Any]], 
    typings.amapJsApi.AMap.Overlay[js.Object]
  ] = js.native
  
  var OverlayGroup: Instantiable1[
    /* overlays */ js.UndefOr[
      (/* import warning: RewrittenClass.unapply cls was tparam O */ js.Any) | (js.Array[/* import warning: RewrittenClass.unapply cls was tparam O */ js.Any])
    ], 
    typings.amapJsApi.AMap.OverlayGroup[typings.amapJsApi.AMap.Overlay[js.Any], js.Object]
  ] = js.native
  
  val PathOverlay: Instantiable1[
    /* options */ js.UndefOr[
      typings.amapJsApi.AMap.PathOverlay.Options[/* import warning: RewrittenClass.unapply cls was tparam ExtraData */ js.Any]
    ], 
    typings.amapJsApi.AMap.PathOverlay[js.Object]
  ] = js.native
  
  var Pixel: Instantiable3[
    /* x */ Double, 
    /* y */ Double, 
    /* round */ js.UndefOr[Boolean], 
    typings.amapJsApi.AMap.Pixel
  ] = js.native
  
  val Polygon: Instantiable1[
    /* options */ js.UndefOr[
      typings.amapJsApi.AMap.Polygon.Options[/* import warning: RewrittenClass.unapply cls was tparam ExtraData */ js.Any]
    ], 
    typings.amapJsApi.AMap.Polygon[js.Object]
  ] = js.native
  
  val Polyline: Instantiable1[
    /* options */ js.UndefOr[
      (Options[/* import warning: RewrittenClass.unapply cls was tparam ExtraData */ js.Any]) | (typings.amapJsApi.AMap.Polyline.Options[/* import warning: RewrittenClass.unapply cls was tparam ExtraData */ js.Any])
    ], 
    typings.amapJsApi.AMap.Polyline[js.Object]
  ] = js.native
  
  val Rectangle: Instantiable1[
    /* options */ js.UndefOr[
      typings.amapJsApi.AMap.Rectangle.Options[/* import warning: RewrittenClass.unapply cls was tparam ExtraData */ js.Any]
    ], 
    typings.amapJsApi.AMap.Rectangle[js.Object]
  ] = js.native
  
  val ShapeOverlay: Instantiable0[typings.amapJsApi.AMap.ShapeOverlay[js.Object]] = js.native
  
  var Size: Instantiable2[/* width */ Double, /* height */ Double, typings.amapJsApi.AMap.Size] = js.native
  
  val Text: Instantiable1[
    /* options */ js.UndefOr[typings.amapJsApi.AMap.Text.Options], 
    typings.amapJsApi.AMap.Text[js.Object]
  ] = js.native
  
  val TileLayer: TypeofTileLayer with (Instantiable1[
    /* options */ js.UndefOr[typings.amapJsApi.AMap.TileLayer.Options], 
    typings.amapJsApi.AMap.TileLayer
  ]) = js.native
  
  val Util: TypeofUtil = js.native
  
  var VideoLayer: Instantiable0[typings.amapJsApi.AMap.VideoLayer] = js.native
  
  val View2D: Instantiable1[
    /* options */ js.UndefOr[typings.amapJsApi.AMap.View2D.Options], 
    typings.amapJsApi.AMap.View2D
  ] = js.native
  
  val convertFrom: TypeofconvertFrom = js.native
  
  val event: Typeofevent = js.native
  
  /**
    * 加载插件，
    * @param name 插件名称
    * @param callback 插件加载完成后的回调函数
    */
  def plugin(plugin: String, callback: js.Function0[Unit]): /* import warning: importer.ImportType#apply Failed type conversion: typeof AMap */ js.Any = js.native
  def plugin(plugin: js.Array[String], callback: js.Function0[Unit]): /* import warning: importer.ImportType#apply Failed type conversion: typeof AMap */ js.Any = js.native
  
  /**
    * 加载插件，
    * @param name 插件名称
    * @param callback 插件加载完成后的回调函数
    */
  def service(plugin: String, callback: js.Function0[Unit]): /* import warning: importer.ImportType#apply Failed type conversion: typeof AMap */ js.Any = js.native
  def service(plugin: js.Array[String], callback: js.Function0[Unit]): /* import warning: importer.ImportType#apply Failed type conversion: typeof AMap */ js.Any = js.native
}
