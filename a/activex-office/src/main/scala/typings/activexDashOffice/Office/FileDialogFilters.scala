package typings.activexDashOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileDialogFilters extends js.Object {
  val Application: js.Any = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  def apply(Index: Double): FileDialogFilter = js.native
  def Add(Description: String, Extensions: String): FileDialogFilter = js.native
  def Add(Description: String, Extensions: String, Position: Double): FileDialogFilter = js.native
  def Clear(): Unit = js.native
  def Delete(): Unit = js.native
  def Delete(filter: js.Any): Unit = js.native
  def Item(Index: Double): FileDialogFilter = js.native
}

