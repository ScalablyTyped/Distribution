package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.PublishObject")
@js.native
class PublishObject protected () extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  var FileName: String = js.native
  var HTMLVersion: PpHTMLVersion = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.PublishObject_typekey")
  var PowerPointDotPublishObject_typekey: PublishObject = js.native
  var RangeEnd: Double = js.native
  var RangeStart: Double = js.native
  var SlideShowName: String = js.native
  var SourceType: PpPublishSourceType = js.native
  var SpeakerNotes: MsoTriState = js.native
  def Publish(): Unit = js.native
}

