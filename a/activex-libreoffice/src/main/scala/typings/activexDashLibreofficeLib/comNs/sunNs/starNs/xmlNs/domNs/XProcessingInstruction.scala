package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XProcessingInstruction extends XNode {
  /** The content of this processing instruction. */
  var Data: java.lang.String
  /** The target of this processing instruction. */
  val Target: java.lang.String
  /** The content of this processing instruction. */
  def getData(): java.lang.String
  /** The target of this processing instruction. */
  def getTarget(): java.lang.String
  /** The content of this processing instruction. Throws: {@link DOMException} - NO_MODIFICATION_ALLOWED_ERR: Raised when the node is readonly. */
  def setData(data: java.lang.String): scala.Unit
}

