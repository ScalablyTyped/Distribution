package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublishObject extends js.Object {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  var FileName: String = js.native
  
  var HTMLVersion: PpHTMLVersion = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("PowerPoint.PublishObject_typekey")
  var PowerPointDotPublishObject_typekey: PublishObject = js.native
  
  def Publish(): Unit = js.native
  
  var RangeEnd: Double = js.native
  
  var RangeStart: Double = js.native
  
  var SlideShowName: String = js.native
  
  var SourceType: PpPublishSourceType = js.native
  
  var SpeakerNotes: MsoTriState = js.native
}
object PublishObject {
  
  @scala.inline
  def apply(
    Application: Application,
    FileName: String,
    HTMLVersion: PpHTMLVersion,
    Parent: js.Any,
    PowerPointDotPublishObject_typekey: PublishObject,
    Publish: () => Unit,
    RangeEnd: Double,
    RangeStart: Double,
    SlideShowName: String,
    SourceType: PpPublishSourceType,
    SpeakerNotes: MsoTriState
  ): PublishObject = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], FileName = FileName.asInstanceOf[js.Any], HTMLVersion = HTMLVersion.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Publish = js.Any.fromFunction0(Publish), RangeEnd = RangeEnd.asInstanceOf[js.Any], RangeStart = RangeStart.asInstanceOf[js.Any], SlideShowName = SlideShowName.asInstanceOf[js.Any], SourceType = SourceType.asInstanceOf[js.Any], SpeakerNotes = SpeakerNotes.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.PublishObject_typekey")(PowerPointDotPublishObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishObject]
  }
  
  @scala.inline
  implicit class PublishObjectOps[Self <: PublishObject] (val x: Self) extends AnyVal {
    
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
    def setFileName(value: String): Self = this.set("FileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHTMLVersion(value: PpHTMLVersion): Self = this.set("HTMLVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotPublishObject_typekey(value: PublishObject): Self = this.set("PowerPoint.PublishObject_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublish(value: () => Unit): Self = this.set("Publish", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRangeEnd(value: Double): Self = this.set("RangeEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeStart(value: Double): Self = this.set("RangeStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlideShowName(value: String): Self = this.set("SlideShowName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceType(value: PpPublishSourceType): Self = this.set("SourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeakerNotes(value: MsoTriState): Self = this.set("SpeakerNotes", value.asInstanceOf[js.Any])
  }
}
