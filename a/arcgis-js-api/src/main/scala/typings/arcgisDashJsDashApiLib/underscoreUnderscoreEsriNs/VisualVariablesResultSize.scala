package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VisualVariablesResultSize
  extends stdLib.Object {
  /**
    * The size scheme used by the visual variable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-univariateColorSize.html#VisualVariablesResult)
    */
  var sizeScheme: SizeScheme
  /**
    * The size visual variable(s) configured based on the statistics of the data and the view scale.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-univariateColorSize.html#VisualVariablesResult)
    */
  var visualVariables: js.Array[SizeVariable]
}

object VisualVariablesResultSize {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    sizeScheme: SizeScheme,
    visualVariables: js.Array[SizeVariable]
  ): VisualVariablesResultSize = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable, sizeScheme = sizeScheme, visualVariables = visualVariables)
  
    __obj.asInstanceOf[VisualVariablesResultSize]
  }
}

