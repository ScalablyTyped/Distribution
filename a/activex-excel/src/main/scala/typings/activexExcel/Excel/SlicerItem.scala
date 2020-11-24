package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SlicerItem extends js.Object {
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Caption: String = js.native
  
  val Creator: XlCreator = js.native
  
  @JSName("Excel.SlicerItem_typekey")
  var ExcelDotSlicerItem_typekey: SlicerItem = js.native
  
  val HasData: Boolean = js.native
  
  val Name: String = js.native
  
  val Parent: SlicerCache = js.native
  
  var Selected: Boolean = js.native
  
  val SourceName: js.Any = js.native
  
  val SourceNameStandard: String = js.native
  
  val Value: String = js.native
}
object SlicerItem {
  
  @scala.inline
  def apply(
    Application: Application,
    Caption: String,
    Creator: XlCreator,
    ExcelDotSlicerItem_typekey: SlicerItem,
    HasData: Boolean,
    Name: String,
    Parent: SlicerCache,
    Selected: Boolean,
    SourceName: js.Any,
    SourceNameStandard: String,
    Value: String
  ): SlicerItem = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Caption = Caption.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], HasData = HasData.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Selected = Selected.asInstanceOf[js.Any], SourceName = SourceName.asInstanceOf[js.Any], SourceNameStandard = SourceNameStandard.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.SlicerItem_typekey")(ExcelDotSlicerItem_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlicerItem]
  }
  
  @scala.inline
  implicit class SlicerItemOps[Self <: SlicerItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaption(value: String): Self = this.set("Caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: XlCreator): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcelDotSlicerItem_typekey(value: SlicerItem): Self = this.set("Excel.SlicerItem_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasData(value: Boolean): Self = this.set("HasData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: SlicerCache): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("Selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceName(value: js.Any): Self = this.set("SourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceNameStandard(value: String): Self = this.set("SourceNameStandard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
}
