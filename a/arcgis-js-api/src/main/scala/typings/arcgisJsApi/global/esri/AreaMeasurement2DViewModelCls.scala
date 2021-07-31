package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`square-feet`
import typings.arcgisJsApi.arcgisJsApiStrings.`square-inches`
import typings.arcgisJsApi.arcgisJsApiStrings.`square-kilometers`
import typings.arcgisJsApi.arcgisJsApiStrings.`square-meters`
import typings.arcgisJsApi.arcgisJsApiStrings.`square-miles`
import typings.arcgisJsApi.arcgisJsApiStrings.`square-us-feet`
import typings.arcgisJsApi.arcgisJsApiStrings.`square-yards`
import typings.arcgisJsApi.arcgisJsApiStrings.acres
import typings.arcgisJsApi.arcgisJsApiStrings.ares
import typings.arcgisJsApi.arcgisJsApiStrings.disabled
import typings.arcgisJsApi.arcgisJsApiStrings.hectares
import typings.arcgisJsApi.arcgisJsApiStrings.imperial
import typings.arcgisJsApi.arcgisJsApiStrings.measured
import typings.arcgisJsApi.arcgisJsApiStrings.measuring
import typings.arcgisJsApi.arcgisJsApiStrings.metric
import typings.arcgisJsApi.arcgisJsApiStrings.ready
import typings.arcgisJsApi.esri.AreaMeasurement2DViewModelMeasurement
import typings.arcgisJsApi.esri.AreaMeasurement2DViewModelMeasurementLabel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.AreaMeasurement2DViewModel")
@js.native
class AreaMeasurement2DViewModelCls ()
  extends StObject
     with typings.arcgisJsApi.esri.AreaMeasurement2DViewModel {
  def this(properties: js.Any) = this()
  
  /**
    * Clears the current measurement.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#clear)
    */
  /* CompleteClass */
  override def clear(): Unit = js.native
  
  /**
    * Clears the current measurement.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#clearMeasurement)
    */
  /* CompleteClass */
  override def clearMeasurement(): Unit = js.native
  
  /**
    * When the coordinate sustem is projected (other than web mercator) then perimeters less than this threshold will be computed planimetrically.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#geodesicDistanceThreshold)
    */
  /* CompleteClass */
  var geodesicDistanceThreshold: Double = js.native
  
  /**
    * The area and perimeter of the measurement polygon in square meters and meters respectively.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#measurement)
    */
  /* CompleteClass */
  override val measurement: AreaMeasurement2DViewModelMeasurement = js.native
  
  /**
    * This property returns the locale specific representation of the area and perimeter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#measurementLabel)
    */
  /* CompleteClass */
  override val measurementLabel: AreaMeasurement2DViewModelMeasurementLabel = js.native
  
  /**
    * Starts a new measurement.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#newMeasurement)
    */
  /* CompleteClass */
  override def newMeasurement(): Unit = js.native
  
  /**
    * Starts a new measurement.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#start)
    */
  /* CompleteClass */
  override def start(): Unit = js.native
  
  /**
    * The ViewModel's state.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#state)
    */
  /* CompleteClass */
  override val state: disabled | ready | measuring | measured = js.native
  
  /**
    * Unit system (imperial, metric) or specific unit used for displaying the area values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#unit)
    */
  /* CompleteClass */
  var unit: metric | imperial | `square-inches` | `square-feet` | `square-us-feet` | `square-yards` | `square-miles` | `square-meters` | `square-kilometers` | acres | ares | hectares = js.native
  
  /**
    * List of available units and unit systems (imperial, metric) for displaying the area values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#unitOptions)
    */
  /* CompleteClass */
  var unitOptions: js.Array[
    metric | imperial | `square-inches` | `square-feet` | `square-us-feet` | `square-yards` | `square-miles` | `square-meters` | `square-kilometers` | acres | ares | hectares
  ] = js.native
  
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#view)
    */
  /* CompleteClass */
  var view: typings.arcgisJsApi.esri.MapView = js.native
}
