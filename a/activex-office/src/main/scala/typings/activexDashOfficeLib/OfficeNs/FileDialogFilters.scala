package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileDialogFilters extends js.Object {
  val Application: js.Any = js.native
  val Count: scala.Double = js.native
  val Creator: scala.Double = js.native
  val Parent: js.Any = js.native
  def apply(Index: scala.Double): FileDialogFilter = js.native
  def Add(Description: java.lang.String, Extensions: java.lang.String): FileDialogFilter = js.native
  def Add(Description: java.lang.String, Extensions: java.lang.String, Position: scala.Double): FileDialogFilter = js.native
  def Clear(): scala.Unit = js.native
  def Delete(): scala.Unit = js.native
  def Delete(filter: js.Any): scala.Unit = js.native
  def Item(Index: scala.Double): FileDialogFilter = js.native
}

