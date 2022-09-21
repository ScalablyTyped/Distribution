package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable1
import typings.arcgisJsApi.arcgisJsApiStrings.average
import typings.arcgisJsApi.arcgisJsApiStrings.compact
import typings.arcgisJsApi.arcgisJsApiStrings.extent
import typings.arcgisJsApi.arcgisJsApiStrings.max
import typings.arcgisJsApi.arcgisJsApiStrings.min
import typings.arcgisJsApi.arcgisJsApiStrings.thumb
import typings.arcgisJsApi.arcgisJsApiStrings.tick
import typings.arcgisJsApi.arcgisJsApiStrings.value
import typings.arcgisJsApi.arcgisJsApiStrings.wide
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AfterInterceptorCallback = js.Function1[/* response */ RequestResponse, scala.Unit]

/* Rewritten from type alias, can be one of: 
  - typings.arcgisJsApi.arcgisJsApiStrings.acres
  - typings.arcgisJsApi.arcgisJsApiStrings.ares
  - typings.arcgisJsApi.arcgisJsApiStrings.hectares
  - typings.arcgisJsApi.arcgisJsApiStrings.`square-feet`
  - typings.arcgisJsApi.arcgisJsApiStrings.`square-meters`
  - typings.arcgisJsApi.arcgisJsApiStrings.`square-yards`
  - typings.arcgisJsApi.arcgisJsApiStrings.`square-kilometers`
  - typings.arcgisJsApi.arcgisJsApiStrings.`square-miles`
  - scala.Double
*/
type ArealUnits = _ArealUnits | Double

type BarCreatedFunction = js.Function2[/* index */ Double, /* element */ Any, scala.Unit]

type BarcodeScannerInputProperties = TextInputProperties

type BaseDynamicLayerLayerviewCreateErrorEventHandler = js.Function1[/* event */ BaseDynamicLayerLayerviewCreateErrorEvent, scala.Unit]

type BaseDynamicLayerLayerviewCreateEventHandler = js.Function1[/* event */ BaseDynamicLayerLayerviewCreateEvent, scala.Unit]

type BaseDynamicLayerLayerviewDestroyEventHandler = js.Function1[/* event */ BaseDynamicLayerLayerviewDestroyEvent, scala.Unit]

type BaseDynamicLayerRefreshEventHandler = js.Function1[/* event */ BaseDynamicLayerRefreshEvent, scala.Unit]

type BaseTileLayerLayerviewCreateErrorEventHandler = js.Function1[/* event */ BaseTileLayerLayerviewCreateErrorEvent, scala.Unit]

type BaseTileLayerLayerviewCreateEventHandler = js.Function1[/* event */ BaseTileLayerLayerviewCreateEvent, scala.Unit]

type BaseTileLayerLayerviewDestroyEventHandler = js.Function1[/* event */ BaseTileLayerLayerviewDestroyEvent, scala.Unit]

type BaseTileLayerRefreshEventHandler = js.Function1[/* event */ BaseTileLayerRefreshEvent, scala.Unit]

type BasemapFilter = js.Function3[/* item */ Basemap, /* index */ Double, /* array */ js.Array[Basemap], Boolean]

type BasemapLayerListTriggerActionEventHandler = js.Function1[/* event */ BasemapLayerListTriggerActionEvent, scala.Unit]

type BasemapToggleToggleEventHandler = js.Function1[/* event */ BasemapToggleToggleEvent, scala.Unit]

type BeforeInterceptorCallback = js.Function1[/* params */ Any, Any]

type BingMapsLayerLayerviewCreateErrorEventHandler = js.Function1[/* event */ BingMapsLayerLayerviewCreateErrorEvent, scala.Unit]

type BingMapsLayerLayerviewCreateEventHandler = js.Function1[/* event */ BingMapsLayerLayerviewCreateEvent, scala.Unit]

type BingMapsLayerLayerviewDestroyEventHandler = js.Function1[/* event */ BingMapsLayerLayerviewDestroyEvent, scala.Unit]

type BingMapsLayerRefreshEventHandler = js.Function1[/* event */ BingMapsLayerRefreshEvent, scala.Unit]

type BookmarksBookmarkEditEventHandler = js.Function1[/* event */ BookmarksBookmarkEditEvent, scala.Unit]

type BookmarksBookmarkSelectEventHandler = js.Function1[/* event */ BookmarksBookmarkSelectEvent, scala.Unit]

type BuildingSceneLayerViewProperties = LayerViewProperties

type ButtonMenuItemClickFunction = js.Function1[/* event */ Any, scala.Unit]

type CSVLayerLayerviewCreateErrorEventHandler = js.Function1[/* event */ CSVLayerLayerviewCreateErrorEvent, scala.Unit]

type CSVLayerLayerviewCreateEventHandler = js.Function1[/* event */ CSVLayerLayerviewCreateEvent, scala.Unit]

type CSVLayerLayerviewDestroyEventHandler = js.Function1[/* event */ CSVLayerLayerviewDestroyEvent, scala.Unit]

type CSVLayerRefreshEventHandler = js.Function1[/* event */ CSVLayerRefreshEvent, scala.Unit]

type CollectionAfterAddEventHandler[T] = js.Function1[/* event */ CollectionAfterEvent[T], scala.Unit]

type CollectionAfterChangesEventHandler[T] = js.Function1[/* event */ CollectionAfterChangesEvent[T], scala.Unit]

type CollectionAfterRemoveEventHandler[T] = js.Function1[/* event */ CollectionAfterEvent[T], scala.Unit]

type CollectionBeforeAddEventHandler[T] = js.Function1[/* event */ CollectionBeforeEvent[T], scala.Unit]

type CollectionBeforeChangesEventHandler[T] = js.Function1[/* event */ CollectionBeforeEvent[T], scala.Unit]

type CollectionBeforeRemoveEventHandler[T] = js.Function1[/* event */ CollectionBeforeEvent[T], scala.Unit]

type CollectionChangeEventHandler[T] = js.Function1[/* event */ CollectionChangeEvent[T], scala.Unit]

type CollectionProperties[T] = js.Array[T] | Collection[T]

type Constructor[T] = Instantiable1[/* params (repeated) */ Any, T]

type CreateWorkflowProperties = WorkflowProperties

type CredentialDestroyEventHandler = js.Function1[/* event */ CredentialDestroyEvent, scala.Unit]

type CredentialTokenChangeEventHandler = js.Function1[/* event */ CredentialTokenChangeEvent, scala.Unit]

type DataLineCreatedFunction = js.Function3[
/* lineElement */ Any, 
/* labelElement */ js.UndefOr[Any], 
/* index */ js.UndefOr[Double], 
scala.Unit]

type DateLabelFormatter = js.Function4[
/* value */ js.Date | js.Array[js.Date], 
/* type */ js.UndefOr[min | max | extent], 
/* element */ js.UndefOr[HTMLElement], 
/* layout */ js.UndefOr[compact | wide], 
scala.Unit]

type DatePickerViewModelProperties = DateTimeElementViewModelProperties

type DateProperties = Double | String | js.Date

type EasingFunction = js.Function2[/* t */ Double, /* duration */ Double, Double]

type Effect = js.Array[Any] | String

type ElevationProfileLineGroundProperties = ElevationProfileLineProperties

type ElevationProfileLineInputProperties = ElevationProfileLineProperties

type ElevationSamplerChangedEventHandler = js.Function1[/* event */ ElevationSamplerChangedEvent, scala.Unit]

type ErrorCallback = js.Function1[/* error */ Error, scala.Unit]

type EventAttachedCallback = js.Function4[
/* target */ js.UndefOr[Any], 
/* propName */ js.UndefOr[String], 
/* obj */ js.UndefOr[Accessor], 
/* eventName */ js.UndefOr[String], 
scala.Unit]

type EventHandler = js.Function1[/* event */ Any, scala.Unit]

type Executor = js.Function2[/* resolve */ ResolveCallback, /* reject */ RejectCallback, scala.Unit]

type FeatureEffectEffect = js.Array[Any] | String

type FeatureFormSubmitEventHandler = js.Function1[/* event */ FeatureFormSubmitEvent, scala.Unit]

type FeatureFormValueChangeEventHandler = js.Function1[/* event */ FeatureFormValueChangeEvent, scala.Unit]

type FeatureFormViewModelSubmitEventHandler = js.Function1[/* event */ FeatureFormViewModelSubmitEvent, scala.Unit]

type FeatureFormViewModelValueChangeEventHandler = js.Function1[/* event */ FeatureFormViewModelValueChangeEvent, scala.Unit]

type FeatureLayerEditsEventHandler = js.Function1[/* event */ FeatureLayerEditsEvent, scala.Unit]

type FeatureLayerLayerviewCreateErrorEventHandler = js.Function1[/* event */ FeatureLayerLayerviewCreateErrorEvent, scala.Unit]

type FeatureLayerLayerviewCreateEventHandler = js.Function1[/* event */ FeatureLayerLayerviewCreateEvent, scala.Unit]

type FeatureLayerLayerviewDestroyEventHandler = js.Function1[/* event */ FeatureLayerLayerviewDestroyEvent, scala.Unit]

type FeatureLayerRefreshEventHandler = js.Function1[/* event */ FeatureLayerRefreshEvent, scala.Unit]

type FeatureTableSelectionChangeEventHandler = js.Function1[/* event */ FeatureTableSelectionChangeEvent, scala.Unit]

type FeatureTemplatesSelectEventHandler = js.Function1[/* event */ FeatureTemplatesSelectEvent, scala.Unit]

type FeatureTemplatesViewModelSelectEventHandler = js.Function1[/* event */ FeatureTemplatesViewModelSelectEvent, scala.Unit]

type FetchMessageBundle = js.Function2[/* bundleId */ String, /* locale */ String, js.Promise[Any]]

type FilterFunction = js.Function1[/* filterName */ Any, Boolean]

type FilterPredicateCallback = js.Function2[/* value */ Any, /* index */ Double, js.Promise[Any]]

type GeoJSONLayerEditsEventHandler = js.Function1[/* event */ GeoJSONLayerEditsEvent, scala.Unit]

type GeoJSONLayerLayerviewCreateErrorEventHandler = js.Function1[/* event */ GeoJSONLayerLayerviewCreateErrorEvent, scala.Unit]

type GeoJSONLayerLayerviewCreateEventHandler = js.Function1[/* event */ GeoJSONLayerLayerviewCreateEvent, scala.Unit]

type GeoJSONLayerLayerviewDestroyEventHandler = js.Function1[/* event */ GeoJSONLayerLayerviewDestroyEvent, scala.Unit]

type GeoJSONLayerRefreshEventHandler = js.Function1[/* event */ GeoJSONLayerRefreshEvent, scala.Unit]

type GeoRSSLayerLayerviewCreateErrorEventHandler = js.Function1[/* event */ GeoRSSLayerLayerviewCreateErrorEvent, scala.Unit]

type GeoRSSLayerLayerviewCreateEventHandler = js.Function1[/* event */ GeoRSSLayerLayerviewCreateEvent, scala.Unit]

type GeoRSSLayerLayerviewDestroyEventHandler = js.Function1[/* event */ GeoRSSLayerLayerviewDestroyEvent, scala.Unit]

type GeoRSSLayerRefreshEventHandler = js.Function1[/* event */ GeoRSSLayerRefreshEvent, scala.Unit]

type GeoRSSLayerViewProperties = LayerViewProperties

type GetHeader = js.Function1[/* headerName */ String, String]

type GetResultsHandler = js.Function1[/* params */ Any, js.Promise[js.Array[SearchResult]]]

type GetSuggestionsParameters = js.Function1[/* params */ Any, js.Promise[js.Array[SuggestResult]]]

type GoToOverride = js.Function2[/* view */ MapView | SceneView, /* goToParameters */ Any, scala.Unit]

/* Rewritten from type alias, can be one of: 
  - js.Array[
scala.Double | typings.arcgisJsApi.esri.Geometry_ | typings.arcgisJsApi.esri.Graphic]
  - typings.arcgisJsApi.esri.Geometry_
  - typings.arcgisJsApi.esri.Collection[typings.arcgisJsApi.esri.Geometry_ | typings.arcgisJsApi.esri.Graphic]
  - typings.arcgisJsApi.esri.Graphic
  - typings.arcgisJsApi.esri.Viewpoint
  - scala.Any
*/
type GoToTarget2D = _GoToTarget2D | (js.Array[Double | Geometry_ | Graphic]) | (Collection[Geometry_ | Graphic]) | Any

/* Rewritten from type alias, can be one of: 
  - js.Array[
scala.Double | typings.arcgisJsApi.esri.Geometry_ | typings.arcgisJsApi.esri.Graphic]
  - typings.arcgisJsApi.esri.Geometry_
  - typings.arcgisJsApi.esri.Collection[typings.arcgisJsApi.esri.Geometry_ | typings.arcgisJsApi.esri.Graphic]
  - typings.arcgisJsApi.esri.Graphic
  - typings.arcgisJsApi.esri.Camera
  - typings.arcgisJsApi.esri.Viewpoint
  - scala.Any
*/
type GoToTarget3D = _GoToTarget3D | (js.Array[Double | Geometry_ | Graphic]) | (Collection[Geometry_ | Graphic]) | Any

type GraphicsLayerViewProperties = LayerViewProperties

type GroupByFunction = js.Function1[/* grouping */ Any, String | Any]

type GroupColumnProperties = ColumnProperties

type HandlerCallback = js.Function5[
/* authorizeParams */ Any, 
/* authorizeUrl */ String, 
/* oAuthInfo */ OAuthInfo, 
/* resourceUrl */ String, 
/* serverInfo */ ServerInfo, 
scala.Unit]

type HeatmapSliderThumbChangeEventHandler = js.Function1[/* event */ HeatmapSliderThumbChangeEvent, scala.Unit]

type HeatmapSliderThumbDragEventHandler = js.Function1[/* event */ HeatmapSliderThumbDragEvent, scala.Unit]

type HistogramRangeSliderMaxChangeEventHandler = js.Function1[/* event */ HistogramRangeSliderMaxChangeEvent, scala.Unit]

type HistogramRangeSliderMinChangeEventHandler = js.Function1[/* event */ HistogramRangeSliderMinChangeEvent, scala.Unit]

type HistogramRangeSliderSegmentDragEventHandler = js.Function1[/* event */ HistogramRangeSliderSegmentDragEvent, scala.Unit]

type HistogramRangeSliderThumbChangeEventHandler = js.Function1[/* event */ HistogramRangeSliderThumbChangeEvent, scala.Unit]

type HistogramRangeSliderThumbDragEventHandler = js.Function1[/* event */ HistogramRangeSliderThumbDragEvent, scala.Unit]

/* Rewritten from type alias, can be one of: 
  - typings.arcgisJsApi.esri.Layer
  - typings.arcgisJsApi.esri.Graphic
  - typings.arcgisJsApi.esri.Collection[typings.arcgisJsApi.esri.Graphic | typings.arcgisJsApi.esri.Layer]
  - js.Array[typings.arcgisJsApi.esri.Graphic | typings.arcgisJsApi.esri.Layer]
*/
type HitTestItem = _HitTestItem | (Collection[Graphic | Layer]) | (js.Array[Graphic | Layer])

type HomeGoEventHandler = js.Function1[/* event */ HomeGoEvent, scala.Unit]

type HomeViewModelGoEventHandler = js.Function1[/* event */ HomeViewModelGoEvent, scala.Unit]

type IdentityManagerCredentialCreateEventHandler = js.Function1[/* event */ IdentityManagerCredentialCreateEvent, scala.Unit]

type IdentityManagerDialogCreateEventHandler = js.Function1[/* event */ IdentityManagerDialogCreateEvent, scala.Unit]

type ImageryLayerLayerviewCreateErrorEventHandler = js.Function1[/* event */ ImageryLayerLayerviewCreateErrorEvent, scala.Unit]

type ImageryLayerLayerviewCreateEventHandler = js.Function1[/* event */ ImageryLayerLayerviewCreateEvent, scala.Unit]

type ImageryLayerLayerviewDestroyEventHandler = js.Function1[/* event */ ImageryLayerLayerviewDestroyEvent, scala.Unit]

type ImageryLayerRefreshEventHandler = js.Function1[/* event */ ImageryLayerRefreshEvent, scala.Unit]

type InheritedDomainProperties = DomainProperties

type InputCreatedFunction = js.Function3[
/* inputElement */ Any, 
/* type */ max | min | thumb, 
/* thumbIndex */ js.UndefOr[Double], 
scala.Unit]

type InputParser = js.Function3[
/* value */ String, 
/* type */ js.UndefOr[average | min | max | tick | value], 
/* index */ js.UndefOr[Double], 
Double]

type ItemCallback[T] = js.Function2[/* item */ T, /* index */ Double, scala.Unit]

type ItemCompareCallback[T] = js.Function2[/* firstItem */ T, /* secondItem */ T, Double]

type ItemMapCallback[T, R] = js.Function2[/* item */ T, /* index */ Double, R]

type ItemReduceCallback[T, R] = js.Function3[/* previousValue */ R, /* currentValue */ T, /* index */ Double, R]

type ItemTestCallback[T] = js.Function2[/* item */ T, /* index */ Double, Boolean]

type KMLLayerViewProperties = LayerViewProperties

type LabelFormatter = js.Function3[
/* value */ Double, 
/* type */ js.UndefOr[String], 
/* index */ js.UndefOr[Double], 
String]

type LayerLayerviewCreateErrorEventHandler = js.Function1[/* event */ LayerLayerviewCreateErrorEvent, scala.Unit]

type LayerLayerviewCreateEventHandler = js.Function1[/* event */ LayerLayerviewCreateEvent, scala.Unit]

type LayerLayerviewDestroyEventHandler = js.Function1[/* event */ LayerLayerviewDestroyEvent, scala.Unit]

type LayerListListItemCreatedHandler = js.Function1[/* event */ Any, scala.Unit]

type LayerListTriggerActionEventHandler = js.Function1[/* event */ LayerListTriggerActionEvent, scala.Unit]

type LayerListViewModelTriggerActionEventHandler = js.Function1[/* event */ LayerListViewModelTriggerActionEvent, scala.Unit]

type LightingProperties = websceneSunLightingProperties

/* Rewritten from type alias, can be one of: 
  - typings.arcgisJsApi.arcgisJsApiStrings.meters_
  - typings.arcgisJsApi.arcgisJsApiStrings.feet_
  - typings.arcgisJsApi.arcgisJsApiStrings.kilometers_
  - typings.arcgisJsApi.arcgisJsApiStrings.miles_
  - typings.arcgisJsApi.arcgisJsApiStrings.`nautical-miles`
  - typings.arcgisJsApi.arcgisJsApiStrings.yards
  - scala.Double
*/
type LinearUnits = _LinearUnits | Double

type ListItemCreatedHandler = js.Function1[/* event */ Any, scala.Unit]

type LocaleChangeCallback = js.Function1[/* newLocale */ String, scala.Unit]

type LocateLocateErrorEventHandler = js.Function1[/* event */ LocateLocateErrorEvent, scala.Unit]

type LocateLocateEventHandler = js.Function1[/* event */ LocateLocateEvent, scala.Unit]

type LocateViewModelLocateErrorEventHandler = js.Function1[/* event */ LocateViewModelLocateErrorEvent, scala.Unit]

type MapImageLayerLayerviewCreateErrorEventHandler = js.Function1[/* event */ MapImageLayerLayerviewCreateErrorEvent, scala.Unit]

type MapImageLayerLayerviewCreateEventHandler = js.Function1[/* event */ MapImageLayerLayerviewCreateEvent, scala.Unit]

type MapImageLayerLayerviewDestroyEventHandler = js.Function1[/* event */ MapImageLayerLayerviewDestroyEvent, scala.Unit]

type MapImageLayerRefreshEventHandler = js.Function1[/* event */ MapImageLayerRefreshEvent, scala.Unit]

type MultipointDrawActionCursorUpdateEventHandler = js.Function1[/* event */ MultipointDrawActionCursorUpdateEvent, scala.Unit]

type MultipointDrawActionDrawCompleteEventHandler = js.Function1[/* event */ MultipointDrawActionDrawCompleteEvent, scala.Unit]

type MultipointDrawActionProperties = DrawActionProperties

type MultipointDrawActionRedoEventHandler = js.Function1[/* event */ MultipointDrawActionRedoEvent, scala.Unit]

type MultipointDrawActionUndoEventHandler = js.Function1[/* event */ MultipointDrawActionUndoEvent, scala.Unit]

type MultipointDrawActionVertexAddEventHandler = js.Function1[/* event */ MultipointDrawActionVertexAddEvent, scala.Unit]

type MultipointDrawActionVertexRemoveEventHandler = js.Function1[/* event */ MultipointDrawActionVertexRemoveEvent, scala.Unit]

type OGCFeatureLayerLayerviewCreateErrorEventHandler = js.Function1[/* event */ OGCFeatureLayerLayerviewCreateErrorEvent, scala.Unit]

type OGCFeatureLayerLayerviewCreateEventHandler = js.Function1[/* event */ OGCFeatureLayerLayerviewCreateEvent, scala.Unit]

type OGCFeatureLayerLayerviewDestroyEventHandler = js.Function1[/* event */ OGCFeatureLayerLayerviewDestroyEvent, scala.Unit]

type OGCFeatureLayerRefreshEventHandler = js.Function1[/* event */ OGCFeatureLayerRefreshEvent, scala.Unit]

type OpenStreetMapLayerProperties = WebTileLayerProperties

type PhaseCallback = js.Function1[/* event */ js.UndefOr[PhaseEvent], scala.Unit]

type PixelFilterFunction = js.Function1[/* pixelData */ PixelData, scala.Unit]

type PointCloudLayerViewProperties = LayerViewProperties

type PointDrawActionCursorUpdateEventHandler = js.Function1[/* event */ PointDrawActionCursorUpdateEvent, scala.Unit]

type PointDrawActionDrawCompleteEventHandler = js.Function1[/* event */ PointDrawActionDrawCompleteEvent, scala.Unit]

type PointDrawActionProperties = DrawActionProperties

type PolygonDrawActionCursorUpdateEventHandler = js.Function1[/* event */ PolygonDrawActionCursorUpdateEvent, scala.Unit]

type PolygonDrawActionDrawCompleteEventHandler = js.Function1[/* event */ PolygonDrawActionDrawCompleteEvent, scala.Unit]

type PolygonDrawActionRedoEventHandler = js.Function1[/* event */ PolygonDrawActionRedoEvent, scala.Unit]

type PolygonDrawActionUndoEventHandler = js.Function1[/* event */ PolygonDrawActionUndoEvent, scala.Unit]

type PolygonDrawActionVertexAddEventHandler = js.Function1[/* event */ PolygonDrawActionVertexAddEvent, scala.Unit]

type PolygonDrawActionVertexRemoveEventHandler = js.Function1[/* event */ PolygonDrawActionVertexRemoveEvent, scala.Unit]

type PolylineDrawActionCursorUpdateEventHandler = js.Function1[/* event */ PolylineDrawActionCursorUpdateEvent, scala.Unit]

type PolylineDrawActionDrawCompleteEventHandler = js.Function1[/* event */ PolylineDrawActionDrawCompleteEvent, scala.Unit]

type PolylineDrawActionRedoEventHandler = js.Function1[/* event */ PolylineDrawActionRedoEvent, scala.Unit]

type PolylineDrawActionUndoEventHandler = js.Function1[/* event */ PolylineDrawActionUndoEvent, scala.Unit]

type PolylineDrawActionVertexAddEventHandler = js.Function1[/* event */ PolylineDrawActionVertexAddEvent, scala.Unit]

type PolylineDrawActionVertexRemoveEventHandler = js.Function1[/* event */ PolylineDrawActionVertexRemoveEvent, scala.Unit]

type PopupTemplateContentCreator = js.Function1[/* graphic */ Graphic, String | HTMLElement | Widget_ | js.Promise[Any]]

type PopupTemplateContentDestroyer = js.Function1[/* graphic */ Graphic, scala.Unit]

type PopupTriggerActionEventHandler = js.Function1[/* event */ PopupTriggerActionEvent, scala.Unit]

type PopupViewModelTriggerActionEventHandler = js.Function1[/* event */ PopupViewModelTriggerActionEvent, scala.Unit]

type PrintCompleteEventHandler = js.Function1[/* event */ PrintCompleteEvent, scala.Unit]

type PrintSubmitEventHandler = js.Function1[/* event */ PrintSubmitEvent, scala.Unit]

/* Rewritten from type alias, can be one of: 
  - typings.arcgisJsApi.esri.Graphic
  - typings.arcgisJsApi.esri.Geometry_
  - typings.arcgisJsApi.esri.FeatureSet
  - typings.arcgisJsApi.esri.FeatureLayer
  - typings.arcgisJsApi.esri.WebMap
  - java.lang.String
  - scala.Double
  - scala.Boolean
  - js.Date
  - scala.Any
  - js.Array[scala.Any]
*/
type ProfileVariableInstanceType = _ProfileVariableInstanceType | js.Array[Any] | String | Double | Boolean | js.Date | Any

type QueryElevation = js.Function2[
/* geometry */ Point | Multipoint | Polyline, 
/* options */ js.UndefOr[Any], 
js.Promise[ElevationLayerElevationQueryResult]]

type RejectCallback = js.Function1[/* error */ js.UndefOr[Any], scala.Unit]

type RenderContextCallback = js.Function1[/* context */ js.UndefOr[RenderContext], scala.Unit]

type ResolveCallback = js.Function1[/* value */ js.UndefOr[Any | js.Promise[Any]], scala.Unit]

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - java.lang.String
  - js.Date
  - scala.Boolean
  - typings.arcgisJsApi.esri.Graphic
  - typings.arcgisJsApi.esri.Geometry_
  - scala.Any
  - js.Array[scala.Any]
*/
type ResultType = _ResultType | js.Array[Any] | Double | String | js.Date | Boolean | Any

type SceneModificationsProperties = CollectionPropertiesBase[SceneModificationProperties]

type SearchSearchBlurEventHandler = js.Function1[/* event */ SearchSearchBlurEvent, scala.Unit]

type SearchSearchClearEventHandler = js.Function1[/* event */ SearchSearchClearEvent, scala.Unit]

type SearchSearchCompleteEventHandler = js.Function1[/* event */ SearchSearchCompleteEvent, scala.Unit]

type SearchSearchFocusEventHandler = js.Function1[/* event */ SearchSearchFocusEvent, scala.Unit]

type SearchSearchStartEventHandler = js.Function1[/* event */ SearchSearchStartEvent, scala.Unit]

type SearchSelectResultEventHandler = js.Function1[/* event */ SearchSelectResultEvent, scala.Unit]

type SearchSuggestCompleteEventHandler = js.Function1[/* event */ SearchSuggestCompleteEvent, scala.Unit]

type SearchSuggestStartEventHandler = js.Function1[/* event */ SearchSuggestStartEvent, scala.Unit]

type SearchViewModelSearchClearEventHandler = js.Function1[/* event */ SearchViewModelSearchClearEvent, scala.Unit]

type SearchViewModelSearchCompleteEventHandler = js.Function1[/* event */ SearchViewModelSearchCompleteEvent, scala.Unit]

type SearchViewModelSearchStartEventHandler = js.Function1[/* event */ SearchViewModelSearchStartEvent, scala.Unit]

type SearchViewModelSelectResultEventHandler = js.Function1[/* event */ SearchViewModelSelectResultEvent, scala.Unit]

type SearchViewModelSuggestCompleteEventHandler = js.Function1[/* event */ SearchViewModelSuggestCompleteEvent, scala.Unit]

type SearchViewModelSuggestStartEventHandler = js.Function1[/* event */ SearchViewModelSuggestStartEvent, scala.Unit]

type SegmentDrawActionCursorUpdateEventHandler = js.Function1[/* event */ SegmentDrawActionCursorUpdateEvent, scala.Unit]

type SegmentDrawActionDrawCompleteEventHandler = js.Function1[/* event */ SegmentDrawActionDrawCompleteEvent, scala.Unit]

type SegmentDrawActionVertexAddEventHandler = js.Function1[/* event */ SegmentDrawActionVertexAddEvent, scala.Unit]

type SketchCreateEventHandler = js.Function1[/* event */ SketchCreateEvent, scala.Unit]

type SketchDeleteEventHandler = js.Function1[/* event */ SketchDeleteEvent, scala.Unit]

type SketchRedoEventHandler = js.Function1[/* event */ SketchRedoEvent, scala.Unit]

type SketchUndoEventHandler = js.Function1[/* event */ SketchUndoEvent, scala.Unit]

type SketchUpdateEventHandler = js.Function1[/* event */ SketchUpdateEvent, scala.Unit]

type SketchViewModelCreateEventHandler = js.Function1[/* event */ SketchViewModelCreateEvent, scala.Unit]

type SketchViewModelDeleteEventHandler = js.Function1[/* event */ SketchViewModelDeleteEvent, scala.Unit]

type SketchViewModelRedoEventHandler = js.Function1[/* event */ SketchViewModelRedoEvent, scala.Unit]

type SketchViewModelUndoEventHandler = js.Function1[/* event */ SketchViewModelUndoEvent, scala.Unit]

type SketchViewModelUpdateEventHandler = js.Function1[/* event */ SketchViewModelUpdateEvent, scala.Unit]

type SliderLabelFormatter = js.Function3[
/* value */ Double, 
/* type */ js.UndefOr[average | min | max | tick | value], 
/* index */ js.UndefOr[Double], 
String]

type SliderMaxChangeEventHandler = js.Function1[/* event */ SliderMaxChangeEvent, scala.Unit]

type SliderMaxClickEventHandler = js.Function1[/* event */ SliderMaxClickEvent, scala.Unit]

type SliderMinChangeEventHandler = js.Function1[/* event */ SliderMinChangeEvent, scala.Unit]

type SliderMinClickEventHandler = js.Function1[/* event */ SliderMinClickEvent, scala.Unit]

type SliderSegmentClickEventHandler = js.Function1[/* event */ SliderSegmentClickEvent, scala.Unit]

type SliderSegmentDragEventHandler = js.Function1[/* event */ SliderSegmentDragEvent, scala.Unit]

type SliderThumbChangeEventHandler = js.Function1[/* event */ SliderThumbChangeEvent, scala.Unit]

type SliderThumbClickEventHandler = js.Function1[/* event */ SliderThumbClickEvent, scala.Unit]

type SliderThumbDragEventHandler = js.Function1[/* event */ SliderThumbDragEvent, scala.Unit]

type SliderTickClickEventHandler = js.Function1[/* event */ SliderTickClickEvent, scala.Unit]

type SliderTrackClickEventHandler = js.Function1[/* event */ SliderTrackClickEvent, scala.Unit]

type SliderViewModelMaxChangeEventHandler = js.Function1[/* event */ SliderViewModelMaxChangeEvent, scala.Unit]

type SliderViewModelMinChangeEventHandler = js.Function1[/* event */ SliderViewModelMinChangeEvent, scala.Unit]

type SmartMappingSliderBaseLabelFormatter = js.Function3[
/* value */ Double, 
/* type */ js.UndefOr[average | min | max | value], 
/* index */ js.UndefOr[Double], 
String]

type SmartMappingSliderBaseMaxChangeEventHandler = js.Function1[/* event */ SmartMappingSliderBaseMaxChangeEvent, scala.Unit]

type SmartMappingSliderBaseMinChangeEventHandler = js.Function1[/* event */ SmartMappingSliderBaseMinChangeEvent, scala.Unit]

type SmartMappingSliderBaseSegmentDragEventHandler = js.Function1[/* event */ SmartMappingSliderBaseSegmentDragEvent, scala.Unit]

type SmartMappingSliderBaseThumbChangeEventHandler = js.Function1[/* event */ SmartMappingSliderBaseThumbChangeEvent, scala.Unit]

type SmartMappingSliderBaseThumbDragEventHandler = js.Function1[/* event */ SmartMappingSliderBaseThumbDragEvent, scala.Unit]

type StreamLayerViewDataReceivedEventHandler = js.Function1[/* event */ StreamLayerViewDataReceivedEvent, scala.Unit]

type StreamLayerViewUpdateRateEventHandler = js.Function1[/* event */ StreamLayerViewUpdateRateEvent, scala.Unit]

type SubtypeGroupLayerEditsEventHandler = js.Function1[/* event */ SubtypeGroupLayerEditsEvent, scala.Unit]

type SubtypeGroupLayerLayerviewCreateErrorEventHandler = js.Function1[/* event */ SubtypeGroupLayerLayerviewCreateErrorEvent, scala.Unit]

type SubtypeGroupLayerLayerviewCreateEventHandler = js.Function1[/* event */ SubtypeGroupLayerLayerviewCreateEvent, scala.Unit]

type SubtypeGroupLayerLayerviewDestroyEventHandler = js.Function1[/* event */ SubtypeGroupLayerLayerviewDestroyEvent, scala.Unit]

type SubtypeGroupLayerRefreshEventHandler = js.Function1[/* event */ SubtypeGroupLayerRefreshEvent, scala.Unit]

type TableListListItemCreatedHandler = js.Function1[/* event */ Any, scala.Unit]

type TableListTriggerActionEventHandler = js.Function1[/* event */ TableListTriggerActionEvent, scala.Unit]

type TableListViewModelListItemCreatedHandler = js.Function1[/* event */ Any, scala.Unit]

type TableListViewModelTriggerActionEventHandler = js.Function1[/* event */ TableListViewModelTriggerActionEvent, scala.Unit]

type TextAreaInputProperties = TextInputProperties

type TextBoxInputProperties = TextInputProperties

type ThumbCreatedFunction = js.Function4[
/* index */ Double, 
/* value */ Double, 
/* thumbElement */ HTMLElement, 
/* labelElement */ js.UndefOr[HTMLElement], 
scala.Unit]

type TickCreatedFunction = js.Function3[
/* value */ Double, 
/* tickElement */ HTMLElement, 
/* labelElement */ js.UndefOr[HTMLElement], 
scala.Unit]

type TileLayerLayerviewCreateErrorEventHandler = js.Function1[/* event */ TileLayerLayerviewCreateErrorEvent, scala.Unit]

type TileLayerLayerviewCreateEventHandler = js.Function1[/* event */ TileLayerLayerviewCreateEvent, scala.Unit]

type TileLayerLayerviewDestroyEventHandler = js.Function1[/* event */ TileLayerLayerviewDestroyEvent, scala.Unit]

type TileLayerRefreshEventHandler = js.Function1[/* event */ TileLayerRefreshEvent, scala.Unit]

type TimePickerViewModelProperties = DateTimeElementViewModelProperties

type TimeSliderTriggerActionEventHandler = js.Function1[/* event */ TimeSliderTriggerActionEvent, scala.Unit]

type TimeSliderViewModelTriggerActionEventHandler = js.Function1[/* event */ TimeSliderViewModelTriggerActionEvent, scala.Unit]

type TrackTrackErrorEventHandler = js.Function1[/* event */ TrackTrackErrorEvent, scala.Unit]

type TrackTrackEventHandler = js.Function1[/* event */ TrackTrackEvent, scala.Unit]

type TrackViewModelTrackErrorEventHandler = js.Function1[/* event */ TrackViewModelTrackErrorEvent, scala.Unit]

type TrackViewModelTrackEventHandler = js.Function1[/* event */ TrackViewModelTrackEvent, scala.Unit]

type UnknownLayerProperties = LayerProperties

type UnsupportedLayerProperties = LayerProperties

type UpdateBasemapsCallback = js.Function1[/* items */ js.Array[Basemap], js.Array[Basemap]]

type UpdateWorkflowProperties = WorkflowProperties

type UtilityNetworkTraceAddFlagCompleteEventHandler = js.Function1[/* event */ UtilityNetworkTraceAddFlagCompleteEvent, scala.Unit]

type UtilityNetworkTraceAddFlagErrorEventHandler = js.Function1[/* event */ UtilityNetworkTraceAddFlagErrorEvent, scala.Unit]

type UtilityNetworkTraceAddFlagEventHandler = js.Function1[/* event */ UtilityNetworkTraceAddFlagEvent, scala.Unit]

type ViewBlurEventHandler = js.Function1[/* event */ ViewBlurEvent, scala.Unit]

type ViewClickEventHandler = js.Function1[/* event */ ViewClickEvent, scala.Unit]

type ViewDoubleClickEventHandler = js.Function1[/* event */ ViewDoubleClickEvent, scala.Unit]

type ViewDragEventHandler = js.Function1[/* event */ ViewDragEvent, scala.Unit]

type ViewFocusEventHandler = js.Function1[/* event */ ViewFocusEvent, scala.Unit]

type ViewHoldEventHandler = js.Function1[/* event */ ViewHoldEvent, scala.Unit]

type ViewImmediateClickEventHandler = js.Function1[/* event */ ViewImmediateClickEvent, scala.Unit]

type ViewImmediateDoubleClickEventHandler = js.Function1[/* event */ ViewImmediateDoubleClickEvent, scala.Unit]

type ViewKeyDownEventHandler = js.Function1[/* event */ ViewKeyDownEvent, scala.Unit]

type ViewKeyUpEventHandler = js.Function1[/* event */ ViewKeyUpEvent, scala.Unit]

type ViewLayerviewCreateErrorEventHandler = js.Function1[/* event */ ViewLayerviewCreateErrorEvent, scala.Unit]

type ViewLayerviewCreateEventHandler = js.Function1[/* event */ ViewLayerviewCreateEvent, scala.Unit]

type ViewLayerviewDestroyEventHandler = js.Function1[/* event */ ViewLayerviewDestroyEvent, scala.Unit]

type ViewMouseWheelEventHandler = js.Function1[/* event */ ViewMouseWheelEvent, scala.Unit]

type ViewPointerDownEventHandler = js.Function1[/* event */ ViewPointerDownEvent, scala.Unit]

type ViewPointerEnterEventHandler = js.Function1[/* event */ ViewPointerEnterEvent, scala.Unit]

type ViewPointerLeaveEventHandler = js.Function1[/* event */ ViewPointerLeaveEvent, scala.Unit]

type ViewPointerMoveEventHandler = js.Function1[/* event */ ViewPointerMoveEvent, scala.Unit]

type ViewPointerUpEventHandler = js.Function1[/* event */ ViewPointerUpEvent, scala.Unit]

type ViewResizeEventHandler = js.Function1[/* event */ ViewResizeEvent, scala.Unit]

type WFSLayerLayerviewCreateErrorEventHandler = js.Function1[/* event */ WFSLayerLayerviewCreateErrorEvent, scala.Unit]

type WFSLayerLayerviewCreateEventHandler = js.Function1[/* event */ WFSLayerLayerviewCreateEvent, scala.Unit]

type WFSLayerLayerviewDestroyEventHandler = js.Function1[/* event */ WFSLayerLayerviewDestroyEvent, scala.Unit]

type WFSLayerRefreshEventHandler = js.Function1[/* event */ WFSLayerRefreshEvent, scala.Unit]

type WMSLayerLayerviewCreateErrorEventHandler = js.Function1[/* event */ WMSLayerLayerviewCreateErrorEvent, scala.Unit]

type WMSLayerLayerviewCreateEventHandler = js.Function1[/* event */ WMSLayerLayerviewCreateEvent, scala.Unit]

type WMSLayerLayerviewDestroyEventHandler = js.Function1[/* event */ WMSLayerLayerviewDestroyEvent, scala.Unit]

type WMSLayerRefreshEventHandler = js.Function1[/* event */ WMSLayerRefreshEvent, scala.Unit]

type WMTSLayerLayerviewCreateErrorEventHandler = js.Function1[/* event */ WMTSLayerLayerviewCreateErrorEvent, scala.Unit]

type WMTSLayerLayerviewCreateEventHandler = js.Function1[/* event */ WMTSLayerLayerviewCreateEvent, scala.Unit]

type WMTSLayerLayerviewDestroyEventHandler = js.Function1[/* event */ WMTSLayerLayerviewDestroyEvent, scala.Unit]

type WMTSLayerRefreshEventHandler = js.Function1[/* event */ WMTSLayerRefreshEvent, scala.Unit]

type WatchCallback = js.Function4[
/* newValue */ Any, 
/* oldValue */ Any, 
/* propertyName */ String, 
/* target */ Accessor, 
scala.Unit]

type contentAttachmentsContent = AttachmentsContent

type contentCustomContent = CustomContent

type contentExpressionContent = ExpressionContent

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

type inputsBarcodeScannerInput = BarcodeScannerInput

type inputsDateTimePickerInput = DateTimePickerInput

type inputsTextAreaInput = TextAreaInput

type inputsTextBoxInput = TextBoxInput

type pointCloudRenderersPointCloudClassBreaksRenderer = PointCloudClassBreaksRenderer

type pointCloudRenderersPointCloudRGBRenderer = PointCloudRGBRenderer

type pointCloudRenderersPointCloudStretchRenderer = PointCloudStretchRenderer

type pointCloudRenderersPointCloudUniqueValueRenderer = PointCloudUniqueValueRenderer

type rasterRenderersClassBreaksRenderer = ClassBreaksRenderer

type rasterRenderersFlowRenderer = FlowRenderer

type rasterRenderersRasterColormapRenderer = RasterColormapRenderer

type rasterRenderersRasterShadedReliefRenderer = RasterShadedReliefRenderer

type rasterRenderersRasterStretchRenderer = RasterStretchRenderer

type rasterRenderersUniqueValueRenderer = UniqueValueRenderer

type rasterRenderersVectorFieldRenderer = VectorFieldRenderer

type renderersClassBreaksRenderer = ClassBreaksRenderer

type renderersDictionaryRenderer = DictionaryRenderer

type renderersDotDensityRenderer = DotDensityRenderer

type renderersHeatmapRenderer = HeatmapRenderer

type renderersPieChartRenderer = PieChartRenderer

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
