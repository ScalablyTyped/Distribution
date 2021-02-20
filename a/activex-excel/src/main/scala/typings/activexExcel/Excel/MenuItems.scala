package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MenuItems extends StObject {
  
  def apply(Index: js.Any): js.Any = js.native
  
  def Add(
    Caption: String,
    OnAction: js.UndefOr[js.Any],
    ShortcutKey: js.UndefOr[js.Any],
    Before: js.UndefOr[js.Any],
    Restore: js.UndefOr[js.Any],
    StatusBar: js.UndefOr[js.Any],
    HelpFile: js.UndefOr[js.Any],
    HelpContextID: js.UndefOr[js.Any]
  ): MenuItem = js.native
  
  def AddMenu(Caption: String): Menu = js.native
  def AddMenu(Caption: String, Before: js.UndefOr[scala.Nothing], Restore: js.Any): Menu = js.native
  def AddMenu(Caption: String, Before: js.Any): Menu = js.native
  def AddMenu(Caption: String, Before: js.Any, Restore: js.Any): Menu = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: XlCreator = js.native
  
  def Item(Index: js.Any): js.Any = js.native
  
  val Parent: js.Any = js.native
  
  def _Default(Index: js.Any): js.Any = js.native
}
