package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmartArt extends StObject {
  
  def AllNodes(Index: String): SmartArtNode
  def AllNodes(Index: Double): SmartArtNode
  @JSName("AllNodes")
  val AllNodes_Original: SmartArtNodes
  
  val Application: Any
  
  var Color: SmartArtColor
  
  val Creator: Double
  
  var Layout: SmartArtLayout
  
  def Nodes(Index: String): SmartArtNode
  def Nodes(Index: Double): SmartArtNode
  @JSName("Nodes")
  val Nodes_Original: SmartArtNodes
  
  /* private */ @JSName("Office.SmartArt_typekey")
  var OfficeDotSmartArt_typekey: SmartArt
  
  val Parent: Any
  
  var QuickStyle: SmartArtQuickStyle
  
  def Reset(): Unit
  
  var Reverse: MsoTriState
}
object SmartArt {
  
  inline def apply(
    AllNodes: SmartArtNodes,
    Application: Any,
    Color: SmartArtColor,
    Creator: Double,
    Layout: SmartArtLayout,
    Nodes: SmartArtNodes,
    OfficeDotSmartArt_typekey: SmartArt,
    Parent: Any,
    QuickStyle: SmartArtQuickStyle,
    Reset: () => Unit,
    Reverse: MsoTriState
  ): SmartArt = {
    val __obj = js.Dynamic.literal(AllNodes = AllNodes.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Layout = Layout.asInstanceOf[js.Any], Nodes = Nodes.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], QuickStyle = QuickStyle.asInstanceOf[js.Any], Reset = js.Any.fromFunction0(Reset), Reverse = Reverse.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.SmartArt_typekey")(OfficeDotSmartArt_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartArt]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SmartArt] (val x: Self) extends AnyVal {
    
    inline def setAllNodes(value: SmartArtNodes): Self = StObject.set(x, "AllNodes", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setColor(value: SmartArtColor): Self = StObject.set(x, "Color", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setLayout(value: SmartArtLayout): Self = StObject.set(x, "Layout", value.asInstanceOf[js.Any])
    
    inline def setNodes(value: SmartArtNodes): Self = StObject.set(x, "Nodes", value.asInstanceOf[js.Any])
    
    inline def setOfficeDotSmartArt_typekey(value: SmartArt): Self = StObject.set(x, "Office.SmartArt_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setQuickStyle(value: SmartArtQuickStyle): Self = StObject.set(x, "QuickStyle", value.asInstanceOf[js.Any])
    
    inline def setReset(value: () => Unit): Self = StObject.set(x, "Reset", js.Any.fromFunction0(value))
    
    inline def setReverse(value: MsoTriState): Self = StObject.set(x, "Reverse", value.asInstanceOf[js.Any])
  }
}
