package typings.activexOffice.global.Office

import typings.activexOffice.Office.PickerFields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Office.PickerResult")
@js.native
/* private */ class PickerResult ()
  extends StObject
     with typings.activexOffice.Office.PickerResult {
  
  /* CompleteClass */
  override val Application: js.Any = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  var DisplayName: String = js.native
  
  /* CompleteClass */
  override val DuplicateResults: js.Any = js.native
  
  /* CompleteClass */
  override def Fields(Index: Double): typings.activexOffice.Office.PickerField = js.native
  /* CompleteClass */
  @JSName("Fields")
  var Fields_Original: PickerFields = js.native
  
  /* CompleteClass */
  override val Id: String = js.native
  
  /* CompleteClass */
  var ItemData: js.Any = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Office.PickerResult_typekey")
  var OfficeDotPickerResult_typekey: typings.activexOffice.Office.PickerResult = js.native
  
  /* CompleteClass */
  var SIPId: String = js.native
  
  /* CompleteClass */
  var SubItems: js.Any = js.native
  
  /* CompleteClass */
  var Type: String = js.native
}
