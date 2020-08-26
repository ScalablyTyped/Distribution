package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabStop extends js.Object {
  var Alignment: WdTabAlignment = js.native
  val Application: typings.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  val CustomTab: Boolean = js.native
  var Leader: WdTabLeader = js.native
  val Next: TabStop = js.native
  val Parent: js.Any = js.native
  var Position: Double = js.native
  val Previous: TabStop = js.native
  @JSName("Word.TabStop_typekey")
  var WordDotTabStop_typekey: TabStop = js.native
  def Clear(): Unit = js.native
}

object TabStop {
  @scala.inline
  def apply(
    Alignment: WdTabAlignment,
    Application: Application,
    Clear: () => Unit,
    Creator: Double,
    CustomTab: Boolean,
    Leader: WdTabLeader,
    Next: TabStop,
    Parent: js.Any,
    Position: Double,
    Previous: TabStop,
    WordDotTabStop_typekey: TabStop
  ): TabStop = {
    val __obj = js.Dynamic.literal(Alignment = Alignment.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Clear = js.Any.fromFunction0(Clear), Creator = Creator.asInstanceOf[js.Any], CustomTab = CustomTab.asInstanceOf[js.Any], Leader = Leader.asInstanceOf[js.Any], Next = Next.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Previous = Previous.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.TabStop_typekey")(WordDotTabStop_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabStop]
  }
  @scala.inline
  implicit class TabStopOps[Self <: TabStop] (val x: Self) extends AnyVal {
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
    def setAlignment(value: WdTabAlignment): Self = this.set("Alignment", value.asInstanceOf[js.Any])
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("Clear", js.Any.fromFunction0(value))
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustomTab(value: Boolean): Self = this.set("CustomTab", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeader(value: WdTabLeader): Self = this.set("Leader", value.asInstanceOf[js.Any])
    @scala.inline
    def setNext(value: TabStop): Self = this.set("Next", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: Double): Self = this.set("Position", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrevious(value: TabStop): Self = this.set("Previous", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordDotTabStop_typekey(value: TabStop): Self = this.set("Word.TabStop_typekey", value.asInstanceOf[js.Any])
  }
  
}

