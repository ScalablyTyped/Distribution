package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait univariateColorSizeCreateContinuousRendererParamsColorOptions
  extends stdLib.Object {
  /**
    * In authoring apps, the user may select a pre-defined color scheme. Pass the scheme object to this property to avoid getting one based on a `theme` and the `basemap`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-univariateColorSize.html#createContinuousRenderer)
    */
  var colorScheme: js.UndefOr[ColorScheme] = js.undefined
  /**
    * Provides options for setting a title to a field when an expression is provided instead of a field name. This title will represent the field in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-univariateColorSize.html#createContinuousRenderer)
    */
  var legendOptions: js.UndefOr[univariateColorSizeCreateContinuousRendererParamsColorOptionsLegendOptions] = js.undefined
  /**
    * Determines which values will be emphasized in the continuous ramp and the map. Possible values are listed below.
    *
    * | Value | Description | Example |
    * | ----- | ----------- | ------- |
    * | high-to-low | High values are emphasized with strong colors. | ![high-to-low](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/sm-high-to-low.png) |
    * | above-and-below | Values centered around a given point (e.g. the average) are visualized with weak colors while other values are emphasized with strong colors. | ![above-and-below](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/sm-above-and-below.png) |
    * | centered-on | Values centered around a given point (e.g. the average) are emphasized with strong colors while other values are visualized with weak colors. | ![centered-on](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/sm-centered-on.png) |
    * | extremes | High and low values are emphasized with strong colors. All others are visualized with weak colors. | ![extremes](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/sm-extremes.png) |
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-univariateColorSize.html#createContinuousRenderer)
    */
  var theme: js.UndefOr[java.lang.String] = js.undefined
}

object univariateColorSizeCreateContinuousRendererParamsColorOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    colorScheme: ColorScheme = null,
    legendOptions: univariateColorSizeCreateContinuousRendererParamsColorOptionsLegendOptions = null,
    theme: java.lang.String = null
  ): univariateColorSizeCreateContinuousRendererParamsColorOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable)
    if (colorScheme != null) __obj.updateDynamic("colorScheme")(colorScheme)
    if (legendOptions != null) __obj.updateDynamic("legendOptions")(legendOptions)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[univariateColorSizeCreateContinuousRendererParamsColorOptions]
  }
}

