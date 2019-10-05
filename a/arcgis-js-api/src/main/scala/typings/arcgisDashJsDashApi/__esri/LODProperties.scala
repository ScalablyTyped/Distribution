package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LODProperties extends js.Object {
  /**
    * ID for each level. The top most level is `0`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LOD.html#level)
    */
  var level: js.UndefOr[Double] = js.undefined
  /**
    * String to be used when constructing a URL to access a tile from this LOD. If `levelValue` is not defined, level will be used for the tile access URL. This property is useful when an LOD object represents a WMTS TileMatrix with non-numeric matrix identifiers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LOD.html#levelValue)
    */
  var levelValue: js.UndefOr[String] = js.undefined
  /**
    * Resolution in map units of each pixel in a tile for each level.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LOD.html#resolution)
    */
  var resolution: js.UndefOr[Double] = js.undefined
  /**
    * Scale for each level.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LOD.html#scale)
    */
  var scale: js.UndefOr[Double] = js.undefined
}

object LODProperties {
  @scala.inline
  def apply(
    level: Int | Double = null,
    levelValue: String = null,
    resolution: Int | Double = null,
    scale: Int | Double = null
  ): LODProperties = {
    val __obj = js.Dynamic.literal()
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (levelValue != null) __obj.updateDynamic("levelValue")(levelValue)
    if (resolution != null) __obj.updateDynamic("resolution")(resolution.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[LODProperties]
  }
}

