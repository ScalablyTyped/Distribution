package typings
package amqplibLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object amqplibLibStrings {
  @js.native
  sealed trait expired extends js.Object
  
  @js.native
  sealed trait maxlen extends js.Object
  
  @js.native
  sealed trait rejected extends js.Object
  
  @js.native
  sealed trait timestamp extends js.Object
  
  def expired: expired = "expired".asInstanceOf[expired]
  def maxlen: maxlen = "maxlen".asInstanceOf[maxlen]
  def rejected: rejected = "rejected".asInstanceOf[rejected]
  def timestamp: timestamp = "timestamp".asInstanceOf[timestamp]
}

