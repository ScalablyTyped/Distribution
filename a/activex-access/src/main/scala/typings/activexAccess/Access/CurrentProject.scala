package typings.activexAccess.Access

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CurrentProject extends StObject {
  
  val AccessConnection: typings.activexAdodb.ADODB.Connection = js.native
  
  /* private */ @JSName("Access.CurrentProject_typekey")
  var AccessDotCurrentProject_typekey: CurrentProject = js.native
  
  def AddSharedImage(SharedImageName: String, FileName: String): Unit = js.native
  
  def AllDataAccessPages(var_0: String): AccessObject = js.native
  def AllDataAccessPages(var_0: Double): AccessObject = js.native
  @JSName("AllDataAccessPages")
  val AllDataAccessPages_Original: AccessObjects = js.native
  
  def AllForms(var_0: String): AccessObject = js.native
  def AllForms(var_0: Double): AccessObject = js.native
  @JSName("AllForms")
  val AllForms_Original: AccessObjects = js.native
  
  def AllMacros(var_0: String): AccessObject = js.native
  def AllMacros(var_0: Double): AccessObject = js.native
  @JSName("AllMacros")
  val AllMacros_Original: AccessObjects = js.native
  
  def AllModules(var_0: String): AccessObject = js.native
  def AllModules(var_0: Double): AccessObject = js.native
  @JSName("AllModules")
  val AllModules_Original: AccessObjects = js.native
  
  def AllReports(var_0: String): AccessObject = js.native
  def AllReports(var_0: Double): AccessObject = js.native
  @JSName("AllReports")
  val AllReports_Original: AccessObjects = js.native
  
  val Application: typings.activexAccess.Access.Application = js.native
  
  val BaseConnectionString: String = js.native
  
  def CloseConnection(): Unit = js.native
  
  val Connection: typings.activexAdodb.ADODB.Connection = js.native
  
  val FileFormat: AcFileFormat = js.native
  
  val FullName: String = js.native
  
  def ImportExportSpecifications(Index: String): ImportExportSpecification = js.native
  def ImportExportSpecifications(Index: Double): ImportExportSpecification = js.native
  @JSName("ImportExportSpecifications")
  val ImportExportSpecifications_Original: ImportExportSpecifications = js.native
  
  val IsConnected: Boolean = js.native
  
  def IsMemberSafe(dispid: Double): Boolean = js.native
  
  val IsTrusted: Boolean = js.native
  
  val IsWeb: Boolean = js.native
  
  val Name: String = js.native
  
  def OpenConnection(): Unit = js.native
  def OpenConnection(BaseConnectionString: String): Unit = js.native
  def OpenConnection(BaseConnectionString: String, UserID: String): Unit = js.native
  def OpenConnection(BaseConnectionString: String, UserID: String, Password: String): Unit = js.native
  def OpenConnection(BaseConnectionString: String, UserID: Unit, Password: String): Unit = js.native
  def OpenConnection(BaseConnectionString: Unit, UserID: String): Unit = js.native
  def OpenConnection(BaseConnectionString: Unit, UserID: String, Password: String): Unit = js.native
  def OpenConnection(BaseConnectionString: Unit, UserID: Unit, Password: String): Unit = js.native
  
  val Parent: js.Any = js.native
  
  val Path: String = js.native
  
  val ProjectType: AcProjectType = js.native
  
  def Properties(Index: String): AccessObjectProperty = js.native
  def Properties(Index: Double): AccessObjectProperty = js.native
  @JSName("Properties")
  val Properties_Original: AccessObjectProperties = js.native
  
  var RemovePersonalInformation: Boolean = js.native
  
  def Resources(Index: Double): SharedResource = js.native
  @JSName("Resources")
  val Resources_Original: SharedResources = js.native
  
  def UpdateDependencyInfo(): Unit = js.native
  
  val WebSite: String = js.native
}
