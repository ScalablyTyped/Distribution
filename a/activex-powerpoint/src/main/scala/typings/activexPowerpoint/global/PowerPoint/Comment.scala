package typings.activexPowerpoint.global.PowerPoint

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Comment")
@js.native
class Comment protected ()
  extends typings.activexPowerpoint.PowerPoint.Comment {
  /* CompleteClass */
  override val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  /* CompleteClass */
  override val Author: String = js.native
  /* CompleteClass */
  override val AuthorIndex: Double = js.native
  /* CompleteClass */
  override val AuthorInitials: String = js.native
  /* CompleteClass */
  override val DateTime: VarDate = js.native
  /* CompleteClass */
  override val Left: Double = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  @JSName("PowerPoint.Comment_typekey")
  override var PowerPointDotComment_typekey: typings.activexPowerpoint.PowerPoint.Comment = js.native
  /* CompleteClass */
  override val Text: String = js.native
  /* CompleteClass */
  override val Top: Double = js.native
  /* CompleteClass */
  override def Delete(): Unit = js.native
}

