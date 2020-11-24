package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoOrientation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PageSetup extends js.Object {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  var FirstSlideNumber: Double = js.native
  
  var NotesOrientation: MsoOrientation = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("PowerPoint.PageSetup_typekey")
  var PowerPointDotPageSetup_typekey: PageSetup = js.native
  
  var SlideHeight: Double = js.native
  
  var SlideOrientation: MsoOrientation = js.native
  
  var SlideSize: PpSlideSizeType = js.native
  
  var SlideWidth: Double = js.native
}
object PageSetup {
  
  @scala.inline
  def apply(
    Application: Application,
    FirstSlideNumber: Double,
    NotesOrientation: MsoOrientation,
    Parent: js.Any,
    PowerPointDotPageSetup_typekey: PageSetup,
    SlideHeight: Double,
    SlideOrientation: MsoOrientation,
    SlideSize: PpSlideSizeType,
    SlideWidth: Double
  ): PageSetup = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], FirstSlideNumber = FirstSlideNumber.asInstanceOf[js.Any], NotesOrientation = NotesOrientation.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], SlideHeight = SlideHeight.asInstanceOf[js.Any], SlideOrientation = SlideOrientation.asInstanceOf[js.Any], SlideSize = SlideSize.asInstanceOf[js.Any], SlideWidth = SlideWidth.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.PageSetup_typekey")(PowerPointDotPageSetup_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageSetup]
  }
  
  @scala.inline
  implicit class PageSetupOps[Self <: PageSetup] (val x: Self) extends AnyVal {
    
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
    def setFirstSlideNumber(value: Double): Self = this.set("FirstSlideNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotesOrientation(value: MsoOrientation): Self = this.set("NotesOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotPageSetup_typekey(value: PageSetup): Self = this.set("PowerPoint.PageSetup_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlideHeight(value: Double): Self = this.set("SlideHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlideOrientation(value: MsoOrientation): Self = this.set("SlideOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlideSize(value: PpSlideSizeType): Self = this.set("SlideSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlideWidth(value: Double): Self = this.set("SlideWidth", value.asInstanceOf[js.Any])
  }
}
