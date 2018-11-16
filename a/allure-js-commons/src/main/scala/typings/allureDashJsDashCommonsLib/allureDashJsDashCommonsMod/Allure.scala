package typings
package allureDashJsDashCommonsLib.allureDashJsDashCommonsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Allure extends js.Object {
  def addAttachment(attachmentName: java.lang.String, buffer: js.Any, `type`: java.lang.String): scala.Unit = js.native
  def endCase(status: allureDashJsDashCommonsLib.allureDashJsDashCommonsMod.AllureNs.Status): scala.Unit = js.native
  def endCase(status: allureDashJsDashCommonsLib.allureDashJsDashCommonsMod.AllureNs.Status, err: js.Object): scala.Unit = js.native
  def endCase(
    status: allureDashJsDashCommonsLib.allureDashJsDashCommonsMod.AllureNs.Status,
    err: js.Object,
    timestamp: scala.Double
  ): scala.Unit = js.native
  def endStep(status: allureDashJsDashCommonsLib.allureDashJsDashCommonsMod.AllureNs.Status): scala.Unit = js.native
  def endStep(
    status: allureDashJsDashCommonsLib.allureDashJsDashCommonsMod.AllureNs.Status,
    timestamp: scala.Double
  ): scala.Unit = js.native
  def endSuite(): scala.Unit = js.native
  def endSuite(timestamp: scala.Double): scala.Unit = js.native
  def getCurrentSuite(): allureDashJsDashCommonsLib.allureDashJsDashCommonsMod.AllureNs.Suite = js.native
  def getCurrentTest(): allureDashJsDashCommonsLib.allureDashJsDashCommonsMod.AllureNs.Test = js.native
  def pendingCase(testName: java.lang.String): scala.Unit = js.native
  def pendingCase(testName: java.lang.String, timestamp: scala.Double): scala.Unit = js.native
  def setDescription(description: java.lang.String): scala.Unit = js.native
  def setDescription(description: java.lang.String, timestamp: scala.Double): scala.Unit = js.native
  def setOptions(options: allureDashJsDashCommonsLib.allureDashJsDashCommonsMod.AllureNs.Options): scala.Unit = js.native
  def startCase(testName: java.lang.String): scala.Unit = js.native
  def startCase(testName: java.lang.String, timestamp: scala.Double): scala.Unit = js.native
  def startStep(stepName: java.lang.String): scala.Unit = js.native
  def startStep(stepName: java.lang.String, timestamp: scala.Double): scala.Unit = js.native
  def startSuite(suiteName: java.lang.String): scala.Unit = js.native
  def startSuite(suiteName: java.lang.String, timestamp: scala.Double): scala.Unit = js.native
}

