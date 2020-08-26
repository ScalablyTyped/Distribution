package typings.activexLibreoffice.com_.sun.star.xml.input

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An element's attributes */
@js.native
trait XAttributes extends XInterface {
  /**
    * Gets the number of attributes.
    * @returns number of attributes
    */
  val Length: Double = js.native
  /**
    * Gets attribute index passing a QName.
    * @param qName QName
    * @returns attribute index or -1, if not found
    */
  def getIndexByQName(qName: String): Double = js.native
  /**
    * Gets attribute index passing a namespace uid and a local name.
    * @param uid namespace uid
    * @param localName local name
    * @returns attribute index or -1, if not found
    */
  def getIndexByUidName(uid: Double, localName: String): Double = js.native
  /**
    * Gets the number of attributes.
    * @returns number of attributes
    */
  def getLength(): Double = js.native
  /**
    * Gets the local name of an attribute.
    * @param nIndex index
    * @returns local name of attribute or empty string, if invalid index
    */
  def getLocalNameByIndex(nIndex: Double): String = js.native
  /**
    * Gets the QName of an attribute.
    * @param nIndex index
    * @returns QName of attribute or empty string, if invalid index
    */
  def getQNameByIndex(nIndex: Double): String = js.native
  /**
    * Gets the type of an attribute, if possible.
    * @param nIndex index
    * @returns type of attribute (if possible, else empty string)
    */
  def getTypeByIndex(nIndex: Double): String = js.native
  /**
    * Gets the namespace uid of an attribute.
    * @param nIndex index
    * @returns namespace uid of attribute or -1, if invalid index
    */
  def getUidByIndex(nIndex: Double): Double = js.native
  /**
    * Gets the value of an attribute.
    * @param nIndex index
    * @returns value string or empty string, if invalid index
    */
  def getValueByIndex(nIndex: Double): String = js.native
  /**
    * For convenience: Gets the value of an attribute passing uid, local name.
    * @param uid namespace uid
    * @param localName local name
    * @returns value string or empty string, if invalid uid/local name
    */
  def getValueByUidName(uid: Double, localName: String): String = js.native
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
    val __obj = js.Dynamic.literal(Length = Length.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getIndexByQName = js.Any.fromFunction1(getIndexByQName), getIndexByUidName = js.Any.fromFunction2(getIndexByUidName), getLength = js.Any.fromFunction0(getLength), getLocalNameByIndex = js.Any.fromFunction1(getLocalNameByIndex), getQNameByIndex = js.Any.fromFunction1(getQNameByIndex), getTypeByIndex = js.Any.fromFunction1(getTypeByIndex), getUidByIndex = js.Any.fromFunction1(getUidByIndex), getValueByIndex = js.Any.fromFunction1(getValueByIndex), getValueByUidName = js.Any.fromFunction2(getValueByUidName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XAttributes]
  }
  @scala.inline
  implicit class XAttributesOps[Self <: XAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLength(value: Double): Self = this.set("Length", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetIndexByQName(value: String => Double): Self = this.set("getIndexByQName", js.Any.fromFunction1(value))
    @scala.inline
    def setGetIndexByUidName(value: (Double, String) => Double): Self = this.set("getIndexByUidName", js.Any.fromFunction2(value))
    @scala.inline
    def setGetLength(value: () => Double): Self = this.set("getLength", js.Any.fromFunction0(value))
    @scala.inline
    def setGetLocalNameByIndex(value: Double => String): Self = this.set("getLocalNameByIndex", js.Any.fromFunction1(value))
    @scala.inline
    def setGetQNameByIndex(value: Double => String): Self = this.set("getQNameByIndex", js.Any.fromFunction1(value))
    @scala.inline
    def setGetTypeByIndex(value: Double => String): Self = this.set("getTypeByIndex", js.Any.fromFunction1(value))
    @scala.inline
    def setGetUidByIndex(value: Double => Double): Self = this.set("getUidByIndex", js.Any.fromFunction1(value))
    @scala.inline
    def setGetValueByIndex(value: Double => String): Self = this.set("getValueByIndex", js.Any.fromFunction1(value))
    @scala.inline
    def setGetValueByUidName(value: (Double, String) => String): Self = this.set("getValueByUidName", js.Any.fromFunction2(value))
  }
  
}

