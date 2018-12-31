package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.PickerDialog")
@js.native
class PickerDialog protected () extends js.Object {
  val Application: js.Any = js.native
  val Creator: scala.Double = js.native
  var DataHandlerId: java.lang.String = js.native
  var `Office.PickerDialog_typekey`: PickerDialog = js.native
  @JSName("Properties")
  val Properties_Original: PickerProperties = js.native
  var Title: java.lang.String = js.native
  def CreatePickerResults(): PickerResults = js.native
  def Properties(Index: scala.Double): PickerProperty = js.native
  def Resolve(TokenText: java.lang.String, duplicateDlgMode: scala.Double): PickerResults = js.native
  /**
    * @param IsMultiSelect [IsMultiSelect=true]
    * @param ExistingResults [ExistingResults=0]
    */
  def Show(): PickerResults = js.native
  def Show(IsMultiSelect: scala.Boolean): PickerResults = js.native
  def Show(IsMultiSelect: scala.Boolean, ExistingResults: PickerResults): PickerResults = js.native
}

