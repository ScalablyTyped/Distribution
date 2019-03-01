package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrintTemplateLayoutOptions
  extends stdLib.Object {
  /**
    * The text used for the author if the specified layout contains an author text element.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#layoutOptions)
    */
  var authorText: java.lang.String
  /**
    * The text used for the copyright if the specified layout contains an copyright text element.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#layoutOptions)
    */
  var copyrightText: java.lang.String
  /**
    * An array of name-value pairs. Use this property to update the text for custom text elements on the page layout. Values must be strings.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#layoutOptions)
    */
  var customTextElements: js.Array[_]
  /**
    * An array of [LegendLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-LegendLayer.html) containing the id's of the layers that will be included in the legend. If `legendLayers` is not specified, all operational layers (non-tiled layers) will be present in the legend. To specify that no layers will be included in the legend set `legendLayer = []`.
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
  var scalebarUnit: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The text used for the map title if the specified layout contains a title text element.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#layoutOptions)
    */
  var titleText: java.lang.String
}

object PrintTemplateLayoutOptions {
  @scala.inline
  def apply(
    authorText: java.lang.String,
    constructor: js.Function,
    copyrightText: java.lang.String,
    customTextElements: js.Array[_],
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    legendLayers: js.Array[LegendLayer],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    titleText: java.lang.String,
    scalebarUnit: java.lang.String = null
  ): PrintTemplateLayoutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("authorText")(authorText)
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("copyrightText")(copyrightText)
    __obj.updateDynamic("customTextElements")(customTextElements)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("legendLayers")(legendLayers)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    __obj.updateDynamic("titleText")(titleText)
    if (scalebarUnit != null) __obj.updateDynamic("scalebarUnit")(scalebarUnit)
    __obj.asInstanceOf[PrintTemplateLayoutOptions]
  }
}

