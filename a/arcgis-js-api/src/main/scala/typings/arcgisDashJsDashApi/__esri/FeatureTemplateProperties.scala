package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`auto-complete-polygon`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`down-arrow`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`left-arrow`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`right-arrow`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`up-arrow`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.arrow
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.circle
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.ellipse
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.freehand
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.line
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.none
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.point
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.polygon
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.rectangle
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.triangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureTemplateProperties extends js.Object {
  /**
    * Description of the feature template.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureTemplate.html#description)
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * Name of the default drawing tool defined for the template to create a feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureTemplate.html#drawingTool)
    */
  var drawingTool: js.UndefOr[
    `auto-complete-polygon` | circle | ellipse | freehand | line | none | point | polygon | rectangle | arrow | triangle | `left-arrow` | `right-arrow` | `up-arrow` | `down-arrow`
  ] = js.undefined
  /**
    * Name of the feature template.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureTemplate.html#name)
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * An object used to create a thumbnail image that represents a feature type in the feature template.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureTemplate.html#thumbnail)
    */
  var thumbnail: js.UndefOr[FeatureTemplateThumbnail] = js.undefined
}

object FeatureTemplateProperties {
  @scala.inline
  def apply(
    description: String = null,
    drawingTool: `auto-complete-polygon` | circle | ellipse | freehand | line | none | point | polygon | rectangle | arrow | triangle | `left-arrow` | `right-arrow` | `up-arrow` | `down-arrow` = null,
    name: String = null,
    thumbnail: FeatureTemplateThumbnail = null
  ): FeatureTemplateProperties = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (drawingTool != null) __obj.updateDynamic("drawingTool")(drawingTool.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (thumbnail != null) __obj.updateDynamic("thumbnail")(thumbnail.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureTemplateProperties]
  }
}

