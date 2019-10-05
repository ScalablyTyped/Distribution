package typings.activexDashOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.ScopeFolder")
@js.native
class ScopeFolder protected () extends js.Object {
  val Application: js.Any = js.native
  val Creator: Double = js.native
  val Name: String = js.native
  var `Office.ScopeFolder_typekey`: ScopeFolder = js.native
  val Path: String = js.native
  @JSName("ScopeFolders")
  val ScopeFolders_Original: ScopeFolders = js.native
  def AddToSearchFolders(): Unit = js.native
  def ScopeFolders(Index: Double): ScopeFolder = js.native
}

