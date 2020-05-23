package typings.activexPowerpoint.global.PowerPoint

import typings.activexPowerpoint.PowerPoint.PpUpdateOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.LinkFormat")
@js.native
class LinkFormat protected ()
  extends typings.activexPowerpoint.PowerPoint.LinkFormat {
  /* CompleteClass */
  override val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  /* CompleteClass */
  override var AutoUpdate: PpUpdateOption = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  @JSName("PowerPoint.LinkFormat_typekey")
  override var PowerPointDotLinkFormat_typekey: typings.activexPowerpoint.PowerPoint.LinkFormat = js.native
  /* CompleteClass */
  override var SourceFullName: String = js.native
  /* CompleteClass */
  override def BreakLink(): Unit = js.native
  /* CompleteClass */
  override def Update(): Unit = js.native
}

