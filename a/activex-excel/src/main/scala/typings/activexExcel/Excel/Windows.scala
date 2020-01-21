package typings.activexExcel.Excel

import typings.activexExcel.activexExcelBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Windows extends js.Object {
  val Application: typings.activexExcel.Excel.Application = js.native
  val Count: Double = js.native
  val Creator: XlCreator = js.native
  val Parent: js.Any = js.native
  var SyncScrollingSideBySide: Boolean = js.native
  def apply(Index: String): Window = js.native
  def apply(Index: Double): Window = js.native
  /** @param ArrangeStyle [ArrangeStyle=1] */
  def Arrange(): js.Any = js.native
  def Arrange(ArrangeStyle: XlArrangeStyle): js.Any = js.native
  def Arrange(ArrangeStyle: XlArrangeStyle, ActiveWorkbook: Boolean): js.Any = js.native
  def Arrange(ArrangeStyle: XlArrangeStyle, ActiveWorkbook: Boolean, SyncHorizontal: Boolean): js.Any = js.native
  def Arrange(
    ArrangeStyle: XlArrangeStyle,
    ActiveWorkbook: Boolean,
    SyncHorizontal: Boolean,
    SyncVertical: Boolean
  ): js.Any = js.native
  @JSName("Arrange")
  def Arrange_true(ArrangeStyle: XlArrangeStyle, ActiveWorkbook: `true`): js.Any = js.native
  @JSName("Arrange")
  def Arrange_true(ArrangeStyle: XlArrangeStyle, ActiveWorkbook: `true`, SyncHorizontal: Boolean): js.Any = js.native
  @JSName("Arrange")
  def Arrange_true(
    ArrangeStyle: XlArrangeStyle,
    ActiveWorkbook: `true`,
    SyncHorizontal: Boolean,
    SyncVertical: Boolean
  ): js.Any = js.native
  def BreakSideBySide(): Boolean = js.native
  def CompareSideBySideWith(WindowName: String): Boolean = js.native
  def Item(Index: String): Window = js.native
  def Item(Index: Double): Window = js.native
  def ResetPositionsSideBySide(): Unit = js.native
  def _Default(Index: js.Any): Window = js.native
}

