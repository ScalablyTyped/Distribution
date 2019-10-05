package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageParameters extends Accessor {
  /**
    * Dots per inch setting for an module:esri/layersMapImageLayer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ImageParameters.html#dpi)
    *
    * @default 96
    */
  var dpi: Double = js.native
  /**
    * Extent of map to be exported.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ImageParameters.html#extent)
    */
  var extent: Extent = js.native
  /**
    * Map image format.  **Possible Values:** png | png8 | png24 | png32 | jpg | pdf | bmp | gif | svg
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ImageParameters.html#format)
    *
    * @default png8
    */
  var format: String = js.native
  /**
    * Requested image height in pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ImageParameters.html#height)
    */
  var height: Double = js.native
  /**
    * Spatial reference of exported map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ImageParameters.html#imageSpatialReference)
    */
  var imageSpatialReference: SpatialReference = js.native
  /**
    * Array of layer definition expressions that allows you to filter the features of individual layers in the exported map image. Layer definitions with semicolons or colons are supported if using a map service published using ArcGIS Server 10 or later.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ImageParameters.html#layerDefinitions)
    */
  var layerDefinitions: js.Array[String] = js.native
  /**
    * A list of layer IDs, that represent which layers to include in the exported map. Use in combination with [layerOption](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ImageParameters.html#layerOption) to specify how layer visibility is handled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ImageParameters.html#layerIds)
    */
  var layerIds: js.Array[Double] = js.native
  /**
    * The option for displaying or hiding the layer.  **Possible Values:** show | hide | include | exclude
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ImageParameters.html#layerOption)
    */
  var layerOption: String = js.native
  /**
    * Indicates whether or not the background of the dynamic image is transparent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ImageParameters.html#transparent)
    *
    * @default true
    */
  var transparent: Boolean = js.native
  /**
    * Requested image width in pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ImageParameters.html#width)
    */
  var width: Double = js.native
  /**
    * Converts an instance of  [this class]() to its ArcGIS portal JSON representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/using-fromjson/index.html) topic in the Guide for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ImageParameters.html#toJSON)
    *
    *
    */
  def toJSON(): js.Any = js.native
}

@JSGlobal("__esri.ImageParameters")
@js.native
object ImageParameters extends TopLevel[ImageParametersConstructor]

