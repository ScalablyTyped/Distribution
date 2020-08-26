package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LODProperties extends js.Object {
  /**
    * ID for each level. The top most level is `0`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LOD.html#level)
    */
  var level: js.UndefOr[Double] = js.native
  /**
    * String to be used when constructing a URL to access a tile from this LOD. If `levelValue` is not defined, level will be used for the tile access URL. This property is useful when an LOD object represents a WMTS TileMatrix with non-numeric matrix identifiers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LOD.html#levelValue)
    */
  var levelValue: js.UndefOr[String] = js.native
  /**
    * Resolution in map units of each pixel in a tile for each level.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LOD.html#resolution)
    */
  var resolution: js.UndefOr[Double] = js.native
  /**
    * Scale for each level.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LOD.html#scale)
    */
  var scale: js.UndefOr[Double] = js.native
}

object LODProperties {
  @scala.inline
  def apply(): LODProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LODProperties]
  }
  @scala.inline
  implicit class LODPropertiesOps[Self <: LODProperties] (val x: Self) extends AnyVal {
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
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    @scala.inline
    def setLevelValue(value: String): Self = this.set("levelValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevelValue: Self = this.set("levelValue", js.undefined)
    @scala.inline
    def setResolution(value: Double): Self = this.set("resolution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolution: Self = this.set("resolution", js.undefined)
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
  }
  
}

