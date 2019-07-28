package typings.adone.adoneNs.utilNs.throttleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.util.throttle.RateLimiter")
@js.native
class RateLimiter () extends js.Object {
  def this(tokensPerInterval: Double) = this()
  def this(tokensPerInterval: Double, interval: Double) = this()
  def this(tokensPerInterval: Double, interval: Double, fireImmediately: Boolean) = this()
  def getTokensRemaining(): Double = js.native
  def removeTokens(count: Double): js.Promise[Double] = js.native
  def tryRemoveTokens(count: Double): Boolean = js.native
}

