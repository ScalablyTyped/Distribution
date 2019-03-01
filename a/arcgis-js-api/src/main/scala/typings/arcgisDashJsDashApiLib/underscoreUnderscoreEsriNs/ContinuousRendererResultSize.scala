package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContinuousRendererResultSize
  extends stdLib.Object {
  /**
    * The size scheme used by the visual variable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-univariateColorSize.html#ContinuousRendererResult)
    */
  var sizeScheme: SizeScheme
  /**
    * The size visual variable(s) configured based on the statistics of the data and the view scale.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-univariateColorSize.html#ContinuousRendererResult)
    */
  var visualVariables: js.Array[SizeVariable]
}

object ContinuousRendererResultSize {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    sizeScheme: SizeScheme,
    visualVariables: js.Array[SizeVariable]
  ): ContinuousRendererResultSize = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    __obj.updateDynamic("sizeScheme")(sizeScheme)
    __obj.updateDynamic("visualVariables")(visualVariables)
    __obj.asInstanceOf[ContinuousRendererResultSize]
  }
}

