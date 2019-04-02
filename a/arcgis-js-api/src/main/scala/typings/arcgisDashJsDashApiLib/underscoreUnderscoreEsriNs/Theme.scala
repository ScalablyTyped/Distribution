package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Theme
  extends stdLib.Object {
  /**
    * The Esri basemaps that pair well with the given theme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-color.html#Theme)
    */
  var basemaps: js.Array[java.lang.String]
  /**
    * Text describing the theme in the UI.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-color.html#Theme)
    */
  var description: java.lang.String
  /**
    * The label identifying the theme in UI elements.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-color.html#Theme)
    */
  var label: java.lang.String
  /**
    * The name of the theme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-color.html#Theme)
    */
  var name: java.lang.String
}

object Theme {
  @scala.inline
  def apply(
    basemaps: js.Array[java.lang.String],
    constructor: js.Function,
    description: java.lang.String,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    label: java.lang.String,
    name: java.lang.String,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean
  ): Theme = {
    val __obj = js.Dynamic.literal(basemaps = basemaps, constructor = constructor, description = description, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), label = label, name = name, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
  
    __obj.asInstanceOf[Theme]
  }
}

