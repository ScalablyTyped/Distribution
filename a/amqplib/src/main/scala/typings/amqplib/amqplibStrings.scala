package typings.amqplib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object amqplibStrings {
  
  @scala.inline
  def direct: direct = "direct".asInstanceOf[direct]
  
  @scala.inline
  def expired: expired = "expired".asInstanceOf[expired]
  
  @scala.inline
  def fanout: fanout = "fanout".asInstanceOf[fanout]
  
  @scala.inline
  def headers: headers = "headers".asInstanceOf[headers]
  
  @scala.inline
  def `match`: `match` = "match".asInstanceOf[`match`]
  
  @scala.inline
  def maxlen: maxlen = "maxlen".asInstanceOf[maxlen]
  
  @scala.inline
  def rejected: rejected = "rejected".asInstanceOf[rejected]
  
  @scala.inline
  def timestamp: timestamp = "timestamp".asInstanceOf[timestamp]
  
  @scala.inline
  def topic: topic = "topic".asInstanceOf[topic]
  
  @js.native
  sealed trait direct extends js.Object
  
  @js.native
  sealed trait expired extends js.Object
  
  @js.native
  sealed trait fanout extends js.Object
  
  @js.native
  sealed trait headers extends js.Object
  
  @js.native
  sealed trait `match` extends js.Object
  
  @js.native
  sealed trait maxlen extends js.Object
  
  @js.native
  sealed trait rejected extends js.Object
  
  @js.native
  sealed trait timestamp extends js.Object
  
  @js.native
  sealed trait topic extends js.Object
}
