package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.SmartDocument")
@js.native
class SmartDocument protected () extends js.Object {
  val Application: js.Any = js.native
  val Creator: Double = js.native
  @JSName("Office.SmartDocument_typekey")
  var OfficeDotSmartDocument_typekey: SmartDocument = js.native
  var SolutionID: String = js.native
  var SolutionURL: String = js.native
  /** @param ConsiderAllSchemas [ConsiderAllSchemas=false] */
  def PickSolution(): Unit = js.native
  def PickSolution(ConsiderAllSchemas: Boolean): Unit = js.native
  def RefreshPane(): Unit = js.native
}

