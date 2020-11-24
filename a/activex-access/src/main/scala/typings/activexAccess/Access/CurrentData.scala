package typings.activexAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CurrentData extends js.Object {
  
  @JSName("Access.CurrentData_typekey")
  var AccessDotCurrentData_typekey: CurrentData = js.native
  
  def AllDatabaseDiagrams(var_0: String): AccessObject = js.native
  def AllDatabaseDiagrams(var_0: Double): AccessObject = js.native
  @JSName("AllDatabaseDiagrams")
  val AllDatabaseDiagrams_Original: AccessObjects = js.native
  
  def AllFunctions(var_0: String): AccessObject = js.native
  def AllFunctions(var_0: Double): AccessObject = js.native
  @JSName("AllFunctions")
  val AllFunctions_Original: AccessObjects = js.native
  
  def AllQueries(var_0: String): AccessObject = js.native
  def AllQueries(var_0: Double): AccessObject = js.native
  @JSName("AllQueries")
  val AllQueries_Original: AccessObjects = js.native
  
  def AllStoredProcedures(var_0: String): AccessObject = js.native
  def AllStoredProcedures(var_0: Double): AccessObject = js.native
  @JSName("AllStoredProcedures")
  val AllStoredProcedures_Original: AccessObjects = js.native
  
  def AllTables(var_0: String): AccessObject = js.native
  def AllTables(var_0: Double): AccessObject = js.native
  @JSName("AllTables")
  val AllTables_Original: AccessObjects = js.native
  
  def AllViews(var_0: String): AccessObject = js.native
  def AllViews(var_0: Double): AccessObject = js.native
  @JSName("AllViews")
  val AllViews_Original: AccessObjects = js.native
  
  def IsMemberSafe(dispid: Double): Boolean = js.native
}
