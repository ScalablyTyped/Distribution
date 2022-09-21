package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Modules extends StObject {
  
  def apply(Index: Any): Any = js.native
  
  def Add(): Module = js.native
  def Add(Before: Any): Module = js.native
  def Add(Before: Any, After: Any): Module = js.native
  def Add(Before: Any, After: Any, Count: Any): Module = js.native
  def Add(Before: Any, After: Unit, Count: Any): Module = js.native
  def Add(Before: Unit, After: Any): Module = js.native
  def Add(Before: Unit, After: Any, Count: Any): Module = js.native
  def Add(Before: Unit, After: Unit, Count: Any): Module = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  def Copy(): Unit = js.native
  def Copy(Before: Any): Unit = js.native
  def Copy(Before: Any, After: Any): Unit = js.native
  def Copy(Before: Unit, After: Any): Unit = js.native
  
  val Count: Double = js.native
  
  val Creator: XlCreator = js.native
  
  def Delete(): Unit = js.native
  
  def HPageBreaks(Index: Double): HPageBreak = js.native
  @JSName("HPageBreaks")
  val HPageBreaks_Original: HPageBreaks = js.native
  
  def Item(Index: Any): Any = js.native
  
  def Move(): Unit = js.native
  def Move(Before: Any): Unit = js.native
  def Move(Before: Any, After: Any): Unit = js.native
  def Move(Before: Unit, After: Any): Unit = js.native
  
  val Parent: Any = js.native
  
  def PrintOut(
    From: js.UndefOr[Any],
    To: js.UndefOr[Any],
    Copies: js.UndefOr[Any],
    Preview: js.UndefOr[Any],
    ActivePrinter: js.UndefOr[Any],
    PrintToFile: js.UndefOr[Any],
    Collate: js.UndefOr[Any],
    PrToFileName: js.UndefOr[Any],
    IgnorePrintAreas: js.UndefOr[Any]
  ): Unit = js.native
  
  def Select(): Unit = js.native
  def Select(Replace: Any): Unit = js.native
  
  def VPageBreaks(Index: Double): VPageBreak = js.native
  @JSName("VPageBreaks")
  val VPageBreaks_Original: VPageBreaks = js.native
  
  var Visible: Any = js.native
  
  def _Default(Index: Any): Any = js.native
  
  def _PrintOut(
    From: js.UndefOr[Any],
    To: js.UndefOr[Any],
    Copies: js.UndefOr[Any],
    Preview: js.UndefOr[Any],
    ActivePrinter: js.UndefOr[Any],
    PrintToFile: js.UndefOr[Any],
    Collate: js.UndefOr[Any],
    PrToFileName: js.UndefOr[Any]
  ): Unit = js.native
  
  def __PrintOut(
    From: js.UndefOr[Any],
    To: js.UndefOr[Any],
    Copies: js.UndefOr[Any],
    Preview: js.UndefOr[Any],
    ActivePrinter: js.UndefOr[Any],
    PrintToFile: js.UndefOr[Any],
    Collate: js.UndefOr[Any]
  ): Unit = js.native
}
