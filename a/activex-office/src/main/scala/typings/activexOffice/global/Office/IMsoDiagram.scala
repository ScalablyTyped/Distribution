package typings.activexOffice.global.Office

import typings.activexOffice.Office.DiagramNodes
import typings.activexOffice.Office.MsoDiagramType
import typings.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Office.IMsoDiagram")
@js.native
/* private */ class IMsoDiagram ()
  extends StObject
     with typings.activexOffice.Office.IMsoDiagram {
  
  /* CompleteClass */
  override val Application: js.Any = js.native
  
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
  override def Nodes(Index: js.Any): typings.activexOffice.Office.DiagramNode = js.native
  /* CompleteClass */
  @JSName("Nodes")
  override val Nodes_Original: DiagramNodes = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Office.IMsoDiagram_typekey")
  var OfficeDotIMsoDiagram_typekey: typings.activexOffice.Office.IMsoDiagram = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  var Reverse: MsoTriState = js.native
  
  /* CompleteClass */
  override val Type: MsoDiagramType = js.native
}
