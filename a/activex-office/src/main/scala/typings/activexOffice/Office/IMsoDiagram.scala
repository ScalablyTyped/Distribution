package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMsoDiagram extends StObject {
  
  val Application: Any
  
  var AutoFormat: MsoTriState
  
  var AutoLayout: MsoTriState
  
  def Convert(Type: MsoDiagramType): Unit
  
  val Creator: Double
  
  def FitText(): Unit
  
  def Nodes(Index: Any): DiagramNode
  @JSName("Nodes")
  val Nodes_Original: DiagramNodes
  
  /* private */ @JSName("Office.IMsoDiagram_typekey")
  var OfficeDotIMsoDiagram_typekey: IMsoDiagram
  
  val Parent: Any
  
  var Reverse: MsoTriState
  
  val Type: MsoDiagramType
}
object IMsoDiagram {
  
  inline def apply(
    Application: Any,
    AutoFormat: MsoTriState,
    AutoLayout: MsoTriState,
    Convert: MsoDiagramType => Unit,
    Creator: Double,
    FitText: () => Unit,
    Nodes: DiagramNodes,
    OfficeDotIMsoDiagram_typekey: IMsoDiagram,
    Parent: Any,
    Reverse: MsoTriState,
    Type: MsoDiagramType
  ): IMsoDiagram = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AutoFormat = AutoFormat.asInstanceOf[js.Any], AutoLayout = AutoLayout.asInstanceOf[js.Any], Convert = js.Any.fromFunction1(Convert), Creator = Creator.asInstanceOf[js.Any], FitText = js.Any.fromFunction0(FitText), Nodes = Nodes.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Reverse = Reverse.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.IMsoDiagram_typekey")(OfficeDotIMsoDiagram_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMsoDiagram]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IMsoDiagram] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setAutoFormat(value: MsoTriState): Self = StObject.set(x, "AutoFormat", value.asInstanceOf[js.Any])
    
    inline def setAutoLayout(value: MsoTriState): Self = StObject.set(x, "AutoLayout", value.asInstanceOf[js.Any])
    
    inline def setConvert(value: MsoDiagramType => Unit): Self = StObject.set(x, "Convert", js.Any.fromFunction1(value))
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setFitText(value: () => Unit): Self = StObject.set(x, "FitText", js.Any.fromFunction0(value))
    
    inline def setNodes(value: DiagramNodes): Self = StObject.set(x, "Nodes", value.asInstanceOf[js.Any])
    
    inline def setOfficeDotIMsoDiagram_typekey(value: IMsoDiagram): Self = StObject.set(x, "Office.IMsoDiagram_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setReverse(value: MsoTriState): Self = StObject.set(x, "Reverse", value.asInstanceOf[js.Any])
    
    inline def setType(value: MsoDiagramType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
