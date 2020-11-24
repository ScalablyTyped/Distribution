package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartDocument extends js.Object {
  
  val Application: js.Any = js.native
  
  val Creator: Double = js.native
  
  @JSName("Office.SmartDocument_typekey")
  var OfficeDotSmartDocument_typekey: SmartDocument = js.native
  
  /** @param ConsiderAllSchemas [ConsiderAllSchemas=false] */
  def PickSolution(): Unit = js.native
  def PickSolution(ConsiderAllSchemas: Boolean): Unit = js.native
  
  def RefreshPane(): Unit = js.native
  
  var SolutionID: String = js.native
  
  var SolutionURL: String = js.native
}
