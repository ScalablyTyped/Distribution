package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MenuItems extends StObject {
  
  def apply(Index: Any): Any = js.native
  
  def Add(
    Caption: String,
    OnAction: js.UndefOr[Any],
    ShortcutKey: js.UndefOr[Any],
    Before: js.UndefOr[Any],
    Restore: js.UndefOr[Any],
    StatusBar: js.UndefOr[Any],
    HelpFile: js.UndefOr[Any],
    HelpContextID: js.UndefOr[Any]
  ): MenuItem = js.native
  
  def AddMenu(Caption: String): Menu = js.native
  def AddMenu(Caption: String, Before: Any): Menu = js.native
  def AddMenu(Caption: String, Before: Any, Restore: Any): Menu = js.native
  def AddMenu(Caption: String, Before: Unit, Restore: Any): Menu = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: XlCreator = js.native
  
  def Item(Index: Any): Any = js.native
  
  val Parent: Any = js.native
  
  def _Default(Index: Any): Any = js.native
}
