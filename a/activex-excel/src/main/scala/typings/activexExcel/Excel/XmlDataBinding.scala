package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XmlDataBinding extends js.Object {
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  def ClearSettings(): Unit = js.native
  
  val Creator: XlCreator = js.native
  
  @JSName("Excel.XmlDataBinding_typekey")
  var ExcelDotXmlDataBinding_typekey: XmlDataBinding = js.native
  
  def LoadSettings(Url: String): Unit = js.native
  
  val Parent: js.Any = js.native
  
  def Refresh(): XlXmlImportResult = js.native
  
  val SourceUrl: String = js.native
  
  val _Default: String = js.native
}
object XmlDataBinding {
  
  @scala.inline
  def apply(
    Application: Application,
    ClearSettings: () => Unit,
    Creator: XlCreator,
    ExcelDotXmlDataBinding_typekey: XmlDataBinding,
    LoadSettings: String => Unit,
    Parent: js.Any,
    Refresh: () => XlXmlImportResult,
    SourceUrl: String,
    _Default: String
  ): XmlDataBinding = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], ClearSettings = js.Any.fromFunction0(ClearSettings), Creator = Creator.asInstanceOf[js.Any], LoadSettings = js.Any.fromFunction1(LoadSettings), Parent = Parent.asInstanceOf[js.Any], Refresh = js.Any.fromFunction0(Refresh), SourceUrl = SourceUrl.asInstanceOf[js.Any], _Default = _Default.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.XmlDataBinding_typekey")(ExcelDotXmlDataBinding_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[XmlDataBinding]
  }
  
  @scala.inline
  implicit class XmlDataBindingOps[Self <: XmlDataBinding] (val x: Self) extends AnyVal {
    
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
    def setClearSettings(value: () => Unit): Self = this.set("ClearSettings", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreator(value: XlCreator): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcelDotXmlDataBinding_typekey(value: XmlDataBinding): Self = this.set("Excel.XmlDataBinding_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadSettings(value: String => Unit): Self = this.set("LoadSettings", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefresh(value: () => XlXmlImportResult): Self = this.set("Refresh", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSourceUrl(value: String): Self = this.set("SourceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_Default(value: String): Self = this.set("_Default", value.asInstanceOf[js.Any])
  }
}
