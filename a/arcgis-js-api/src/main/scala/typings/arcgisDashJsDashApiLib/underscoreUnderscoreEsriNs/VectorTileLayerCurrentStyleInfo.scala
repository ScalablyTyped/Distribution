package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VectorTileLayerCurrentStyleInfo
  extends stdLib.Object {
  /**
    * Absolute template URL for font sets included in a style. The URL includes `{fontstack}` and `{range}` tokens.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#currentStyleInfo)
    */
  var glyphsUrl: java.lang.String
  /**
    * Vector tile service information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#currentStyleInfo)
    */
  var layerDefinition: js.Any
  /**
    * Absolute URL for a vector tile service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#currentStyleInfo)
    */
  var serviceUrl: java.lang.String
  /**
    * Absolute URL for sprites included in a style.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#currentStyleInfo)
    */
  var spriteUrl: java.lang.String
  /**
    * Style JSON object for vector tiles. Style object includes `version` of the style specification, `sprite` and `glyphs` properties. It adheres to [version 8 of the Mapbox GL style specification](https://www.mapbox.com/mapbox-gl-js/style-spec/).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#currentStyleInfo)
    */
  var style: js.Any
  /**
    * Absolute URL for vector tile service style.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#currentStyleInfo)
    */
  var styleUrl: java.lang.String
}

object VectorTileLayerCurrentStyleInfo {
  @scala.inline
  def apply(
    constructor: js.Function,
    glyphsUrl: java.lang.String,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    layerDefinition: js.Any,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    serviceUrl: java.lang.String,
    spriteUrl: java.lang.String,
    style: js.Any,
    styleUrl: java.lang.String
  ): VectorTileLayerCurrentStyleInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor, glyphsUrl = glyphsUrl, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), layerDefinition = layerDefinition, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), serviceUrl = serviceUrl, spriteUrl = spriteUrl, style = style, styleUrl = styleUrl)
  
    __obj.asInstanceOf[VectorTileLayerCurrentStyleInfo]
  }
}

