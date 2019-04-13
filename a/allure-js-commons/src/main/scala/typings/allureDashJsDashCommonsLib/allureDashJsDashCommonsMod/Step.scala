package typings
package allureDashJsDashCommonsLib.allureDashJsDashCommonsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("allure-js-commons", "Step")
@js.native
class Step protected () extends js.Object {
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, timestamp: scala.Double) = this()
  def addAttachment(attachment: Attachment): scala.Unit = js.native
  def addStep(step: Step): scala.Unit = js.native
  def end(status: Status, error: stdLib.Error): scala.Unit = js.native
  def end(status: Status, error: stdLib.Error, timestamp: scala.Double): scala.Unit = js.native
  def toXML(): java.lang.String = js.native
}

