package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RendererResultClassBreaks extends Object {
  /**
    * The class breaks generated for values in the `field1` parameter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-relationship.html#RendererResult)
    */
  var field1: ClassBreaksResult
  /**
    * The class breaks generated for values in the `field2` parameter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-relationship.html#RendererResult)
    */
  var field2: ClassBreaksResult
}

object RendererResultClassBreaks {
  @scala.inline
  def apply(
    constructor: js.Function,
    field1: ClassBreaksResult,
    field2: ClassBreaksResult,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): RendererResultClassBreaks = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], field1 = field1.asInstanceOf[js.Any], field2 = field2.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[RendererResultClassBreaks]
  }
}

