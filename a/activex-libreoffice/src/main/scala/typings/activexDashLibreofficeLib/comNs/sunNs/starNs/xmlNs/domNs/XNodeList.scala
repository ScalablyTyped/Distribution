package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XNodeList
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** The number of nodes in the list. */
  val Length: scala.Double
  /** The number of nodes in the list. */
  def getLength(): scala.Double
  /** Returns a node specified by index in the collection. */
  def item(index: scala.Double): XNode
}

object XNodeList {
  @scala.inline
  def apply(
    Length: scala.Double,
    acquire: () => scala.Unit,
    getLength: () => scala.Double,
    item: scala.Double => XNode,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XNodeList = {
    val __obj = js.Dynamic.literal(Length = Length, acquire = js.Any.fromFunction0(acquire), getLength = js.Any.fromFunction0(getLength), item = js.Any.fromFunction1(item), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XNodeList]
  }
}

