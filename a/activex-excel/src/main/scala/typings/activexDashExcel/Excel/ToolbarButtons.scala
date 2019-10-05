package typings.activexDashExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToolbarButtons extends js.Object {
  val Application: typings.activexDashExcel.Excel.Application = js.native
  val Count: Double = js.native
  val Creator: XlCreator = js.native
  val Parent: js.Any = js.native
  def apply(Index: Double): ToolbarButton = js.native
  def Add(
    Button: js.UndefOr[js.Any],
    Before: js.UndefOr[js.Any],
    OnAction: js.UndefOr[js.Any],
    Pushed: js.UndefOr[js.Any],
    Enabled: js.UndefOr[js.Any],
    StatusBar: js.UndefOr[js.Any],
    HelpFile: js.UndefOr[js.Any],
    HelpContextID: js.UndefOr[js.Any]
  ): ToolbarButton = js.native
  def Item(Index: Double): ToolbarButton = js.native
  def _Default(Index: Double): ToolbarButton = js.native
}

