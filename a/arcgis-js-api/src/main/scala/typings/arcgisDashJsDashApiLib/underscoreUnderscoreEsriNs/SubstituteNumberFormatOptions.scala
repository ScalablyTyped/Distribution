package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubstituteNumberFormatOptions
  extends stdLib.Object {
  /**
    * The Intl number format options for the [Intl.NumberFormat](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/NumberFormat) object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-intl.html#SubstituteNumberFormatOptions)
    */
  var intlOptions: stdLib.IntlNs.NumberFormatOptions
  /**
    * The type of this format. The value is always `"number"`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-intl.html#SubstituteNumberFormatOptions)
    */
  var `type`: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.number
}

object SubstituteNumberFormatOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    intlOptions: stdLib.IntlNs.NumberFormatOptions,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    `type`: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.number
  ): SubstituteNumberFormatOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), intlOptions = intlOptions, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SubstituteNumberFormatOptions]
  }
}

