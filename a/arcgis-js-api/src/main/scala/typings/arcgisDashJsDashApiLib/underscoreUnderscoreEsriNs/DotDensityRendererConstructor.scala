package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DotDensityRendererConstructor
  extends /**
  * DotDensityRenderer allows you to create dot density visualizations for polygon layers. Dot density visualizations randomly draw dots within each polygon to visualize the density of a population or some other variable. Each dot represents a fixed numeric value of an [attribute](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#attributes) or a subset of attributes. Unlike choropleth maps, field values used in dot density visualizations don't need to be normalized because the size of the polygon, together with the number of dots rendered within its boundaries, indicate the spatial density of that value.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html)
  */
org.scalablytyped.runtime.Instantiable0[DotDensityRenderer]
     with org.scalablytyped.runtime.Instantiable1[/* properties */ DotDensityRendererProperties, DotDensityRenderer] {
  def fromJSON(json: js.Any): DotDensityRenderer = js.native
}

