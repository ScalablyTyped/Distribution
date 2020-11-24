package typings.activexInfopath.InfoPath

import typings.activexMsxml2.MSXML2.IXMLDOMNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XMLNodesCollection extends js.Object {
  
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
  implicit class XMLNodesCollectionOps[Self <: XMLNodesCollection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoPathDotXMLNodesCollection_typekey(value: XMLNodesCollection): Self = this.set("InfoPath.XMLNodesCollection_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: js.Any => IXMLDOMNode): Self = this.set("Item", js.Any.fromFunction1(value))
  }
}
