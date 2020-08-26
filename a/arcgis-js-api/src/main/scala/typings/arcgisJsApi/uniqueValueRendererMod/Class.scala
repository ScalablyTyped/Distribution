package typings.arcgisJsApi.uniqueValueRendererMod

import typings.arcgisJsApi.esri.UniqueValueRenderer
import typings.arcgisJsApi.esri.UniqueValueRendererProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/renderers/UniqueValueRenderer", JSImport.Namespace)
@js.native
/**
  * UniqueValueRenderer allows you to symbolize features in a [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html) based on one or more matching string attributes. This is typically done by using unique colors, fill styles, or images to represent features with equal values in a string field.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html)
  */
class Class () extends UniqueValueRenderer {
  def this(properties: UniqueValueRendererProperties) = this()
}

