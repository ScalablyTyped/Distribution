package typings
package allureDashJsDashCommonsLib.allureDashJsDashCommonsMod.AllureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Step extends js.Object {
  def addAttachment(attachment: Attachment): scala.Unit = js.native
  def addStep(step: Step): scala.Unit = js.native
  def end(status: Status, error: stdLib.Error): scala.Unit = js.native
  def end(status: Status, error: stdLib.Error, timestamp: scala.Double): scala.Unit = js.native
  def toXML(): java.lang.String = js.native
}

