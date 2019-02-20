package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XCharacterData extends XNode {
  /**
    * Return the character data of the node that implements this interface. Throws: {@link DOMException} - NO_MODIFICATION_ALLOWED_ERR: Raised when the node
    * is readonly. {@link DOMException} - DOMSTRING_SIZE_ERR: Raised when it would return more characters than fit in a DOMString variable on the
    * implementation platform.
    */
  var Data: java.lang.String
  /** The number of 16-bit units that are available through data and the substringData method below. */
  val Length: scala.Double
  /**
    * Append the string to the end of the character data of the node. Throws: {@link DOMException} - NO_MODIFICATION_ALLOWED_ERR: Raised if this node is
    * readonly.
    */
  def appendData(arg: java.lang.String): scala.Unit
  /**
    * Remove a range of 16-bit units from the node. Throws: {@link DOMException} - INDEX_SIZE_ERR: Raised if the specified offset is negative or greater
    * than the number of 16-bit units in data, or if the specified count is negative. NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly.
    */
  def deleteData(offset: scala.Double, count: scala.Double): scala.Unit
  /**
    * Return the character data of the node that implements this interface. Throws: {@link DOMException} - NO_MODIFICATION_ALLOWED_ERR: Raised when the node
    * is readonly. {@link DOMException} - DOMSTRING_SIZE_ERR: Raised when it would return more characters than fit in a DOMString variable on the
    * implementation platform.
    */
  def getData(): java.lang.String
  /** The number of 16-bit units that are available through data and the substringData method below. */
  def getLength(): scala.Double
  /**
    * Insert a string at the specified 16-bit unit offset. Throws: {@link DOMException} - INDEX_SIZE_ERR: Raised if the specified offset is negative or
    * greater than the number of 16-bit units in data. NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly.
    */
  def insertData(offset: scala.Double, arg: java.lang.String): scala.Unit
  /**
    * Replace the characters starting at the specified 16-bit unit offset with the specified string. Throws; {@link DOMException} - INDEX_SIZE_ERR: Raised
    * if the specified offset is negative or greater than the number of 16-bit units in data, or if the specified count is negative.
    * NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly.
    */
  def replaceData(offset: scala.Double, count: scala.Double, arg: java.lang.String): scala.Unit
  /**
    * Set the character data of the node that implements this interface. Throws: {@link DOMException} - NO_MODIFICATION_ALLOWED_ERR: Raised when the node is
    * readonly. {@link DOMException} - DOMSTRING_SIZE_ERR: Raised when it would return more characters than fit in a DOMString variable on the
    * implementation platform.
    */
  def setData(data: java.lang.String): scala.Unit
  /**
    * Extracts a range of data from the node. Throws: {@link DOMException} - INDEX_SIZE_ERR: Raised if the specified offset is negative or greater than the
    * number of 16-bit units in data, or if the specified count is negative. DOMSTRING_SIZE_ERR: Raised if the specified range of text does not fit into a
    * DOMString.
    */
  def subStringData(offset: scala.Double, count: scala.Double): java.lang.String
}

