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
    acquire: js.Function0[scala.Unit],
    getLength: js.Function0[scala.Double],
    item: js.Function1[scala.Double, XNode],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XNodeList = {
    val __obj = js.Dynamic.literal(Length = Length, acquire = acquire, getLength = getLength, item = item, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XNodeList]
  }
}

