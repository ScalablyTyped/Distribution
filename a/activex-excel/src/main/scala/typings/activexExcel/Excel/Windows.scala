package typings.activexExcel.Excel

import typings.activexExcel.activexExcelBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Windows extends StObject {
  
  def apply(Index: String): Window = js.native
  def apply(Index: Double): Window = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  /** @param ArrangeStyle [ArrangeStyle=1] */
  def Arrange(): Any = js.native
  def Arrange(ArrangeStyle: Unit, ActiveWorkbook: Boolean): Any = js.native
  def Arrange(ArrangeStyle: Unit, ActiveWorkbook: Boolean, SyncHorizontal: Boolean): Any = js.native
  def Arrange(ArrangeStyle: Unit, ActiveWorkbook: Boolean, SyncHorizontal: Boolean, SyncVertical: Boolean): Any = js.native
  def Arrange(ArrangeStyle: Unit, ActiveWorkbook: Boolean, SyncHorizontal: Unit, SyncVertical: Boolean): Any = js.native
  def Arrange(ArrangeStyle: Unit, ActiveWorkbook: Unit, SyncHorizontal: Boolean): Any = js.native
  def Arrange(ArrangeStyle: Unit, ActiveWorkbook: Unit, SyncHorizontal: Boolean, SyncVertical: Boolean): Any = js.native
  def Arrange(ArrangeStyle: Unit, ActiveWorkbook: Unit, SyncHorizontal: Unit, SyncVertical: Boolean): Any = js.native
  def Arrange(ArrangeStyle: XlArrangeStyle): Any = js.native
  def Arrange(ArrangeStyle: XlArrangeStyle, ActiveWorkbook: Boolean): Any = js.native
  def Arrange(ArrangeStyle: XlArrangeStyle, ActiveWorkbook: Boolean, SyncHorizontal: Boolean): Any = js.native
  def Arrange(
    ArrangeStyle: XlArrangeStyle,
    ActiveWorkbook: Boolean,
    SyncHorizontal: Boolean,
    SyncVertical: Boolean
  ): Any = js.native
  def Arrange(ArrangeStyle: XlArrangeStyle, ActiveWorkbook: Boolean, SyncHorizontal: Unit, SyncVertical: Boolean): Any = js.native
  def Arrange(ArrangeStyle: XlArrangeStyle, ActiveWorkbook: Unit, SyncHorizontal: Boolean): Any = js.native
  def Arrange(ArrangeStyle: XlArrangeStyle, ActiveWorkbook: Unit, SyncHorizontal: Boolean, SyncVertical: Boolean): Any = js.native
  def Arrange(ArrangeStyle: XlArrangeStyle, ActiveWorkbook: Unit, SyncHorizontal: Unit, SyncVertical: Boolean): Any = js.native
  @JSName("Arrange")
  def Arrange_true(ArrangeStyle: XlArrangeStyle, ActiveWorkbook: `true`): Any = js.native
  @JSName("Arrange")
  def Arrange_true(ArrangeStyle: XlArrangeStyle, ActiveWorkbook: `true`, SyncHorizontal: Boolean): Any = js.native
  @JSName("Arrange")
  def Arrange_true(
    ArrangeStyle: XlArrangeStyle,
    ActiveWorkbook: `true`,
    SyncHorizontal: Boolean,
    SyncVertical: Boolean
  ): Any = js.native
  @JSName("Arrange")
  def Arrange_true(ArrangeStyle: XlArrangeStyle, ActiveWorkbook: `true`, SyncHorizontal: Unit, SyncVertical: Boolean): Any = js.native
  
  def BreakSideBySide(): Boolean = js.native
  
  def CompareSideBySideWith(WindowName: String): Boolean = js.native
  
  val Count: Double = js.native
  
  val Creator: XlCreator = js.native
  
  def Item(Index: String): Window = js.native
  def Item(Index: Double): Window = js.native
  
  val Parent: Any = js.native
  
  def ResetPositionsSideBySide(): Unit = js.native
  
  var SyncScrollingSideBySide: Boolean = js.native
  
  def _Default(Index: Any): Window = js.native
}
