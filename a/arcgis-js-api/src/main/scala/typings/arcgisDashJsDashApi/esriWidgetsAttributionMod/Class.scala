package typings.arcgisDashJsDashApi.esriWidgetsAttributionMod

import typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs.Attribution
import typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs.AttributionProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/widgets/Attribution", JSImport.Namespace)
@js.native
/**
  * The Attribution displays attribution text for the layers in a map. The text displayed for the layers is either a list of data providers or sources as defined in the layer's custom attribution data, or the copyright text. This widget automatically updates based on layer visibility and map extent and displays a single line of attribution that can be expanded with a single click to view all data sources.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attribution.html)
  */
class Class () extends Attribution {
  def this(properties: AttributionProperties) = this()
}

