package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.SmartDocument")
@js.native
class SmartDocument protected () extends js.Object {
  val Application: js.Any = js.native
  val Creator: scala.Double = js.native
  var `Office.SmartDocument_typekey`: SmartDocument = js.native
  var SolutionID: java.lang.String = js.native
  var SolutionURL: java.lang.String = js.native
  /** @param ConsiderAllSchemas [ConsiderAllSchemas=false] */
  def PickSolution(): scala.Unit = js.native
  /** @param ConsiderAllSchemas [ConsiderAllSchemas=false] */
  def PickSolution(ConsiderAllSchemas: scala.Boolean): scala.Unit = js.native
  def RefreshPane(): scala.Unit = js.native
}

