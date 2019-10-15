package typings.arcgisDashJsDashApi.esriRenderersRendererMod

import typings.arcgisDashJsDashApi.__esri.Renderer
import typings.arcgisDashJsDashApi.__esri.RendererProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/renderers/Renderer", JSImport.Namespace)
@js.native
/**
  * Renderers define how to visually represent each feature in one of the following layer types:
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-Renderer.html)
  */
class Class () extends Renderer {
  def this(properties: RendererProperties) = this()
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

