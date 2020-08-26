package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`auto-complete-polygon`
import typings.arcgisJsApi.arcgisJsApiStrings.`down-arrow`
import typings.arcgisJsApi.arcgisJsApiStrings.`left-arrow`
import typings.arcgisJsApi.arcgisJsApiStrings.`right-arrow`
import typings.arcgisJsApi.arcgisJsApiStrings.`up-arrow`
import typings.arcgisJsApi.arcgisJsApiStrings.arrow
import typings.arcgisJsApi.arcgisJsApiStrings.circle
import typings.arcgisJsApi.arcgisJsApiStrings.ellipse
import typings.arcgisJsApi.arcgisJsApiStrings.freehand
import typings.arcgisJsApi.arcgisJsApiStrings.line
import typings.arcgisJsApi.arcgisJsApiStrings.none
import typings.arcgisJsApi.arcgisJsApiStrings.point
import typings.arcgisJsApi.arcgisJsApiStrings.polygon
import typings.arcgisJsApi.arcgisJsApiStrings.rectangle
import typings.arcgisJsApi.arcgisJsApiStrings.triangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureTemplateProperties extends js.Object {
  /**
    * Description of the feature template.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureTemplate.html#description)
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Name of the default drawing tool defined for the template to create a feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureTemplate.html#drawingTool)
    */
  var drawingTool: js.UndefOr[
    `auto-complete-polygon` | circle | ellipse | freehand | line | none | point | polygon | rectangle | arrow | triangle | `left-arrow` | `right-arrow` | `up-arrow` | `down-arrow`
  ] = js.native
  /**
    * Name of the feature template.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureTemplate.html#name)
    */
  var name: js.UndefOr[String] = js.native
  /**
    * An object used to create a thumbnail image that represents a feature type in the feature template.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureTemplate.html#thumbnail)
    */
  var thumbnail: js.UndefOr[FeatureTemplateThumbnail] = js.native
}

object FeatureTemplateProperties {
  @scala.inline
  def apply(): FeatureTemplateProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureTemplateProperties]
  }
  @scala.inline
  implicit class FeatureTemplatePropertiesOps[Self <: FeatureTemplateProperties] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDrawingTool(
      value: `auto-complete-polygon` | circle | ellipse | freehand | line | none | point | polygon | rectangle | arrow | triangle | `left-arrow` | `right-arrow` | `up-arrow` | `down-arrow`
    ): Self = this.set("drawingTool", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrawingTool: Self = this.set("drawingTool", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setThumbnail(value: FeatureTemplateThumbnail): Self = this.set("thumbnail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbnail: Self = this.set("thumbnail", js.undefined)
  }
  
}

