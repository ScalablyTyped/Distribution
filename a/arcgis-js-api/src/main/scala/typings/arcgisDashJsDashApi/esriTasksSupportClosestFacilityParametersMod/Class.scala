package typings.arcgisDashJsDashApi.esriTasksSupportClosestFacilityParametersMod

import typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs.ClosestFacilityParameters
import typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs.ClosestFacilityParametersProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/tasks/support/ClosestFacilityParameters", JSImport.Namespace)
@js.native
/**
  * Input parameters for [ClosestFacilityTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-ClosestFacilityTask.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html)
  */
class Class () extends ClosestFacilityParameters {
  def this(properties: ClosestFacilityParametersProperties) = this()
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

