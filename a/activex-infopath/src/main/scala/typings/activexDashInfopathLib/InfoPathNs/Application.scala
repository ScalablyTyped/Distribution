package typings
package activexDashInfopathLib.InfoPathNs

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
  val Name: java.lang.String = js.native
  val UsableHeight: scala.Double = js.native
  val UsableWidth: scala.Double = js.native
  val User: UserObject = js.native
  val Version: java.lang.String = js.native
  val Windows: WindowsCollection = js.native
  val XDocuments: activexDashInfopathLib.InfoPathNs.XDocuments = js.native
  def CacheSolution(bstrSolutionURI: java.lang.String): scala.Unit = js.native
  def FormatString(varInput: js.Any, bstrCategory: java.lang.String, bstrOptions: java.lang.String): java.lang.String = js.native
  def IsDestinationReachable(bstrDestination: java.lang.String): scala.Boolean = js.native
  def NewADODBConnection(): activexDashAdodbLib.ADODBNs.Connection = js.native
  def NewADODBRecordset(): activexDashAdodbLib.ADODBNs.Recordset = js.native
  /** @param boolean [bForce=false] */
  def Quit(): scala.Unit = js.native
  def Quit(bForce: scala.Boolean): scala.Unit = js.native
  /** @param string [bstrBehavior='overwrite'] */
  def RegisterSolution(bstrSolutionURL: java.lang.String): scala.Unit = js.native
  def RegisterSolution(bstrSolutionURL: java.lang.String, bstrBehavior: java.lang.String): scala.Unit = js.native
  def UnregisterSolution(bstrSolutionURI: java.lang.String): scala.Unit = js.native
}

