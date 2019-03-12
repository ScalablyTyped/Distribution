package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.PublishObject")
@js.native
class PublishObject protected () extends js.Object {
  val Application: activexDashPowerpointLib.PowerPointNs.Application = js.native
  var FileName: java.lang.String = js.native
  var HTMLVersion: PpHTMLVersion = js.native
  val Parent: js.Any = js.native
  var `PowerPoint.PublishObject_typekey`: PublishObject = js.native
  var RangeEnd: scala.Double = js.native
  var RangeStart: scala.Double = js.native
  var SlideShowName: java.lang.String = js.native
  var SourceType: PpPublishSourceType = js.native
  var SpeakerNotes: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  def Publish(): scala.Unit = js.native
}

