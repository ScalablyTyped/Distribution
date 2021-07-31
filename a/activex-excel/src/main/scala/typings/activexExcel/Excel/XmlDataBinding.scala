package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XmlDataBinding extends StObject {
  
  val Application: typings.activexExcel.Excel.Application
  
  def ClearSettings(): Unit
  
  val Creator: XlCreator
  
  @JSName("Excel.XmlDataBinding_typekey")
  var ExcelDotXmlDataBinding_typekey: XmlDataBinding
  
  def LoadSettings(Url: String): Unit
  
  val Parent: js.Any
  
  def Refresh(): XlXmlImportResult
  
  val SourceUrl: String
  
  val _Default: String
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
  implicit class XmlDataBindingMutableBuilder[Self <: XmlDataBinding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearSettings(value: () => Unit): Self = StObject.set(x, "ClearSettings", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcelDotXmlDataBinding_typekey(value: XmlDataBinding): Self = StObject.set(x, "Excel.XmlDataBinding_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadSettings(value: String => Unit): Self = StObject.set(x, "LoadSettings", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefresh(value: () => XlXmlImportResult): Self = StObject.set(x, "Refresh", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSourceUrl(value: String): Self = StObject.set(x, "SourceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_Default(value: String): Self = StObject.set(x, "_Default", value.asInstanceOf[js.Any])
  }
}
