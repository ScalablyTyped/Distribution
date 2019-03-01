package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait univariateColorSizeCreateVisualVariablesParamsSizeOptions
  extends stdLib.Object {
  /**
    * When set to `all`, a single size variable that scales uniformly in all dimensions is generated. When set to `height`, the result contains two size visual variables: the first one sizes the height according to the field statistics, while the second defines a constant size for width and depth.  **Possible Values:** all | height
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-univariateColorSize.html#createVisualVariables)
    *
    * @default all
    */
  var axis: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Provides options for setting a title to a field when an expression is provided instead of a field name. This title will represent the field in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-univariateColorSize.html#createVisualVariables)
    */
  var legendOptions: js.UndefOr[univariateColorSizeCreateVisualVariablesParamsSizeOptionsLegendOptions] = js.undefined
  /**
    * In authoring apps, the user may select a pre-defined size scheme. Pass the scheme object to this property to avoid getting one based on the `basemap`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-univariateColorSize.html#createVisualVariables)
    */
  var sizeScheme: js.UndefOr[SizeScheme] = js.undefined
}

object univariateColorSizeCreateVisualVariablesParamsSizeOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    axis: js.UndefOr[scala.Boolean] = js.undefined,
    legendOptions: univariateColorSizeCreateVisualVariablesParamsSizeOptionsLegendOptions = null,
    sizeScheme: SizeScheme = null
  ): univariateColorSizeCreateVisualVariablesParamsSizeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    if (!js.isUndefined(axis)) __obj.updateDynamic("axis")(axis)
    if (legendOptions != null) __obj.updateDynamic("legendOptions")(legendOptions)
    if (sizeScheme != null) __obj.updateDynamic("sizeScheme")(sizeScheme)
    __obj.asInstanceOf[univariateColorSizeCreateVisualVariablesParamsSizeOptions]
  }
}

