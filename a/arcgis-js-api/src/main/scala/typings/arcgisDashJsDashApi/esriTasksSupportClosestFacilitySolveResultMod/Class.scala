package typings.arcgisDashJsDashApi.esriTasksSupportClosestFacilitySolveResultMod

import typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs.ClosestFacilitySolveResult
import typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs.ClosestFacilitySolveResultProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/tasks/support/ClosestFacilitySolveResult", JSImport.Namespace)
@js.native
/**
  * The result from [ClosestFacilityTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-ClosestFacilityTask.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilitySolveResult.html)
  */
class Class () extends ClosestFacilitySolveResult {
  def this(properties: ClosestFacilitySolveResultProperties) = this()
  /**
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/using-fromjson/index.html) topic in the Guide for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    *
    *
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

