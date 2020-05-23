package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabStops extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application
  val Count: Double
  var DefaultSpacing: Double
  val Parent: js.Any
  @JSName("PowerPoint.TabStops_typekey")
  var PowerPointDotTabStops_typekey: TabStops
  def Add(Type: PpTabStopType, Position: Double): TabStop
  def Item(Index: Double): TabStop
}

object TabStops {
  @scala.inline
  def apply(
    Add: (PpTabStopType, Double) => TabStop,
    Application: Application,
    Count: Double,
    DefaultSpacing: Double,
    Item: Double => TabStop,
    Parent: js.Any,
    PowerPointDotTabStops_typekey: TabStops
  ): TabStops = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], DefaultSpacing = DefaultSpacing.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.TabStops_typekey")(PowerPointDotTabStops_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabStops]
  }
}

