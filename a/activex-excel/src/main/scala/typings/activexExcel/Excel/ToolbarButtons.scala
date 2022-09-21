package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToolbarButtons extends StObject {
  
  def apply(Index: Double): ToolbarButton = js.native
  
  def Add(
    Button: js.UndefOr[Any],
    Before: js.UndefOr[Any],
    OnAction: js.UndefOr[Any],
    Pushed: js.UndefOr[Any],
    Enabled: js.UndefOr[Any],
    StatusBar: js.UndefOr[Any],
    HelpFile: js.UndefOr[Any],
    HelpContextID: js.UndefOr[Any]
  ): ToolbarButton = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: XlCreator = js.native
  
  def Item(Index: Double): ToolbarButton = js.native
  
  val Parent: Any = js.native
  
  def _Default(Index: Double): ToolbarButton = js.native
}
