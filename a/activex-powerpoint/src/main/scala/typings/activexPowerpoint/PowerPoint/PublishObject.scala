package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublishObject extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application
  var FileName: String
  var HTMLVersion: PpHTMLVersion
  val Parent: js.Any
  @JSName("PowerPoint.PublishObject_typekey")
  var PowerPointDotPublishObject_typekey: PublishObject
  var RangeEnd: Double
  var RangeStart: Double
  var SlideShowName: String
  var SourceType: PpPublishSourceType
  var SpeakerNotes: MsoTriState
  def Publish(): Unit
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
}

