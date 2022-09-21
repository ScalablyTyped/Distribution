package typings.architectFunctions

import typings.architectFunctions.httpMod.ArcHttp
import typings.architectFunctions.tablesMod.ArcTables
import typings.architectFunctions.webSocketMod.ArcWebSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@architect/functions", "events")
  @js.native
  val events: Todo = js.native
  
  @JSImport("@architect/functions", "http")
  @js.native
  val http: ArcHttp = js.native
  
  @JSImport("@architect/functions", "queues")
  @js.native
  val queues: Todo = js.native
  
  @JSImport("@architect/functions", "static")
  @js.native
  val static: Todo = js.native
  
  @JSImport("@architect/functions", "tables")
  @js.native
  val tables: ArcTables = js.native
  
  @JSImport("@architect/functions", "ws")
  @js.native
  val ws: ArcWebSocket = js.native
  
  type Todo = Any
}
