package typings.activexDashOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.PickerDialog")
@js.native
class PickerDialog protected () extends js.Object {
  val Application: js.Any = js.native
  val Creator: Double = js.native
  var DataHandlerId: String = js.native
  var `Office.PickerDialog_typekey`: PickerDialog = js.native
  @JSName("Properties")
  val Properties_Original: PickerProperties = js.native
  var Title: String = js.native
  def CreatePickerResults(): PickerResults = js.native
  def Properties(Index: Double): PickerProperty = js.native
  def Resolve(TokenText: String, duplicateDlgMode: Double): PickerResults = js.native
  /**
    * @param IsMultiSelect [IsMultiSelect=true]
    * @param ExistingResults [ExistingResults=0]
    */
  def Show(): PickerResults = js.native
  def Show(IsMultiSelect: Boolean): PickerResults = js.native
  def Show(IsMultiSelect: Boolean, ExistingResults: PickerResults): PickerResults = js.native
}

