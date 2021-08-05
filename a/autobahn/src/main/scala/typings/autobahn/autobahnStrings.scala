package typings.autobahn

import typings.autobahn.mod.DefaultTransportType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autobahnStrings {
  
  @js.native
  sealed trait first extends StObject
  inline def first: first = "first".asInstanceOf[first]
  
  @js.native
  sealed trait last extends StObject
  inline def last: last = "last".asInstanceOf[last]
  
  @js.native
  sealed trait longpoll
    extends StObject
       with DefaultTransportType
  inline def longpoll: longpoll = "longpoll".asInstanceOf[longpoll]
  
  @js.native
  sealed trait random extends StObject
  inline def random: random = "random".asInstanceOf[random]
  
  @js.native
  sealed trait rawsocket
    extends StObject
       with DefaultTransportType
  inline def rawsocket: rawsocket = "rawsocket".asInstanceOf[rawsocket]
  
  @js.native
  sealed trait roundrobin extends StObject
  inline def roundrobin: roundrobin = "roundrobin".asInstanceOf[roundrobin]
  
  @js.native
  sealed trait single extends StObject
  inline def single: single = "single".asInstanceOf[single]
  
  @js.native
  sealed trait websocket
    extends StObject
       with DefaultTransportType
  inline def websocket: websocket = "websocket".asInstanceOf[websocket]
}
