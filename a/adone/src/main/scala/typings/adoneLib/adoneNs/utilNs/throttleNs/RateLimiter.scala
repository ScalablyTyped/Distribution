package typings
package adoneLib.adoneNs.utilNs.throttleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.util.throttle.RateLimiter")
@js.native
class RateLimiter () extends js.Object {
  def this(tokensPerInterval: scala.Double) = this()
  def this(tokensPerInterval: scala.Double, interval: scala.Double) = this()
  def this(tokensPerInterval: scala.Double, interval: scala.Double, fireImmediately: scala.Boolean) = this()
  def getTokensRemaining(): scala.Double = js.native
  def removeTokens(count: scala.Double): js.Promise[scala.Double] = js.native
  def tryRemoveTokens(count: scala.Double): scala.Boolean = js.native
}

