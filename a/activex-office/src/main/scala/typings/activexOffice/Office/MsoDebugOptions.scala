package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MsoDebugOptions extends js.Object {
  val Application: js.Any
  val Creator: Double
  var FeatureReports: Double
  @JSName("Office.MsoDebugOptions_typekey")
  var OfficeDotMsoDebugOptions_typekey: MsoDebugOptions
  var OutputToDebugger: Boolean
  var OutputToFile: Boolean
  var OutputToMessageBox: Boolean
  val UnitTestManager: js.Any
  def AddIgnoredAssertTag(bstrTagToIgnore: String): Unit
  def RemoveIgnoredAssertTag(bstrTagToIgnore: String): Unit
}

object MsoDebugOptions {
  @scala.inline
  def apply(
    AddIgnoredAssertTag: String => Unit,
    Application: js.Any,
    Creator: Double,
    FeatureReports: Double,
    OfficeDotMsoDebugOptions_typekey: MsoDebugOptions,
    OutputToDebugger: Boolean,
    OutputToFile: Boolean,
    OutputToMessageBox: Boolean,
    RemoveIgnoredAssertTag: String => Unit,
    UnitTestManager: js.Any
  ): MsoDebugOptions = {
    val __obj = js.Dynamic.literal(AddIgnoredAssertTag = js.Any.fromFunction1(AddIgnoredAssertTag), Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], FeatureReports = FeatureReports.asInstanceOf[js.Any], OutputToDebugger = OutputToDebugger.asInstanceOf[js.Any], OutputToFile = OutputToFile.asInstanceOf[js.Any], OutputToMessageBox = OutputToMessageBox.asInstanceOf[js.Any], RemoveIgnoredAssertTag = js.Any.fromFunction1(RemoveIgnoredAssertTag), UnitTestManager = UnitTestManager.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.MsoDebugOptions_typekey")(OfficeDotMsoDebugOptions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MsoDebugOptions]
  }
}

