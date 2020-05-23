package typings.activexPowerpoint.global.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Coauthoring")
@js.native
class Coauthoring protected ()
  extends typings.activexPowerpoint.PowerPoint.Coauthoring {
  /* CompleteClass */
  override val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  /* CompleteClass */
  override val CoauthorCount: Double = js.native
  /* CompleteClass */
  override var FavorServerEditsDuringMerge: Boolean = js.native
  /* CompleteClass */
  override val MergeMode: Boolean = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val PendingUpdates: Boolean = js.native
  /* CompleteClass */
  @JSName("PowerPoint.Coauthoring_typekey")
  override var PowerPointDotCoauthoring_typekey: typings.activexPowerpoint.PowerPoint.Coauthoring = js.native
  /* CompleteClass */
  override def EndReview(): Unit = js.native
}

