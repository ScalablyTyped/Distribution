package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Windows extends js.Object {
  val Application: Application = js.native
  val Count: scala.Double = js.native
  val Creator: XlCreator = js.native
  val Parent: js.Any = js.native
  var SyncScrollingSideBySide: scala.Boolean = js.native
  def apply(Index: java.lang.String): Window = js.native
  def apply(Index: scala.Double): Window = js.native
  /** @param ArrangeStyle [ArrangeStyle=1] */
  def Arrange(): js.Any = js.native
  /** @param ArrangeStyle [ArrangeStyle=1] */
  def Arrange(ArrangeStyle: XlArrangeStyle): js.Any = js.native
  def Arrange(
    ArrangeStyle: XlArrangeStyle,
    ActiveWorkbook: activexDashExcelLib.activexDashExcelLibNumbers.`true`
  ): js.Any = js.native
  def Arrange(
    ArrangeStyle: XlArrangeStyle,
    ActiveWorkbook: activexDashExcelLib.activexDashExcelLibNumbers.`true`,
    SyncHorizontal: scala.Boolean
  ): js.Any = js.native
  def Arrange(
    ArrangeStyle: XlArrangeStyle,
    ActiveWorkbook: activexDashExcelLib.activexDashExcelLibNumbers.`true`,
    SyncHorizontal: scala.Boolean,
    SyncVertical: scala.Boolean
  ): js.Any = js.native
  /** @param ArrangeStyle [ArrangeStyle=1] */
  def Arrange(ArrangeStyle: XlArrangeStyle, ActiveWorkbook: scala.Boolean): js.Any = js.native
  /** @param ArrangeStyle [ArrangeStyle=1] */
  def Arrange(ArrangeStyle: XlArrangeStyle, ActiveWorkbook: scala.Boolean, SyncHorizontal: scala.Boolean): js.Any = js.native
  /** @param ArrangeStyle [ArrangeStyle=1] */
  def Arrange(
    ArrangeStyle: XlArrangeStyle,
    ActiveWorkbook: scala.Boolean,
    SyncHorizontal: scala.Boolean,
    SyncVertical: scala.Boolean
  ): js.Any = js.native
  def BreakSideBySide(): scala.Boolean = js.native
  def CompareSideBySideWith(WindowName: java.lang.String): scala.Boolean = js.native
  def Item(Index: java.lang.String): Window = js.native
  def Item(Index: scala.Double): Window = js.native
  def ResetPositionsSideBySide(): scala.Unit = js.native
  def _Default(Index: js.Any): Window = js.native
}

