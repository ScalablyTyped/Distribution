package typings.activexDashMsxml2.MSXML2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line:interface-name
@js.native
trait IXMLDOMNamedNodeMap extends js.Object {
  /** number of nodes in the collection */
  val length: Double = js.native
  /** collection of nodes */
  def apply(index: Double): IXMLDOMNode = js.native
  /** lookup item by name */
  def getNamedItem(name: String): IXMLDOMNode = js.native
  /** lookup the item by name and namespace */
  def getQualifiedItem(baseName: String, namespaceURI: String): IXMLDOMNode = js.native
  /** collection of nodes */
  def item(index: Double): IXMLDOMNode = js.native
  /** get next node from iterator */
  def nextNode(): IXMLDOMNode = js.native
  /** remove item by name */
  def removeNamedItem(name: String): IXMLDOMNode = js.native
  /** remove the item by name and namespace */
  def removeQualifiedItem(baseName: String, namespaceURI: String): IXMLDOMNode = js.native
  /** reset the position of iterator */
  def reset(): Unit = js.native
  /** set item by name */
  def setNamedItem(newItem: IXMLDOMNode): IXMLDOMNode = js.native
}

