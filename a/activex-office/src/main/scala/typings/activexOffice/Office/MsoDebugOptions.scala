package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.MsoDebugOptions")
@js.native
class MsoDebugOptions protected () extends js.Object {
  val Application: js.Any = js.native
  val Creator: Double = js.native
  var FeatureReports: Double = js.native
  @JSName("Office.MsoDebugOptions_typekey")
  var OfficeDotMsoDebugOptions_typekey: MsoDebugOptions = js.native
  var OutputToDebugger: Boolean = js.native
  var OutputToFile: Boolean = js.native
  var OutputToMessageBox: Boolean = js.native
  val UnitTestManager: js.Any = js.native
  def AddIgnoredAssertTag(bstrTagToIgnore: String): Unit = js.native
  def RemoveIgnoredAssertTag(bstrTagToIgnore: String): Unit = js.native
}

