package typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.inputNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An element's attributes */
trait XAttributes extends XInterface {
  /**
    * Gets the number of attributes.
    * @returns number of attributes
    */
  val Length: Double
  /**
    * Gets attribute index passing a QName.
    * @param qName QName
    * @returns attribute index or -1, if not found
    */
  def getIndexByQName(qName: String): Double
  /**
    * Gets attribute index passing a namespace uid and a local name.
    * @param uid namespace uid
    * @param localName local name
    * @returns attribute index or -1, if not found
    */
  def getIndexByUidName(uid: Double, localName: String): Double
  /**
    * Gets the number of attributes.
    * @returns number of attributes
    */
  def getLength(): Double
  /**
    * Gets the local name of an attribute.
    * @param nIndex index
    * @returns local name of attribute or empty string, if invalid index
    */
  def getLocalNameByIndex(nIndex: Double): String
  /**
    * Gets the QName of an attribute.
    * @param nIndex index
    * @returns QName of attribute or empty string, if invalid index
    */
  def getQNameByIndex(nIndex: Double): String
  /**
    * Gets the type of an attribute, if possible.
    * @param nIndex index
    * @returns type of attribute (if possible, else empty string)
    */
  def getTypeByIndex(nIndex: Double): String
  /**
    * Gets the namespace uid of an attribute.
    * @param nIndex index
    * @returns namespace uid of attribute or -1, if invalid index
    */
  def getUidByIndex(nIndex: Double): Double
  /**
    * Gets the value of an attribute.
    * @param nIndex index
    * @returns value string or empty string, if invalid index
    */
  def getValueByIndex(nIndex: Double): String
  /**
    * For convenience: Gets the value of an attribute passing uid, local name.
    * @param uid namespace uid
    * @param localName local name
    * @returns value string or empty string, if invalid uid/local name
    */
  def getValueByUidName(uid: Double, localName: String): String
}

object XAttributes {
  @scala.inline
  def apply(
    Length: Double,
    acquire: () => Unit,
    getIndexByQName: String => Double,
    getIndexByUidName: (Double, String) => Double,
    getLength: () => Double,
    getLocalNameByIndex: Double => String,
    getQNameByIndex: Double => String,
    getTypeByIndex: Double => String,
    getUidByIndex: Double => Double,
    getValueByIndex: Double => String,
    getValueByUidName: (Double, String) => String,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XAttributes = {
    val __obj = js.Dynamic.literal(Length = Length, acquire = js.Any.fromFunction0(acquire), getIndexByQName = js.Any.fromFunction1(getIndexByQName), getIndexByUidName = js.Any.fromFunction2(getIndexByUidName), getLength = js.Any.fromFunction0(getLength), getLocalNameByIndex = js.Any.fromFunction1(getLocalNameByIndex), getQNameByIndex = js.Any.fromFunction1(getQNameByIndex), getTypeByIndex = js.Any.fromFunction1(getTypeByIndex), getUidByIndex = js.Any.fromFunction1(getUidByIndex), getValueByIndex = js.Any.fromFunction1(getValueByIndex), getValueByUidName = js.Any.fromFunction2(getValueByUidName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XAttributes]
  }
}

