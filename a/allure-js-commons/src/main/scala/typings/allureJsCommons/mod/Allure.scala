package typings.allureJsCommons.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Allure extends js.Object {
  
  def addAttachment(attachmentName: String, buffer: js.Any, `type`: String): Unit = js.native
  
  def endCase(status: Status): Unit = js.native
  def endCase(status: Status, err: js.UndefOr[scala.Nothing], timestamp: Double): Unit = js.native
  def endCase(status: Status, err: js.Object): Unit = js.native
  def endCase(status: Status, err: js.Object, timestamp: Double): Unit = js.native
  
  def endStep(status: Status): Unit = js.native
  def endStep(status: Status, timestamp: Double): Unit = js.native
  
  def endSuite(): Unit = js.native
  def endSuite(timestamp: Double): Unit = js.native
  
  def getCurrentSuite(): Suite = js.native
  
  def getCurrentTest(): Test = js.native
  
  def pendingCase(testName: String): Unit = js.native
  def pendingCase(testName: String, timestamp: Double): Unit = js.native
  
  def setDescription(description: String): Unit = js.native
  def setDescription(description: String, timestamp: Double): Unit = js.native
  
  def setOptions(options: Options): Unit = js.native
  
  def startCase(testName: String): Unit = js.native
  def startCase(testName: String, timestamp: Double): Unit = js.native
  
  def startStep(stepName: String): Unit = js.native
  def startStep(stepName: String, timestamp: Double): Unit = js.native
  
  def startSuite(suiteName: String): Unit = js.native
  def startSuite(suiteName: String, timestamp: Double): Unit = js.native
}
