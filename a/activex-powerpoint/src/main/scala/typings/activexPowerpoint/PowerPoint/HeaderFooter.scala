package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeaderFooter extends js.Object {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  var Format: PpDateTimeFormat = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("PowerPoint.HeaderFooter_typekey")
  var PowerPointDotHeaderFooter_typekey: HeaderFooter = js.native
  
  var Text: String = js.native
  
  var UseFormat: MsoTriState = js.native
  
  var Visible: MsoTriState = js.native
}
object HeaderFooter {
  
  @scala.inline
  def apply(
    Application: Application,
    Format: PpDateTimeFormat,
    Parent: js.Any,
    PowerPointDotHeaderFooter_typekey: HeaderFooter,
    Text: String,
    UseFormat: MsoTriState,
    Visible: MsoTriState
  ): HeaderFooter = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], UseFormat = UseFormat.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.HeaderFooter_typekey")(PowerPointDotHeaderFooter_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderFooter]
  }
  
  @scala.inline
  implicit class HeaderFooterOps[Self <: HeaderFooter] (val x: Self) extends AnyVal {
    
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
    def setFormat(value: PpDateTimeFormat): Self = this.set("Format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotHeaderFooter_typekey(value: HeaderFooter): Self = this.set("PowerPoint.HeaderFooter_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("Text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseFormat(value: MsoTriState): Self = this.set("UseFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: MsoTriState): Self = this.set("Visible", value.asInstanceOf[js.Any])
  }
}
