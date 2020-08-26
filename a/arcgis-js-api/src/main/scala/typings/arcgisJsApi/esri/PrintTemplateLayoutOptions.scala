package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.Feet
import typings.arcgisJsApi.arcgisJsApiStrings.Kilometers
import typings.arcgisJsApi.arcgisJsApiStrings.Meters
import typings.arcgisJsApi.arcgisJsApiStrings.Miles
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrintTemplateLayoutOptions extends Object {
  /**
    * The text used for the author if the specified layout contains an author text element.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#layoutOptions)
    */
  var authorText: js.UndefOr[String] = js.native
  /**
    * The text used for the copyright if the specified layout contains a copyright text element.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#layoutOptions)
    */
  var copyrightText: js.UndefOr[String] = js.native
  /**
    * An array of name-value pair objects. Use this property to update the text for custom text elements on the page layout. Values must be strings. The custom text elements must exist in the print service. All out-of-the-box print service layout templates contain a text element named `date` that gets populated by default with the system date-time, but can be overwritten.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#layoutOptions)
    */
  var customTextElements: js.UndefOr[js.Array[_]] = js.native
  /**
    * An array of [LegendLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-LegendLayer.html) containing the ids of the layers that will be included in the legend. Tiled layers and GraphicsLayer will not appear in the legend. If `legendLayers` is not specified, all operational layers (non-tiled layers) except [GraphicsLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html) will be present in the legend. To specify that no layers will be included in the legend, set `legendLayer = []`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#layoutOptions)
    */
  var legendLayers: js.UndefOr[js.Array[LegendLayer]] = js.native
  /**
    * The unit used for the scalebar.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#layoutOptions)
    *
    * @default Miles
    */
  var scalebarUnit: js.UndefOr[Miles | Kilometers | Meters | Feet] = js.native
  /**
    * The text used for the map title if the specified layout contains a title text element.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#layoutOptions)
    */
  var titleText: js.UndefOr[String] = js.native
}

object PrintTemplateLayoutOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): PrintTemplateLayoutOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[PrintTemplateLayoutOptions]
  }
  @scala.inline
  implicit class PrintTemplateLayoutOptionsOps[Self <: PrintTemplateLayoutOptions] (val x: Self) extends AnyVal {
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
    def setAuthorText(value: String): Self = this.set("authorText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthorText: Self = this.set("authorText", js.undefined)
    @scala.inline
    def setCopyrightText(value: String): Self = this.set("copyrightText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCopyrightText: Self = this.set("copyrightText", js.undefined)
    @scala.inline
    def setCustomTextElementsVarargs(value: js.Any*): Self = this.set("customTextElements", js.Array(value :_*))
    @scala.inline
    def setCustomTextElements(value: js.Array[_]): Self = this.set("customTextElements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomTextElements: Self = this.set("customTextElements", js.undefined)
    @scala.inline
    def setLegendLayersVarargs(value: LegendLayer*): Self = this.set("legendLayers", js.Array(value :_*))
    @scala.inline
    def setLegendLayers(value: js.Array[LegendLayer]): Self = this.set("legendLayers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegendLayers: Self = this.set("legendLayers", js.undefined)
    @scala.inline
    def setScalebarUnit(value: Miles | Kilometers | Meters | Feet): Self = this.set("scalebarUnit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScalebarUnit: Self = this.set("scalebarUnit", js.undefined)
    @scala.inline
    def setTitleText(value: String): Self = this.set("titleText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleText: Self = this.set("titleText", js.undefined)
  }
  
}

