package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabStop extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application
  val Parent: js.Any
  var Position: Double
  @JSName("PowerPoint.TabStop_typekey")
  var PowerPointDotTabStop_typekey: TabStop
  var Type: PpTabStopType
  def Clear(): Unit
}

object TabStop {
  @scala.inline
  def apply(
    Application: Application,
    Clear: () => Unit,
    Parent: js.Any,
    Position: Double,
    PowerPointDotTabStop_typekey: TabStop,
    Type: PpTabStopType
  ): TabStop = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Clear = js.Any.fromFunction0(Clear), Parent = Parent.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.TabStop_typekey")(PowerPointDotTabStop_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabStop]
  }
}

