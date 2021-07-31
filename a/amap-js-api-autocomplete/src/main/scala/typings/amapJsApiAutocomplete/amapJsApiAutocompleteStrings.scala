package typings.amapJsApiAutocomplete

import typings.amapJsApiAutocomplete.AMap.Autocomplete.DataType
import typings.amapJsApiAutocomplete.AMap.Autocomplete.SearchStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object amapJsApiAutocompleteStrings {
  
  @js.native
  sealed trait all
    extends StObject
       with DataType
  @scala.inline
  def all: all = "all".asInstanceOf[all]
  
  @js.native
  sealed trait bus
    extends StObject
       with DataType
  @scala.inline
  def bus: bus = "bus".asInstanceOf[bus]
  
  @js.native
  sealed trait busline
    extends StObject
       with DataType
  @scala.inline
  def busline: busline = "busline".asInstanceOf[busline]
  
  @js.native
  sealed trait choose extends StObject
  @scala.inline
  def choose: choose = "choose".asInstanceOf[choose]
  
  @js.native
  sealed trait complete
    extends StObject
       with SearchStatus
  @scala.inline
  def complete: complete = "complete".asInstanceOf[complete]
  
  @js.native
  sealed trait error
    extends StObject
       with SearchStatus
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait no_data
    extends StObject
       with SearchStatus
  @scala.inline
  def no_data: no_data = "no_data".asInstanceOf[no_data]
  
  @js.native
  sealed trait poi
    extends StObject
       with DataType
  @scala.inline
  def poi: poi = "poi".asInstanceOf[poi]
  
  @js.native
  sealed trait select extends StObject
  @scala.inline
  def select: select = "select".asInstanceOf[select]
}
