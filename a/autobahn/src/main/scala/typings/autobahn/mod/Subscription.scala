package typings.autobahn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("autobahn", "Subscription")
@js.native
class Subscription () extends ISubscription {
  def this(topic: String) = this()
  def this(topic: String, handler: SubscribeHandler) = this()
  def this(topic: String, handler: SubscribeHandler, options: ISubscribeOptions) = this()
  def this(topic: String, handler: SubscribeHandler, options: ISubscribeOptions, session: Session) = this()
  def this(topic: String, handler: SubscribeHandler, options: ISubscribeOptions, session: Session, id: Double) = this()
}

