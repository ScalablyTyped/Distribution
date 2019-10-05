package typings.arcgisDashJsDashApi.esriGeometryPolylineMod

import typings.arcgisDashJsDashApi.__esri.Polyline
import typings.arcgisDashJsDashApi.__esri.PolylineProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/geometry/Polyline", JSImport.Namespace)
@js.native
class Class () extends Polyline {
  def this(properties: PolylineProperties) = this()
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

