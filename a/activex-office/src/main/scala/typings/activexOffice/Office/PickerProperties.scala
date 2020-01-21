package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PickerProperties extends js.Object {
  val Application: js.Any = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  def apply(Index: Double): PickerProperty = js.native
  def Add(Id: String, Value: String, Type: MsoPickerField): PickerProperty = js.native
  def Item(Index: Double): PickerProperty = js.native
  def Remove(Id: String): Unit = js.native
}

