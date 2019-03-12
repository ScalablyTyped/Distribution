package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Access.CurrentProject")
@js.native
class CurrentProject protected () extends js.Object {
  var `Access.CurrentProject_typekey`: CurrentProject = js.native
  val AccessConnection: activexDashAdodbLib.ADODBNs.Connection = js.native
  @JSName("AllDataAccessPages")
  val AllDataAccessPages_Original: AccessObjects = js.native
  @JSName("AllForms")
  val AllForms_Original: AccessObjects = js.native
  @JSName("AllMacros")
  val AllMacros_Original: AccessObjects = js.native
  @JSName("AllModules")
  val AllModules_Original: AccessObjects = js.native
  @JSName("AllReports")
  val AllReports_Original: AccessObjects = js.native
  val Application: activexDashAccessLib.AccessNs.Application = js.native
  val BaseConnectionString: java.lang.String = js.native
  val Connection: activexDashAdodbLib.ADODBNs.Connection = js.native
  val FileFormat: AcFileFormat = js.native
  val FullName: java.lang.String = js.native
  @JSName("ImportExportSpecifications")
  val ImportExportSpecifications_Original: ImportExportSpecifications = js.native
  val IsConnected: scala.Boolean = js.native
  val IsTrusted: scala.Boolean = js.native
  val IsWeb: scala.Boolean = js.native
  val Name: java.lang.String = js.native
  val Parent: js.Any = js.native
  val Path: java.lang.String = js.native
  val ProjectType: AcProjectType = js.native
  @JSName("Properties")
  val Properties_Original: AccessObjectProperties = js.native
  var RemovePersonalInformation: scala.Boolean = js.native
  @JSName("Resources")
  val Resources_Original: SharedResources = js.native
  val WebSite: java.lang.String = js.native
  def AddSharedImage(SharedImageName: java.lang.String, FileName: java.lang.String): scala.Unit = js.native
  def AllDataAccessPages(var_0: java.lang.String): AccessObject = js.native
  def AllDataAccessPages(var_0: scala.Double): AccessObject = js.native
  def AllForms(var_0: java.lang.String): AccessObject = js.native
  def AllForms(var_0: scala.Double): AccessObject = js.native
  def AllMacros(var_0: java.lang.String): AccessObject = js.native
  def AllMacros(var_0: scala.Double): AccessObject = js.native
  def AllModules(var_0: java.lang.String): AccessObject = js.native
  def AllModules(var_0: scala.Double): AccessObject = js.native
  def AllReports(var_0: java.lang.String): AccessObject = js.native
  def AllReports(var_0: scala.Double): AccessObject = js.native
  def CloseConnection(): scala.Unit = js.native
  def ImportExportSpecifications(Index: java.lang.String): ImportExportSpecification = js.native
  def ImportExportSpecifications(Index: scala.Double): ImportExportSpecification = js.native
  def IsMemberSafe(dispid: scala.Double): scala.Boolean = js.native
  def OpenConnection(): scala.Unit = js.native
  def OpenConnection(BaseConnectionString: java.lang.String): scala.Unit = js.native
  def OpenConnection(BaseConnectionString: java.lang.String, UserID: java.lang.String): scala.Unit = js.native
  def OpenConnection(BaseConnectionString: java.lang.String, UserID: java.lang.String, Password: java.lang.String): scala.Unit = js.native
  def Properties(Index: java.lang.String): AccessObjectProperty = js.native
  def Properties(Index: scala.Double): AccessObjectProperty = js.native
  def Resources(Index: scala.Double): SharedResource = js.native
  def UpdateDependencyInfo(): scala.Unit = js.native
}

