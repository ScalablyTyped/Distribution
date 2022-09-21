package typings.activexInfopath.InfoPath

import typings.activexMsxml2.MSXML2.IXMLDOMNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XMLNodesCollection extends StObject {
  
  val Count: Double
  
  /* private */ @JSName("InfoPath.XMLNodesCollection_typekey")
  var InfoPathDotXMLNodesCollection_typekey: XMLNodesCollection
  
  def Item(varIndex: Any): IXMLDOMNode
}
object XMLNodesCollection {
  
  inline def apply(Count: Double, InfoPathDotXMLNodesCollection_typekey: XMLNodesCollection, Item: Any => IXMLDOMNode): XMLNodesCollection = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.updateDynamic("InfoPath.XMLNodesCollection_typekey")(InfoPathDotXMLNodesCollection_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[XMLNodesCollection]
  }
  
  extension [Self <: XMLNodesCollection](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setInfoPathDotXMLNodesCollection_typekey(value: XMLNodesCollection): Self = StObject.set(x, "InfoPath.XMLNodesCollection_typekey", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Any => IXMLDOMNode): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
  }
}
