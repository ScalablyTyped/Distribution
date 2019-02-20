package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.inputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An element's attributes */
trait XAttributes
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Gets the number of attributes.
    * @returns number of attributes
    */
  val Length: scala.Double
  /**
    * Gets attribute index passing a QName.
    * @param qName QName
    * @returns attribute index or -1, if not found
    */
  def getIndexByQName(qName: java.lang.String): scala.Double
  /**
    * Gets attribute index passing a namespace uid and a local name.
    * @param uid namespace uid
    * @param localName local name
    * @returns attribute index or -1, if not found
    */
  def getIndexByUidName(uid: scala.Double, localName: java.lang.String): scala.Double
  /**
    * Gets the number of attributes.
    * @returns number of attributes
    */
  def getLength(): scala.Double
  /**
    * Gets the local name of an attribute.
    * @param nIndex index
    * @returns local name of attribute or empty string, if invalid index
    */
  def getLocalNameByIndex(nIndex: scala.Double): java.lang.String
  /**
    * Gets the QName of an attribute.
    * @param nIndex index
    * @returns QName of attribute or empty string, if invalid index
    */
  def getQNameByIndex(nIndex: scala.Double): java.lang.String
  /**
    * Gets the type of an attribute, if possible.
    * @param nIndex index
    * @returns type of attribute (if possible, else empty string)
    */
  def getTypeByIndex(nIndex: scala.Double): java.lang.String
  /**
    * Gets the namespace uid of an attribute.
    * @param nIndex index
    * @returns namespace uid of attribute or -1, if invalid index
    */
  def getUidByIndex(nIndex: scala.Double): scala.Double
  /**
    * Gets the value of an attribute.
    * @param nIndex index
    * @returns value string or empty string, if invalid index
    */
  def getValueByIndex(nIndex: scala.Double): java.lang.String
  /**
    * For convenience: Gets the value of an attribute passing uid, local name.
    * @param uid namespace uid
    * @param localName local name
    * @returns value string or empty string, if invalid uid/local name
    */
  def getValueByUidName(uid: scala.Double, localName: java.lang.String): java.lang.String
}

