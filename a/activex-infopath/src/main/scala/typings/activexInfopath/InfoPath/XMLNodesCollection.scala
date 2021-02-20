package typings.activexInfopath.InfoPath

import typings.activexMsxml2.MSXML2.IXMLDOMNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XMLNodesCollection extends StObject {
  
  val Count: Double = js.native
  
  @JSName("InfoPath.XMLNodesCollection_typekey")
  var InfoPathDotXMLNodesCollection_typekey: XMLNodesCollection = js.native
  
  def Item(varIndex: js.Any): IXMLDOMNode = js.native
}
object XMLNodesCollection {
  
  @scala.inline
  def apply(
    Count: Double,
    InfoPathDotXMLNodesCollection_typekey: XMLNodesCollection,
    Item: js.Any => IXMLDOMNode
  ): XMLNodesCollection = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.updateDynamic("InfoPath.XMLNodesCollection_typekey")(InfoPathDotXMLNodesCollection_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[XMLNodesCollection]
  }
  
  @scala.inline
  implicit class XMLNodesCollectionMutableBuilder[Self <: XMLNodesCollection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoPathDotXMLNodesCollection_typekey(value: XMLNodesCollection): Self = StObject.set(x, "InfoPath.XMLNodesCollection_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: js.Any => IXMLDOMNode): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
  }
}
