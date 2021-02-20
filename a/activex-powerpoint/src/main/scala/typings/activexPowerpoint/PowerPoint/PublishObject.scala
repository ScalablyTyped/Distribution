package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublishObject extends StObject {
  
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
  implicit class PublishObjectMutableBuilder[Self <: PublishObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileName(value: String): Self = StObject.set(x, "FileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHTMLVersion(value: PpHTMLVersion): Self = StObject.set(x, "HTMLVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotPublishObject_typekey(value: PublishObject): Self = StObject.set(x, "PowerPoint.PublishObject_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublish(value: () => Unit): Self = StObject.set(x, "Publish", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRangeEnd(value: Double): Self = StObject.set(x, "RangeEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeStart(value: Double): Self = StObject.set(x, "RangeStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlideShowName(value: String): Self = StObject.set(x, "SlideShowName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceType(value: PpPublishSourceType): Self = StObject.set(x, "SourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeakerNotes(value: MsoTriState): Self = StObject.set(x, "SpeakerNotes", value.asInstanceOf[js.Any])
  }
}
