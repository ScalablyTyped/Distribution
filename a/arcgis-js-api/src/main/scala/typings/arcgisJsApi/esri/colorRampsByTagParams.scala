package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait colorRampsByTagParams extends Object {
  /**
    * When provided, only ramps missing all the provided tags will be returned.  **Known Tags:** light | dark | reds | yellows | oranges | greens | blues | purples | pinks | browns | grays | bright | subdued | colorblind-friendly | diverging | sequential | categorical | heatmap
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-support-colorRamps.html#byTag)
    */
  var excludedTags: js.UndefOr[js.Array[String]] = js.native
  /**
    * When provided, only ramps containing all the matching tags will be returned.  **Known Tags:** light | dark | reds | yellows | oranges | greens | blues | purples | pinks | browns | grays | bright | subdued | colorblind-friendly | diverging | sequential | categorical | heatmap
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-support-colorRamps.html#byTag)
    */
  var includedTags: js.UndefOr[js.Array[String]] = js.native
}

object colorRampsByTagParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): colorRampsByTagParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[colorRampsByTagParams]
  }
  @scala.inline
  implicit class colorRampsByTagParamsOps[Self <: colorRampsByTagParams] (val x: Self) extends AnyVal {
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
    def setExcludedTagsVarargs(value: String*): Self = this.set("excludedTags", js.Array(value :_*))
    @scala.inline
    def setExcludedTags(value: js.Array[String]): Self = this.set("excludedTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludedTags: Self = this.set("excludedTags", js.undefined)
    @scala.inline
    def setIncludedTagsVarargs(value: String*): Self = this.set("includedTags", js.Array(value :_*))
    @scala.inline
    def setIncludedTags(value: js.Array[String]): Self = this.set("includedTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludedTags: Self = this.set("includedTags", js.undefined)
  }
  
}

