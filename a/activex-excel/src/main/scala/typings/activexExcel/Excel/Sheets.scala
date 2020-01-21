package typings.activexExcel.Excel

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sheets[TSheet] extends js.Object {
  val Application: typings.activexExcel.Excel.Application = js.native
  val Count: Double = js.native
  val Creator: XlCreator = js.native
  @JSName("HPageBreaks")
  val HPageBreaks_Original: HPageBreaks = js.native
  val Parent: js.Any = js.native
  @JSName("VPageBreaks")
  val VPageBreaks_Original: VPageBreaks = js.native
  var Visible: js.Any = js.native
  def apply(Indexes: SafeArray[String | Double]): Sheets[TSheet] = js.native
  def apply(Index: String): TSheet = js.native
  def apply(Index: Double): TSheet = js.native
  def Add[T](): AddSheetResult[T] = js.native
  def Add[T](Before: Sheet): AddSheetResult[T] = js.native
  def Add[T](Before: Sheet, After: Sheet): AddSheetResult[T] = js.native
  def Add[T](Before: Sheet, After: Sheet, Count: Double): AddSheetResult[T] = js.native
  def Add[T](Before: Sheet, After: Sheet, Count: Double, Type: T): AddSheetResult[T] = js.native
  def Copy(): Unit = js.native
  def Copy(Before: js.UndefOr[scala.Nothing], After: Sheet): Unit = js.native
  def Copy(Before: Sheet): Unit = js.native
  def Delete(): Unit = js.native
  /** @param Type [Type=-4104] */
  def FillAcrossSheets(Range: Range): Unit = js.native
  def FillAcrossSheets(Range: Range, Type: XlFillWith): Unit = js.native
  def HPageBreaks(Index: Double): HPageBreak = js.native
  def Item(Indexes: SafeArray[String | Double]): Sheets[TSheet] = js.native
  def Item(Index: String): TSheet = js.native
  def Item(Index: Double): TSheet = js.native
  def Move(): Unit = js.native
  def Move(Before: js.UndefOr[scala.Nothing], After: Double): Unit = js.native
  def Move(Before: js.UndefOr[scala.Nothing], After: Sheet): Unit = js.native
  def Move(Before: Double): Unit = js.native
  def Move(Before: Sheet): Unit = js.native
  def PrintOut[T /* <: js.UndefOr[Boolean] */](
    From: js.UndefOr[Double],
    To: js.UndefOr[Double],
    Copies: js.UndefOr[Double],
    Preview: js.UndefOr[Boolean],
    ActivePrinter: js.UndefOr[String],
    PrintToFile: js.UndefOr[T],
    Collate: js.UndefOr[Boolean],
    PrToFileName: js.UndefOr[PrintToFileName[T]],
    IgnorePrintAreas: js.UndefOr[Boolean]
  ): Unit = js.native
  def PrintPreview(): Unit = js.native
  def PrintPreview(EnableChanges: Boolean): Unit = js.native
  def Select(): Unit = js.native
  def Select(Replace: Boolean): Unit = js.native
  def VPageBreaks(Index: Double): VPageBreak = js.native
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
  ): Unit = js.native
  def __PrintOut(
    From: js.UndefOr[js.Any],
    To: js.UndefOr[js.Any],
    Copies: js.UndefOr[js.Any],
    Preview: js.UndefOr[js.Any],
    ActivePrinter: js.UndefOr[js.Any],
    PrintToFile: js.UndefOr[js.Any],
    Collate: js.UndefOr[js.Any]
  ): Unit = js.native
}

