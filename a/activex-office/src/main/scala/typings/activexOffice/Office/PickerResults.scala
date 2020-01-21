package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PickerResults extends js.Object {
  val Application: js.Any = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  def apply(Index: Double): PickerResult = js.native
  /** @param SIPId [SIPId=''] */
  def Add(Id: String, DisplayName: String, Type: String): PickerResult = js.native
  def Add(Id: String, DisplayName: String, Type: String, SIPId: String): PickerResult = js.native
  def Add(Id: String, DisplayName: String, Type: String, SIPId: String, ItemData: js.Any): PickerResult = js.native
  def Add(Id: String, DisplayName: String, Type: String, SIPId: String, ItemData: js.Any, SubItems: js.Any): PickerResult = js.native
  def Item(Index: Double): PickerResult = js.native
}

