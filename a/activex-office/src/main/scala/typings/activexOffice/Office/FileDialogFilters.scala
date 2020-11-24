package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileDialogFilters extends js.Object {
  
  def apply(Index: Double): FileDialogFilter = js.native
  
  def Add(Description: String, Extensions: String): FileDialogFilter = js.native
  def Add(Description: String, Extensions: String, Position: Double): FileDialogFilter = js.native
  
  val Application: js.Any = js.native
  
  def Clear(): Unit = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Delete(): Unit = js.native
  def Delete(filter: js.Any): Unit = js.native
  
  def Item(Index: Double): FileDialogFilter = js.native
  
  val Parent: js.Any = js.native
}
