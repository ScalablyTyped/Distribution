package typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.domNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XNodeList extends XInterface {
  /** The number of nodes in the list. */
  val Length: Double
  /** The number of nodes in the list. */
  def getLength(): Double
  /** Returns a node specified by index in the collection. */
  def item(index: Double): XNode
}

object XNodeList {
  @scala.inline
  def apply(
    Length: Double,
    acquire: () => Unit,
    getLength: () => Double,
    item: Double => XNode,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XNodeList = {
    val __obj = js.Dynamic.literal(Length = Length, acquire = js.Any.fromFunction0(acquire), getLength = js.Any.fromFunction0(getLength), item = js.Any.fromFunction1(item), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XNodeList]
  }
}

