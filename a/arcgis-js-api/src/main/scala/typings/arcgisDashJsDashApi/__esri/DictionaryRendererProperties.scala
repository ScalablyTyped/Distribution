package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.HashMap
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.dictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DictionaryRendererProperties
  extends RendererProperties
     with VisualVariablesMixinProperties {
  /**
    * This property allows you to set display options that can be configured on the dictionary symbol style. For example, if the dictionary symbol style provides a display option to turn on/off a symbol/text, you could set it here.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DictionaryRenderer.html#config)
    */
  var config: js.UndefOr[js.Any] = js.undefined
  /**
    * Defines a field mapping that maps input fields from the feature to the dictionary symbol style's expected fields for symbols and text. Each key identifies an expected field (defined in the dictionary's symbol and text properties). The value identifies the corresponding mapped field from the dataset. Field names are case sensitive.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DictionaryRenderer.html#fieldMap)
    */
  var fieldMap: js.UndefOr[HashMap[String]] = js.undefined
  /**
    * The type of renderer. For this renderer the type is always `dictionary`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DictionaryRenderer.html#type)
    */
  var `type`: js.UndefOr[dictionary] = js.undefined
  /**
    * The URL to the dictionary style, e.g. https://jsapi.maps.arcgis.com/sharing/rest/content/items/30cfbf36efd64ccf92136201d9e852af.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DictionaryRenderer.html#url)
    */
  var url: js.UndefOr[String] = js.undefined
}

object DictionaryRendererProperties {
  @scala.inline
  def apply(
    authoringInfo: AuthoringInfoProperties = null,
    config: js.Any = null,
    fieldMap: HashMap[String] = null,
    `type`: dictionary = null,
    url: String = null,
    visualVariables: js.Array[VisualVariableProperties] = null
  ): DictionaryRendererProperties = {
    val __obj = js.Dynamic.literal()
    if (authoringInfo != null) __obj.updateDynamic("authoringInfo")(authoringInfo.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (fieldMap != null) __obj.updateDynamic("fieldMap")(fieldMap.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (visualVariables != null) __obj.updateDynamic("visualVariables")(visualVariables.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictionaryRendererProperties]
  }
}

