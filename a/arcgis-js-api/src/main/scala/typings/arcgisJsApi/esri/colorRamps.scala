package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait colorRamps extends js.Object {
  /**
    * Returns all color ramps available in smartMapping [color schemes](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-color.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-support-colorRamps.html#all)
    *
    *
    */
  def all(): js.Array[colorRampsColorRamp]
  /**
    * Returns the color ramp available in the smartMapping [color schemes](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-color.html) matching the given name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-support-colorRamps.html#byName)
    *
    * @param name The name of the desired color ramp.
    *
    */
  def byName(name: String): colorRampsColorRamp
  /**
    * Returns the color ramps available in the smartMapping [color schemes](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-color.html) matching the given tags.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-support-colorRamps.html#byTag)
    *
    * @param params See the table below for details of each parameter that may be passed to this function.
    * @param params.includedTags When provided, only ramps containing all the matching tags will be returned.  **Known Tags:** light | dark | reds | yellows | oranges | greens | blues | purples | pinks | browns | grays | bright | subdued | colorblind-friendly | diverging | sequential | categorical | heatmap
    * @param params.excludedTags When provided, only ramps missing all the provided tags will be returned.  **Known Tags:** light | dark | reds | yellows | oranges | greens | blues | purples | pinks | browns | grays | bright | subdued | colorblind-friendly | diverging | sequential | categorical | heatmap
    *
    */
  def byTag(params: colorRampsByTagParams): js.Array[colorRampsColorRamp]
  /**
    * Returns the names of all color ramps available in the smartMapping [color schemes](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-color.html). Any of the returned names can be used to query for color schemes using [colorSchemes.getSchemeByName()](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-color.html#getSchemeByName) or the color ramp using [byName()](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-support-colorRamps.html#byName).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-support-colorRamps.html#names)
    *
    *
    */
  def names(): js.Array[String]
}

@JSGlobal("__esri.colorRamps")
@js.native
object colorRamps extends TopLevel[colorRamps]

