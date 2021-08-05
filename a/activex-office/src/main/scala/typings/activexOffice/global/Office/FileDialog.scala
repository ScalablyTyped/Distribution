package typings.activexOffice.global.Office

import typings.activexOffice.Office.FileDialogFilters
import typings.activexOffice.Office.FileDialogSelectedItems
import typings.activexOffice.Office.MsoFileDialogType
import typings.activexOffice.Office.MsoFileDialogView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Office.FileDialog")
@js.native
/* private */ class FileDialog ()
  extends StObject
     with typings.activexOffice.Office.FileDialog {
  
  /* CompleteClass */
  var AllowMultiSelect: Boolean = js.native
  
  /* CompleteClass */
  override val Application: js.Any = js.native
  
  /* CompleteClass */
  var ButtonName: String = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  override val DialogType: MsoFileDialogType = js.native
  
  /* CompleteClass */
  override def Execute(): Unit = js.native
  
  /* CompleteClass */
  var FilterIndex: Double = js.native
  
  /* CompleteClass */
  override def Filters(Index: Double): typings.activexOffice.Office.FileDialogFilter = js.native
  /* CompleteClass */
  @JSName("Filters")
  override val Filters_Original: FileDialogFilters = js.native
  
  /* CompleteClass */
  var InitialFileName: String = js.native
  
  /* CompleteClass */
  var InitialView: MsoFileDialogView = js.native
  
  /* CompleteClass */
  override val Item: String = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Office.FileDialog_typekey")
  var OfficeDotFileDialog_typekey: typings.activexOffice.Office.FileDialog = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  override def SelectedItems(Index: Double): String = js.native
  /* CompleteClass */
  @JSName("SelectedItems")
  override val SelectedItems_Original: FileDialogSelectedItems = js.native
  
  /* CompleteClass */
  override def Show(): Double = js.native
  
  /* CompleteClass */
  var Title: String = js.native
}
