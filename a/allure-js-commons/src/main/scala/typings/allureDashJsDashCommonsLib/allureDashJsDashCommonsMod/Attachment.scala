package typings
package allureDashJsDashCommonsLib.allureDashJsDashCommonsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("allure-js-commons", "Attachment")
@js.native
class Attachment protected () extends js.Object {
  def this(title: java.lang.String, source: js.Any, size: scala.Double, mime: java.lang.String) = this()
  def addAttachment(attachment: Attachment): scala.Unit = js.native
  def addStep(step: Step): scala.Unit = js.native
  def end(status: Status, error: stdLib.Error): scala.Unit = js.native
  def end(status: Status, error: stdLib.Error, timestamp: scala.Double): scala.Unit = js.native
  def toXML(): java.lang.String = js.native
}

