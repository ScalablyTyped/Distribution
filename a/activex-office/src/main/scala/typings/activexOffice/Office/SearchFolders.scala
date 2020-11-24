package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchFolders extends js.Object {
  
  def apply(Index: Double): ScopeFolder = js.native
  
  def Add(ScopeFolder: ScopeFolder): Unit = js.native
  
  val Application: js.Any = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: Double): ScopeFolder = js.native
  
  def Remove(Index: Double): Unit = js.native
}
