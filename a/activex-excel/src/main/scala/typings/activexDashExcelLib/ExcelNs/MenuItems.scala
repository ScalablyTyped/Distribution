package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuItems extends js.Object {
  val Application: Application = js.native
  val Count: scala.Double = js.native
  val Creator: XlCreator = js.native
  val Parent: js.Any = js.native
  def apply(Index: js.Any): js.Any = js.native
  def Add(
    Caption: java.lang.String,
    OnAction: js.UndefOr[js.Any],
    ShortcutKey: js.UndefOr[js.Any],
    Before: js.UndefOr[js.Any],
    Restore: js.UndefOr[js.Any],
    StatusBar: js.UndefOr[js.Any],
    HelpFile: js.UndefOr[js.Any],
    HelpContextID: js.UndefOr[js.Any]
  ): MenuItem = js.native
  def AddMenu(Caption: java.lang.String): Menu = js.native
  def AddMenu(Caption: java.lang.String, Before: js.Any): Menu = js.native
  def AddMenu(Caption: java.lang.String, Before: js.Any, Restore: js.Any): Menu = js.native
  def Item(Index: js.Any): js.Any = js.native
  def _Default(Index: js.Any): js.Any = js.native
}

