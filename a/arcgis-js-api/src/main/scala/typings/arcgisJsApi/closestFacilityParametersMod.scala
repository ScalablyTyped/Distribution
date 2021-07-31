package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ClosestFacilityParameters
import typings.arcgisJsApi.esri.ClosestFacilityParametersConstructor
import typings.arcgisJsApi.esri.ClosestFacilityParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object closestFacilityParametersMod extends Shortcut {
  
  @JSImport("esri/tasks/support/ClosestFacilityParameters", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ClosestFacilityParametersConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/tasks/support/ClosestFacilityParameters", JSImport.Namespace)
  @js.native
  /**
    * Input parameters for [ClosestFacilityTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-ClosestFacilityTask.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html)
    */
  class Class ()
    extends StObject
       with ClosestFacilityParameters {
    def this(properties: ClosestFacilityParametersProperties) = this()
    
    /**
      * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
  }
  
  type _To = js.Object & ClosestFacilityParametersConstructor
  
  /* This means you don't have to write `^`, but can instead just say `closestFacilityParametersMod.foo` */
  override def _to: js.Object & ClosestFacilityParametersConstructor = ^
}
