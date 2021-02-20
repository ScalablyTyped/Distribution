package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PickerResult extends StObject {
  
  val Application: js.Any = js.native
  
  val Creator: Double = js.native
  
  var DisplayName: String = js.native
  
  val DuplicateResults: js.Any = js.native
  
  def Fields(Index: Double): PickerField = js.native
  @JSName("Fields")
  var Fields_Original: PickerFields = js.native
  
  val Id: String = js.native
  
  var ItemData: js.Any = js.native
  
  @JSName("Office.PickerResult_typekey")
  var OfficeDotPickerResult_typekey: PickerResult = js.native
  
  var SIPId: String = js.native
  
  var SubItems: js.Any = js.native
  
  var Type: String = js.native
}
