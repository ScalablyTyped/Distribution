package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartTagRecognizer extends js.Object {
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Creator: XlCreator = js.native
  
  var Enabled: Boolean = js.native
  
  @JSName("Excel.SmartTagRecognizer_typekey")
  var ExcelDotSmartTagRecognizer_typekey: SmartTagRecognizer = js.native
  
  val FullName: String = js.native
  
  val Parent: js.Any = js.native
  
  val _Default: String = js.native
  
  val progID: String = js.native
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
  implicit class SmartTagRecognizerOps[Self <: SmartTagRecognizer] (val x: Self) extends AnyVal {
    
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
    def setCreator(value: XlCreator): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcelDotSmartTagRecognizer_typekey(value: SmartTagRecognizer): Self = this.set("Excel.SmartTagRecognizer_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullName(value: String): Self = this.set("FullName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_Default(value: String): Self = this.set("_Default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgID(value: String): Self = this.set("progID", value.asInstanceOf[js.Any])
  }
}
