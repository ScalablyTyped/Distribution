package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmartTagRecognizer extends StObject {
  
  val Application: typings.activexExcel.Excel.Application
  
  val Creator: XlCreator
  
  var Enabled: Boolean
  
  @JSName("Excel.SmartTagRecognizer_typekey")
  var ExcelDotSmartTagRecognizer_typekey: SmartTagRecognizer
  
  val FullName: String
  
  val Parent: js.Any
  
  val _Default: String
  
  val progID: String
}
object SmartTagRecognizer {
  
  @scala.inline
  def apply(
    Application: Application,
    Creator: XlCreator,
    Enabled: Boolean,
    ExcelDotSmartTagRecognizer_typekey: SmartTagRecognizer,
    FullName: String,
    Parent: js.Any,
    _Default: String,
    progID: String
  ): SmartTagRecognizer = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], FullName = FullName.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], _Default = _Default.asInstanceOf[js.Any], progID = progID.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.SmartTagRecognizer_typekey")(ExcelDotSmartTagRecognizer_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartTagRecognizer]
  }
  
  @scala.inline
  implicit class SmartTagRecognizerMutableBuilder[Self <: SmartTagRecognizer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcelDotSmartTagRecognizer_typekey(value: SmartTagRecognizer): Self = StObject.set(x, "Excel.SmartTagRecognizer_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullName(value: String): Self = StObject.set(x, "FullName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgID(value: String): Self = StObject.set(x, "progID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_Default(value: String): Self = StObject.set(x, "_Default", value.asInstanceOf[js.Any])
  }
}
