package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.Feet
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.Kilometers
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.Meters
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.Miles
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrintTemplateLayoutOptions extends Object {
  /**
    * The text used for the author if the specified layout contains an author text element.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#layoutOptions)
    */
  var authorText: js.UndefOr[String] = js.undefined
  /**
    * The text used for the copyright if the specified layout contains a copyright text element.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#layoutOptions)
    */
  var copyrightText: js.UndefOr[String] = js.undefined
  /**
    * An array of name-value pair objects. Use this property to update the text for custom text elements on the page layout. Values must be strings. The custom text elements must exist in the print service. All out-of-the-box print service layout templates contain a text element named `date` that gets populated by default with the system date-time, but can be overwritten.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#layoutOptions)
    */
  var customTextElements: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * An array of [LegendLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-LegendLayer.html) containing the ids of the layers that will be included in the legend. Tiled layers and GraphicsLayer will not appear in the legend. If `legendLayers` is not specified, all operational layers (non-tiled layers) except [GraphicsLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html) will be present in the legend. To specify that no layers will be included in the legend, set `legendLayer = []`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#layoutOptions)
    */
  var legendLayers: js.UndefOr[js.Array[LegendLayer]] = js.undefined
  /**
    * The unit used for the scalebar.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#layoutOptions)
    *
    * @default Miles
    */
  var scalebarUnit: js.UndefOr[Miles | Kilometers | Meters | Feet] = js.undefined
  /**
    * The text used for the map title if the specified layout contains a title text element.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#layoutOptions)
    */
  var titleText: js.UndefOr[String] = js.undefined
}

object PrintTemplateLayoutOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    authorText: String = null,
    copyrightText: String = null,
    customTextElements: js.Array[_] = null,
    legendLayers: js.Array[LegendLayer] = null,
    scalebarUnit: Miles | Kilometers | Meters | Feet = null,
    titleText: String = null
  ): PrintTemplateLayoutOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (authorText != null) __obj.updateDynamic("authorText")(authorText.asInstanceOf[js.Any])
    if (copyrightText != null) __obj.updateDynamic("copyrightText")(copyrightText.asInstanceOf[js.Any])
    if (customTextElements != null) __obj.updateDynamic("customTextElements")(customTextElements.asInstanceOf[js.Any])
    if (legendLayers != null) __obj.updateDynamic("legendLayers")(legendLayers.asInstanceOf[js.Any])
    if (scalebarUnit != null) __obj.updateDynamic("scalebarUnit")(scalebarUnit.asInstanceOf[js.Any])
    if (titleText != null) __obj.updateDynamic("titleText")(titleText.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintTemplateLayoutOptions]
  }
}

