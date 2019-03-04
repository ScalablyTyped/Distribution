package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies an element's attributes.
  *
  * This interface describes a name-type-value triple which describes a single attribute of a tag. Implementors are encouraged to implement the {@link
  * com.sun.star.util.XCloneable} interface also to allow the user to make a copy of the instance.
  *
  * This interface is a poor IDL version of the Java interface **org.xml.sax.AttributeList** . For example in getValueByName, it does not allow to
  * distinguish a missing value (for which the Java interface returns null) from an empty string value.
  */
trait XAttributeList
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns the number of attributes in this list. */
  val Length: scala.Double
  /** @returns the number of attributes in this list. */
  def getLength(): scala.Double
  /** @returns the name of an attribute in this list (by position). */
  def getNameByIndex(i: scala.Double): java.lang.String
  /** @returns the type of an attribute in the list (by position). Non-validating parsers may return CDATA only. */
  def getTypeByIndex(i: scala.Double): java.lang.String
  /** @returns the type of an attribute in the list (by name). Non-validating parsers may return CDATA only. */
  def getTypeByName(aName: java.lang.String): java.lang.String
  /** @returns the value of an attribute in the list (by position). */
  def getValueByIndex(i: scala.Double): java.lang.String
  /** @returns the value of an attribute in the list (by name). */
  def getValueByName(aName: java.lang.String): java.lang.String
}

object XAttributeList {
  @scala.inline
  def apply(
    Length: scala.Double,
    acquire: js.Function0[scala.Unit],
    getLength: js.Function0[scala.Double],
    getNameByIndex: js.Function1[scala.Double, java.lang.String],
    getTypeByIndex: js.Function1[scala.Double, java.lang.String],
    getTypeByName: js.Function1[java.lang.String, java.lang.String],
    getValueByIndex: js.Function1[scala.Double, java.lang.String],
    getValueByName: js.Function1[java.lang.String, java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XAttributeList = {
    val __obj = js.Dynamic.literal(Length = Length, acquire = acquire, getLength = getLength, getNameByIndex = getNameByIndex, getTypeByIndex = getTypeByIndex, getTypeByName = getTypeByName, getValueByIndex = getValueByIndex, getValueByName = getValueByName, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XAttributeList]
  }
}

