package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait colorRampsByTagParams extends Object {
  /**
    * When provided, only ramps missing all the provided tags will be returned.  **Known Tags:** light | dark | reds | yellows | oranges | greens | blues | purples | pinks | browns | grays | bright | subdued | colorblind-friendly | diverging | sequential | categorical | heatmap
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-support-colorRamps.html#byTag)
    */
  var excludedTags: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * When provided, only ramps containing all the matching tags will be returned.  **Known Tags:** light | dark | reds | yellows | oranges | greens | blues | purples | pinks | browns | grays | bright | subdued | colorblind-friendly | diverging | sequential | categorical | heatmap
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-support-colorRamps.html#byTag)
    */
  var includedTags: js.UndefOr[js.Array[String]] = js.undefined
}

object colorRampsByTagParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    excludedTags: js.Array[String] = null,
    includedTags: js.Array[String] = null
  ): colorRampsByTagParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (excludedTags != null) __obj.updateDynamic("excludedTags")(excludedTags.asInstanceOf[js.Any])
    if (includedTags != null) __obj.updateDynamic("includedTags")(includedTags.asInstanceOf[js.Any])
    __obj.asInstanceOf[colorRampsByTagParams]
  }
}

