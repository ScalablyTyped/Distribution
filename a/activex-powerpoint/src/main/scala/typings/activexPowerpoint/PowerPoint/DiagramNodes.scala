package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagramNodes extends StObject {
  
  val Application: Any
  
  val Count: Double
  
  val Creator: Double
  
  def Item(Index: Any): DiagramNode
  
  val Parent: Any
  
  /* private */ @JSName("PowerPoint.DiagramNodes_typekey")
  var PowerPointDotDiagramNodes_typekey: DiagramNodes
  
  def SelectAll(): Unit
}
object DiagramNodes {
  
  inline def apply(
    Application: Any,
    Count: Double,
    Creator: Double,
    Item: Any => DiagramNode,
    Parent: Any,
    PowerPointDotDiagramNodes_typekey: DiagramNodes,
    SelectAll: () => Unit
  ): DiagramNodes = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], SelectAll = js.Any.fromFunction0(SelectAll))
    __obj.updateDynamic("PowerPoint.DiagramNodes_typekey")(PowerPointDotDiagramNodes_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramNodes]
  }
  
  extension [Self <: DiagramNodes](x: Self) {
    
    inline def setApplication(value: Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Any => DiagramNode): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotDiagramNodes_typekey(value: DiagramNodes): Self = StObject.set(x, "PowerPoint.DiagramNodes_typekey", value.asInstanceOf[js.Any])
    
    inline def setSelectAll(value: () => Unit): Self = StObject.set(x, "SelectAll", js.Any.fromFunction0(value))
  }
}
