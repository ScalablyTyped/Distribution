package typings.arcgisDashJsDashApi.esriGeometryCircleMod

import typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs.Circle
import typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs.CircleProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/geometry/Circle", JSImport.Namespace)
@js.native
class Class () extends Circle {
  def this(properties: CircleProperties) = this()
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

