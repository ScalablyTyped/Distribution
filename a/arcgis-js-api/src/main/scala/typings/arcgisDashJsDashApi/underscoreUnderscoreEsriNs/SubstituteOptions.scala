package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.arcgisDashJsDashApi.HashMap
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubstituteOptions extends Object {
  /**
    * A hashmap of string keys to formatting options.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-intl.html#SubstituteOptions)
    */
  var format: HashMap[SubstituteDateTimeFormatOptions | SubstituteNumberFormatOptions]
}

object SubstituteOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    format: HashMap[SubstituteDateTimeFormatOptions | SubstituteNumberFormatOptions],
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): SubstituteOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor, format = format, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
  
    __obj.asInstanceOf[SubstituteOptions]
  }
}

