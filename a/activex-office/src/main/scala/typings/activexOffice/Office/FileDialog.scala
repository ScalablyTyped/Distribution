package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileDialog extends StObject {
  
  var AllowMultiSelect: Boolean
  
  val Application: Any
  
  var ButtonName: String
  
  val Creator: Double
  
  val DialogType: MsoFileDialogType
  
  def Execute(): Unit
  
  var FilterIndex: Double
  
  def Filters(Index: Double): FileDialogFilter
  @JSName("Filters")
  val Filters_Original: FileDialogFilters
  
  var InitialFileName: String
  
  var InitialView: MsoFileDialogView
  
  val Item: String
  
  /* private */ @JSName("Office.FileDialog_typekey")
  var OfficeDotFileDialog_typekey: FileDialog
  
  val Parent: Any
  
  def SelectedItems(Index: Double): String
  @JSName("SelectedItems")
  val SelectedItems_Original: FileDialogSelectedItems
  
  def Show(): Double
  
  var Title: String
}
object FileDialog {
  
  inline def apply(
    AllowMultiSelect: Boolean,
    Application: Any,
    ButtonName: String,
    Creator: Double,
    DialogType: MsoFileDialogType,
    Execute: () => Unit,
    FilterIndex: Double,
    Filters: FileDialogFilters,
    InitialFileName: String,
    InitialView: MsoFileDialogView,
    Item: String,
    OfficeDotFileDialog_typekey: FileDialog,
    Parent: Any,
    SelectedItems: FileDialogSelectedItems,
    Show: () => Double,
    Title: String
  ): FileDialog = {
    val __obj = js.Dynamic.literal(AllowMultiSelect = AllowMultiSelect.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], ButtonName = ButtonName.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], DialogType = DialogType.asInstanceOf[js.Any], Execute = js.Any.fromFunction0(Execute), FilterIndex = FilterIndex.asInstanceOf[js.Any], Filters = Filters.asInstanceOf[js.Any], InitialFileName = InitialFileName.asInstanceOf[js.Any], InitialView = InitialView.asInstanceOf[js.Any], Item = Item.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], SelectedItems = SelectedItems.asInstanceOf[js.Any], Show = js.Any.fromFunction0(Show), Title = Title.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.FileDialog_typekey")(OfficeDotFileDialog_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileDialog]
  }
  
  extension [Self <: FileDialog](x: Self) {
    
    inline def setAllowMultiSelect(value: Boolean): Self = StObject.set(x, "AllowMultiSelect", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setButtonName(value: String): Self = StObject.set(x, "ButtonName", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDialogType(value: MsoFileDialogType): Self = StObject.set(x, "DialogType", value.asInstanceOf[js.Any])
    
    inline def setExecute(value: () => Unit): Self = StObject.set(x, "Execute", js.Any.fromFunction0(value))
    
    inline def setFilterIndex(value: Double): Self = StObject.set(x, "FilterIndex", value.asInstanceOf[js.Any])
    
    inline def setFilters(value: FileDialogFilters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setInitialFileName(value: String): Self = StObject.set(x, "InitialFileName", value.asInstanceOf[js.Any])
    
    inline def setInitialView(value: MsoFileDialogView): Self = StObject.set(x, "InitialView", value.asInstanceOf[js.Any])
    
    inline def setItem(value: String): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
    
    inline def setOfficeDotFileDialog_typekey(value: FileDialog): Self = StObject.set(x, "Office.FileDialog_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setSelectedItems(value: FileDialogSelectedItems): Self = StObject.set(x, "SelectedItems", value.asInstanceOf[js.Any])
    
    inline def setShow(value: () => Double): Self = StObject.set(x, "Show", js.Any.fromFunction0(value))
    
    inline def setTitle(value: String): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
  }
}
