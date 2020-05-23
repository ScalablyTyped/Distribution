package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Coauthoring extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application
  val CoauthorCount: Double
  var FavorServerEditsDuringMerge: Boolean
  val MergeMode: Boolean
  val Parent: js.Any
  val PendingUpdates: Boolean
  @JSName("PowerPoint.Coauthoring_typekey")
  var PowerPointDotCoauthoring_typekey: Coauthoring
  def EndReview(): Unit
}

object Coauthoring {
  @scala.inline
  def apply(
    Application: Application,
    CoauthorCount: Double,
    EndReview: () => Unit,
    FavorServerEditsDuringMerge: Boolean,
    MergeMode: Boolean,
    Parent: js.Any,
    PendingUpdates: Boolean,
    PowerPointDotCoauthoring_typekey: Coauthoring
  ): Coauthoring = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], CoauthorCount = CoauthorCount.asInstanceOf[js.Any], EndReview = js.Any.fromFunction0(EndReview), FavorServerEditsDuringMerge = FavorServerEditsDuringMerge.asInstanceOf[js.Any], MergeMode = MergeMode.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PendingUpdates = PendingUpdates.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.Coauthoring_typekey")(PowerPointDotCoauthoring_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Coauthoring]
  }
}

