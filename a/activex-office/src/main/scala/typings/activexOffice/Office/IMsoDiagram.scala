package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMsoDiagram extends StObject {
  
  val Application: js.Any
  
  var AutoFormat: MsoTriState
  
  var AutoLayout: MsoTriState
  
  def Convert(Type: MsoDiagramType): Unit
  
  val Creator: Double
  
  def FitText(): Unit
  
  def Nodes(Index: js.Any): DiagramNode
  @JSName("Nodes")
  val Nodes_Original: DiagramNodes
  
  @JSName("Office.IMsoDiagram_typekey")
  var OfficeDotIMsoDiagram_typekey: IMsoDiagram
  
  val Parent: js.Any
  
  var Reverse: MsoTriState
  
  val Type: MsoDiagramType
}
object IMsoDiagram {
  
  @scala.inline
  def apply(
    Application: js.Any,
    AutoFormat: MsoTriState,
    AutoLayout: MsoTriState,
    Convert: MsoDiagramType => Unit,
    Creator: Double,
    FitText: () => Unit,
    Nodes: DiagramNodes,
    OfficeDotIMsoDiagram_typekey: IMsoDiagram,
    Parent: js.Any,
    Reverse: MsoTriState,
    Type: MsoDiagramType
  ): IMsoDiagram = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AutoFormat = AutoFormat.asInstanceOf[js.Any], AutoLayout = AutoLayout.asInstanceOf[js.Any], Convert = js.Any.fromFunction1(Convert), Creator = Creator.asInstanceOf[js.Any], FitText = js.Any.fromFunction0(FitText), Nodes = Nodes.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Reverse = Reverse.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.IMsoDiagram_typekey")(OfficeDotIMsoDiagram_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMsoDiagram]
  }
  
  @scala.inline
  implicit class IMsoDiagramMutableBuilder[Self <: IMsoDiagram] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoFormat(value: MsoTriState): Self = StObject.set(x, "AutoFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoLayout(value: MsoTriState): Self = StObject.set(x, "AutoLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConvert(value: MsoDiagramType => Unit): Self = StObject.set(x, "Convert", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFitText(value: () => Unit): Self = StObject.set(x, "FitText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNodes(value: DiagramNodes): Self = StObject.set(x, "Nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficeDotIMsoDiagram_typekey(value: IMsoDiagram): Self = StObject.set(x, "Office.IMsoDiagram_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReverse(value: MsoTriState): Self = StObject.set(x, "Reverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: MsoDiagramType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
