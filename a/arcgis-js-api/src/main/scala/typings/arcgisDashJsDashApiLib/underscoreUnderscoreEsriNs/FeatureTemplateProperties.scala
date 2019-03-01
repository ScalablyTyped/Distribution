package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureTemplateProperties extends js.Object {
  /**
    * Description of the feature template.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureTemplate.html#description)
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Name of the default drawing tool defined for the template to create a feature.  **Possible Values:** auto-complete-polygon | circle | ellipse | freehand | line | none | point | polygon | rectangle | arrow | triangle | left-arrow | right-arrow | up-arrow | down-arrow
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureTemplate.html#drawingTool)
    */
  var drawingTool: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Name of the feature template.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureTemplate.html#name)
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
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
    description: java.lang.String = null,
    drawingTool: java.lang.String = null,
    name: java.lang.String = null,
    thumbnail: FeatureTemplateThumbnail = null
  ): FeatureTemplateProperties = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (drawingTool != null) __obj.updateDynamic("drawingTool")(drawingTool)
    if (name != null) __obj.updateDynamic("name")(name)
    if (thumbnail != null) __obj.updateDynamic("thumbnail")(thumbnail)
    __obj.asInstanceOf[FeatureTemplateProperties]
  }
}

