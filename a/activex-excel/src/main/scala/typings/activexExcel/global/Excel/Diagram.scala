package typings.activexExcel.global.Excel

import typings.activexExcel.Excel.DiagramNodes
import typings.activexExcel.Excel.XlCreator
import typings.activexOffice.Office.MsoDiagramType
import typings.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.Diagram")
@js.native
/* private */ class Diagram ()
  extends StObject
     with typings.activexExcel.Excel.Diagram {
  
  /* CompleteClass */
  override val Application: typings.activexExcel.Excel.Application = js.native
  
  /* CompleteClass */
  var AutoFormat: MsoTriState = js.native
  
  /* CompleteClass */
  var AutoLayout: MsoTriState = js.native
  
  /* CompleteClass */
  override def Convert(Type: MsoDiagramType): Unit = js.native
  
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Excel.Diagram_typekey")
  var ExcelDotDiagram_typekey: typings.activexExcel.Excel.Diagram = js.native
  
  /* CompleteClass */
  override def FitText(): Unit = js.native
  
  /* CompleteClass */
  override def Nodes(Index: js.Any): typings.activexExcel.Excel.DiagramNode = js.native
  /* CompleteClass */
  @JSName("Nodes")
  override val Nodes_Original: DiagramNodes = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  var Reverse: MsoTriState = js.native
  
  /* CompleteClass */
  override val Type: MsoDiagramType = js.native
}
