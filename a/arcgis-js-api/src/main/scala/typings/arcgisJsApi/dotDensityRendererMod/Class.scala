package typings.arcgisJsApi.dotDensityRendererMod

import typings.arcgisJsApi.esri.DotDensityRenderer
import typings.arcgisJsApi.esri.DotDensityRendererProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/renderers/DotDensityRenderer", JSImport.Namespace)
@js.native
/**
  * DotDensityRenderer allows you to create dot density visualizations for polygon layers. Dot density visualizations randomly draw dots within each polygon to visualize the density of a population or some other variable. Each dot represents a fixed numeric value of an [attribute](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#attributes) or a subset of attributes. Unlike choropleth maps, field values used in dot density visualizations don't need to be normalized because the size of the polygon, together with the number of dots rendered within its boundaries, indicate the spatial density of that value.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html)
  */
class Class () extends DotDensityRenderer {
  def this(properties: DotDensityRendererProperties) = this()
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

