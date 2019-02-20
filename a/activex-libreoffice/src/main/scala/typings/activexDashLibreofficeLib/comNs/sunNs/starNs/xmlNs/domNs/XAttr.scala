package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XAttr extends XNode {
  /** Returns the name of this attribute. */
  val Name: java.lang.String
  /** The Element node this attribute is attached to or null if this attribute is not in use. */
  val OwnerElement: XElement
  /** If this attribute was explicitly given a value in the original document, this is true; otherwise, it is false. */
  val Specified: scala.Boolean
  /** On retrieval, the value of the attribute is returned as a string. */
  var Value: java.lang.String
  /** Returns the name of this attribute. */
  def getName(): java.lang.String
  /** The Element node this attribute is attached to or null if this attribute is not in use. */
  def getOwnerElement(): XElement
  /** If this attribute was explicitly given a value in the original document, this is true; otherwise, it is false. */
  def getSpecified(): scala.Boolean
  /** On retrieval, the value of the attribute is returned as a string. */
  def getValue(): java.lang.String
  /** Sets the value of the attribute from a string. Throws: {@link DOMException} - NO_MODIFICATION_ALLOWED_ERR: Raised when the node is readonly. */
  def setValue(value: java.lang.String): scala.Unit
}

