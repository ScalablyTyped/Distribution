package typings.amapJsApiTransfer

import typings.amapJsApiTransfer.AMap.Transfer.SearchStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object amapJsApiTransferStrings {
  
  @scala.inline
  def BUS: BUS = "BUS".asInstanceOf[BUS]
  
  @scala.inline
  def METRO_RAIL: METRO_RAIL = "METRO_RAIL".asInstanceOf[METRO_RAIL]
  
  @scala.inline
  def RAILWAY: RAILWAY = "RAILWAY".asInstanceOf[RAILWAY]
  
  @scala.inline
  def SUBWAY: SUBWAY = "SUBWAY".asInstanceOf[SUBWAY]
  
  @scala.inline
  def TAXI: TAXI = "TAXI".asInstanceOf[TAXI]
  
  @scala.inline
  def WALK: WALK = "WALK".asInstanceOf[WALK]
  
  @scala.inline
  def all: all = "all".asInstanceOf[all]
  
  @scala.inline
  def base: base = "base".asInstanceOf[base]
  
  @scala.inline
  def complete: complete = "complete".asInstanceOf[complete]
  
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @scala.inline
  def no_data: no_data = "no_data".asInstanceOf[no_data]
  
  @scala.inline
  def start: start = "start".asInstanceOf[start]
  
  @js.native
  sealed trait BUS extends js.Object
  
  @js.native
  sealed trait METRO_RAIL extends js.Object
  
  @js.native
  sealed trait RAILWAY extends js.Object
  
  @js.native
  sealed trait SUBWAY extends js.Object
  
  @js.native
  sealed trait TAXI extends js.Object
  
  @js.native
  sealed trait WALK extends js.Object
  
  @js.native
  sealed trait all extends js.Object
  
  @js.native
  sealed trait base extends js.Object
  
  @js.native
  sealed trait complete extends SearchStatus
  
  @js.native
  sealed trait end extends js.Object
  
  @js.native
  sealed trait error extends SearchStatus
  
  @js.native
  sealed trait no_data extends SearchStatus
  
  @js.native
  sealed trait start extends js.Object
}
