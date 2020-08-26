package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VectorTileLayerCurrentStyleInfo extends Object {
  /**
    * Absolute template URL for font sets included in a style. The URL includes `{fontstack}` and `{range}` tokens.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#currentStyleInfo)
    */
  var glyphsUrl: String = js.native
  /**
    * Vector tile service information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#currentStyleInfo)
    */
  var layerDefinition: js.Any = js.native
  /**
    * Absolute URL for a vector tile service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#currentStyleInfo)
    */
  var serviceUrl: String = js.native
  /**
    * Absolute URL for sprites included in a style.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#currentStyleInfo)
    */
  var spriteUrl: String = js.native
  /**
    * Style JSON object for vector tiles. Style object includes `version` of the style specification, `sprite` and `glyphs` properties. It adheres to [version 8 of the Mapbox GL style specification](https://www.mapbox.com/mapbox-gl-js/style-spec/).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#currentStyleInfo)
    */
  var style: js.Any = js.native
  /**
    * Absolute URL for vector tile service style.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#currentStyleInfo)
    */
  var styleUrl: String = js.native
}

object VectorTileLayerCurrentStyleInfo {
  @scala.inline
  def apply(
    constructor: js.Function,
    glyphsUrl: String,
    hasOwnProperty: PropertyKey => Boolean,
    layerDefinition: js.Any,
    propertyIsEnumerable: PropertyKey => Boolean,
    serviceUrl: String,
    spriteUrl: String,
    style: js.Any,
    styleUrl: String
  ): VectorTileLayerCurrentStyleInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], glyphsUrl = glyphsUrl.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), layerDefinition = layerDefinition.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), serviceUrl = serviceUrl.asInstanceOf[js.Any], spriteUrl = spriteUrl.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], styleUrl = styleUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[VectorTileLayerCurrentStyleInfo]
  }
  @scala.inline
  implicit class VectorTileLayerCurrentStyleInfoOps[Self <: VectorTileLayerCurrentStyleInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGlyphsUrl(value: String): Self = this.set("glyphsUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setLayerDefinition(value: js.Any): Self = this.set("layerDefinition", value.asInstanceOf[js.Any])
    @scala.inline
    def setServiceUrl(value: String): Self = this.set("serviceUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpriteUrl(value: String): Self = this.set("spriteUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyle(value: js.Any): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyleUrl(value: String): Self = this.set("styleUrl", value.asInstanceOf[js.Any])
  }
  
}

