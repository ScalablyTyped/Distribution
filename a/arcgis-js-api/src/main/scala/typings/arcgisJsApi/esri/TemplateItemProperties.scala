package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateItemProperties extends js.Object {
  /**
    * The description that is displayed for the template item. This is similar to the description provided in [FeatureTemplate.description](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureTemplate.html#description).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-TemplateItem.html#description)
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * The label that is displayed for the template item. This is similar to the name provided in [FeatureTemplate.name](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureTemplate.html#name).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-TemplateItem.html#label)
    */
  var label: js.UndefOr[String] = js.undefined
  /**
    * The [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) associated with the template item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-TemplateItem.html#layer)
    */
  var layer: js.UndefOr[FeatureLayerProperties] = js.undefined
  /**
    * The associated [FeatureTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureTemplate.html) for the item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-TemplateItem.html#template)
    */
  var template: js.UndefOr[FeatureTemplateProperties] = js.undefined
}

object TemplateItemProperties {
  @scala.inline
  def apply(
    description: String = null,
    label: String = null,
    layer: FeatureLayerProperties = null,
    template: FeatureTemplateProperties = null
  ): TemplateItemProperties = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (layer != null) __obj.updateDynamic("layer")(layer.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateItemProperties]
  }
}

