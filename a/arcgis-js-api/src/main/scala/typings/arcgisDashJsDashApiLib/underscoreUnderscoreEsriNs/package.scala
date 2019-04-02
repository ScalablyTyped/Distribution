package typings
package arcgisDashJsDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object underscoreUnderscoreEsriNs {
  type AfterInterceptorCallback = js.Function1[/* response */ RequestResponse, scala.Unit]
  type BaseDynamicLayerLayerviewCreateEventHandler = js.Function1[/* event */ BaseDynamicLayerLayerviewCreateEvent, scala.Unit]
  type BaseDynamicLayerLayerviewDestroyEventHandler = js.Function1[/* event */ BaseDynamicLayerLayerviewDestroyEvent, scala.Unit]
  type BaseElevationLayerLayerviewCreateEventHandler = js.Function1[/* event */ BaseElevationLayerLayerviewCreateEvent, scala.Unit]
  type BaseElevationLayerLayerviewDestroyEventHandler = js.Function1[/* event */ BaseElevationLayerLayerviewDestroyEvent, scala.Unit]
  type BaseTileLayerLayerviewCreateEventHandler = js.Function1[/* event */ BaseTileLayerLayerviewCreateEvent, scala.Unit]
  type BaseTileLayerLayerviewDestroyEventHandler = js.Function1[/* event */ BaseTileLayerLayerviewDestroyEvent, scala.Unit]
  type BeforeInterceptorCallback = js.Function1[/* params */ js.Any, js.Any]
  type BingMapsLayerLayerviewCreateEventHandler = js.Function1[/* event */ BingMapsLayerLayerviewCreateEvent, scala.Unit]
  type BingMapsLayerLayerviewDestroyEventHandler = js.Function1[/* event */ BingMapsLayerLayerviewDestroyEvent, scala.Unit]
  type BuildingSceneLayerLayerviewCreateEventHandler = js.Function1[/* event */ BuildingSceneLayerLayerviewCreateEvent, scala.Unit]
  type BuildingSceneLayerLayerviewDestroyEventHandler = js.Function1[/* event */ BuildingSceneLayerLayerviewDestroyEvent, scala.Unit]
  type CSVLayerLayerviewCreateEventHandler = js.Function1[/* event */ CSVLayerLayerviewCreateEvent, scala.Unit]
  type CSVLayerLayerviewDestroyEventHandler = js.Function1[/* event */ CSVLayerLayerviewDestroyEvent, scala.Unit]
  type ClosestFacilityTaskProperties = TaskProperties
  type CollectionAfterAddEventHandler[T] = js.Function1[/* event */ CollectionAfterEvent[T], scala.Unit]
  type CollectionAfterChangesEventHandler[T] = js.Function1[/* event */ CollectionAfterChangesEvent[T], scala.Unit]
  type CollectionAfterRemoveEventHandler[T] = js.Function1[/* event */ CollectionAfterEvent[T], scala.Unit]
  type CollectionBeforeAddEventHandler[T] = js.Function1[/* event */ CollectionBeforeEvent[T], scala.Unit]
  type CollectionBeforeChangesEventHandler[T] = js.Function1[/* event */ CollectionBeforeEvent[T], scala.Unit]
  type CollectionBeforeRemoveEventHandler[T] = js.Function1[/* event */ CollectionBeforeEvent[T], scala.Unit]
  type CollectionChangeEventHandler[T] = js.Function1[/* event */ CollectionChangeEvent[T], scala.Unit]
  type CollectionProperties[T] = js.Array[T] | Collection[T]
  type Constructor[T] = org.scalablytyped.runtime.Instantiable1[/* params (repeated) */ js.Any, T]
  type CredentialDestroyEventHandler = js.Function1[/* event */ CredentialDestroyEvent, scala.Unit]
  type CredentialTokenChangeEventHandler = js.Function1[/* event */ CredentialTokenChangeEvent, scala.Unit]
  type DateProperties = scala.Double | java.lang.String | stdLib.Date
  type EasingFunction = js.Function2[/* t */ scala.Double, /* duration */ scala.Double, scala.Double]
  type ElevationLayerLayerviewCreateEventHandler = js.Function1[/* event */ ElevationLayerLayerviewCreateEvent, scala.Unit]
  type ElevationLayerLayerviewDestroyEventHandler = js.Function1[/* event */ ElevationLayerLayerviewDestroyEvent, scala.Unit]
  type ElevationSamplerChangedEventHandler = js.Function1[/* event */ ElevationSamplerChangedEvent, scala.Unit]
  type EventAttachedCallback = js.Function4[
    /* target */ js.UndefOr[js.Any], 
    /* propName */ js.UndefOr[java.lang.String], 
    /* obj */ js.UndefOr[Accessor], 
    /* eventName */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
  type EventHandler = js.Function1[/* event */ js.Any, scala.Unit]
  type Executor = js.Function2[/* resolve */ ResolveCallback, /* reject */ RejectCallback, scala.Unit]
  type FeatureLayerLayerviewCreateEventHandler = js.Function1[/* event */ FeatureLayerLayerviewCreateEvent, scala.Unit]
  type FeatureLayerLayerviewDestroyEventHandler = js.Function1[/* event */ FeatureLayerLayerviewDestroyEvent, scala.Unit]
  type FilterFunction = js.Function1[/* filterName */ js.Any, scala.Boolean]
  type FilterPredicateCallback = js.Function2[
    /* value */ js.Any, 
    /* index */ scala.Double, 
    arcgisDashJsDashApiLib.IPromise[js.Any]
  ]
  type GeoJSONLayerLayerviewCreateEventHandler = js.Function1[/* event */ GeoJSONLayerLayerviewCreateEvent, scala.Unit]
  type GeoJSONLayerLayerviewDestroyEventHandler = js.Function1[/* event */ GeoJSONLayerLayerviewDestroyEvent, scala.Unit]
  type GeoRSSLayerLayerviewCreateEventHandler = js.Function1[/* event */ GeoRSSLayerLayerviewCreateEvent, scala.Unit]
  type GeoRSSLayerLayerviewDestroyEventHandler = js.Function1[/* event */ GeoRSSLayerLayerviewDestroyEvent, scala.Unit]
  type GeoRSSLayerViewProperties = LayerViewProperties
  type GeometryServiceProperties = TaskProperties
  type GetHeader = js.Function1[/* headerName */ java.lang.String, java.lang.String]
  type GoToOverride = js.Function2[/* view */ MapView | SceneView, /* goToParameters */ GoToParameters, scala.Unit]
  type GraphicsLayerLayerviewCreateEventHandler = js.Function1[/* event */ GraphicsLayerLayerviewCreateEvent, scala.Unit]
  type GraphicsLayerLayerviewDestroyEventHandler = js.Function1[/* event */ GraphicsLayerLayerviewDestroyEvent, scala.Unit]
  type GraphicsLayerViewProperties = LayerViewProperties
  type GroupByFunction = js.Function1[/* grouping */ js.Any, java.lang.String | js.Any]
  type GroupLayerLayerviewCreateEventHandler = js.Function1[/* event */ GroupLayerLayerviewCreateEvent, scala.Unit]
  type GroupLayerLayerviewDestroyEventHandler = js.Function1[/* event */ GroupLayerLayerviewDestroyEvent, scala.Unit]
  type HandlerCallback = js.Function5[
    /* authorizeParams */ js.Any, 
    /* authorizeUrl */ java.lang.String, 
    /* oAuthInfo */ OAuthInfo, 
    /* resourceUrl */ java.lang.String, 
    /* serverInfo */ ServerInfo, 
    scala.Unit
  ]
  type ImageServiceIdentifyTaskProperties = TaskProperties
  type ImageryLayerLayerviewCreateEventHandler = js.Function1[/* event */ ImageryLayerLayerviewCreateEvent, scala.Unit]
  type ImageryLayerLayerviewDestroyEventHandler = js.Function1[/* event */ ImageryLayerLayerviewDestroyEvent, scala.Unit]
  type InheritedDomainProperties = DomainProperties
  type IntegratedMeshLayerLayerviewCreateEventHandler = js.Function1[/* event */ IntegratedMeshLayerLayerviewCreateEvent, scala.Unit]
  type IntegratedMeshLayerLayerviewDestroyEventHandler = js.Function1[/* event */ IntegratedMeshLayerLayerviewDestroyEvent, scala.Unit]
  type ItemCallback[T] = js.Function2[/* item */ T, /* index */ scala.Double, scala.Unit]
  type ItemCompareCallback[T] = js.Function2[/* firstItem */ T, /* secondItem */ T, scala.Double]
  type ItemMapCallback[T, R] = js.Function2[/* item */ T, /* index */ scala.Double, R]
  type ItemReduceCallback[T, R] = js.Function3[/* previousValue */ R, /* currentValue */ T, /* index */ scala.Double, R]
  type ItemTestCallback[T] = js.Function2[/* item */ T, /* index */ scala.Double, scala.Boolean]
  type KMLLayerLayerviewCreateEventHandler = js.Function1[/* event */ KMLLayerLayerviewCreateEvent, scala.Unit]
  type KMLLayerLayerviewDestroyEventHandler = js.Function1[/* event */ KMLLayerLayerviewDestroyEvent, scala.Unit]
  type KMLLayerViewProperties = LayerViewProperties
  type LineSymbol3DProperties = Symbol3DProperties
  type ListItemCreatedHandler = js.Function1[/* event */ js.Any, scala.Unit]
  type MapImageLayerLayerviewCreateEventHandler = js.Function1[/* event */ MapImageLayerLayerviewCreateEvent, scala.Unit]
  type MapImageLayerLayerviewDestroyEventHandler = js.Function1[/* event */ MapImageLayerLayerviewDestroyEvent, scala.Unit]
  type MapNotesLayerLayerviewCreateEventHandler = js.Function1[/* event */ MapNotesLayerLayerviewCreateEvent, scala.Unit]
  type MapNotesLayerLayerviewDestroyEventHandler = js.Function1[/* event */ MapNotesLayerLayerviewDestroyEvent, scala.Unit]
  type MapViewBlurEventHandler = js.Function1[/* event */ MapViewBlurEvent, scala.Unit]
  type MapViewClickEventHandler = js.Function1[/* event */ MapViewClickEvent, scala.Unit]
  type MapViewDoubleClickEventHandler = js.Function1[/* event */ MapViewDoubleClickEvent, scala.Unit]
  type MapViewDragEventHandler = js.Function1[/* event */ MapViewDragEvent, scala.Unit]
  type MapViewFocusEventHandler = js.Function1[/* event */ MapViewFocusEvent, scala.Unit]
  type MapViewHoldEventHandler = js.Function1[/* event */ MapViewHoldEvent, scala.Unit]
  type MapViewImmediateClickEventHandler = js.Function1[/* event */ MapViewImmediateClickEvent, scala.Unit]
  type MapViewKeyDownEventHandler = js.Function1[/* event */ MapViewKeyDownEvent, scala.Unit]
  type MapViewKeyUpEventHandler = js.Function1[/* event */ MapViewKeyUpEvent, scala.Unit]
  type MapViewLayerviewCreateEventHandler = js.Function1[/* event */ MapViewLayerviewCreateEvent, scala.Unit]
  type MapViewLayerviewDestroyEventHandler = js.Function1[/* event */ MapViewLayerviewDestroyEvent, scala.Unit]
  type MapViewMouseWheelEventHandler = js.Function1[/* event */ MapViewMouseWheelEvent, scala.Unit]
  type MapViewPointerDownEventHandler = js.Function1[/* event */ MapViewPointerDownEvent, scala.Unit]
  type MapViewPointerEnterEventHandler = js.Function1[/* event */ MapViewPointerEnterEvent, scala.Unit]
  type MapViewPointerLeaveEventHandler = js.Function1[/* event */ MapViewPointerLeaveEvent, scala.Unit]
  type MapViewPointerMoveEventHandler = js.Function1[/* event */ MapViewPointerMoveEvent, scala.Unit]
  type MapViewPointerUpEventHandler = js.Function1[/* event */ MapViewPointerUpEvent, scala.Unit]
  type MapViewResizeEventHandler = js.Function1[/* event */ MapViewResizeEvent, scala.Unit]
  type MeshSymbol3DProperties = Symbol3DProperties
  type MultipointDrawActionProperties = DrawActionProperties
  type OpenStreetMapLayerLayerviewCreateEventHandler = js.Function1[/* event */ OpenStreetMapLayerLayerviewCreateEvent, scala.Unit]
  type OpenStreetMapLayerLayerviewDestroyEventHandler = js.Function1[/* event */ OpenStreetMapLayerLayerviewDestroyEvent, scala.Unit]
  type OpenStreetMapLayerProperties = WebTileLayerProperties
  type PhaseCallback = js.Function1[/* event */ js.UndefOr[PhaseEvent], scala.Unit]
  type PointCloudLayerLayerviewCreateEventHandler = js.Function1[/* event */ PointCloudLayerLayerviewCreateEvent, scala.Unit]
  type PointCloudLayerLayerviewDestroyEventHandler = js.Function1[/* event */ PointCloudLayerLayerviewDestroyEvent, scala.Unit]
  type PointDrawActionProperties = DrawActionProperties
  type PolygonSymbol3DProperties = Symbol3DProperties
  type PopupViewModelTriggerActionEventHandler = js.Function1[/* event */ PopupViewModelTriggerActionEvent, scala.Unit]
  type RejectCallback = js.Function1[/* error */ js.UndefOr[js.Any], scala.Unit]
  type RenderContextCallback = js.Function1[/* context */ js.UndefOr[RenderContext], scala.Unit]
  type ResolveCallback = js.Function1[
    /* value */ js.UndefOr[js.Any | arcgisDashJsDashApiLib.IPromise[js.Any]], 
    scala.Unit
  ]
  type RouteTaskProperties = TaskProperties
  type SceneLayerLayerviewCreateEventHandler = js.Function1[/* event */ SceneLayerLayerviewCreateEvent, scala.Unit]
  type SceneLayerLayerviewDestroyEventHandler = js.Function1[/* event */ SceneLayerLayerviewDestroyEvent, scala.Unit]
  type SceneViewBlurEventHandler = js.Function1[/* event */ SceneViewBlurEvent, scala.Unit]
  type SceneViewClickEventHandler = js.Function1[/* event */ SceneViewClickEvent, scala.Unit]
  type SceneViewDoubleClickEventHandler = js.Function1[/* event */ SceneViewDoubleClickEvent, scala.Unit]
  type SceneViewDragEventHandler = js.Function1[/* event */ SceneViewDragEvent, scala.Unit]
  type SceneViewFocusEventHandler = js.Function1[/* event */ SceneViewFocusEvent, scala.Unit]
  type SceneViewHoldEventHandler = js.Function1[/* event */ SceneViewHoldEvent, scala.Unit]
  type SceneViewImmediateClickEventHandler = js.Function1[/* event */ SceneViewImmediateClickEvent, scala.Unit]
  type SceneViewKeyDownEventHandler = js.Function1[/* event */ SceneViewKeyDownEvent, scala.Unit]
  type SceneViewKeyUpEventHandler = js.Function1[/* event */ SceneViewKeyUpEvent, scala.Unit]
  type SceneViewLayerviewCreateEventHandler = js.Function1[/* event */ SceneViewLayerviewCreateEvent, scala.Unit]
  type SceneViewLayerviewDestroyEventHandler = js.Function1[/* event */ SceneViewLayerviewDestroyEvent, scala.Unit]
  type SceneViewMouseWheelEventHandler = js.Function1[/* event */ SceneViewMouseWheelEvent, scala.Unit]
  type SceneViewPointerDownEventHandler = js.Function1[/* event */ SceneViewPointerDownEvent, scala.Unit]
  type SceneViewPointerEnterEventHandler = js.Function1[/* event */ SceneViewPointerEnterEvent, scala.Unit]
  type SceneViewPointerLeaveEventHandler = js.Function1[/* event */ SceneViewPointerLeaveEvent, scala.Unit]
  type SceneViewPointerMoveEventHandler = js.Function1[/* event */ SceneViewPointerMoveEvent, scala.Unit]
  type SceneViewPointerUpEventHandler = js.Function1[/* event */ SceneViewPointerUpEvent, scala.Unit]
  type SceneViewResizeEventHandler = js.Function1[/* event */ SceneViewResizeEvent, scala.Unit]
  type SearchViewModelSearchClearEventHandler = js.Function1[/* event */ SearchViewModelSearchClearEvent, scala.Unit]
  type SearchViewModelSearchCompleteEventHandler = js.Function1[/* event */ SearchViewModelSearchCompleteEvent, scala.Unit]
  type SearchViewModelSearchStartEventHandler = js.Function1[/* event */ SearchViewModelSearchStartEvent, scala.Unit]
  type SearchViewModelSelectResultEventHandler = js.Function1[/* event */ SearchViewModelSelectResultEvent, scala.Unit]
  type SearchViewModelSuggestCompleteEventHandler = js.Function1[/* event */ SearchViewModelSuggestCompleteEvent, scala.Unit]
  type SearchViewModelSuggestStartEventHandler = js.Function1[/* event */ SearchViewModelSuggestStartEvent, scala.Unit]
  type ServiceAreaTaskProperties = TaskProperties
  type StreamLayerLayerviewCreateEventHandler = js.Function1[/* event */ StreamLayerLayerviewCreateEvent, scala.Unit]
  type StreamLayerLayerviewDestroyEventHandler = js.Function1[/* event */ StreamLayerLayerviewDestroyEvent, scala.Unit]
  type StreamLayerViewDataReceivedEventHandler = js.Function1[/* event */ StreamLayerViewDataReceivedEvent, scala.Unit]
  type TileLayerLayerviewCreateEventHandler = js.Function1[/* event */ TileLayerLayerviewCreateEvent, scala.Unit]
  type TileLayerLayerviewDestroyEventHandler = js.Function1[/* event */ TileLayerLayerviewDestroyEvent, scala.Unit]
  type TokenTaskProperties = TaskProperties
  type UnknownLayerLayerviewCreateEventHandler = js.Function1[/* event */ UnknownLayerLayerviewCreateEvent, scala.Unit]
  type UnknownLayerLayerviewDestroyEventHandler = js.Function1[/* event */ UnknownLayerLayerviewDestroyEvent, scala.Unit]
  type UnknownLayerProperties = LayerProperties
  type UnsupportedLayerLayerviewCreateEventHandler = js.Function1[/* event */ UnsupportedLayerLayerviewCreateEvent, scala.Unit]
  type UnsupportedLayerLayerviewDestroyEventHandler = js.Function1[/* event */ UnsupportedLayerLayerviewDestroyEvent, scala.Unit]
  type UnsupportedLayerProperties = LayerProperties
  type VectorTileLayerLayerviewCreateEventHandler = js.Function1[/* event */ VectorTileLayerLayerviewCreateEvent, scala.Unit]
  type VectorTileLayerLayerviewDestroyEventHandler = js.Function1[/* event */ VectorTileLayerLayerviewDestroyEvent, scala.Unit]
  type WMSLayerLayerviewCreateEventHandler = js.Function1[/* event */ WMSLayerLayerviewCreateEvent, scala.Unit]
  type WMSLayerLayerviewDestroyEventHandler = js.Function1[/* event */ WMSLayerLayerviewDestroyEvent, scala.Unit]
  type WMTSLayerLayerviewCreateEventHandler = js.Function1[/* event */ WMTSLayerLayerviewCreateEvent, scala.Unit]
  type WMTSLayerLayerviewDestroyEventHandler = js.Function1[/* event */ WMTSLayerLayerviewDestroyEvent, scala.Unit]
  type WatchCallback = js.Function4[
    /* newValue */ js.Any, 
    /* oldValue */ js.Any, 
    /* propertyName */ java.lang.String, 
    /* target */ Accessor, 
    scala.Unit
  ]
  type WebTileLayerLayerviewCreateEventHandler = js.Function1[/* event */ WebTileLayerLayerviewCreateEvent, scala.Unit]
  type WebTileLayerLayerviewDestroyEventHandler = js.Function1[/* event */ WebTileLayerLayerviewDestroyEvent, scala.Unit]
  type contentAttachmentsContent = AttachmentsContent
  type contentFieldsContent = FieldsContent
  type contentMediaContent = MediaContent
  type contentTextContent = TextContent
  type geometryExtent = Extent
  type geometryMesh = Mesh
  type geometryMultipoint = Multipoint
  type geometryPoint = Point
  type geometryPolygon = Polygon
  type geometryPolyline = Polyline
  type pointCloudRenderersPointCloudClassBreaksRenderer = PointCloudClassBreaksRenderer
  type pointCloudRenderersPointCloudRGBRenderer = PointCloudRGBRenderer
  type pointCloudRenderersPointCloudStretchRenderer = PointCloudStretchRenderer
  type pointCloudRenderersPointCloudUniqueValueRenderer = PointCloudUniqueValueRenderer
  type renderersClassBreaksRenderer = ClassBreaksRenderer
  type renderersDotDensityRenderer = DotDensityRenderer
  type renderersHeatmapRenderer = HeatmapRenderer
  type renderersSimpleRenderer = SimpleRenderer
  type renderersUniqueValueRenderer = UniqueValueRenderer
  type symbolsExtrudeSymbol3DLayer = ExtrudeSymbol3DLayer
  type symbolsFillSymbol3DLayer = FillSymbol3DLayer
  type symbolsFont = Font
  type symbolsIconSymbol3DLayer = IconSymbol3DLayer
  type symbolsLabelSymbol3D = LabelSymbol3D
  type symbolsLineSymbol3D = LineSymbol3D
  type symbolsLineSymbol3DLayer = LineSymbol3DLayer
  type symbolsMeshSymbol3D = MeshSymbol3D
  type symbolsObjectSymbol3DLayer = ObjectSymbol3DLayer
  type symbolsPathSymbol3DLayer = PathSymbol3DLayer
  type symbolsPictureFillSymbol = PictureFillSymbol
  type symbolsPictureMarkerSymbol = PictureMarkerSymbol
  type symbolsPointSymbol3D = PointSymbol3D
  type symbolsPolygonSymbol3D = PolygonSymbol3D
  type symbolsSimpleFillSymbol = SimpleFillSymbol
  type symbolsSimpleLineSymbol = SimpleLineSymbol
  type symbolsSimpleMarkerSymbol = SimpleMarkerSymbol
  type symbolsTextSymbol = TextSymbol
  type symbolsTextSymbol3DLayer = TextSymbol3DLayer
  type symbolsWebStyleSymbol = WebStyleSymbol
}
