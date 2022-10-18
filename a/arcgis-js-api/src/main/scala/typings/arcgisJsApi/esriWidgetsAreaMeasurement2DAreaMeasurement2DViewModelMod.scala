package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.arcgisJsApiStrings.disabled
import typings.arcgisJsApi.arcgisJsApiStrings.measured
import typings.arcgisJsApi.arcgisJsApiStrings.measuring
import typings.arcgisJsApi.arcgisJsApiStrings.ready
import typings.arcgisJsApi.esri.AreaMeasurement2DViewModel
import typings.arcgisJsApi.esri.AreaMeasurement2DViewModelConstructor
import typings.arcgisJsApi.esri.AreaMeasurement2DViewModelMeasurement
import typings.arcgisJsApi.esri.AreaMeasurement2DViewModelMeasurementLabel
import typings.arcgisJsApi.esri.MapView
import typings.arcgisJsApi.esri.SystemOrAreaUnit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsAreaMeasurement2DAreaMeasurement2DViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/AreaMeasurement2D/AreaMeasurement2DViewModel", JSImport.Namespace)
  @js.native
  val ^ : js.Object & AreaMeasurement2DViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/AreaMeasurement2D/AreaMeasurement2DViewModel", JSImport.Namespace)
  @js.native
  /**
    * Provides the logic for the [AreaMeasurement2D](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html)
    */
  open class Class ()
    extends StObject
       with AreaMeasurement2DViewModel {
    def this(properties: Any) = this()
    
    /**
      * Clears the current measurement.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#clear)
      */
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /**
      * When the coordinate system is projected (other than web mercator) then perimeters less than this threshold will be computed planimetrically.
      *
      * @default 100000
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
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#start)
      */
    /* CompleteClass */
    override def start(): Unit = js.native
    
    /**
      * The ViewModel's state.
      *
      * @default disabled
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
    var unit: SystemOrAreaUnit = js.native
    
    /**
      * List of available units and unit systems (imperial, metric) for displaying the area values.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#unitOptions)
      */
    /* CompleteClass */
    var unitOptions: js.Array[SystemOrAreaUnit] = js.native
    
    /**
      * The view from which the widget will operate.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#view)
      */
    /* CompleteClass */
    var view: MapView = js.native
  }
  
  type _To = js.Object & AreaMeasurement2DViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsAreaMeasurement2DAreaMeasurement2DViewModelMod.foo` */
  override def _to: js.Object & AreaMeasurement2DViewModelConstructor = ^
}
