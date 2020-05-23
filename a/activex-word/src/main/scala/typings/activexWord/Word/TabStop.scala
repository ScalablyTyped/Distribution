package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabStop extends js.Object {
  var Alignment: WdTabAlignment
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  val CustomTab: Boolean
  var Leader: WdTabLeader
  val Next: TabStop
  val Parent: js.Any
  var Position: Double
  val Previous: TabStop
  @JSName("Word.TabStop_typekey")
  var WordDotTabStop_typekey: TabStop
  def Clear(): Unit
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
}

