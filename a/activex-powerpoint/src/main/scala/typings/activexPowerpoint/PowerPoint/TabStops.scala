package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabStops extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  val Count: Double = js.native
  var DefaultSpacing: Double = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.TabStops_typekey")
  var PowerPointDotTabStops_typekey: TabStops = js.native
  def Add(Type: PpTabStopType, Position: Double): TabStop = js.native
  def Item(Index: Double): TabStop = js.native
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
  @scala.inline
  implicit class TabStopsOps[Self <: TabStops] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdd(value: (PpTabStopType, Double) => TabStop): Self = this.set("Add", js.Any.fromFunction2(value))
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultSpacing(value: Double): Self = this.set("DefaultSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: Double => TabStop): Self = this.set("Item", js.Any.fromFunction1(value))
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPowerPointDotTabStops_typekey(value: TabStops): Self = this.set("PowerPoint.TabStops_typekey", value.asInstanceOf[js.Any])
  }
  
}

