package typings.arcgisDashJsDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object __esri {
  import org.scalablytyped.runtime.Instantiable1
  import typings.arcgisDashJsDashApi.IPromise
  import typings.std.Date
  import typings.std.HTMLElement

  type AfterInterceptorCallback = js.Function1[/* response */ RequestResponse, Unit]
  type BarCreatedFunction = js.Function2[/* index */ Double, /* element */ js.Any, Unit]
  type BaseDynamicLayerLayerviewCreateErrorEventHandler = js.Function1[/* event */ BaseDynamicLayerLayerviewCreateErrorEvent, Unit]
  type BaseDynamicLayerLayerviewCreateEventHandler = js.Function1[/* event */ BaseDynamicLayerLayerviewCreateEvent, Unit]
  type BaseDynamicLayerLayerviewDestroyEventHandler = js.Function1[/* event */ BaseDynamicLayerLayerviewDestroyEvent, Unit]
  type BaseElevationLayerLayerviewCreateErrorEventHandler = js.Function1[/* event */ BaseElevationLayerLayerviewCreateErrorEvent, Unit]
  type BaseElevationLayerLayerviewCreateEventHandler = js.Function1[/* event */ BaseElevationLayerLayerviewCreateEvent, Unit]
  type BaseElevationLayerLayerviewDestroyEventHandler = js.Function1[/* event */ BaseElevationLayerLayerviewDestroyEvent, Unit]
  type BaseTileLayerLayerviewCreateErrorEventHandler = js.Function1[/* event */ BaseTileLayerLayerviewCreateErrorEvent, Unit]
  type BaseTileLayerLayerviewCreateEventHandler = js.Function1[/* event */ BaseTileLayerLayerviewCreateEvent, Unit]
  type BaseTileLayerLayerviewDestroyEventHandler = js.Function1[/* event */ BaseTileLayerLayerviewDestroyEvent, Unit]
  type BasemapLayerListTriggerActionEventHandler = js.Function1[/* event */ BasemapLayerListTriggerActionEvent, Unit]
  type BasemapToggleToggleEventHandler = js.Function1[/* event */ BasemapToggleToggleEvent, Unit]
  type BeforeInterceptorCallback = js.Function1[/* params */ js.Any, js.Any]
  type BingMapsLayerLayerviewCreateErrorEventHandler = js.Function1[/* event */ BingMapsLayerLayerviewCreateErrorEvent, Unit]
  type BingMapsLayerLayerviewCreateEventHandler = js.Function1[/* event */ BingMapsLayerLayerviewCreateEvent, Unit]
  type BingMapsLayerLayerviewDestroyEventHandler = js.Function1[/* event */ BingMapsLayerLayerviewDestroyEvent, Unit]
  type BookmarksSelectBookmarkEventHandler = js.Function1[/* event */ BookmarksSelectBookmarkEvent, Unit]
  type BuildingSceneLayerLayerviewCreateErrorEventHandler = js.Function1[/* event */ BuildingSceneLayerLayerviewCreateErrorEvent, Unit]
  type BuildingSceneLayerLayerviewCreateEventHandler = js.Function1[/* event */ BuildingSceneLayerLayerviewCreateEvent, Unit]
  type BuildingSceneLayerLayerviewDestroyEventHandler = js.Function1[/* event */ BuildingSceneLayerLayerviewDestroyEvent, Unit]
  type CSVLayerLayerviewCreateErrorEventHandler = js.Function1[/* event */ CSVLayerLayerviewCreateErrorEvent, Unit]
  type CSVLayerLayerviewCreateEventHandler = js.Function1[/* event */ CSVLayerLayerviewCreateEvent, Unit]
  type CSVLayerLayerviewDestroyEventHandler = js.Function1[/* event */ CSVLayerLayerviewDestroyEvent, Unit]
  type ClassedColorSliderMaxChangeEventHandler = js.Function1[/* event */ ClassedColorSliderMaxChangeEvent, Unit]
  type ClassedColorSliderMinChangeEventHandler = js.Function1[/* event */ ClassedColorSliderMinChangeEvent, Unit]
  type ClassedColorSliderThumbChangeEventHandler = js.Function1[/* event */ ClassedColorSliderThumbChangeEvent, Unit]
  type ClassedColorSliderThumbDragEventHandler = js.Function1[/* event */ ClassedColorSliderThumbDragEvent, Unit]
  type ClassedColorSliderViewModelMaxChangeEventHandler = js.Function1[/* event */ ClassedColorSliderViewModelMaxChangeEvent, Unit]
  type ClassedColorSliderViewModelMinChangeEventHandler = js.Function1[/* event */ ClassedColorSliderViewModelMinChangeEvent, Unit]
  type ClassedSizeSliderMaxChangeEventHandler = js.Function1[/* event */ ClassedSizeSliderMaxChangeEvent, Unit]
  type ClassedSizeSliderMinChangeEventHandler = js.Function1[/* event */ ClassedSizeSliderMinChangeEvent, Unit]
  type ClassedSizeSliderThumbChangeEventHandler = js.Function1[/* event */ ClassedSizeSliderThumbChangeEvent, Unit]
  type ClassedSizeSliderThumbDragEventHandler = js.Function1[/* event */ ClassedSizeSliderThumbDragEvent, Unit]
  type ClassedSizeSliderViewModelMaxChangeEventHandler = js.Function1[/* event */ ClassedSizeSliderViewModelMaxChangeEvent, Unit]
  type ClassedSizeSliderViewModelMinChangeEventHandler = js.Function1[/* event */ ClassedSizeSliderViewModelMinChangeEvent, Unit]
  type ClosestFacilityTaskProperties = TaskProperties
  type CollectionAfterAddEventHandler[T] = js.Function1[/* event */ CollectionAfterEvent[T], Unit]
  type CollectionAfterChangesEventHandler[T] = js.Function1[/* event */ CollectionAfterChangesEvent[T], Unit]
  type CollectionAfterRemoveEventHandler[T] = js.Function1[/* event */ CollectionAfterEvent[T], Unit]
  type CollectionBeforeAddEventHandler[T] = js.Function1[/* event */ CollectionBeforeEvent[T], Unit]
  type CollectionBeforeChangesEventHandler[T] = js.Function1[/* event */ CollectionBeforeEvent[T], Unit]
  type CollectionBeforeRemoveEventHandler[T] = js.Function1[/* event */ CollectionBeforeEvent[T], Unit]
  type CollectionChangeEventHandler[T] = js.Function1[/* event */ CollectionChangeEvent[T], Unit]
  type CollectionProperties[T] = js.Array[T] | Collection[T]
  type ColorSizeSliderMaxChangeEventHandler = js.Function1[/* event */ ColorSizeSliderMaxChangeEvent, Unit]
  type ColorSizeSliderMinChangeEventHandler = js.Function1[/* event */ ColorSizeSliderMinChangeEvent, Unit]
  type ColorSizeSliderThumbChangeEventHandler = js.Function1[/* event */ ColorSizeSliderThumbChangeEvent, Unit]
  type ColorSizeSliderThumbDragEventHandler = js.Function1[/* event */ ColorSizeSliderThumbDragEvent, Unit]
  type ColorSizeSliderViewModelMaxChangeEventHandler = js.Function1[/* event */ ColorSizeSliderViewModelMaxChangeEvent, Unit]
  type ColorSizeSliderViewModelMinChangeEventHandler = js.Function1[/* event */ ColorSizeSliderViewModelMinChangeEvent, Unit]
  type ColorSliderMaxChangeEventHandler = js.Function1[/* event */ ColorSliderMaxChangeEvent, Unit]
  type ColorSliderMinChangeEventHandler = js.Function1[/* event */ ColorSliderMinChangeEvent, Unit]
  type ColorSliderThumbChangeEventHandler = js.Function1[/* event */ ColorSliderThumbChangeEvent, Unit]
  type ColorSliderThumbDragEventHandler = js.Function1[/* event */ ColorSliderThumbDragEvent, Unit]
  type ColorSliderViewModelMaxChangeEventHandler = js.Function1[/* event */ ColorSliderViewModelMaxChangeEvent, Unit]
  type ColorSliderViewModelMinChangeEventHandler = js.Function1[/* event */ ColorSliderViewModelMinChangeEvent, Unit]
  type Constructor[T] = Instantiable1[/* params (repeated) */ js.Any, T]
  type CredentialDestroyEventHandler = js.Function1[/* event */ CredentialDestroyEvent, Unit]
  type CredentialTokenChangeEventHandler = js.Function1[/* event */ CredentialTokenChangeEvent, Unit]
  type DataLineCreatedFunction = js.Function3[
    /* lineElement */ js.Any, 
    /* labelElement */ js.UndefOr[js.Any], 
    /* index */ js.UndefOr[Double], 
    Unit
  ]
  type DateProperties = Double | String | Date
  type EasingFunction = js.Function2[/* t */ Double, /* duration */ Double, Double]
  type ElevationLayerLayerviewCreateErrorEventHandler = js.Function1[/* event */ ElevationLayerLayerviewCreateErrorEvent, Unit]
  type ElevationLayerLayerviewCreateEventHandler = js.Function1[/* event */ ElevationLayerLayerviewCreateEvent, Unit]
  type ElevationLayerLayerviewDestroyEventHandler = js.Function1[/* event */ ElevationLayerLayerviewDestroyEvent, Unit]
  type ElevationSamplerChangedEventHandler = js.Function1[/* event */ ElevationSamplerChangedEvent, Unit]
  type EventAttachedCallback = js.Function4[
    /* target */ js.UndefOr[js.Any], 
    /* propName */ js.UndefOr[String], 
    /* obj */ js.UndefOr[Accessor], 
    /* eventName */ js.UndefOr[String], 
    Unit
  ]
  type EventHandler = js.Function1[/* event */ js.Any, Unit]
  type Executor = js.Function2[/* resolve */ ResolveCallback, /* reject */ RejectCallback, Unit]
  type FeatureFormSubmitEventHandler = js.Function1[/* event */ FeatureFormSubmitEvent, Unit]
  type FeatureFormValueChangeEventHandler = js.Function1[/* event */ FeatureFormValueChangeEvent, Unit]
  type FeatureFormViewModelSubmitEventHandler = js.Function1[/* event */ FeatureFormViewModelSubmitEvent, Unit]
  type FeatureFormViewModelValueChangeEventHandler = js.Function1[/* event */ FeatureFormViewModelValueChangeEvent, Unit]
  type FeatureLayerEditsEventHandler = js.Function1[/* event */ FeatureLayerEditsEvent, Unit]
  type FeatureLayerLayerviewCreateErrorEventHandler = js.Function1[/* event */ FeatureLayerLayerviewCreateErrorEvent, Unit]
  type FeatureLayerLayerviewCreateEventHandler = js.Function1[/* event */ FeatureLayerLayerviewCreateEvent, Unit]
  type FeatureLayerLayerviewDestroyEventHandler = js.Function1[/* event */ FeatureLayerLayerviewDestroyEvent, Unit]
  type FeatureTemplatesSelectEventHandler = js.Function1[/* event */ FeatureTemplatesSelectEvent, Unit]
  type FeatureTemplatesViewModelSelectEventHandler = js.Function1[/* event */ FeatureTemplatesViewModelSelectEvent, Unit]
  type FilterFunction = js.Function1[/* filterName */ js.Any, Boolean]
  type FilterPredicateCallback = js.Function2[/* value */ js.Any, /* index */ Double, IPromise[js.Any]]
  type GeoJSONLayerEditsEventHandler = js.Function1[/* event */ GeoJSONLayerEditsEvent, Unit]
  type GeoJSONLayerLayerviewCreateErrorEventHandler = js.Function1[/* event */ GeoJSONLayerLayerviewCreateErrorEvent, Unit]
  type GeoJSONLayerLayerviewCreateEventHandler = js.Function1[/* event */ GeoJSONLayerLayerviewCreateEvent, Unit]
  type GeoJSONLayerLayerviewDestroyEventHandler = js.Function1[/* event */ GeoJSONLayerLayerviewDestroyEvent, Unit]
  type GeoRSSLayerLayerviewCreateErrorEventHandler = js.Function1[/* event */ GeoRSSLayerLayerviewCreateErrorEvent, Unit]
  type GeoRSSLayerLayerviewCreateEventHandler = js.Function1[/* event */ GeoRSSLayerLayerviewCreateEvent, Unit]
  type GeoRSSLayerLayerviewDestroyEventHandler = js.Function1[/* event */ GeoRSSLayerLayerviewDestroyEvent, Unit]
  type GeoRSSLayerViewProperties = LayerViewProperties
  type GeometryServiceProperties = TaskProperties
  type GetHeader = js.Function1[/* headerName */ String, String]
  type GetResultsHandler = js.Function1[/* params */ js.Any, IPromise[js.Array[SearchResult]]]
  type GetSuggestionsParameters = js.Function1[/* params */ js.Any, IPromise[js.Array[SuggestResult]]]
  type GoToOverride = js.Function2[/* view */ MapView | SceneView, /* goToParameters */ js.Any, Unit]
  /* Rewritten from type alias, can be one of: 
    - js.Array[
  scala.Double | typings.arcgisDashJsDashApi.__esri.Geometry | typings.arcgisDashJsDashApi.__esri.Graphic]
    - typings.arcgisDashJsDashApi.__esri.Geometry
    - typings.arcgisDashJsDashApi.__esri.Collection[
  typings.arcgisDashJsDashApi.__esri.Geometry | typings.arcgisDashJsDashApi.__esri.Graphic]
    - typings.arcgisDashJsDashApi.__esri.Graphic
    - typings.arcgisDashJsDashApi.__esri.Viewpoint
    - js.Any
  */
  type GoToTarget2D = _GoToTarget2D | (js.Array[Double | Geometry | Graphic]) | (Collection[Geometry | Graphic]) | js.Any
  /* Rewritten from type alias, can be one of: 
    - js.Array[
  scala.Double | typings.arcgisDashJsDashApi.__esri.Geometry | typings.arcgisDashJsDashApi.__esri.Graphic]
    - typings.arcgisDashJsDashApi.__esri.Geometry
    - typings.arcgisDashJsDashApi.__esri.Collection[
  typings.arcgisDashJsDashApi.__esri.Geometry | typings.arcgisDashJsDashApi.__esri.Graphic]
    - typings.arcgisDashJsDashApi.__esri.Graphic
    - typings.arcgisDashJsDashApi.__esri.Camera
    - typings.arcgisDashJsDashApi.__esri.Viewpoint
    - js.Any
  */
  type GoToTarget3D = _GoToTarget3D | (js.Array[Double | Geometry | Graphic]) | (Collection[Geometry | Graphic]) | js.Any
  type GraphicsLayerLayerviewCreateErrorEventHandler = js.Function1[/* event */ GraphicsLayerLayerviewCreateErrorEvent, Unit]
  type GraphicsLayerLayerviewCreateEventHandler = js.Function1[/* event */ GraphicsLayerLayerviewCreateEvent, Unit]
  type GraphicsLayerLayerviewDestroyEventHandler = js.Function1[/* event */ GraphicsLayerLayerviewDestroyEvent, Unit]
  type GraphicsLayerViewProperties = LayerViewProperties
  type GroupByFunction = js.Function1[/* grouping */ js.Any, String | js.Any]
  type GroupLayerLayerviewCreateErrorEventHandler = js.Function1[/* event */ GroupLayerLayerviewCreateErrorEvent, Unit]
  type GroupLayerLayerviewCreateEventHandler = js.Function1[/* event */ GroupLayerLayerviewCreateEvent, Unit]
  type GroupLayerLayerviewDestroyEventHandler = js.Function1[/* event */ GroupLayerLayerviewDestroyEvent, Unit]
  type HandlerCallback = js.Function5[
    /* authorizeParams */ js.Any, 
    /* authorizeUrl */ String, 
    /* oAuthInfo */ OAuthInfo, 
    /* resourceUrl */ String, 
    /* serverInfo */ ServerInfo, 
    Unit
  ]
  type HeatmapSliderThumbChangeEventHandler = js.Function1[/* event */ HeatmapSliderThumbChangeEvent, Unit]
  type HeatmapSliderThumbDragEventHandler = js.Function1[/* event */ HeatmapSliderThumbDragEvent, Unit]
  type HeatmapSliderViewModelMaxChangeEventHandler = js.Function1[/* event */ HeatmapSliderViewModelMaxChangeEvent, Unit]
  type HeatmapSliderViewModelMinChangeEventHandler = js.Function1[/* event */ HeatmapSliderViewModelMinChangeEvent, Unit]
  type HistogramRangeSliderMaxChangeEventHandler = js.Function1[/* event */ HistogramRangeSliderMaxChangeEvent, Unit]
  type HistogramRangeSliderMinChangeEventHandler = js.Function1[/* event */ HistogramRangeSliderMinChangeEvent, Unit]
  type HistogramRangeSliderSegmentDragEventHandler = js.Function1[/* event */ HistogramRangeSliderSegmentDragEvent, Unit]
  type HistogramRangeSliderThumbChangeEventHandler = js.Function1[/* event */ HistogramRangeSliderThumbChangeEvent, Unit]
  type HistogramRangeSliderThumbDragEventHandler = js.Function1[/* event */ HistogramRangeSliderThumbDragEvent, Unit]
  type HistogramRangeSliderValueChangeEventHandler = js.Function1[/* event */ HistogramRangeSliderValueChangeEvent, Unit]
  type HistogramRangeSliderValuesChangeEventHandler = js.Function1[/* event */ HistogramRangeSliderValuesChangeEvent, Unit]
  type HistogramRangeSliderViewModelMaxChangeEventHandler = js.Function1[/* event */ HistogramRangeSliderViewModelMaxChangeEvent, Unit]
  type HistogramRangeSliderViewModelMinChangeEventHandler = js.Function1[/* event */ HistogramRangeSliderViewModelMinChangeEvent, Unit]
  type HomeGoEventHandler = js.Function1[/* event */ HomeGoEvent, Unit]
  type HomeViewModelGoEventHandler = js.Function1[/* event */ HomeViewModelGoEvent, Unit]
  type IdentityManagerCredentialCreateEventHandler = js.Function1[/* event */ IdentityManagerCredentialCreateEvent, Unit]
  type IdentityManagerDialogCreateEventHandler = js.Function1[/* event */ IdentityManagerDialogCreateEvent, Unit]
  type ImageServiceIdentifyTask = Task
  type ImageServiceIdentifyTaskProperties = TaskProperties
  type ImageryLayerLayerviewCreateErrorEventHandler = js.Function1[/* event */ ImageryLayerLayerviewCreateErrorEvent, Unit]
  type ImageryLayerLayerviewCreateEventHandler = js.Function1[/* event */ ImageryLayerLayerviewCreateEvent, Unit]
  type ImageryLayerLayerviewDestroyEventHandler = js.Function1[/* event */ ImageryLayerLayerviewDestroyEvent, Unit]
  type InheritedDomainProperties = DomainProperties
  type InputParser = js.Function3[
    /* value */ String, 
    /* type */ js.UndefOr[String], 
    /* index */ js.UndefOr[Double], 
    Double
  ]
  type IntegratedMeshLayerLayerviewCreateErrorEventHandler = js.Function1[/* event */ IntegratedMeshLayerLayerviewCreateErrorEvent, Unit]
  type IntegratedMeshLayerLayerviewCreateEventHandler = js.Function1[/* event */ IntegratedMeshLayerLayerviewCreateEvent, Unit]
  type IntegratedMeshLayerLayerviewDestroyEventHandler = js.Function1[/* event */ IntegratedMeshLayerLayerviewDestroyEvent, Unit]
  type ItemCallback[T] = js.Function2[/* item */ T, /* index */ Double, Unit]
  type ItemCompareCallback[T] = js.Function2[/* firstItem */ T, /* secondItem */ T, Double]
  type ItemMapCallback[T, R] = js.Function2[/* item */ T, /* index */ Double, R]
  type ItemReduceCallback[T, R] = js.Function3[/* previousValue */ R, /* currentValue */ T, /* index */ Double, R]
  type ItemTestCallback[T] = js.Function2[/* item */ T, /* index */ Double, Boolean]
  type KMLLayerLayerviewCreateErrorEventHandler = js.Function1[/* event */ KMLLayerLayerviewCreateErrorEvent, Unit]
  type KMLLayerLayerviewCreateEventHandler = js.Function1[/* event */ KMLLayerLayerviewCreateEvent, Unit]
  type KMLLayerLayerviewDestroyEventHandler = js.Function1[/* event */ KMLLayerLayerviewDestroyEvent, Unit]
  type KMLLayerViewProperties = LayerViewProperties
  type LabelFormatter = js.Function3[
    /* value */ Double, 
    /* type */ js.UndefOr[String], 
    /* index */ js.UndefOr[Double], 
    String
  ]
  type LayerLayerviewCreateErrorEventHandler = js.Function1[/* event */ LayerLayerviewCreateErrorEvent, Unit]
  type LayerLayerviewCreateEventHandler = js.Function1[/* event */ LayerLayerviewCreateEvent, Unit]
  type LayerLayerviewDestroyEventHandler = js.Function1[/* event */ LayerLayerviewDestroyEvent, Unit]
  type LayerListTriggerActionEventHandler = js.Function1[/* event */ LayerListTriggerActionEvent, Unit]
  type LayerListViewModelTriggerActionEventHandler = js.Function1[/* event */ LayerListViewModelTriggerActionEvent, Unit]
  type LineSymbol3DProperties = Symbol3DProperties
  type ListItemCreatedHandler = js.Function1[/* event */ js.Any, Unit]
  type LocateLocateErrorEventHandler = js.Function1[/* event */ LocateLocateErrorEvent, Unit]
  type LocateLocateEventHandler = js.Function1[/* event */ LocateLocateEvent, Unit]
  type LocateViewModelLocateErrorEventHandler = js.Function1[/* event */ LocateViewModelLocateErrorEvent, Unit]
  type MapImageLayerLayerviewCreateErrorEventHandler = js.Function1[/* event */ MapImageLayerLayerviewCreateErrorEvent, Unit]
  type MapImageLayerLayerviewCreateEventHandler = js.Function1[/* event */ MapImageLayerLayerviewCreateEvent, Unit]
  type MapImageLayerLayerviewDestroyEventHandler = js.Function1[/* event */ MapImageLayerLayerviewDestroyEvent, Unit]
  type MapNotesLayerLayerviewCreateErrorEventHandler = js.Function1[/* event */ MapNotesLayerLayerviewCreateErrorEvent, Unit]
  type MapNotesLayerLayerviewCreateEventHandler = js.Function1[/* event */ MapNotesLayerLayerviewCreateEvent, Unit]
  type MapNotesLayerLayerviewDestroyEventHandler = js.Function1[/* event */ MapNotesLayerLayerviewDestroyEvent, Unit]
  type MapViewBlurEventHandler = js.Function1[/* event */ MapViewBlurEvent, Unit]
  type MapViewClickEventHandler = js.Function1[/* event */ MapViewClickEvent, Unit]
  type MapViewDoubleClickEventHandler = js.Function1[/* event */ MapViewDoubleClickEvent, Unit]
  type MapViewDragEventHandler = js.Function1[/* event */ MapViewDragEvent, Unit]
  type MapViewFocusEventHandler = js.Function1[/* event */ MapViewFocusEvent, Unit]
  type MapViewHoldEventHandler = js.Function1[/* event */ MapViewHoldEvent, Unit]
  type MapViewImmediateClickEventHandler = js.Function1[/* event */ MapViewImmediateClickEvent, Unit]
  type MapViewKeyDownEventHandler = js.Function1[/* event */ MapViewKeyDownEvent, Unit]
  type MapViewKeyUpEventHandler = js.Function1[/* event */ MapViewKeyUpEvent, Unit]
  type MapViewLayerviewCreateErrorEventHandler = js.Function1[/* event */ MapViewLayerviewCreateErrorEvent, Unit]
  type MapViewLayerviewCreateEventHandler = js.Function1[/* event */ MapViewLayerviewCreateEvent, Unit]
  type MapViewLayerviewDestroyEventHandler = js.Function1[/* event */ MapViewLayerviewDestroyEvent, Unit]
  type MapViewMouseWheelEventHandler = js.Function1[/* event */ MapViewMouseWheelEvent, Unit]
  type MapViewPointerDownEventHandler = js.Function1[/* event */ MapViewPointerDownEvent, Unit]
  type MapViewPointerEnterEventHandler = js.Function1[/* event */ MapViewPointerEnterEvent, Unit]
  type MapViewPointerLeaveEventHandler = js.Function1[/* event */ MapViewPointerLeaveEvent, Unit]
  type MapViewPointerMoveEventHandler = js.Function1[/* event */ MapViewPointerMoveEvent, Unit]
  type MapViewPointerUpEventHandler = js.Function1[/* event */ MapViewPointerUpEvent, Unit]
  type MapViewResizeEventHandler = js.Function1[/* event */ MapViewResizeEvent, Unit]
  type MeshSymbol3DProperties = Symbol3DProperties
  type MultipointDrawActionCursorUpdateEventHandler = js.Function1[/* event */ MultipointDrawActionCursorUpdateEvent, Unit]
  type MultipointDrawActionDrawCompleteEventHandler = js.Function1[/* event */ MultipointDrawActionDrawCompleteEvent, Unit]
  type MultipointDrawActionProperties = DrawActionProperties
  type MultipointDrawActionRedoEventHandler = js.Function1[/* event */ MultipointDrawActionRedoEvent, Unit]
  type MultipointDrawActionUndoEventHandler = js.Function1[/* event */ MultipointDrawActionUndoEvent, Unit]
  type MultipointDrawActionVertexAddEventHandler = js.Function1[/* event */ MultipointDrawActionVertexAddEvent, Unit]
  type MultipointDrawActionVertexRemoveEventHandler = js.Function1[/* event */ MultipointDrawActionVertexRemoveEvent, Unit]
  type OpacitySliderMaxChangeEventHandler = js.Function1[/* event */ OpacitySliderMaxChangeEvent, Unit]
  type OpacitySliderMinChangeEventHandler = js.Function1[/* event */ OpacitySliderMinChangeEvent, Unit]
  type OpacitySliderThumbChangeEventHandler = js.Function1[/* event */ OpacitySliderThumbChangeEvent, Unit]
  type OpacitySliderThumbDragEventHandler = js.Function1[/* event */ OpacitySliderThumbDragEvent, Unit]
  type OpacitySliderViewModelMaxChangeEventHandler = js.Function1[/* event */ OpacitySliderViewModelMaxChangeEvent, Unit]
  type OpacitySliderViewModelMinChangeEventHandler = js.Function1[/* event */ OpacitySliderViewModelMinChangeEvent, Unit]
  type OpenStreetMapLayerLayerviewCreateErrorEventHandler = js.Function1[/* event */ OpenStreetMapLayerLayerviewCreateErrorEvent, Unit]
  type OpenStreetMapLayerLayerviewCreateEventHandler = js.Function1[/* event */ OpenStreetMapLayerLayerviewCreateEvent, Unit]
  type OpenStreetMapLayerLayerviewDestroyEventHandler = js.Function1[/* event */ OpenStreetMapLayerLayerviewDestroyEvent, Unit]
  type OpenStreetMapLayerProperties = WebTileLayerProperties
  type PhaseCallback = js.Function1[/* event */ js.UndefOr[PhaseEvent], Unit]
  type PointCloudLayerLayerviewCreateErrorEventHandler = js.Function1[/* event */ PointCloudLayerLayerviewCreateErrorEvent, Unit]
  type PointCloudLayerLayerviewCreateEventHandler = js.Function1[/* event */ PointCloudLayerLayerviewCreateEvent, Unit]
  type PointCloudLayerLayerviewDestroyEventHandler = js.Function1[/* event */ PointCloudLayerLayerviewDestroyEvent, Unit]
  type PointCloudLayerViewProperties = LayerViewProperties
  type PointDrawActionCursorUpdateEventHandler = js.Function1[/* event */ PointDrawActionCursorUpdateEvent, Unit]
  type PointDrawActionDrawCompleteEventHandler = js.Function1[/* event */ PointDrawActionDrawCompleteEvent, Unit]
  type PointDrawActionProperties = DrawActionProperties
  type PolygonDrawActionCursorUpdateEventHandler = js.Function1[/* event */ PolygonDrawActionCursorUpdateEvent, Unit]
  type PolygonDrawActionDrawCompleteEventHandler = js.Function1[/* event */ PolygonDrawActionDrawCompleteEvent, Unit]
  type PolygonDrawActionRedoEventHandler = js.Function1[/* event */ PolygonDrawActionRedoEvent, Unit]
  type PolygonDrawActionUndoEventHandler = js.Function1[/* event */ PolygonDrawActionUndoEvent, Unit]
  type PolygonDrawActionVertexAddEventHandler = js.Function1[/* event */ PolygonDrawActionVertexAddEvent, Unit]
  type PolygonDrawActionVertexRemoveEventHandler = js.Function1[/* event */ PolygonDrawActionVertexRemoveEvent, Unit]
  type PolygonSymbol3DProperties = Symbol3DProperties
  type PolylineDrawActionCursorUpdateEventHandler = js.Function1[/* event */ PolylineDrawActionCursorUpdateEvent, Unit]
  type PolylineDrawActionDrawCompleteEventHandler = js.Function1[/* event */ PolylineDrawActionDrawCompleteEvent, Unit]
  type PolylineDrawActionRedoEventHandler = js.Function1[/* event */ PolylineDrawActionRedoEvent, Unit]
  type PolylineDrawActionUndoEventHandler = js.Function1[/* event */ PolylineDrawActionUndoEvent, Unit]
  type PolylineDrawActionVertexAddEventHandler = js.Function1[/* event */ PolylineDrawActionVertexAddEvent, Unit]
  type PolylineDrawActionVertexRemoveEventHandler = js.Function1[/* event */ PolylineDrawActionVertexRemoveEvent, Unit]
  type PopupTriggerActionEventHandler = js.Function1[/* event */ PopupTriggerActionEvent, Unit]
  type PopupViewModelTriggerActionEventHandler = js.Function1[/* event */ PopupViewModelTriggerActionEvent, Unit]
  type RejectCallback = js.Function1[/* error */ js.UndefOr[js.Any], Unit]
  type RenderContextCallback = js.Function1[/* context */ js.UndefOr[RenderContext], Unit]
  type ResolveCallback = js.Function1[/* value */ js.UndefOr[js.Any | IPromise[js.Any]], Unit]
  type RouteTaskProperties = TaskProperties
  type SceneLayerLayerviewCreateErrorEventHandler = js.Function1[/* event */ SceneLayerLayerviewCreateErrorEvent, Unit]
  type SceneLayerLayerviewCreateEventHandler = js.Function1[/* event */ SceneLayerLayerviewCreateEvent, Unit]
  type SceneLayerLayerviewDestroyEventHandler = js.Function1[/* event */ SceneLayerLayerviewDestroyEvent, Unit]
  type SceneViewBlurEventHandler = js.Function1[/* event */ SceneViewBlurEvent, Unit]
  type SceneViewClickEventHandler = js.Function1[/* event */ SceneViewClickEvent, Unit]
  type SceneViewDoubleClickEventHandler = js.Function1[/* event */ SceneViewDoubleClickEvent, Unit]
  type SceneViewDragEventHandler = js.Function1[/* event */ SceneViewDragEvent, Unit]
  type SceneViewFocusEventHandler = js.Function1[/* event */ SceneViewFocusEvent, Unit]
  type SceneViewHoldEventHandler = js.Function1[/* event */ SceneViewHoldEvent, Unit]
  type SceneViewImmediateClickEventHandler = js.Function1[/* event */ SceneViewImmediateClickEvent, Unit]
  type SceneViewKeyDownEventHandler = js.Function1[/* event */ SceneViewKeyDownEvent, Unit]
  type SceneViewKeyUpEventHandler = js.Function1[/* event */ SceneViewKeyUpEvent, Unit]
  type SceneViewLayerviewCreateErrorEventHandler = js.Function1[/* event */ SceneViewLayerviewCreateErrorEvent, Unit]
  type SceneViewLayerviewCreateEventHandler = js.Function1[/* event */ SceneViewLayerviewCreateEvent, Unit]
  type SceneViewLayerviewDestroyEventHandler = js.Function1[/* event */ SceneViewLayerviewDestroyEvent, Unit]
  type SceneViewMouseWheelEventHandler = js.Function1[/* event */ SceneViewMouseWheelEvent, Unit]
  type SceneViewPointerDownEventHandler = js.Function1[/* event */ SceneViewPointerDownEvent, Unit]
  type SceneViewPointerEnterEventHandler = js.Function1[/* event */ SceneViewPointerEnterEvent, Unit]
  type SceneViewPointerLeaveEventHandler = js.Function1[/* event */ SceneViewPointerLeaveEvent, Unit]
  type SceneViewPointerMoveEventHandler = js.Function1[/* event */ SceneViewPointerMoveEvent, Unit]
  type SceneViewPointerUpEventHandler = js.Function1[/* event */ SceneViewPointerUpEvent, Unit]
  type SceneViewResizeEventHandler = js.Function1[/* event */ SceneViewResizeEvent, Unit]
  type SearchSearchBlurEventHandler = js.Function1[/* event */ SearchSearchBlurEvent, Unit]
  type SearchSearchClearEventHandler = js.Function1[/* event */ SearchSearchClearEvent, Unit]
  type SearchSearchCompleteEventHandler = js.Function1[/* event */ SearchSearchCompleteEvent, Unit]
  type SearchSearchFocusEventHandler = js.Function1[/* event */ SearchSearchFocusEvent, Unit]
  type SearchSearchStartEventHandler = js.Function1[/* event */ SearchSearchStartEvent, Unit]
  type SearchSelectResultEventHandler = js.Function1[/* event */ SearchSelectResultEvent, Unit]
  type SearchSuggestCompleteEventHandler = js.Function1[/* event */ SearchSuggestCompleteEvent, Unit]
  type SearchSuggestStartEventHandler = js.Function1[/* event */ SearchSuggestStartEvent, Unit]
  type SearchViewModelSearchClearEventHandler = js.Function1[/* event */ SearchViewModelSearchClearEvent, Unit]
  type SearchViewModelSearchCompleteEventHandler = js.Function1[/* event */ SearchViewModelSearchCompleteEvent, Unit]
  type SearchViewModelSearchStartEventHandler = js.Function1[/* event */ SearchViewModelSearchStartEvent, Unit]
  type SearchViewModelSelectResultEventHandler = js.Function1[/* event */ SearchViewModelSelectResultEvent, Unit]
  type SearchViewModelSuggestCompleteEventHandler = js.Function1[/* event */ SearchViewModelSuggestCompleteEvent, Unit]
  type SearchViewModelSuggestStartEventHandler = js.Function1[/* event */ SearchViewModelSuggestStartEvent, Unit]
  type SegmentDrawActionCursorUpdateEventHandler = js.Function1[/* event */ SegmentDrawActionCursorUpdateEvent, Unit]
  type SegmentDrawActionDrawCompleteEventHandler = js.Function1[/* event */ SegmentDrawActionDrawCompleteEvent, Unit]
  type SegmentDrawActionVertexAddEventHandler = js.Function1[/* event */ SegmentDrawActionVertexAddEvent, Unit]
  type ServiceAreaTaskProperties = TaskProperties
  type SizeSliderMaxChangeEventHandler = js.Function1[/* event */ SizeSliderMaxChangeEvent, Unit]
  type SizeSliderMinChangeEventHandler = js.Function1[/* event */ SizeSliderMinChangeEvent, Unit]
  type SizeSliderThumbChangeEventHandler = js.Function1[/* event */ SizeSliderThumbChangeEvent, Unit]
  type SizeSliderThumbDragEventHandler = js.Function1[/* event */ SizeSliderThumbDragEvent, Unit]
  type SizeSliderViewModelMaxChangeEventHandler = js.Function1[/* event */ SizeSliderViewModelMaxChangeEvent, Unit]
  type SizeSliderViewModelMinChangeEventHandler = js.Function1[/* event */ SizeSliderViewModelMinChangeEvent, Unit]
  type SketchCreateEventHandler = js.Function1[/* event */ SketchCreateEvent, Unit]
  type SketchDeleteEventHandler = js.Function1[/* event */ SketchDeleteEvent, Unit]
  type SketchRedoEventHandler = js.Function1[/* event */ SketchRedoEvent, Unit]
  type SketchUndoEventHandler = js.Function1[/* event */ SketchUndoEvent, Unit]
  type SketchUpdateEventHandler = js.Function1[/* event */ SketchUpdateEvent, Unit]
  type SketchViewModelCreateEventHandler = js.Function1[/* event */ SketchViewModelCreateEvent, Unit]
  type SketchViewModelRedoEventHandler = js.Function1[/* event */ SketchViewModelRedoEvent, Unit]
  type SketchViewModelUndoEventHandler = js.Function1[/* event */ SketchViewModelUndoEvent, Unit]
  type SketchViewModelUpdateEventHandler = js.Function1[/* event */ SketchViewModelUpdateEvent, Unit]
  type SliderLabelFormatter = js.Function3[
    /* value */ Double, 
    /* type */ js.UndefOr[String], 
    /* index */ js.UndefOr[Double], 
    String
  ]
  type SliderMaxChangeEventHandler = js.Function1[/* event */ SliderMaxChangeEvent, Unit]
  type SliderMinChangeEventHandler = js.Function1[/* event */ SliderMinChangeEvent, Unit]
  type SliderSegmentDragEventHandler = js.Function1[/* event */ SliderSegmentDragEvent, Unit]
  type SliderThumbChangeEventHandler = js.Function1[/* event */ SliderThumbChangeEvent, Unit]
  type SliderThumbDragEventHandler = js.Function1[/* event */ SliderThumbDragEvent, Unit]
  type SliderValueChangeEventHandler = js.Function1[/* event */ SliderValueChangeEvent, Unit]
  type SliderValuesChangeEventHandler = js.Function1[/* event */ SliderValuesChangeEvent, Unit]
  type SliderViewModelMaxChangeEventHandler = js.Function1[/* event */ SliderViewModelMaxChangeEvent, Unit]
  type SliderViewModelMinChangeEventHandler = js.Function1[/* event */ SliderViewModelMinChangeEvent, Unit]
  type SmartMappingSliderBaseLabelFormatter = js.Function3[
    /* value */ Double, 
    /* type */ js.UndefOr[String], 
    /* index */ js.UndefOr[Double], 
    String
  ]
  type SmartMappingSliderBaseMaxChangeEventHandler = js.Function1[/* event */ SmartMappingSliderBaseMaxChangeEvent, Unit]
  type SmartMappingSliderBaseMinChangeEventHandler = js.Function1[/* event */ SmartMappingSliderBaseMinChangeEvent, Unit]
  type SmartMappingSliderBaseThumbChangeEventHandler = js.Function1[/* event */ SmartMappingSliderBaseThumbChangeEvent, Unit]
  type SmartMappingSliderBaseThumbDragEventHandler = js.Function1[/* event */ SmartMappingSliderBaseThumbDragEvent, Unit]
  type SpinnerViewModel = Accessor
  type StreamLayerEditsEventHandler = js.Function1[/* event */ StreamLayerEditsEvent, Unit]
  type StreamLayerLayerviewCreateErrorEventHandler = js.Function1[/* event */ StreamLayerLayerviewCreateErrorEvent, Unit]
  type StreamLayerLayerviewCreateEventHandler = js.Function1[/* event */ StreamLayerLayerviewCreateEvent, Unit]
  type StreamLayerLayerviewDestroyEventHandler = js.Function1[/* event */ StreamLayerLayerviewDestroyEvent, Unit]
  type StreamLayerViewDataReceivedEventHandler = js.Function1[/* event */ StreamLayerViewDataReceivedEvent, Unit]
  type StreamLayerViewProperties = LayerViewProperties
  type ThumbCreatedFunction = js.Function4[
    /* index */ Double, 
    /* value */ Double, 
    /* thumbElement */ HTMLElement, 
    /* labelElement */ js.UndefOr[HTMLElement], 
    Unit
  ]
  type TickCreatedFunction = js.Function3[
    /* value */ Double, 
    /* tickElement */ HTMLElement, 
    /* labelElement */ js.UndefOr[HTMLElement], 
    Unit
  ]
  type TileLayerLayerviewCreateErrorEventHandler = js.Function1[/* event */ TileLayerLayerviewCreateErrorEvent, Unit]
  type TileLayerLayerviewCreateEventHandler = js.Function1[/* event */ TileLayerLayerviewCreateEvent, Unit]
  type TileLayerLayerviewDestroyEventHandler = js.Function1[/* event */ TileLayerLayerviewDestroyEvent, Unit]
  type TokenTaskProperties = TaskProperties
  type TrackTrackErrorEventHandler = js.Function1[/* event */ TrackTrackErrorEvent, Unit]
  type TrackTrackEventHandler = js.Function1[/* event */ TrackTrackEvent, Unit]
  type TrackViewModelTrackErrorEventHandler = js.Function1[/* event */ TrackViewModelTrackErrorEvent, Unit]
  type TrackViewModelTrackEventHandler = js.Function1[/* event */ TrackViewModelTrackEvent, Unit]
  type UnknownLayerLayerviewCreateErrorEventHandler = js.Function1[/* event */ UnknownLayerLayerviewCreateErrorEvent, Unit]
  type UnknownLayerLayerviewCreateEventHandler = js.Function1[/* event */ UnknownLayerLayerviewCreateEvent, Unit]
  type UnknownLayerLayerviewDestroyEventHandler = js.Function1[/* event */ UnknownLayerLayerviewDestroyEvent, Unit]
  type UnknownLayerProperties = LayerProperties
  type UnsupportedLayerLayerviewCreateErrorEventHandler = js.Function1[/* event */ UnsupportedLayerLayerviewCreateErrorEvent, Unit]
  type UnsupportedLayerLayerviewCreateEventHandler = js.Function1[/* event */ UnsupportedLayerLayerviewCreateEvent, Unit]
  type UnsupportedLayerLayerviewDestroyEventHandler = js.Function1[/* event */ UnsupportedLayerLayerviewDestroyEvent, Unit]
  type UnsupportedLayerProperties = LayerProperties
  type VectorTileLayerLayerviewCreateErrorEventHandler = js.Function1[/* event */ VectorTileLayerLayerviewCreateErrorEvent, Unit]
  type VectorTileLayerLayerviewCreateEventHandler = js.Function1[/* event */ VectorTileLayerLayerviewCreateEvent, Unit]
  type VectorTileLayerLayerviewDestroyEventHandler = js.Function1[/* event */ VectorTileLayerLayerviewDestroyEvent, Unit]
  type ViewBlurEventHandler = js.Function1[/* event */ ViewBlurEvent, Unit]
  type ViewClickEventHandler = js.Function1[/* event */ ViewClickEvent, Unit]
  type ViewDoubleClickEventHandler = js.Function1[/* event */ ViewDoubleClickEvent, Unit]
  type ViewDragEventHandler = js.Function1[/* event */ ViewDragEvent, Unit]
  type ViewFocusEventHandler = js.Function1[/* event */ ViewFocusEvent, Unit]
  type ViewHoldEventHandler = js.Function1[/* event */ ViewHoldEvent, Unit]
  type ViewImmediateClickEventHandler = js.Function1[/* event */ ViewImmediateClickEvent, Unit]
  type ViewKeyDownEventHandler = js.Function1[/* event */ ViewKeyDownEvent, Unit]
  type ViewKeyUpEventHandler = js.Function1[/* event */ ViewKeyUpEvent, Unit]
  type ViewLayerviewCreateErrorEventHandler = js.Function1[/* event */ ViewLayerviewCreateErrorEvent, Unit]
  type ViewLayerviewCreateEventHandler = js.Function1[/* event */ ViewLayerviewCreateEvent, Unit]
  type ViewLayerviewDestroyEventHandler = js.Function1[/* event */ ViewLayerviewDestroyEvent, Unit]
  type ViewMouseWheelEventHandler = js.Function1[/* event */ ViewMouseWheelEvent, Unit]
  type ViewPointerDownEventHandler = js.Function1[/* event */ ViewPointerDownEvent, Unit]
  type ViewPointerEnterEventHandler = js.Function1[/* event */ ViewPointerEnterEvent, Unit]
  type ViewPointerLeaveEventHandler = js.Function1[/* event */ ViewPointerLeaveEvent, Unit]
  type ViewPointerMoveEventHandler = js.Function1[/* event */ ViewPointerMoveEvent, Unit]
  type ViewPointerUpEventHandler = js.Function1[/* event */ ViewPointerUpEvent, Unit]
  type ViewResizeEventHandler = js.Function1[/* event */ ViewResizeEvent, Unit]
  type WMSLayerLayerviewCreateErrorEventHandler = js.Function1[/* event */ WMSLayerLayerviewCreateErrorEvent, Unit]
  type WMSLayerLayerviewCreateEventHandler = js.Function1[/* event */ WMSLayerLayerviewCreateEvent, Unit]
  type WMSLayerLayerviewDestroyEventHandler = js.Function1[/* event */ WMSLayerLayerviewDestroyEvent, Unit]
  type WMTSLayerLayerviewCreateErrorEventHandler = js.Function1[/* event */ WMTSLayerLayerviewCreateErrorEvent, Unit]
  type WMTSLayerLayerviewCreateEventHandler = js.Function1[/* event */ WMTSLayerLayerviewCreateEvent, Unit]
  type WMTSLayerLayerviewDestroyEventHandler = js.Function1[/* event */ WMTSLayerLayerviewDestroyEvent, Unit]
  type WatchCallback = js.Function4[
    /* newValue */ js.Any, 
    /* oldValue */ js.Any, 
    /* propertyName */ String, 
    /* target */ Accessor, 
    Unit
  ]
  type WebTileLayerLayerviewCreateErrorEventHandler = js.Function1[/* event */ WebTileLayerLayerviewCreateErrorEvent, Unit]
  type WebTileLayerLayerviewCreateEventHandler = js.Function1[/* event */ WebTileLayerLayerviewCreateEvent, Unit]
  type WebTileLayerLayerviewDestroyEventHandler = js.Function1[/* event */ WebTileLayerLayerviewDestroyEvent, Unit]
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
  type geometrySpatialReference = SpatialReference
  type pointCloudRenderersPointCloudClassBreaksRenderer = PointCloudClassBreaksRenderer
  type pointCloudRenderersPointCloudRGBRenderer = PointCloudRGBRenderer
  type pointCloudRenderersPointCloudStretchRenderer = PointCloudStretchRenderer
  type pointCloudRenderersPointCloudUniqueValueRenderer = PointCloudUniqueValueRenderer
  type rasterRenderersClassBreaksRenderer = ClassBreaksRenderer
  type rasterRenderersRasterStretchRenderer = RasterStretchRenderer
  type rasterRenderersUniqueValueRenderer = UniqueValueRenderer
  type renderersClassBreaksRenderer = ClassBreaksRenderer
  type renderersDotDensityRenderer = DotDensityRenderer
  type renderersHeatmapRenderer = HeatmapRenderer
  type renderersSimpleRenderer = SimpleRenderer
  type renderersUniqueValueRenderer = UniqueValueRenderer
  type symbolsCIMSymbol = CIMSymbol
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
  type symbolsWaterSymbol3DLayer = WaterSymbol3DLayer
  type symbolsWebStyleSymbol = WebStyleSymbol
}
