package typings.arcgisJsApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object esri {
  type AfterInterceptorCallback = js.Function1[/* response */ typings.arcgisJsApi.esri.RequestResponse, scala.Unit]
  type BarCreatedFunction = js.Function2[/* index */ scala.Double, /* element */ js.Any, scala.Unit]
  type BaseDynamicLayerLayerviewCreateErrorEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.BaseDynamicLayerLayerviewCreateErrorEvent, 
    scala.Unit
  ]
  type BaseDynamicLayerLayerviewCreateEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.BaseDynamicLayerLayerviewCreateEvent, 
    scala.Unit
  ]
  type BaseDynamicLayerLayerviewDestroyEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.BaseDynamicLayerLayerviewDestroyEvent, 
    scala.Unit
  ]
  type BaseElevationLayerLayerviewCreateErrorEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.BaseElevationLayerLayerviewCreateErrorEvent, 
    scala.Unit
  ]
  type BaseElevationLayerLayerviewCreateEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.BaseElevationLayerLayerviewCreateEvent, 
    scala.Unit
  ]
  type BaseElevationLayerLayerviewDestroyEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.BaseElevationLayerLayerviewDestroyEvent, 
    scala.Unit
  ]
  type BaseTileLayerLayerviewCreateErrorEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.BaseTileLayerLayerviewCreateErrorEvent, 
    scala.Unit
  ]
  type BaseTileLayerLayerviewCreateEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.BaseTileLayerLayerviewCreateEvent, scala.Unit]
  type BaseTileLayerLayerviewDestroyEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.BaseTileLayerLayerviewDestroyEvent, 
    scala.Unit
  ]
  type BasemapLayerListTriggerActionEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.BasemapLayerListTriggerActionEvent, 
    scala.Unit
  ]
  type BasemapToggleToggleEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.BasemapToggleToggleEvent, scala.Unit]
  type BeforeInterceptorCallback = js.Function1[/* params */ js.Any, js.Any]
  type BingMapsLayerLayerviewCreateErrorEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.BingMapsLayerLayerviewCreateErrorEvent, 
    scala.Unit
  ]
  type BingMapsLayerLayerviewCreateEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.BingMapsLayerLayerviewCreateEvent, scala.Unit]
  type BingMapsLayerLayerviewDestroyEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.BingMapsLayerLayerviewDestroyEvent, 
    scala.Unit
  ]
  type BookmarksSelectBookmarkEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.BookmarksSelectBookmarkEvent, scala.Unit]
  type BuildingSceneLayerLayerviewCreateErrorEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.BuildingSceneLayerLayerviewCreateErrorEvent, 
    scala.Unit
  ]
  type BuildingSceneLayerLayerviewCreateEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.BuildingSceneLayerLayerviewCreateEvent, 
    scala.Unit
  ]
  type BuildingSceneLayerLayerviewDestroyEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.BuildingSceneLayerLayerviewDestroyEvent, 
    scala.Unit
  ]
  type ButtonMenuItemClickFunction = js.Function1[/* event */ js.Any, scala.Unit]
  type CSVLayerLayerviewCreateErrorEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.CSVLayerLayerviewCreateErrorEvent, scala.Unit]
  type CSVLayerLayerviewCreateEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.CSVLayerLayerviewCreateEvent, scala.Unit]
  type CSVLayerLayerviewDestroyEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.CSVLayerLayerviewDestroyEvent, scala.Unit]
  type ClassedColorSliderMaxChangeEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.ClassedColorSliderMaxChangeEvent, scala.Unit]
  type ClassedColorSliderMinChangeEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.ClassedColorSliderMinChangeEvent, scala.Unit]
  type ClassedColorSliderThumbChangeEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.ClassedColorSliderThumbChangeEvent, 
    scala.Unit
  ]
  type ClassedColorSliderThumbDragEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.ClassedColorSliderThumbDragEvent, scala.Unit]
  type ClassedColorSliderViewModelMaxChangeEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.ClassedColorSliderViewModelMaxChangeEvent, 
    scala.Unit
  ]
  type ClassedColorSliderViewModelMinChangeEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.ClassedColorSliderViewModelMinChangeEvent, 
    scala.Unit
  ]
  type ClassedSizeSliderMaxChangeEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.ClassedSizeSliderMaxChangeEvent, scala.Unit]
  type ClassedSizeSliderMinChangeEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.ClassedSizeSliderMinChangeEvent, scala.Unit]
  type ClassedSizeSliderThumbChangeEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.ClassedSizeSliderThumbChangeEvent, scala.Unit]
  type ClassedSizeSliderThumbDragEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.ClassedSizeSliderThumbDragEvent, scala.Unit]
  type ClassedSizeSliderViewModelMaxChangeEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.ClassedSizeSliderViewModelMaxChangeEvent, 
    scala.Unit
  ]
  type ClassedSizeSliderViewModelMinChangeEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.ClassedSizeSliderViewModelMinChangeEvent, 
    scala.Unit
  ]
  type ClosestFacilityTaskProperties = typings.arcgisJsApi.esri.TaskProperties
  type CollectionAfterAddEventHandler[T] = js.Function1[/* event */ typings.arcgisJsApi.esri.CollectionAfterEvent[T], scala.Unit]
  type CollectionAfterChangesEventHandler[T] = js.Function1[/* event */ typings.arcgisJsApi.esri.CollectionAfterChangesEvent[T], scala.Unit]
  type CollectionAfterRemoveEventHandler[T] = js.Function1[/* event */ typings.arcgisJsApi.esri.CollectionAfterEvent[T], scala.Unit]
  type CollectionBeforeAddEventHandler[T] = js.Function1[/* event */ typings.arcgisJsApi.esri.CollectionBeforeEvent[T], scala.Unit]
  type CollectionBeforeChangesEventHandler[T] = js.Function1[/* event */ typings.arcgisJsApi.esri.CollectionBeforeEvent[T], scala.Unit]
  type CollectionBeforeRemoveEventHandler[T] = js.Function1[/* event */ typings.arcgisJsApi.esri.CollectionBeforeEvent[T], scala.Unit]
  type CollectionChangeEventHandler[T] = js.Function1[/* event */ typings.arcgisJsApi.esri.CollectionChangeEvent[T], scala.Unit]
  type CollectionProperties[T] = js.Array[T] | typings.arcgisJsApi.esri.Collection[T]
  type ColorSizeSliderMaxChangeEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.ColorSizeSliderMaxChangeEvent, scala.Unit]
  type ColorSizeSliderMinChangeEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.ColorSizeSliderMinChangeEvent, scala.Unit]
  type ColorSizeSliderThumbChangeEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.ColorSizeSliderThumbChangeEvent, scala.Unit]
  type ColorSizeSliderThumbDragEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.ColorSizeSliderThumbDragEvent, scala.Unit]
  type ColorSizeSliderViewModelMaxChangeEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.ColorSizeSliderViewModelMaxChangeEvent, 
    scala.Unit
  ]
  type ColorSizeSliderViewModelMinChangeEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.ColorSizeSliderViewModelMinChangeEvent, 
    scala.Unit
  ]
  type ColorSliderMaxChangeEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.ColorSliderMaxChangeEvent, scala.Unit]
  type ColorSliderMinChangeEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.ColorSliderMinChangeEvent, scala.Unit]
  type ColorSliderThumbChangeEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.ColorSliderThumbChangeEvent, scala.Unit]
  type ColorSliderThumbDragEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.ColorSliderThumbDragEvent, scala.Unit]
  type ColorSliderViewModelMaxChangeEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.ColorSliderViewModelMaxChangeEvent, 
    scala.Unit
  ]
  type ColorSliderViewModelMinChangeEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.ColorSliderViewModelMinChangeEvent, 
    scala.Unit
  ]
  type Constructor[T] = org.scalablytyped.runtime.Instantiable1[/* params (repeated) */ js.Any, T]
  type CreateWorkflowProperties = typings.arcgisJsApi.esri.WorkflowProperties
  type CredentialDestroyEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.CredentialDestroyEvent, scala.Unit]
  type CredentialTokenChangeEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.CredentialTokenChangeEvent, scala.Unit]
  type DataLineCreatedFunction = js.Function3[
    /* lineElement */ js.Any, 
    /* labelElement */ js.UndefOr[js.Any], 
    /* index */ js.UndefOr[scala.Double], 
    scala.Unit
  ]
  type DatePickerViewModelProperties = typings.arcgisJsApi.esri.MomentElementViewModelProperties
  type DateProperties = scala.Double | java.lang.String | typings.std.Date
  type EasingFunction = js.Function2[/* t */ scala.Double, /* duration */ scala.Double, scala.Double]
  type ElementProperties = typings.arcgisJsApi.esri.ElementMixinProperties
  type ElevationLayerLayerviewCreateErrorEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.ElevationLayerLayerviewCreateErrorEvent, 
    scala.Unit
  ]
  type ElevationLayerLayerviewCreateEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.ElevationLayerLayerviewCreateEvent, 
    scala.Unit
  ]
  type ElevationLayerLayerviewDestroyEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.ElevationLayerLayerviewDestroyEvent, 
    scala.Unit
  ]
  type ElevationSamplerChangedEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.ElevationSamplerChangedEvent, scala.Unit]
  type ErrorCallback = js.Function1[/* error */ typings.arcgisJsApi.esri.Error, scala.Unit]
  type EventAttachedCallback = js.Function4[
    /* target */ js.UndefOr[js.Any], 
    /* propName */ js.UndefOr[java.lang.String], 
    /* obj */ js.UndefOr[typings.arcgisJsApi.esri.Accessor], 
    /* eventName */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
  type EventHandler = js.Function1[/* event */ js.Any, scala.Unit]
  type Executor = js.Function2[
    /* resolve */ typings.arcgisJsApi.esri.ResolveCallback, 
    /* reject */ typings.arcgisJsApi.esri.RejectCallback, 
    scala.Unit
  ]
  type FeatureFormSubmitEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.FeatureFormSubmitEvent, scala.Unit]
  type FeatureFormValueChangeEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.FeatureFormValueChangeEvent, scala.Unit]
  type FeatureFormViewModelSubmitEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.FeatureFormViewModelSubmitEvent, scala.Unit]
  type FeatureFormViewModelValueChangeEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.FeatureFormViewModelValueChangeEvent, 
    scala.Unit
  ]
  type FeatureLayerLayerviewCreateErrorEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.FeatureLayerLayerviewCreateErrorEvent, 
    scala.Unit
  ]
  type FeatureLayerLayerviewCreateEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.FeatureLayerLayerviewCreateEvent, scala.Unit]
  type FeatureLayerLayerviewDestroyEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.FeatureLayerLayerviewDestroyEvent, scala.Unit]
  type FeatureTableSelectionChangeEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.FeatureTableSelectionChangeEvent, scala.Unit]
  type FeatureTemplatesSelectEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.FeatureTemplatesSelectEvent, scala.Unit]
  type FeatureTemplatesViewModelSelectEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.FeatureTemplatesViewModelSelectEvent, 
    scala.Unit
  ]
  type FilterFunction = js.Function1[/* filterName */ js.Any, scala.Boolean]
  type FilterPredicateCallback = js.Function2[/* value */ js.Any, /* index */ scala.Double, js.Promise[js.Any]]
  type GeoJSONLayerEditsEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.GeoJSONLayerEditsEvent, scala.Unit]
  type GeoJSONLayerLayerviewCreateErrorEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.GeoJSONLayerLayerviewCreateErrorEvent, 
    scala.Unit
  ]
  type GeoJSONLayerLayerviewCreateEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.GeoJSONLayerLayerviewCreateEvent, scala.Unit]
  type GeoJSONLayerLayerviewDestroyEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.GeoJSONLayerLayerviewDestroyEvent, scala.Unit]
  type GeoRSSLayerLayerviewCreateErrorEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.GeoRSSLayerLayerviewCreateErrorEvent, 
    scala.Unit
  ]
  type GeoRSSLayerLayerviewCreateEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.GeoRSSLayerLayerviewCreateEvent, scala.Unit]
  type GeoRSSLayerLayerviewDestroyEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.GeoRSSLayerLayerviewDestroyEvent, scala.Unit]
  type GeoRSSLayerViewProperties = typings.arcgisJsApi.esri.LayerViewProperties
  type GeometryServiceProperties = typings.arcgisJsApi.esri.TaskProperties
  type GetHeader = js.Function1[/* headerName */ java.lang.String, java.lang.String]
  type GetResultsHandler = js.Function1[/* params */ js.Any, js.Promise[js.Array[typings.arcgisJsApi.esri.SearchResult]]]
  type GetSuggestionsParameters = js.Function1[/* params */ js.Any, js.Promise[js.Array[typings.arcgisJsApi.esri.SuggestResult]]]
  type GoToOverride = js.Function2[
    /* view */ typings.arcgisJsApi.esri.MapView | typings.arcgisJsApi.esri.SceneView, 
    /* goToParameters */ js.Any, 
    scala.Unit
  ]
  /* Rewritten from type alias, can be one of: 
    - js.Array[
  scala.Double | typings.arcgisJsApi.esri.Geometry_ | typings.arcgisJsApi.esri.Graphic]
    - typings.arcgisJsApi.esri.Geometry_
    - typings.arcgisJsApi.esri.Collection[typings.arcgisJsApi.esri.Geometry_ | typings.arcgisJsApi.esri.Graphic]
    - typings.arcgisJsApi.esri.Graphic
    - typings.arcgisJsApi.esri.Viewpoint
    - js.Any
  */
  type GoToTarget2D = typings.arcgisJsApi.esri._GoToTarget2D | (js.Array[
    scala.Double | typings.arcgisJsApi.esri.Geometry_ | typings.arcgisJsApi.esri.Graphic
  ]) | (typings.arcgisJsApi.esri.Collection[typings.arcgisJsApi.esri.Geometry_ | typings.arcgisJsApi.esri.Graphic]) | js.Any
  /* Rewritten from type alias, can be one of: 
    - js.Array[
  scala.Double | typings.arcgisJsApi.esri.Geometry_ | typings.arcgisJsApi.esri.Graphic]
    - typings.arcgisJsApi.esri.Geometry_
    - typings.arcgisJsApi.esri.Collection[typings.arcgisJsApi.esri.Geometry_ | typings.arcgisJsApi.esri.Graphic]
    - typings.arcgisJsApi.esri.Graphic
    - typings.arcgisJsApi.esri.Camera
    - typings.arcgisJsApi.esri.Viewpoint
    - js.Any
  */
  type GoToTarget3D = typings.arcgisJsApi.esri._GoToTarget3D | (js.Array[
    scala.Double | typings.arcgisJsApi.esri.Geometry_ | typings.arcgisJsApi.esri.Graphic
  ]) | (typings.arcgisJsApi.esri.Collection[typings.arcgisJsApi.esri.Geometry_ | typings.arcgisJsApi.esri.Graphic]) | js.Any
  type GraphicsLayerLayerviewCreateErrorEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.GraphicsLayerLayerviewCreateErrorEvent, 
    scala.Unit
  ]
  type GraphicsLayerLayerviewCreateEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.GraphicsLayerLayerviewCreateEvent, scala.Unit]
  type GraphicsLayerLayerviewDestroyEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.GraphicsLayerLayerviewDestroyEvent, 
    scala.Unit
  ]
  type GraphicsLayerViewProperties = typings.arcgisJsApi.esri.LayerViewProperties
  type GroupByFunction = js.Function1[/* grouping */ js.Any, java.lang.String | js.Any]
  type GroupLayerLayerviewCreateErrorEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.GroupLayerLayerviewCreateErrorEvent, 
    scala.Unit
  ]
  type GroupLayerLayerviewCreateEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.GroupLayerLayerviewCreateEvent, scala.Unit]
  type GroupLayerLayerviewDestroyEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.GroupLayerLayerviewDestroyEvent, scala.Unit]
  type HandlerCallback = js.Function5[
    /* authorizeParams */ js.Any, 
    /* authorizeUrl */ java.lang.String, 
    /* oAuthInfo */ typings.arcgisJsApi.esri.OAuthInfo, 
    /* resourceUrl */ java.lang.String, 
    /* serverInfo */ typings.arcgisJsApi.esri.ServerInfo, 
    scala.Unit
  ]
  type HeatmapSliderThumbChangeEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.HeatmapSliderThumbChangeEvent, scala.Unit]
  type HeatmapSliderThumbDragEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.HeatmapSliderThumbDragEvent, scala.Unit]
  type HeatmapSliderViewModelMaxChangeEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.HeatmapSliderViewModelMaxChangeEvent, 
    scala.Unit
  ]
  type HeatmapSliderViewModelMinChangeEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.HeatmapSliderViewModelMinChangeEvent, 
    scala.Unit
  ]
  type HistogramRangeSliderMaxChangeEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.HistogramRangeSliderMaxChangeEvent, 
    scala.Unit
  ]
  type HistogramRangeSliderMinChangeEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.HistogramRangeSliderMinChangeEvent, 
    scala.Unit
  ]
  type HistogramRangeSliderSegmentDragEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.HistogramRangeSliderSegmentDragEvent, 
    scala.Unit
  ]
  type HistogramRangeSliderThumbChangeEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.HistogramRangeSliderThumbChangeEvent, 
    scala.Unit
  ]
  type HistogramRangeSliderThumbDragEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.HistogramRangeSliderThumbDragEvent, 
    scala.Unit
  ]
  type HistogramRangeSliderViewModelMaxChangeEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.HistogramRangeSliderViewModelMaxChangeEvent, 
    scala.Unit
  ]
  type HistogramRangeSliderViewModelMinChangeEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.HistogramRangeSliderViewModelMinChangeEvent, 
    scala.Unit
  ]
  /* Rewritten from type alias, can be one of: 
    - typings.arcgisJsApi.esri.Layer
    - typings.arcgisJsApi.esri.Graphic
    - typings.arcgisJsApi.esri.Collection[typings.arcgisJsApi.esri.Graphic | typings.arcgisJsApi.esri.Layer]
    - js.Array[typings.arcgisJsApi.esri.Graphic | typings.arcgisJsApi.esri.Layer]
  */
  type HitTestItem = typings.arcgisJsApi.esri._HitTestItem | (typings.arcgisJsApi.esri.Collection[typings.arcgisJsApi.esri.Graphic | typings.arcgisJsApi.esri.Layer]) | (js.Array[typings.arcgisJsApi.esri.Graphic | typings.arcgisJsApi.esri.Layer])
  type HomeGoEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.HomeGoEvent, scala.Unit]
  type HomeViewModelGoEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.HomeViewModelGoEvent, scala.Unit]
  type IdentityManagerCredentialCreateEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.IdentityManagerCredentialCreateEvent, 
    scala.Unit
  ]
  type IdentityManagerDialogCreateEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.IdentityManagerDialogCreateEvent, scala.Unit]
  type ImageServiceIdentifyTask = typings.arcgisJsApi.esri.Task
  type ImageServiceIdentifyTaskProperties = typings.arcgisJsApi.esri.TaskProperties
  type ImageryLayerLayerviewCreateErrorEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.ImageryLayerLayerviewCreateErrorEvent, 
    scala.Unit
  ]
  type ImageryLayerLayerviewCreateEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.ImageryLayerLayerviewCreateEvent, scala.Unit]
  type ImageryLayerLayerviewDestroyEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.ImageryLayerLayerviewDestroyEvent, scala.Unit]
  type ImageryTileLayerLayerviewCreateErrorEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.ImageryTileLayerLayerviewCreateErrorEvent, 
    scala.Unit
  ]
  type ImageryTileLayerLayerviewCreateEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.ImageryTileLayerLayerviewCreateEvent, 
    scala.Unit
  ]
  type ImageryTileLayerLayerviewDestroyEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.ImageryTileLayerLayerviewDestroyEvent, 
    scala.Unit
  ]
  type InheritedDomainProperties = typings.arcgisJsApi.esri.DomainProperties
  type InputCreatedFunction = js.Function3[
    /* inputElement */ js.Any, 
    /* type */ typings.arcgisJsApi.arcgisJsApiStrings.max | typings.arcgisJsApi.arcgisJsApiStrings.min | typings.arcgisJsApi.arcgisJsApiStrings.thumb, 
    /* thumbIndex */ js.UndefOr[scala.Double], 
    scala.Unit
  ]
  type InputParser = js.Function3[
    /* value */ java.lang.String, 
    /* type */ js.UndefOr[
      typings.arcgisJsApi.arcgisJsApiStrings.average | typings.arcgisJsApi.arcgisJsApiStrings.min | typings.arcgisJsApi.arcgisJsApiStrings.max | typings.arcgisJsApi.arcgisJsApiStrings.tick | typings.arcgisJsApi.arcgisJsApiStrings.value
    ], 
    /* index */ js.UndefOr[scala.Double], 
    scala.Double
  ]
  type IntegratedMeshLayerLayerviewCreateErrorEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.IntegratedMeshLayerLayerviewCreateErrorEvent, 
    scala.Unit
  ]
  type IntegratedMeshLayerLayerviewCreateEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.IntegratedMeshLayerLayerviewCreateEvent, 
    scala.Unit
  ]
  type IntegratedMeshLayerLayerviewDestroyEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.IntegratedMeshLayerLayerviewDestroyEvent, 
    scala.Unit
  ]
  type ItemCallback[T] = js.Function2[/* item */ T, /* index */ scala.Double, scala.Unit]
  type ItemCompareCallback[T] = js.Function2[/* firstItem */ T, /* secondItem */ T, scala.Double]
  type ItemMapCallback[T, R] = js.Function2[/* item */ T, /* index */ scala.Double, R]
  type ItemReduceCallback[T, R] = js.Function3[/* previousValue */ R, /* currentValue */ T, /* index */ scala.Double, R]
  type ItemTestCallback[T] = js.Function2[/* item */ T, /* index */ scala.Double, scala.Boolean]
  type KMLLayerLayerviewCreateErrorEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.KMLLayerLayerviewCreateErrorEvent, scala.Unit]
  type KMLLayerLayerviewCreateEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.KMLLayerLayerviewCreateEvent, scala.Unit]
  type KMLLayerLayerviewDestroyEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.KMLLayerLayerviewDestroyEvent, scala.Unit]
  type KMLLayerViewProperties = typings.arcgisJsApi.esri.LayerViewProperties
  type LabelFormatter = js.Function3[
    /* value */ scala.Double, 
    /* type */ js.UndefOr[java.lang.String], 
    /* index */ js.UndefOr[scala.Double], 
    java.lang.String
  ]
  type LayerLayerviewCreateErrorEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.LayerLayerviewCreateErrorEvent, scala.Unit]
  type LayerLayerviewCreateEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.LayerLayerviewCreateEvent, scala.Unit]
  type LayerLayerviewDestroyEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.LayerLayerviewDestroyEvent, scala.Unit]
  type LayerListTriggerActionEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.LayerListTriggerActionEvent, scala.Unit]
  type LayerListViewModelTriggerActionEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.LayerListViewModelTriggerActionEvent, 
    scala.Unit
  ]
  type LineSymbol3DProperties = typings.arcgisJsApi.esri.Symbol3DProperties
  type ListItemCreatedHandler = js.Function1[/* event */ js.Any, scala.Unit]
  type LocateLocateErrorEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.LocateLocateErrorEvent, scala.Unit]
  type LocateLocateEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.LocateLocateEvent, scala.Unit]
  type LocateViewModelLocateErrorEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.LocateViewModelLocateErrorEvent, scala.Unit]
  type MapImageLayerLayerviewCreateErrorEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.MapImageLayerLayerviewCreateErrorEvent, 
    scala.Unit
  ]
  type MapImageLayerLayerviewCreateEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.MapImageLayerLayerviewCreateEvent, scala.Unit]
  type MapImageLayerLayerviewDestroyEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.MapImageLayerLayerviewDestroyEvent, 
    scala.Unit
  ]
  type MapNotesLayerLayerviewCreateErrorEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.MapNotesLayerLayerviewCreateErrorEvent, 
    scala.Unit
  ]
  type MapNotesLayerLayerviewCreateEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.MapNotesLayerLayerviewCreateEvent, scala.Unit]
  type MapNotesLayerLayerviewDestroyEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.MapNotesLayerLayerviewDestroyEvent, 
    scala.Unit
  ]
  type MapViewBlurEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.MapViewBlurEvent, scala.Unit]
  type MapViewClickEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.MapViewClickEvent, scala.Unit]
  type MapViewDoubleClickEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.MapViewDoubleClickEvent, scala.Unit]
  type MapViewDragEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.MapViewDragEvent, scala.Unit]
  type MapViewFocusEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.MapViewFocusEvent, scala.Unit]
  type MapViewHoldEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.MapViewHoldEvent, scala.Unit]
  type MapViewImmediateClickEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.MapViewImmediateClickEvent, scala.Unit]
  type MapViewImmediateDoubleClickEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.MapViewImmediateDoubleClickEvent, scala.Unit]
  type MapViewKeyDownEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.MapViewKeyDownEvent, scala.Unit]
  type MapViewKeyUpEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.MapViewKeyUpEvent, scala.Unit]
  type MapViewLayerviewCreateErrorEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.MapViewLayerviewCreateErrorEvent, scala.Unit]
  type MapViewLayerviewCreateEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.MapViewLayerviewCreateEvent, scala.Unit]
  type MapViewLayerviewDestroyEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.MapViewLayerviewDestroyEvent, scala.Unit]
  type MapViewMouseWheelEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.MapViewMouseWheelEvent, scala.Unit]
  type MapViewPointerDownEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.MapViewPointerDownEvent, scala.Unit]
  type MapViewPointerEnterEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.MapViewPointerEnterEvent, scala.Unit]
  type MapViewPointerLeaveEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.MapViewPointerLeaveEvent, scala.Unit]
  type MapViewPointerMoveEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.MapViewPointerMoveEvent, scala.Unit]
  type MapViewPointerUpEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.MapViewPointerUpEvent, scala.Unit]
  type MapViewResizeEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.MapViewResizeEvent, scala.Unit]
  type MeshSymbol3DProperties = typings.arcgisJsApi.esri.Symbol3DProperties
  type MultipointDrawActionCursorUpdateEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.MultipointDrawActionCursorUpdateEvent, 
    scala.Unit
  ]
  type MultipointDrawActionDrawCompleteEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.MultipointDrawActionDrawCompleteEvent, 
    scala.Unit
  ]
  type MultipointDrawActionProperties = typings.arcgisJsApi.esri.DrawActionProperties
  type MultipointDrawActionRedoEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.MultipointDrawActionRedoEvent, scala.Unit]
  type MultipointDrawActionUndoEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.MultipointDrawActionUndoEvent, scala.Unit]
  type MultipointDrawActionVertexAddEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.MultipointDrawActionVertexAddEvent, 
    scala.Unit
  ]
  type MultipointDrawActionVertexRemoveEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.MultipointDrawActionVertexRemoveEvent, 
    scala.Unit
  ]
  type OGCFeatureLayerLayerviewCreateErrorEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.OGCFeatureLayerLayerviewCreateErrorEvent, 
    scala.Unit
  ]
  type OGCFeatureLayerLayerviewCreateEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.OGCFeatureLayerLayerviewCreateEvent, 
    scala.Unit
  ]
  type OGCFeatureLayerLayerviewDestroyEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.OGCFeatureLayerLayerviewDestroyEvent, 
    scala.Unit
  ]
  type OpacitySliderMaxChangeEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.OpacitySliderMaxChangeEvent, scala.Unit]
  type OpacitySliderMinChangeEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.OpacitySliderMinChangeEvent, scala.Unit]
  type OpacitySliderThumbChangeEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.OpacitySliderThumbChangeEvent, scala.Unit]
  type OpacitySliderThumbDragEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.OpacitySliderThumbDragEvent, scala.Unit]
  type OpacitySliderViewModelMaxChangeEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.OpacitySliderViewModelMaxChangeEvent, 
    scala.Unit
  ]
  type OpacitySliderViewModelMinChangeEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.OpacitySliderViewModelMinChangeEvent, 
    scala.Unit
  ]
  type OpenStreetMapLayerLayerviewCreateErrorEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.OpenStreetMapLayerLayerviewCreateErrorEvent, 
    scala.Unit
  ]
  type OpenStreetMapLayerLayerviewCreateEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.OpenStreetMapLayerLayerviewCreateEvent, 
    scala.Unit
  ]
  type OpenStreetMapLayerLayerviewDestroyEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.OpenStreetMapLayerLayerviewDestroyEvent, 
    scala.Unit
  ]
  type OpenStreetMapLayerProperties = typings.arcgisJsApi.esri.WebTileLayerProperties
  type PhaseCallback = js.Function1[/* event */ js.UndefOr[typings.arcgisJsApi.esri.PhaseEvent], scala.Unit]
  type PointCloudLayerLayerviewCreateErrorEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.PointCloudLayerLayerviewCreateErrorEvent, 
    scala.Unit
  ]
  type PointCloudLayerLayerviewCreateEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.PointCloudLayerLayerviewCreateEvent, 
    scala.Unit
  ]
  type PointCloudLayerLayerviewDestroyEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.PointCloudLayerLayerviewDestroyEvent, 
    scala.Unit
  ]
  type PointCloudLayerViewProperties = typings.arcgisJsApi.esri.LayerViewProperties
  type PointDrawActionCursorUpdateEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.PointDrawActionCursorUpdateEvent, scala.Unit]
  type PointDrawActionDrawCompleteEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.PointDrawActionDrawCompleteEvent, scala.Unit]
  type PointDrawActionProperties = typings.arcgisJsApi.esri.DrawActionProperties
  type PolygonDrawActionCursorUpdateEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.PolygonDrawActionCursorUpdateEvent, 
    scala.Unit
  ]
  type PolygonDrawActionDrawCompleteEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.PolygonDrawActionDrawCompleteEvent, 
    scala.Unit
  ]
  type PolygonDrawActionRedoEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.PolygonDrawActionRedoEvent, scala.Unit]
  type PolygonDrawActionUndoEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.PolygonDrawActionUndoEvent, scala.Unit]
  type PolygonDrawActionVertexAddEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.PolygonDrawActionVertexAddEvent, scala.Unit]
  type PolygonDrawActionVertexRemoveEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.PolygonDrawActionVertexRemoveEvent, 
    scala.Unit
  ]
  type PolygonSymbol3DProperties = typings.arcgisJsApi.esri.Symbol3DProperties
  type PolylineDrawActionCursorUpdateEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.PolylineDrawActionCursorUpdateEvent, 
    scala.Unit
  ]
  type PolylineDrawActionDrawCompleteEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.PolylineDrawActionDrawCompleteEvent, 
    scala.Unit
  ]
  type PolylineDrawActionRedoEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.PolylineDrawActionRedoEvent, scala.Unit]
  type PolylineDrawActionUndoEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.PolylineDrawActionUndoEvent, scala.Unit]
  type PolylineDrawActionVertexAddEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.PolylineDrawActionVertexAddEvent, scala.Unit]
  type PolylineDrawActionVertexRemoveEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.PolylineDrawActionVertexRemoveEvent, 
    scala.Unit
  ]
  type PopupTemplateContentCreator = js.Function1[
    /* graphic */ typings.arcgisJsApi.esri.Graphic, 
    java.lang.String | typings.std.HTMLElement | typings.arcgisJsApi.esri.Widget_ | js.Promise[js.Any]
  ]
  type PopupTemplateContentDestroyer = js.Function1[/* graphic */ typings.arcgisJsApi.esri.Graphic, scala.Unit]
  type PopupTriggerActionEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.PopupTriggerActionEvent, scala.Unit]
  type PopupViewModelTriggerActionEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.PopupViewModelTriggerActionEvent, scala.Unit]
  type RejectCallback = js.Function1[/* error */ js.UndefOr[js.Any], scala.Unit]
  type RenderContextCallback = js.Function1[/* context */ js.UndefOr[typings.arcgisJsApi.esri.RenderContext], scala.Unit]
  type ResolveCallback = js.Function1[/* value */ js.UndefOr[js.Any | js.Promise[js.Any]], scala.Unit]
  type RouteTaskProperties = typings.arcgisJsApi.esri.TaskProperties
  type SceneLayerLayerviewCreateErrorEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.SceneLayerLayerviewCreateErrorEvent, 
    scala.Unit
  ]
  type SceneLayerLayerviewCreateEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.SceneLayerLayerviewCreateEvent, scala.Unit]
  type SceneLayerLayerviewDestroyEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.SceneLayerLayerviewDestroyEvent, scala.Unit]
  type SceneModificationsProperties = typings.arcgisJsApi.esri.CollectionPropertiesBase[typings.arcgisJsApi.esri.SceneModificationProperties]
  type SceneViewBlurEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.SceneViewBlurEvent, scala.Unit]
  type SceneViewClickEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.SceneViewClickEvent, scala.Unit]
  type SceneViewDoubleClickEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.SceneViewDoubleClickEvent, scala.Unit]
  type SceneViewDragEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.SceneViewDragEvent, scala.Unit]
  type SceneViewFocusEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.SceneViewFocusEvent, scala.Unit]
  type SceneViewHoldEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.SceneViewHoldEvent, scala.Unit]
  type SceneViewImmediateClickEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.SceneViewImmediateClickEvent, scala.Unit]
  type SceneViewImmediateDoubleClickEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.SceneViewImmediateDoubleClickEvent, 
    scala.Unit
  ]
  type SceneViewKeyDownEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.SceneViewKeyDownEvent, scala.Unit]
  type SceneViewKeyUpEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.SceneViewKeyUpEvent, scala.Unit]
  type SceneViewLayerviewCreateErrorEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.SceneViewLayerviewCreateErrorEvent, 
    scala.Unit
  ]
  type SceneViewLayerviewCreateEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.SceneViewLayerviewCreateEvent, scala.Unit]
  type SceneViewLayerviewDestroyEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.SceneViewLayerviewDestroyEvent, scala.Unit]
  type SceneViewMouseWheelEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.SceneViewMouseWheelEvent, scala.Unit]
  type SceneViewPointerDownEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.SceneViewPointerDownEvent, scala.Unit]
  type SceneViewPointerEnterEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.SceneViewPointerEnterEvent, scala.Unit]
  type SceneViewPointerLeaveEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.SceneViewPointerLeaveEvent, scala.Unit]
  type SceneViewPointerMoveEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.SceneViewPointerMoveEvent, scala.Unit]
  type SceneViewPointerUpEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.SceneViewPointerUpEvent, scala.Unit]
  type SceneViewResizeEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.SceneViewResizeEvent, scala.Unit]
  type SearchSearchBlurEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.SearchSearchBlurEvent, scala.Unit]
  type SearchSearchClearEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.SearchSearchClearEvent, scala.Unit]
  type SearchSearchCompleteEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.SearchSearchCompleteEvent, scala.Unit]
  type SearchSearchFocusEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.SearchSearchFocusEvent, scala.Unit]
  type SearchSearchStartEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.SearchSearchStartEvent, scala.Unit]
  type SearchSelectResultEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.SearchSelectResultEvent, scala.Unit]
  type SearchSuggestCompleteEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.SearchSuggestCompleteEvent, scala.Unit]
  type SearchSuggestStartEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.SearchSuggestStartEvent, scala.Unit]
  type SearchViewModelSearchClearEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.SearchViewModelSearchClearEvent, scala.Unit]
  type SearchViewModelSearchCompleteEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.SearchViewModelSearchCompleteEvent, 
    scala.Unit
  ]
  type SearchViewModelSearchStartEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.SearchViewModelSearchStartEvent, scala.Unit]
  type SearchViewModelSelectResultEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.SearchViewModelSelectResultEvent, scala.Unit]
  type SearchViewModelSuggestCompleteEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.SearchViewModelSuggestCompleteEvent, 
    scala.Unit
  ]
  type SearchViewModelSuggestStartEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.SearchViewModelSuggestStartEvent, scala.Unit]
  type SegmentDrawActionCursorUpdateEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.SegmentDrawActionCursorUpdateEvent, 
    scala.Unit
  ]
  type SegmentDrawActionDrawCompleteEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.SegmentDrawActionDrawCompleteEvent, 
    scala.Unit
  ]
  type SegmentDrawActionVertexAddEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.SegmentDrawActionVertexAddEvent, scala.Unit]
  type ServiceAreaTaskProperties = typings.arcgisJsApi.esri.TaskProperties
  type SizeSliderMaxChangeEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.SizeSliderMaxChangeEvent, scala.Unit]
  type SizeSliderMinChangeEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.SizeSliderMinChangeEvent, scala.Unit]
  type SizeSliderThumbChangeEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.SizeSliderThumbChangeEvent, scala.Unit]
  type SizeSliderThumbDragEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.SizeSliderThumbDragEvent, scala.Unit]
  type SizeSliderViewModelMaxChangeEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.SizeSliderViewModelMaxChangeEvent, scala.Unit]
  type SizeSliderViewModelMinChangeEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.SizeSliderViewModelMinChangeEvent, scala.Unit]
  type SketchCreateEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.SketchCreateEvent, scala.Unit]
  type SketchDeleteEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.SketchDeleteEvent, scala.Unit]
  type SketchRedoEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.SketchRedoEvent, scala.Unit]
  type SketchUndoEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.SketchUndoEvent, scala.Unit]
  type SketchUpdateEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.SketchUpdateEvent, scala.Unit]
  type SketchViewModelCreateEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.SketchViewModelCreateEvent, scala.Unit]
  type SketchViewModelDeleteEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.SketchViewModelDeleteEvent, scala.Unit]
  type SketchViewModelRedoEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.SketchViewModelRedoEvent, scala.Unit]
  type SketchViewModelUndoEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.SketchViewModelUndoEvent, scala.Unit]
  type SketchViewModelUpdateEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.SketchViewModelUpdateEvent, scala.Unit]
  type SliderLabelFormatter = js.Function3[
    /* value */ scala.Double, 
    /* type */ js.UndefOr[
      typings.arcgisJsApi.arcgisJsApiStrings.average | typings.arcgisJsApi.arcgisJsApiStrings.min | typings.arcgisJsApi.arcgisJsApiStrings.max | typings.arcgisJsApi.arcgisJsApiStrings.tick | typings.arcgisJsApi.arcgisJsApiStrings.value
    ], 
    /* index */ js.UndefOr[scala.Double], 
    java.lang.String
  ]
  type SliderMaxChangeEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.SliderMaxChangeEvent, scala.Unit]
  type SliderMinChangeEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.SliderMinChangeEvent, scala.Unit]
  type SliderSegmentDragEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.SliderSegmentDragEvent, scala.Unit]
  type SliderThumbChangeEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.SliderThumbChangeEvent, scala.Unit]
  type SliderThumbDragEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.SliderThumbDragEvent, scala.Unit]
  type SliderViewModelMaxChangeEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.SliderViewModelMaxChangeEvent, scala.Unit]
  type SliderViewModelMinChangeEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.SliderViewModelMinChangeEvent, scala.Unit]
  type SmartMappingSliderBaseLabelFormatter = js.Function3[
    /* value */ scala.Double, 
    /* type */ js.UndefOr[
      typings.arcgisJsApi.arcgisJsApiStrings.average | typings.arcgisJsApi.arcgisJsApiStrings.min | typings.arcgisJsApi.arcgisJsApiStrings.max | typings.arcgisJsApi.arcgisJsApiStrings.value
    ], 
    /* index */ js.UndefOr[scala.Double], 
    java.lang.String
  ]
  type SmartMappingSliderBaseMaxChangeEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.SmartMappingSliderBaseMaxChangeEvent, 
    scala.Unit
  ]
  type SmartMappingSliderBaseMinChangeEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.SmartMappingSliderBaseMinChangeEvent, 
    scala.Unit
  ]
  type SmartMappingSliderBaseThumbChangeEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.SmartMappingSliderBaseThumbChangeEvent, 
    scala.Unit
  ]
  type SmartMappingSliderBaseThumbDragEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.SmartMappingSliderBaseThumbDragEvent, 
    scala.Unit
  ]
  type SmartMappingSliderViewModelMaxChangeEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.SmartMappingSliderViewModelMaxChangeEvent, 
    scala.Unit
  ]
  type SmartMappingSliderViewModelMinChangeEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.SmartMappingSliderViewModelMinChangeEvent, 
    scala.Unit
  ]
  type SpinnerViewModel = typings.arcgisJsApi.esri.Accessor
  type StreamLayerLayerviewCreateErrorEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.StreamLayerLayerviewCreateErrorEvent, 
    scala.Unit
  ]
  type StreamLayerLayerviewCreateEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.StreamLayerLayerviewCreateEvent, scala.Unit]
  type StreamLayerLayerviewDestroyEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.StreamLayerLayerviewDestroyEvent, scala.Unit]
  type StreamLayerViewDataReceivedEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.StreamLayerViewDataReceivedEvent, scala.Unit]
  type ThumbCreatedFunction = js.Function4[
    /* index */ scala.Double, 
    /* value */ scala.Double, 
    /* thumbElement */ typings.std.HTMLElement, 
    /* labelElement */ js.UndefOr[typings.std.HTMLElement], 
    scala.Unit
  ]
  type TickCreatedFunction = js.Function3[
    /* value */ scala.Double, 
    /* tickElement */ typings.std.HTMLElement, 
    /* labelElement */ js.UndefOr[typings.std.HTMLElement], 
    scala.Unit
  ]
  type TileLayerLayerviewCreateErrorEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.TileLayerLayerviewCreateErrorEvent, 
    scala.Unit
  ]
  type TileLayerLayerviewCreateEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.TileLayerLayerviewCreateEvent, scala.Unit]
  type TileLayerLayerviewDestroyEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.TileLayerLayerviewDestroyEvent, scala.Unit]
  type TimePickerViewModelProperties = typings.arcgisJsApi.esri.MomentElementViewModelProperties
  type TrackTrackErrorEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.TrackTrackErrorEvent, scala.Unit]
  type TrackTrackEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.TrackTrackEvent, scala.Unit]
  type TrackViewModelTrackErrorEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.TrackViewModelTrackErrorEvent, scala.Unit]
  type TrackViewModelTrackEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.TrackViewModelTrackEvent, scala.Unit]
  type UnknownLayerLayerviewCreateErrorEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.UnknownLayerLayerviewCreateErrorEvent, 
    scala.Unit
  ]
  type UnknownLayerLayerviewCreateEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.UnknownLayerLayerviewCreateEvent, scala.Unit]
  type UnknownLayerLayerviewDestroyEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.UnknownLayerLayerviewDestroyEvent, scala.Unit]
  type UnknownLayerProperties = typings.arcgisJsApi.esri.LayerProperties
  type UnsupportedLayerLayerviewCreateErrorEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.UnsupportedLayerLayerviewCreateErrorEvent, 
    scala.Unit
  ]
  type UnsupportedLayerLayerviewCreateEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.UnsupportedLayerLayerviewCreateEvent, 
    scala.Unit
  ]
  type UnsupportedLayerLayerviewDestroyEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.UnsupportedLayerLayerviewDestroyEvent, 
    scala.Unit
  ]
  type UnsupportedLayerProperties = typings.arcgisJsApi.esri.LayerProperties
  type UpdateWorkflowProperties = typings.arcgisJsApi.esri.WorkflowProperties
  type VectorTileLayerLayerviewCreateErrorEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.VectorTileLayerLayerviewCreateErrorEvent, 
    scala.Unit
  ]
  type VectorTileLayerLayerviewCreateEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.VectorTileLayerLayerviewCreateEvent, 
    scala.Unit
  ]
  type VectorTileLayerLayerviewDestroyEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.VectorTileLayerLayerviewDestroyEvent, 
    scala.Unit
  ]
  type ViewBlurEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.ViewBlurEvent, scala.Unit]
  type ViewClickEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.ViewClickEvent, scala.Unit]
  type ViewDoubleClickEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.ViewDoubleClickEvent, scala.Unit]
  type ViewDragEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.ViewDragEvent, scala.Unit]
  type ViewFocusEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.ViewFocusEvent, scala.Unit]
  type ViewHoldEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.ViewHoldEvent, scala.Unit]
  type ViewImmediateClickEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.ViewImmediateClickEvent, scala.Unit]
  type ViewImmediateDoubleClickEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.ViewImmediateDoubleClickEvent, scala.Unit]
  type ViewKeyDownEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.ViewKeyDownEvent, scala.Unit]
  type ViewKeyUpEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.ViewKeyUpEvent, scala.Unit]
  type ViewLayerviewCreateErrorEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.ViewLayerviewCreateErrorEvent, scala.Unit]
  type ViewLayerviewCreateEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.ViewLayerviewCreateEvent, scala.Unit]
  type ViewLayerviewDestroyEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.ViewLayerviewDestroyEvent, scala.Unit]
  type ViewMouseWheelEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.ViewMouseWheelEvent, scala.Unit]
  type ViewPointerDownEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.ViewPointerDownEvent, scala.Unit]
  type ViewPointerEnterEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.ViewPointerEnterEvent, scala.Unit]
  type ViewPointerLeaveEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.ViewPointerLeaveEvent, scala.Unit]
  type ViewPointerMoveEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.ViewPointerMoveEvent, scala.Unit]
  type ViewPointerUpEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.ViewPointerUpEvent, scala.Unit]
  type ViewResizeEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.ViewResizeEvent, scala.Unit]
  type WMSLayerLayerviewCreateErrorEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.WMSLayerLayerviewCreateErrorEvent, scala.Unit]
  type WMSLayerLayerviewCreateEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.WMSLayerLayerviewCreateEvent, scala.Unit]
  type WMSLayerLayerviewDestroyEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.WMSLayerLayerviewDestroyEvent, scala.Unit]
  type WMTSLayerLayerviewCreateErrorEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.WMTSLayerLayerviewCreateErrorEvent, 
    scala.Unit
  ]
  type WMTSLayerLayerviewCreateEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.WMTSLayerLayerviewCreateEvent, scala.Unit]
  type WMTSLayerLayerviewDestroyEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.WMTSLayerLayerviewDestroyEvent, scala.Unit]
  type WatchCallback = js.Function4[
    /* newValue */ js.Any, 
    /* oldValue */ js.Any, 
    /* propertyName */ java.lang.String, 
    /* target */ typings.arcgisJsApi.esri.Accessor, 
    scala.Unit
  ]
  type WebTileLayerLayerviewCreateErrorEventHandler = js.Function1[
    /* event */ typings.arcgisJsApi.esri.WebTileLayerLayerviewCreateErrorEvent, 
    scala.Unit
  ]
  type WebTileLayerLayerviewCreateEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.WebTileLayerLayerviewCreateEvent, scala.Unit]
  type WebTileLayerLayerviewDestroyEventHandler = js.Function1[/* event */ typings.arcgisJsApi.esri.WebTileLayerLayerviewDestroyEvent, scala.Unit]
  type contentAttachmentsContent = typings.arcgisJsApi.esri.AttachmentsContent
  type contentCustomContent = typings.arcgisJsApi.esri.CustomContent
  type contentFieldsContent = typings.arcgisJsApi.esri.FieldsContent
  type contentMediaContent = typings.arcgisJsApi.esri.MediaContent
  type contentTextContent = typings.arcgisJsApi.esri.TextContent
  type elementsFieldElement = typings.arcgisJsApi.esri.FieldElement
  type elementsGroupElement = typings.arcgisJsApi.esri.GroupElement
  type geometryExtent = typings.arcgisJsApi.esri.Extent
  type geometryMesh = typings.arcgisJsApi.esri.Mesh
  type geometryMultipoint = typings.arcgisJsApi.esri.Multipoint
  type geometryPoint = typings.arcgisJsApi.esri.Point
  type geometryPolygon = typings.arcgisJsApi.esri.Polygon
  type geometryPolyline = typings.arcgisJsApi.esri.Polyline
  type geometrySpatialReference = typings.arcgisJsApi.esri.SpatialReference
  type inputsTextAreaInput = typings.arcgisJsApi.esri.TextAreaInput
  type inputsTextBoxInput = typings.arcgisJsApi.esri.TextBoxInput
  type pointCloudRenderersPointCloudClassBreaksRenderer = typings.arcgisJsApi.esri.PointCloudClassBreaksRenderer
  type pointCloudRenderersPointCloudRGBRenderer = typings.arcgisJsApi.esri.PointCloudRGBRenderer
  type pointCloudRenderersPointCloudStretchRenderer = typings.arcgisJsApi.esri.PointCloudStretchRenderer
  type pointCloudRenderersPointCloudUniqueValueRenderer = typings.arcgisJsApi.esri.PointCloudUniqueValueRenderer
  type rasterRenderersClassBreaksRenderer = typings.arcgisJsApi.esri.ClassBreaksRenderer
  type rasterRenderersRasterColormapRenderer = typings.arcgisJsApi.esri.RasterColormapRenderer
  type rasterRenderersRasterShadedReliefRenderer = typings.arcgisJsApi.esri.RasterShadedReliefRenderer
  type rasterRenderersRasterStretchRenderer = typings.arcgisJsApi.esri.RasterStretchRenderer
  type rasterRenderersUniqueValueRenderer = typings.arcgisJsApi.esri.UniqueValueRenderer
  type renderersClassBreaksRenderer = typings.arcgisJsApi.esri.ClassBreaksRenderer
  type renderersDotDensityRenderer = typings.arcgisJsApi.esri.DotDensityRenderer
  type renderersHeatmapRenderer = typings.arcgisJsApi.esri.HeatmapRenderer
  type renderersSimpleRenderer = typings.arcgisJsApi.esri.SimpleRenderer
  type renderersUniqueValueRenderer = typings.arcgisJsApi.esri.UniqueValueRenderer
  type symbolsCIMSymbol = typings.arcgisJsApi.esri.CIMSymbol
  type symbolsExtrudeSymbol3DLayer = typings.arcgisJsApi.esri.ExtrudeSymbol3DLayer
  type symbolsFillSymbol3DLayer = typings.arcgisJsApi.esri.FillSymbol3DLayer
  type symbolsFont = typings.arcgisJsApi.esri.Font
  type symbolsIconSymbol3DLayer = typings.arcgisJsApi.esri.IconSymbol3DLayer
  type symbolsLabelSymbol3D = typings.arcgisJsApi.esri.LabelSymbol3D
  type symbolsLineSymbol3D = typings.arcgisJsApi.esri.LineSymbol3D
  type symbolsLineSymbol3DLayer = typings.arcgisJsApi.esri.LineSymbol3DLayer
  type symbolsMeshSymbol3D = typings.arcgisJsApi.esri.MeshSymbol3D
  type symbolsObjectSymbol3DLayer = typings.arcgisJsApi.esri.ObjectSymbol3DLayer
  type symbolsPathSymbol3DLayer = typings.arcgisJsApi.esri.PathSymbol3DLayer
  type symbolsPictureFillSymbol = typings.arcgisJsApi.esri.PictureFillSymbol
  type symbolsPictureMarkerSymbol = typings.arcgisJsApi.esri.PictureMarkerSymbol
  type symbolsPointSymbol3D = typings.arcgisJsApi.esri.PointSymbol3D
  type symbolsPolygonSymbol3D = typings.arcgisJsApi.esri.PolygonSymbol3D
  type symbolsSimpleFillSymbol = typings.arcgisJsApi.esri.SimpleFillSymbol
  type symbolsSimpleLineSymbol = typings.arcgisJsApi.esri.SimpleLineSymbol
  type symbolsSimpleMarkerSymbol = typings.arcgisJsApi.esri.SimpleMarkerSymbol
  type symbolsTextSymbol = typings.arcgisJsApi.esri.TextSymbol
  type symbolsTextSymbol3DLayer = typings.arcgisJsApi.esri.TextSymbol3DLayer
  type symbolsWaterSymbol3DLayer = typings.arcgisJsApi.esri.WaterSymbol3DLayer
  type symbolsWebStyleSymbol = typings.arcgisJsApi.esri.WebStyleSymbol
}
