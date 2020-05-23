package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Panes extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application
  val Count: Double
  val Parent: js.Any
  @JSName("PowerPoint.Panes_typekey")
  var PowerPointDotPanes_typekey: Panes
  def Item(Index: Double): Pane
}

object Panes {
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Item: Double => Pane,
    Parent: js.Any,
    PowerPointDotPanes_typekey: Panes
  ): Panes = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.Panes_typekey")(PowerPointDotPanes_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Panes]
  }
}

