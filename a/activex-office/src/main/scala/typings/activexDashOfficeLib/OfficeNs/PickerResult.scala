package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.PickerResult")
@js.native
class PickerResult protected () extends js.Object {
  val Application: js.Any = js.native
  val Creator: scala.Double = js.native
  var DisplayName: java.lang.String = js.native
  val DuplicateResults: js.Any = js.native
  @JSName("Fields")
  var Fields_Original: PickerFields = js.native
  val Id: java.lang.String = js.native
  var ItemData: js.Any = js.native
  var `Office.PickerResult_typekey`: PickerResult = js.native
  var SIPId: java.lang.String = js.native
  var SubItems: js.Any = js.native
  var Type: java.lang.String = js.native
  def Fields(Index: scala.Double): PickerField = js.native
}

