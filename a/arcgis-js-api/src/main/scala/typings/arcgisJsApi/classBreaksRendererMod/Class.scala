package typings.arcgisJsApi.classBreaksRendererMod

import typings.arcgisJsApi.esri.ClassBreaksRenderer
import typings.arcgisJsApi.esri.ClassBreaksRendererProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/renderers/ClassBreaksRenderer", JSImport.Namespace)
@js.native
/**
  * ClassBreaksRenderer defines the symbol of each feature in a [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html) based on the value of a numeric attribute. Symbols are assigned based on classes or ranges of data. Each feature is assigned a symbol based on the class break in which the value of the attribute falls.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html)
  */
class Class () extends ClassBreaksRenderer {
  def this(properties: ClassBreaksRendererProperties) = this()
}

