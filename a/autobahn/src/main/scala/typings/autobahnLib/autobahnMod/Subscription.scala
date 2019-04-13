package typings
package autobahnLib.autobahnMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("autobahn", "Subscription")
@js.native
class Subscription () extends ISubscription {
  def this(topic: java.lang.String) = this()
  def this(topic: java.lang.String, handler: SubscribeHandler) = this()
  def this(topic: java.lang.String, handler: SubscribeHandler, options: ISubscribeOptions) = this()
  def this(topic: java.lang.String, handler: SubscribeHandler, options: ISubscribeOptions, session: Session) = this()
  def this(topic: java.lang.String, handler: SubscribeHandler, options: ISubscribeOptions, session: Session, id: scala.Double) = this()
}

