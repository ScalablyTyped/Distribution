package typings.arcgisDashJsDashApi.esriTasksSupportDataLayerMod

import typings.arcgisDashJsDashApi.__esri.DataLayer
import typings.arcgisDashJsDashApi.__esri.DataLayerProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/tasks/support/DataLayer", JSImport.Namespace)
@js.native
/**
  * Input for properties of ClosestFacilityParameters, RouteParameters or ServiceAreaParameters. The DataLayer can be used to define the following for each parameter type:
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataLayer.html)
  */
class Class () extends DataLayer {
  def this(properties: DataLayerProperties) = this()
  /**
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/programming-patterns/#using-fromjson) topic in the Guide for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    *
    *
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

