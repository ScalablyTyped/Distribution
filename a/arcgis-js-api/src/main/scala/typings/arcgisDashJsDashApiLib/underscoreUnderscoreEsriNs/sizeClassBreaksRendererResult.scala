package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait sizeClassBreaksRendererResult
  extends stdLib.Object {
  /**
    * The ID of the basemap used to determine the optimal fill color of the features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#ClassBreaksRendererResult)
    */
  var basemapId: java.lang.String
  /**
    * This object describes class breaks generated from data in a layer for a given field with a specified classification method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#ClassBreaksRendererResult)
    */
  var classBreaksResult: ClassBreaksResult
  /**
    * Indicates whether default values are used in the absence of sufficient data and/or statistics from the layer. Default values are typically used when all features have the same field value or no value at all.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#ClassBreaksRendererResult)
    */
  var defaultValuesUsed: scala.Boolean
  /**
    * The renderer object configured to best match the given basemap and the spread of the data. Set this on a layer's `renderer` property to update its visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#ClassBreaksRendererResult)
    */
  var renderer: ClassBreaksRenderer
  /**
    * The size scheme used by the visual variables.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#ClassBreaksRendererResult)
    */
  var sizeScheme: SizeScheme
}

object sizeClassBreaksRendererResult {
  @scala.inline
  def apply(
    basemapId: java.lang.String,
    classBreaksResult: ClassBreaksResult,
    constructor: js.Function,
    defaultValuesUsed: scala.Boolean,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    renderer: ClassBreaksRenderer,
    sizeScheme: SizeScheme
  ): sizeClassBreaksRendererResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("basemapId")(basemapId)
    __obj.updateDynamic("classBreaksResult")(classBreaksResult)
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("defaultValuesUsed")(defaultValuesUsed)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    __obj.updateDynamic("renderer")(renderer)
    __obj.updateDynamic("sizeScheme")(sizeScheme)
    __obj.asInstanceOf[sizeClassBreaksRendererResult]
  }
}

