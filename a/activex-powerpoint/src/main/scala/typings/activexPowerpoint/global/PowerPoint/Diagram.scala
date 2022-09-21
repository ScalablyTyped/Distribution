package typings.activexPowerpoint.global.PowerPoint

import typings.activexOffice.Office.MsoDiagramType
import typings.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PowerPoint.Diagram")
@js.native
/* private */ open class Diagram ()
  extends StObject
     with typings.activexPowerpoint.PowerPoint.Diagram {
  
  /* CompleteClass */
  override val Application: Any = js.native
  
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
  override val Nodes: typings.activexPowerpoint.PowerPoint.DiagramNodes = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* private */ /* CompleteClass */
  @JSName("PowerPoint.Diagram_typekey")
  var PowerPointDotDiagram_typekey: typings.activexPowerpoint.PowerPoint.Diagram = js.native
  
  /* CompleteClass */
  var Reverse: MsoTriState = js.native
  
  /* CompleteClass */
  override val Type: MsoDiagramType = js.native
}
