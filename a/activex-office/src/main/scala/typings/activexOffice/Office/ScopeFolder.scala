package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScopeFolder extends js.Object {
  
  def AddToSearchFolders(): Unit = js.native
  
  val Application: js.Any = js.native
  
  val Creator: Double = js.native
  
  val Name: String = js.native
  
  @JSName("Office.ScopeFolder_typekey")
  var OfficeDotScopeFolder_typekey: ScopeFolder = js.native
  
  val Path: String = js.native
  
  def ScopeFolders(Index: Double): ScopeFolder = js.native
  @JSName("ScopeFolders")
  val ScopeFolders_Original: ScopeFolders = js.native
}
