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

