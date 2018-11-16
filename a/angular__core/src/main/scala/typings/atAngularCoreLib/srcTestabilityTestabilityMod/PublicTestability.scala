package typings
package atAngularCoreLib.srcTestabilityTestabilityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublicTestability extends js.Object {
  def findProviders(using: js.Any, provider: java.lang.String, exactMatch: scala.Boolean): js.Array[_] = js.native
  def isStable(): scala.Boolean = js.native
  def whenStable(callback: js.Function): scala.Unit = js.native
  def whenStable(callback: js.Function, timeout: scala.Double): scala.Unit = js.native
  def whenStable(callback: js.Function, timeout: scala.Double, updateCallback: js.Function): scala.Unit = js.native
}

