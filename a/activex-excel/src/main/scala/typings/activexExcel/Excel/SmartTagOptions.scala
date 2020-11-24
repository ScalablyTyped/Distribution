package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartTagOptions extends js.Object {
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Creator: XlCreator = js.native
  
  var DisplaySmartTags: XlSmartTagDisplayMode = js.native
  
  var EmbedSmartTags: Boolean = js.native
  
  @JSName("Excel.SmartTagOptions_typekey")
  var ExcelDotSmartTagOptions_typekey: SmartTagOptions = js.native
  
  val Parent: js.Any = js.native
}
object SmartTagOptions {
  
  @scala.inline
  def apply(
    Application: Application,
    Creator: XlCreator,
    DisplaySmartTags: XlSmartTagDisplayMode,
    EmbedSmartTags: Boolean,
    ExcelDotSmartTagOptions_typekey: SmartTagOptions,
    Parent: js.Any
  ): SmartTagOptions = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], DisplaySmartTags = DisplaySmartTags.asInstanceOf[js.Any], EmbedSmartTags = EmbedSmartTags.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.SmartTagOptions_typekey")(ExcelDotSmartTagOptions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartTagOptions]
  }
  
  @scala.inline
  implicit class SmartTagOptionsOps[Self <: SmartTagOptions] (val x: Self) extends AnyVal {
    
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
    def setDisplaySmartTags(value: XlSmartTagDisplayMode): Self = this.set("DisplaySmartTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbedSmartTags(value: Boolean): Self = this.set("EmbedSmartTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcelDotSmartTagOptions_typekey(value: SmartTagOptions): Self = this.set("Excel.SmartTagOptions_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
  }
}
