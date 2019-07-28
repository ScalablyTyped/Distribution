package typings.activexDashInfopath.InfoPathNs

import typings.activexDashAdodb.ADODBNs.Connection
import typings.activexDashAdodb.ADODBNs.Recordset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("InfoPath.Application")
@js.native
class Application protected () extends js.Object {
  val ActiveWindow: Window = js.native
  var `InfoPath.Application_typekey`: Application = js.native
  val LanguageSettings: js.Any = js.native
  val MachineOnlineState: XdMachineOnlineState = js.native
  val Name: String = js.native
  val UsableHeight: Double = js.native
  val UsableWidth: Double = js.native
  val User: UserObject = js.native
  val Version: String = js.native
  val Windows: WindowsCollection = js.native
  val XDocuments: typings.activexDashInfopath.InfoPathNs.XDocuments = js.native
  def CacheSolution(bstrSolutionURI: String): Unit = js.native
  def FormatString(varInput: js.Any, bstrCategory: String, bstrOptions: String): String = js.native
  def IsDestinationReachable(bstrDestination: String): Boolean = js.native
  def NewADODBConnection(): Connection = js.native
  def NewADODBRecordset(): Recordset = js.native
  /** @param boolean [bForce=false] */
  def Quit(): Unit = js.native
  def Quit(bForce: Boolean): Unit = js.native
  /** @param string [bstrBehavior='overwrite'] */
  def RegisterSolution(bstrSolutionURL: String): Unit = js.native
  def RegisterSolution(bstrSolutionURL: String, bstrBehavior: String): Unit = js.native
  def UnregisterSolution(bstrSolutionURI: String): Unit = js.native
}

