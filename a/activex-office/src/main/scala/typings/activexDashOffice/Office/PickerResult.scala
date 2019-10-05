package typings.activexDashOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.PickerResult")
@js.native
class PickerResult protected () extends js.Object {
  val Application: js.Any = js.native
  val Creator: Double = js.native
  var DisplayName: String = js.native
  val DuplicateResults: js.Any = js.native
  @JSName("Fields")
  var Fields_Original: PickerFields = js.native
  val Id: String = js.native
  var ItemData: js.Any = js.native
  var `Office.PickerResult_typekey`: PickerResult = js.native
  var SIPId: String = js.native
  var SubItems: js.Any = js.native
  var Type: String = js.native
  def Fields(Index: Double): PickerField = js.native
}

