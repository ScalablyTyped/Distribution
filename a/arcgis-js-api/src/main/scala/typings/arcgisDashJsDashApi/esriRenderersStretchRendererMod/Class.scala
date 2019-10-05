package typings.arcgisDashJsDashApi.esriRenderersStretchRendererMod

import typings.arcgisDashJsDashApi.__esri.StretchRenderer
import typings.arcgisDashJsDashApi.__esri.StretchRendererProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/renderers/StretchRenderer", JSImport.Namespace)
@js.native
/**
  * StretchRenderer defines the symbology with a gradual ramp of colors for each pixel in a [ImageryLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html) based on the pixel value. The StretchRenderer works well when you have a large range of values to display, such as in imagery, aerial photographs, or elevation models.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-StretchRenderer.html)
  */
class Class () extends StretchRenderer {
  def this(properties: StretchRendererProperties) = this()
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

