package typings
package allureDashJsDashCommonsLib.allureDashJsDashCommonsMod.AllureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Suite extends js.Object {
  var name: java.lang.String = js.native
  def addTest(test: Test): scala.Boolean = js.native
  def end(): scala.Unit = js.native
  def end(timestamp: scala.Double): scala.Unit = js.native
  def hasTests(): scala.Boolean = js.native
  def toXML(): java.lang.String = js.native
}

