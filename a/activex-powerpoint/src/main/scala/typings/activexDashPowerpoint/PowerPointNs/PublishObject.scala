package typings.activexDashPowerpoint.PowerPointNs

import typings.activexDashOffice.OfficeNs.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.PublishObject")
@js.native
class PublishObject protected () extends js.Object {
  val Application: typings.activexDashPowerpoint.PowerPointNs.Application = js.native
  var FileName: String = js.native
  var HTMLVersion: PpHTMLVersion = js.native
  val Parent: js.Any = js.native
  var `PowerPoint.PublishObject_typekey`: PublishObject = js.native
  var RangeEnd: Double = js.native
  var RangeStart: Double = js.native
  var SlideShowName: String = js.native
  var SourceType: PpPublishSourceType = js.native
  var SpeakerNotes: MsoTriState = js.native
  def Publish(): Unit = js.native
}

