package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PickerProperties extends js.Object {
  val Application: js.Any = js.native
  val Count: scala.Double = js.native
  val Creator: scala.Double = js.native
  def apply(Index: scala.Double): PickerProperty = js.native
  def Add(Id: java.lang.String, Value: java.lang.String, Type: MsoPickerField): PickerProperty = js.native
  def Item(Index: scala.Double): PickerProperty = js.native
  def Remove(Id: java.lang.String): scala.Unit = js.native
}

