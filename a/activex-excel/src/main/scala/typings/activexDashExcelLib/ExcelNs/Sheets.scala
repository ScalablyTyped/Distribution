package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sheets[TSheet] extends js.Object {
  val Application: activexDashExcelLib.ExcelNs.Application = js.native
  val Count: scala.Double = js.native
  val Creator: XlCreator = js.native
  @JSName("HPageBreaks")
  val HPageBreaks_Original: HPageBreaks = js.native
  val Parent: js.Any = js.native
  @JSName("VPageBreaks")
  val VPageBreaks_Original: VPageBreaks = js.native
  var Visible: js.Any = js.native
  def apply(Indexes: stdLib.SafeArray[java.lang.String | scala.Double]): Sheets[TSheet] = js.native
  def apply(Index: java.lang.String): TSheet = js.native
  def apply(Index: scala.Double): TSheet = js.native
  def Add[T](): AddSheetResult[T] = js.native
  def Add[T](Before: Sheet): AddSheetResult[T] = js.native
  def Add[T](Before: Sheet, After: Sheet): AddSheetResult[T] = js.native
  def Add[T](Before: Sheet, After: Sheet, Count: scala.Double): AddSheetResult[T] = js.native
  def Add[T](Before: Sheet, After: Sheet, Count: scala.Double, Type: T): AddSheetResult[T] = js.native
  def Copy(): scala.Unit = js.native
  def Copy(Before: Sheet): scala.Unit = js.native
  def Copy(Before: js.UndefOr[scala.Nothing], After: Sheet): scala.Unit = js.native
  def Delete(): scala.Unit = js.native
  /** @param Type [Type=-4104] */
  def FillAcrossSheets(Range: Range): scala.Unit = js.native
  def FillAcrossSheets(Range: Range, Type: XlFillWith): scala.Unit = js.native
  def HPageBreaks(Index: scala.Double): HPageBreak = js.native
  def Item(Indexes: stdLib.SafeArray[java.lang.String | scala.Double]): Sheets[TSheet] = js.native
  def Item(Index: java.lang.String): TSheet = js.native
  def Item(Index: scala.Double): TSheet = js.native
  def Move(): scala.Unit = js.native
  def Move(Before: Sheet): scala.Unit = js.native
  def Move(Before: js.UndefOr[scala.Nothing], After: Sheet): scala.Unit = js.native
  def Move(Before: js.UndefOr[scala.Nothing], After: scala.Double): scala.Unit = js.native
  def Move(Before: scala.Double): scala.Unit = js.native
  def PrintOut[T /* <: js.UndefOr[scala.Boolean] */](
    From: js.UndefOr[scala.Double],
    To: js.UndefOr[scala.Double],
    Copies: js.UndefOr[scala.Double],
    Preview: js.UndefOr[scala.Boolean],
    ActivePrinter: js.UndefOr[java.lang.String],
    PrintToFile: js.UndefOr[T],
    Collate: js.UndefOr[scala.Boolean],
    PrToFileName: js.UndefOr[PrintToFileName[T]],
    IgnorePrintAreas: js.UndefOr[scala.Boolean]
  ): scala.Unit = js.native
  def PrintPreview(): scala.Unit = js.native
  def PrintPreview(EnableChanges: scala.Boolean): scala.Unit = js.native
  def Select(): scala.Unit = js.native
  def Select(Replace: scala.Boolean): scala.Unit = js.native
  def VPageBreaks(Index: scala.Double): VPageBreak = js.native
  def _Default(Index: js.Any): js.Any = js.native
  def _PrintOut(
    From: js.UndefOr[js.Any],
    To: js.UndefOr[js.Any],
    Copies: js.UndefOr[js.Any],
    Preview: js.UndefOr[js.Any],
    ActivePrinter: js.UndefOr[js.Any],
    PrintToFile: js.UndefOr[js.Any],
    Collate: js.UndefOr[js.Any],
    PrToFileName: js.UndefOr[js.Any]
  ): scala.Unit = js.native
  def __PrintOut(
    From: js.UndefOr[js.Any],
    To: js.UndefOr[js.Any],
    Copies: js.UndefOr[js.Any],
    Preview: js.UndefOr[js.Any],
    ActivePrinter: js.UndefOr[js.Any],
    PrintToFile: js.UndefOr[js.Any],
    Collate: js.UndefOr[js.Any]
  ): scala.Unit = js.native
}

