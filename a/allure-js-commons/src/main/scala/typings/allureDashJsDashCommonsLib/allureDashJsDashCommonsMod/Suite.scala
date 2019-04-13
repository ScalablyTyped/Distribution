package typings
package allureDashJsDashCommonsLib.allureDashJsDashCommonsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("allure-js-commons", "Suite")
@js.native
class Suite protected () extends js.Object {
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, timestamp: scala.Double) = this()
  var name: java.lang.String = js.native
  def addTest(test: Test): scala.Boolean = js.native
  def end(): scala.Unit = js.native
  def end(timestamp: scala.Double): scala.Unit = js.native
  def hasTests(): scala.Boolean = js.native
  def toXML(): java.lang.String = js.native
}

