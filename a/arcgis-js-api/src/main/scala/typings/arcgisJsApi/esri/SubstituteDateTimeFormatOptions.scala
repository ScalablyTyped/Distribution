package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.date
import typings.std.Intl.DateTimeFormatOptions
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubstituteDateTimeFormatOptions extends Object {
  
  /**
    * The date format options for the [Intl.DateTimeFormat](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/DateTimeFormat) object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-intl.html#SubstituteDateTimeFormatOptions)
    */
  var intlOptions: DateTimeFormatOptions = js.native
  
  /**
    * The type of this format.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-intl.html#SubstituteDateTimeFormatOptions)
    */
  var `type`: date = js.native
}
object SubstituteDateTimeFormatOptions {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    intlOptions: DateTimeFormatOptions,
    propertyIsEnumerable: PropertyKey => Boolean,
    `type`: date
  ): SubstituteDateTimeFormatOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), intlOptions = intlOptions.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubstituteDateTimeFormatOptions]
  }
  
  @scala.inline
  implicit class SubstituteDateTimeFormatOptionsMutableBuilder[Self <: SubstituteDateTimeFormatOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIntlOptions(value: DateTimeFormatOptions): Self = StObject.set(x, "intlOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: date): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
