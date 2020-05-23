package typings.activexInfopath.InfoPath

import typings.activexMsxml2.MSXML2.IXMLDOMNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XMLNodesCollection extends js.Object {
  val Count: Double
  @JSName("InfoPath.XMLNodesCollection_typekey")
  var InfoPathDotXMLNodesCollection_typekey: XMLNodesCollection
  def Item(varIndex: js.Any): IXMLDOMNode
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
}

