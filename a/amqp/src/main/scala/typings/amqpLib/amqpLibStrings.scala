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
  
  @scala.inline
  def ack: ack = "ack".asInstanceOf[ack]
  @scala.inline
  def direct: direct = "direct".asInstanceOf[direct]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def exchangeBindOk: exchangeBindOk = "exchangeBindOk".asInstanceOf[exchangeBindOk]
  @scala.inline
  def exchangeUnbindOk: exchangeUnbindOk = "exchangeUnbindOk".asInstanceOf[exchangeUnbindOk]
  @scala.inline
  def fanout: fanout = "fanout".asInstanceOf[fanout]
  @scala.inline
  def open: open = "open".asInstanceOf[open]
  @scala.inline
  def topic: topic = "topic".asInstanceOf[topic]
}

