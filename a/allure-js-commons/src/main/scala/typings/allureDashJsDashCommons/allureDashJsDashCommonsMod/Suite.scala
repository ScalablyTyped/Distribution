package typings.allureDashJsDashCommons.allureDashJsDashCommonsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("allure-js-commons", "Suite")
@js.native
class Suite protected () extends js.Object {
  def this(name: String) = this()
  def this(name: String, timestamp: Double) = this()
  var name: String = js.native
  def addTest(test: Test): Boolean = js.native
  def end(): Unit = js.native
  def end(timestamp: Double): Unit = js.native
  def hasTests(): Boolean = js.native
  def toXML(): String = js.native
}

