package typings.arcgisDashJsDashApi.esriLayersUnknownLayerMod

import typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs.UnknownLayer
import typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs.UnknownLayerProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/layers/UnknownLayer", JSImport.Namespace)
@js.native
/**
  * Represents a layer whose type could not be determined. For example, when loading a layer from a URL and the layer type cannot be determined, then it is represented as an instance of this class.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-UnknownLayer.html)
  */
class Class () extends UnknownLayer {
  def this(properties: UnknownLayerProperties) = this()
}

