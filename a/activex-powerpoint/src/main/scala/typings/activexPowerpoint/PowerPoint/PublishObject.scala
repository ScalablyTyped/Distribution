package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublishObject extends StObject {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application
  
  var FileName: String
  
  var HTMLVersion: PpHTMLVersion
  
  val Parent: Any
  
  /* private */ @JSName("PowerPoint.PublishObject_typekey")
  var PowerPointDotPublishObject_typekey: PublishObject
  
  def Publish(): Unit
  
  var RangeEnd: Double
  
  var RangeStart: Double
  
  var SlideShowName: String
  
  var SourceType: PpPublishSourceType
  
  var SpeakerNotes: MsoTriState
}
object PublishObject {
  
  inline def apply(
    Application: Application,
    FileName: String,
    HTMLVersion: PpHTMLVersion,
    Parent: Any,
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
  implicit open class MutableBuilder[Self <: PublishObject] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setFileName(value: String): Self = StObject.set(x, "FileName", value.asInstanceOf[js.Any])
    
    inline def setHTMLVersion(value: PpHTMLVersion): Self = StObject.set(x, "HTMLVersion", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotPublishObject_typekey(value: PublishObject): Self = StObject.set(x, "PowerPoint.PublishObject_typekey", value.asInstanceOf[js.Any])
    
    inline def setPublish(value: () => Unit): Self = StObject.set(x, "Publish", js.Any.fromFunction0(value))
    
    inline def setRangeEnd(value: Double): Self = StObject.set(x, "RangeEnd", value.asInstanceOf[js.Any])
    
    inline def setRangeStart(value: Double): Self = StObject.set(x, "RangeStart", value.asInstanceOf[js.Any])
    
    inline def setSlideShowName(value: String): Self = StObject.set(x, "SlideShowName", value.asInstanceOf[js.Any])
    
    inline def setSourceType(value: PpPublishSourceType): Self = StObject.set(x, "SourceType", value.asInstanceOf[js.Any])
    
    inline def setSpeakerNotes(value: MsoTriState): Self = StObject.set(x, "SpeakerNotes", value.asInstanceOf[js.Any])
  }
}
