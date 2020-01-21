package typings.amapJsApiAutocomplete.AMap.Autocomplete

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.all
  - typings.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.bus
  - typings.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.poi
  - typings.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.busline
*/
trait DataType extends js.Object

object DataType {
  @scala.inline
  def all: typings.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.all = this.cast("all")
  @scala.inline
  def bus: typings.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.bus = this.cast("bus")
  @scala.inline
  def busline: typings.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.busline = this.cast("busline")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def poi: typings.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.poi = this.cast("poi")
}

