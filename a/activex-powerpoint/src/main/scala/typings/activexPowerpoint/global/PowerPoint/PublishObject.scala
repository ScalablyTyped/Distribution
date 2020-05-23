package typings.activexPowerpoint.global.PowerPoint

import typings.activexOffice.Office.MsoTriState
import typings.activexPowerpoint.PowerPoint.PpHTMLVersion
import typings.activexPowerpoint.PowerPoint.PpPublishSourceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.PublishObject")
@js.native
class PublishObject protected ()
  extends typings.activexPowerpoint.PowerPoint.PublishObject {
  /* CompleteClass */
  override val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  /* CompleteClass */
  override var FileName: String = js.native
  /* CompleteClass */
  override var HTMLVersion: PpHTMLVersion = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  @JSName("PowerPoint.PublishObject_typekey")
  override var PowerPointDotPublishObject_typekey: typings.activexPowerpoint.PowerPoint.PublishObject = js.native
  /* CompleteClass */
  override var RangeEnd: Double = js.native
  /* CompleteClass */
  override var RangeStart: Double = js.native
  /* CompleteClass */
  override var SlideShowName: String = js.native
  /* CompleteClass */
  override var SourceType: PpPublishSourceType = js.native
  /* CompleteClass */
  override var SpeakerNotes: MsoTriState = js.native
  /* CompleteClass */
  override def Publish(): Unit = js.native
}

