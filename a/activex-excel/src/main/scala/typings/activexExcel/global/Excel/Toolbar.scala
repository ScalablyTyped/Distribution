package typings.activexExcel.global.Excel

import typings.activexExcel.Excel.ToolbarButtons
import typings.activexExcel.Excel.XlCreator
import typings.activexExcel.Excel.XlToolbarProtection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.Toolbar")
@js.native
/* private */ class Toolbar ()
  extends StObject
     with typings.activexExcel.Excel.Toolbar {
  
  /* CompleteClass */
  override val Application: typings.activexExcel.Excel.Application = js.native
  
  /* CompleteClass */
  override val BuiltIn: Boolean = js.native
  
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  
  /* CompleteClass */
  override def Delete(): Unit = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Excel.Toolbar_typekey")
  var ExcelDotToolbar_typekey: typings.activexExcel.Excel.Toolbar = js.native
  
  /* CompleteClass */
  var Height: Double = js.native
  
  /* CompleteClass */
  var Left: Double = js.native
  
  /* CompleteClass */
  override val Name: String = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  var Position: Double = js.native
  
  /* CompleteClass */
  var Protection: XlToolbarProtection = js.native
  
  /* CompleteClass */
  override def Reset(): Unit = js.native
  
  /* CompleteClass */
  override def ToolbarButtons(Index: Double): typings.activexExcel.Excel.ToolbarButton = js.native
  /* CompleteClass */
  @JSName("ToolbarButtons")
  override val ToolbarButtons_Original: ToolbarButtons = js.native
  
  /* CompleteClass */
  var Top: Double = js.native
  
  /* CompleteClass */
  var Visible: Boolean = js.native
  
  /* CompleteClass */
  var Width: Double = js.native
}
