package typings.arcgisJsApi.esri

import typings.arcgisJsApi.HashMap
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubstituteOptions
  extends StObject
     with Object {
  
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
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[SubstituteOptions]
  }
  
  @scala.inline
  implicit class SubstituteOptionsMutableBuilder[Self <: SubstituteOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: HashMap[SubstituteDateTimeFormatOptions | SubstituteNumberFormatOptions]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
  }
}
