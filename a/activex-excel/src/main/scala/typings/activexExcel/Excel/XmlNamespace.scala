package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XmlNamespace extends StObject {
  
  val Application: typings.activexExcel.Excel.Application
  
  val Creator: XlCreator
  
  @JSName("Excel.XmlNamespace_typekey")
  var ExcelDotXmlNamespace_typekey: XmlNamespace
  
  val Parent: js.Any
  
  val Prefix: String
  
  val Uri: String
  
  val _Default: String
}
object XmlNamespace {
  
  @scala.inline
  def apply(
    Application: Application,
    Creator: XlCreator,
    ExcelDotXmlNamespace_typekey: XmlNamespace,
    Parent: js.Any,
    Prefix: String,
    Uri: String,
    _Default: String
  ): XmlNamespace = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Prefix = Prefix.asInstanceOf[js.Any], Uri = Uri.asInstanceOf[js.Any], _Default = _Default.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.XmlNamespace_typekey")(ExcelDotXmlNamespace_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[XmlNamespace]
  }
  
  @scala.inline
  implicit class XmlNamespaceMutableBuilder[Self <: XmlNamespace] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcelDotXmlNamespace_typekey(value: XmlNamespace): Self = StObject.set(x, "Excel.XmlNamespace_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefix(value: String): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "Uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_Default(value: String): Self = StObject.set(x, "_Default", value.asInstanceOf[js.Any])
  }
}
