package typings
package autobahnLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object autobahnLibStrings {
  @js.native
  sealed trait first extends js.Object
  
  @js.native
  sealed trait last extends js.Object
  
  @js.native
  sealed trait longpoll
    extends autobahnLib.autobahnMod.DefaultTransportType
  
  @js.native
  sealed trait random extends js.Object
  
  @js.native
  sealed trait rawsocket
    extends autobahnLib.autobahnMod.DefaultTransportType
  
  @js.native
  sealed trait roundrobin extends js.Object
  
  @js.native
  sealed trait single extends js.Object
  
  @js.native
  sealed trait websocket
    extends autobahnLib.autobahnMod.DefaultTransportType
  
  @scala.inline
  def first: first = "first".asInstanceOf[first]
  @scala.inline
  def last: last = "last".asInstanceOf[last]
  @scala.inline
  def longpoll: longpoll = "longpoll".asInstanceOf[longpoll]
  @scala.inline
  def random: random = "random".asInstanceOf[random]
  @scala.inline
  def rawsocket: rawsocket = "rawsocket".asInstanceOf[rawsocket]
  @scala.inline
  def roundrobin: roundrobin = "roundrobin".asInstanceOf[roundrobin]
  @scala.inline
  def single: single = "single".asInstanceOf[single]
  @scala.inline
  def websocket: websocket = "websocket".asInstanceOf[websocket]
}

