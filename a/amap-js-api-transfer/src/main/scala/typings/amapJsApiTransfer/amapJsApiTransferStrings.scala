package typings.amapJsApiTransfer

import typings.amapJsApiTransfer.AMap.Transfer.SearchStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object amapJsApiTransferStrings {
  
  @js.native
  sealed trait BUS extends StObject
  inline def BUS: BUS = "BUS".asInstanceOf[BUS]
  
  @js.native
  sealed trait METRO_RAIL extends StObject
  inline def METRO_RAIL: METRO_RAIL = "METRO_RAIL".asInstanceOf[METRO_RAIL]
  
  @js.native
  sealed trait RAILWAY extends StObject
  inline def RAILWAY: RAILWAY = "RAILWAY".asInstanceOf[RAILWAY]
  
  @js.native
  sealed trait SUBWAY extends StObject
  inline def SUBWAY: SUBWAY = "SUBWAY".asInstanceOf[SUBWAY]
  
  @js.native
  sealed trait TAXI extends StObject
  inline def TAXI: TAXI = "TAXI".asInstanceOf[TAXI]
  
  @js.native
  sealed trait WALK extends StObject
  inline def WALK: WALK = "WALK".asInstanceOf[WALK]
  
  @js.native
  sealed trait all extends StObject
  inline def all: all = "all".asInstanceOf[all]
  
  @js.native
  sealed trait base extends StObject
  inline def base: base = "base".asInstanceOf[base]
  
  @js.native
  sealed trait complete
    extends StObject
       with SearchStatus
  inline def complete: complete = "complete".asInstanceOf[complete]
  
  @js.native
  sealed trait end extends StObject
  inline def end: end = "end".asInstanceOf[end]
  
  @js.native
  sealed trait error
    extends StObject
       with SearchStatus
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait no_data
    extends StObject
       with SearchStatus
  inline def no_data: no_data = "no_data".asInstanceOf[no_data]
  
  @js.native
  sealed trait start extends StObject
  inline def start: start = "start".asInstanceOf[start]
}
