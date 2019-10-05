package typings.amapDashJsDashApiDashAutocomplete

import typings.amapDashJsDashApiDashAutocomplete.AMap.Autocomplete.DataType
import typings.amapDashJsDashApiDashAutocomplete.AMap.Autocomplete.SearchStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object amapDashJsDashApiDashAutocompleteStrings {
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
}

