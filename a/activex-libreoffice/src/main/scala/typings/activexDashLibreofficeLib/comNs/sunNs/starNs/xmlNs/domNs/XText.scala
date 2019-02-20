package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XText extends XCharacterData {
  /**
    * Breaks this node into two nodes at the specified offset, keeping both in the tree as siblings. Throws: {@link DOMException} - INDEX_SIZE_ERR: Raised
    * if the specified offset is negative or greater than the number of 16-bit units in data. NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly.
    */
  def splitText(offset: scala.Double): XText
}

