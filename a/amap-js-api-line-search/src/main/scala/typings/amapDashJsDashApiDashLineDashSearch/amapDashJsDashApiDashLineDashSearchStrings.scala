package typings.amapDashJsDashApiDashLineDashSearch

import typings.amapDashJsDashApiDashLineDashSearch.AMap.LineSearch.SearchStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object amapDashJsDashApiDashLineDashSearchStrings {
  @js.native
  sealed trait all extends js.Object
  
  @js.native
  sealed trait base extends js.Object
  
  @js.native
  sealed trait complete extends SearchStatus
  
  @js.native
  sealed trait error extends SearchStatus
  
  @js.native
  sealed trait no_data extends SearchStatus
  
  @scala.inline
  def all: all = "all".asInstanceOf[all]
  @scala.inline
  def base: base = "base".asInstanceOf[base]
  @scala.inline
  def complete: complete = "complete".asInstanceOf[complete]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def no_data: no_data = "no_data".asInstanceOf[no_data]
}

