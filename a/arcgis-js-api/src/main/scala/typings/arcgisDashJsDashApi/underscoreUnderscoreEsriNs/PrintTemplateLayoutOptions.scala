package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

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
  var authorText: String
  /**
    * The text used for the copyright if the specified layout contains an copyright text element.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#layoutOptions)
    */
  var copyrightText: String
  /**
    * An array of name-value pairs. Use this property to update the text for custom text elements on the page layout. Values must be strings.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#layoutOptions)
    */
  var customTextElements: js.Array[_]
  /**
    * An array of [LegendLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-LegendLayer.html) containing the id's of the layers that will be included in the legend. If `legendLayers` is not specified, all operational layers (non-tiled layers) except [GraphicsLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html) will be present in the legend. To specify that no layers will be included in the legend set `legendLayer = []`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#layoutOptions)
    */
  var legendLayers: js.Array[LegendLayer]
  /**
    * The unit used for the scalebar.  **Possible Values:** `Miles` | `Kilometers` | `Meters` | `Feet`
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#layoutOptions)
    *
    * @default Miles
    */
  var scalebarUnit: js.UndefOr[String] = js.undefined
  /**
    * The text used for the map title if the specified layout contains a title text element.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#layoutOptions)
    */
  var titleText: String
}

object PrintTemplateLayoutOptions {
  @scala.inline
  def apply(
    authorText: String,
    constructor: js.Function,
    copyrightText: String,
    customTextElements: js.Array[_],
    hasOwnProperty: PropertyKey => Boolean,
    legendLayers: js.Array[LegendLayer],
    propertyIsEnumerable: PropertyKey => Boolean,
    titleText: String,
    scalebarUnit: String = null
  ): PrintTemplateLayoutOptions = {
    val __obj = js.Dynamic.literal(authorText = authorText, constructor = constructor, copyrightText = copyrightText, customTextElements = customTextElements, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), legendLayers = legendLayers, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), titleText = titleText)
    if (scalebarUnit != null) __obj.updateDynamic("scalebarUnit")(scalebarUnit)
    __obj.asInstanceOf[PrintTemplateLayoutOptions]
  }
}

