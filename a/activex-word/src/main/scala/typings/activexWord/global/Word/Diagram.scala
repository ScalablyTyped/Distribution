package typings.activexWord.global.Word

import typings.activexOffice.Office.MsoDiagramType
import typings.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Word.Diagram")
@js.native
/* private */ class Diagram ()
  extends StObject
     with typings.activexWord.Word.Diagram {
  
  /* CompleteClass */
  override val Application: typings.activexWord.Word.Application = js.native
  
  /* CompleteClass */
  var AutoFormat: MsoTriState = js.native
  
  /* CompleteClass */
  var AutoLayout: MsoTriState = js.native
  
  /* CompleteClass */
  override def Convert(Type: MsoDiagramType): Unit = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  override def FitText(): Unit = js.native
  
  /* CompleteClass */
  override val Nodes: typings.activexWord.Word.DiagramNodes = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  var Reverse: MsoTriState = js.native
  
  /* CompleteClass */
  override val Type: MsoDiagramType = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Word.Diagram_typekey")
  var WordDotDiagram_typekey: typings.activexWord.Word.Diagram = js.native
}
