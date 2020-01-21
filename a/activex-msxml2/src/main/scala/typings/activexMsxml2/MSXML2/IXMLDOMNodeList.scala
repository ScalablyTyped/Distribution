package typings.activexMsxml2.MSXML2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line:interface-name
@js.native
trait IXMLDOMNodeList extends js.Object {
  /** number of nodes in the collection */
  val length: Double = js.native
  /** collection of nodes */
  def apply(index: Double): IXMLDOMNode = js.native
  /** collection of nodes */
  def item(index: Double): IXMLDOMNode = js.native
  /** get next node from iterator */
  def nextNode(): IXMLDOMNode = js.native
  /** reset the position of iterator */
  def reset(): Unit = js.native
}

