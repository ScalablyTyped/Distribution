package typings.arcgisJsApi.graphicMod

import typings.arcgisJsApi.esri.Graphic
import typings.arcgisJsApi.esri.GraphicProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/Graphic", JSImport.Namespace)
@js.native
/**
  * A Graphic is a vector representation of real world geographic phenomena. It can contain [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html#geometry), a [symbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html#symbol), and [attributes](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html#attributes). A Graphic is displayed in the [GraphicsLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html)
  */
class Class () extends Graphic {
  def this(properties: GraphicProperties) = this()
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

