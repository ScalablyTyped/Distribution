package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeLine extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application
  val InteractiveSequences: Sequences
  val MainSequence: Sequence
  val Parent: js.Any
  @JSName("PowerPoint.TimeLine_typekey")
  var PowerPointDotTimeLine_typekey: TimeLine
}

object TimeLine {
  @scala.inline
  def apply(
    Application: Application,
    InteractiveSequences: Sequences,
    MainSequence: Sequence,
    Parent: js.Any,
    PowerPointDotTimeLine_typekey: TimeLine
  ): TimeLine = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], InteractiveSequences = InteractiveSequences.asInstanceOf[js.Any], MainSequence = MainSequence.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.TimeLine_typekey")(PowerPointDotTimeLine_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeLine]
  }
}

