package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pane extends js.Object {
  val Active: MsoTriState
  val Application: typings.activexPowerpoint.PowerPoint.Application
  val Parent: js.Any
  @JSName("PowerPoint.Pane_typekey")
  var PowerPointDotPane_typekey: Pane
  val ViewType: PpViewType
  def Activate(): Unit
}

object Pane {
  @scala.inline
  def apply(
    Activate: () => Unit,
    Active: MsoTriState,
    Application: Application,
    Parent: js.Any,
    PowerPointDotPane_typekey: Pane,
    ViewType: PpViewType
  ): Pane = {
    val __obj = js.Dynamic.literal(Activate = js.Any.fromFunction0(Activate), Active = Active.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ViewType = ViewType.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.Pane_typekey")(PowerPointDotPane_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pane]
  }
}

