package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubstituteOptions
  extends stdLib.Object {
  /**
    * A hashmap of string keys to formatting options.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-intl.html#SubstituteOptions)
    */
  var format: arcgisDashJsDashApiLib.HashMap[SubstituteDateTimeFormatOptions | SubstituteNumberFormatOptions]
}

object SubstituteOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    format: arcgisDashJsDashApiLib.HashMap[SubstituteDateTimeFormatOptions | SubstituteNumberFormatOptions],
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean
  ): SubstituteOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor, format = format, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
  
    __obj.asInstanceOf[SubstituteOptions]
  }
}

