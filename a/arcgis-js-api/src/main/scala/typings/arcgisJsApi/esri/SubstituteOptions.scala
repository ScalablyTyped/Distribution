package typings.arcgisJsApi.esri

import typings.arcgisJsApi.HashMap
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubstituteOptions extends Object {
  /**
    * A hashmap of string keys to formatting options.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-intl.html#SubstituteOptions)
    */
  var format: HashMap[SubstituteDateTimeFormatOptions | SubstituteNumberFormatOptions] = js.native
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
  implicit class SubstituteOptionsOps[Self <: SubstituteOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFormat(value: HashMap[SubstituteDateTimeFormatOptions | SubstituteNumberFormatOptions]): Self = this.set("format", value.asInstanceOf[js.Any])
  }
  
}

