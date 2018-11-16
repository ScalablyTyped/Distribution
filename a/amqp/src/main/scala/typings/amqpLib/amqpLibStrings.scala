package typings
package amqpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object amqpLibStrings {
  @js.native
  sealed trait ack extends js.Object
  
  @js.native
  sealed trait direct extends js.Object
  
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait exchangeBindOk extends js.Object
  
  @js.native
  sealed trait exchangeUnbindOk extends js.Object
  
  @js.native
  sealed trait fanout extends js.Object
  
  @js.native
  sealed trait open extends js.Object
  
  @js.native
  sealed trait topic extends js.Object
  
  def ack: ack = "ack".asInstanceOf[ack]
  def direct: direct = "direct".asInstanceOf[direct]
  def error: error = "error".asInstanceOf[error]
  def exchangeBindOk: exchangeBindOk = "exchangeBindOk".asInstanceOf[exchangeBindOk]
  def exchangeUnbindOk: exchangeUnbindOk = "exchangeUnbindOk".asInstanceOf[exchangeUnbindOk]
  def fanout: fanout = "fanout".asInstanceOf[fanout]
  def open: open = "open".asInstanceOf[open]
  def topic: topic = "topic".asInstanceOf[topic]
}

