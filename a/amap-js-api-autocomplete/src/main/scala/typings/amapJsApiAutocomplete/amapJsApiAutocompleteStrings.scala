package typings.amapJsApiAutocomplete

import typings.amapJsApiAutocomplete.AMap.Autocomplete.DataType
import typings.amapJsApiAutocomplete.AMap.Autocomplete.SearchStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object amapJsApiAutocompleteStrings {
  
  @scala.inline
  def all: all = "all".asInstanceOf[all]
  
  @scala.inline
  def bus: bus = "bus".asInstanceOf[bus]
  
  @scala.inline
  def busline: busline = "busline".asInstanceOf[busline]
  
  @scala.inline
  def choose: choose = "choose".asInstanceOf[choose]
  
  @scala.inline
  def complete: complete = "complete".asInstanceOf[complete]
  
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @scala.inline
  def no_data: no_data = "no_data".asInstanceOf[no_data]
  
  @scala.inline
  def poi: poi = "poi".asInstanceOf[poi]
  
  @scala.inline
  def select: select = "select".asInstanceOf[select]
  
  @js.native
  sealed trait all extends DataType
  
  @js.native
  sealed trait bus extends DataType
  
  @js.native
  sealed trait busline extends DataType
  
  @js.native
  sealed trait choose extends js.Object
  
  @js.native
  sealed trait complete extends SearchStatus
  
  @js.native
  sealed trait error extends SearchStatus
  
  @js.native
  sealed trait no_data extends SearchStatus
  
  @js.native
  sealed trait poi extends DataType
  
  @js.native
  sealed trait select extends js.Object
}
