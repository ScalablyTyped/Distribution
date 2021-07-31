package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.ClosestFacilitySolveResultProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.ClosestFacilitySolveResult")
@js.native
/**
  * The result from [ClosestFacilityTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-ClosestFacilityTask.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilitySolveResult.html)
  */
class ClosestFacilitySolveResultCls ()
  extends StObject
     with typings.arcgisJsApi.esri.ClosestFacilitySolveResult {
  def this(properties: ClosestFacilitySolveResultProperties) = this()
  
  /**
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}
