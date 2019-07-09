package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubstituteDateTimeFormatOptions
  extends stdLib.Object {
  /**
    * The date format options for the [Intl.DateTimeFormat](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/DateTimeFormat) object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-intl.html#SubstituteDateTimeFormatOptions)
    */
  var intlOptions: stdLib.IntlNs.DateTimeFormatOptions
  /**
    * The type of this format. The value is always `"date"`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-intl.html#SubstituteDateTimeFormatOptions)
    */
  var `type`: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.date
}

object SubstituteDateTimeFormatOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    intlOptions: stdLib.IntlNs.DateTimeFormatOptions,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    `type`: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.date
  ): SubstituteDateTimeFormatOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), intlOptions = intlOptions, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SubstituteDateTimeFormatOptions]
  }
}

