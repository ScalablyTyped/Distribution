package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.ViewProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__esri.View")
@js.native
/**
  * A view provides the means of viewing and interacting with the components of a [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html). The [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html) is merely a container, storing the geographic information contained in base layers and operational layers. The View renders the [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html) and its various [layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#layers), making them visible to the user.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html)
  */
class ViewCls ()
  extends typings.arcgisJsApi.esri.View {
  def this(properties: ViewProperties) = this()
}

