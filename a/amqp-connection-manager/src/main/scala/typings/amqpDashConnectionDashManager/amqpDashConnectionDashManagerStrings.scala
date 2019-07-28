package typings.amqpDashConnectionDashManager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object amqpDashConnectionDashManagerStrings {
  @js.native
  sealed trait close extends js.Object
  
  @js.native
  sealed trait connect extends js.Object
  
  @js.native
  sealed trait disconnect extends js.Object
  
  @js.native
  sealed trait error extends js.Object
  
  @scala.inline
  def close: close = "close".asInstanceOf[close]
  @scala.inline
  def connect: connect = "connect".asInstanceOf[connect]
  @scala.inline
  def disconnect: disconnect = "disconnect".asInstanceOf[disconnect]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
}

