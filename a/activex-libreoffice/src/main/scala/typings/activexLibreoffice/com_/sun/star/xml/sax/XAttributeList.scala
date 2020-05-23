package typings.activexLibreoffice.com_.sun.star.xml.sax

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
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
trait XAttributeList extends XInterface {
  /** @returns the number of attributes in this list. */
  val Length: Double
  /** @returns the number of attributes in this list. */
  def getLength(): Double
  /** @returns the name of an attribute in this list (by position). */
  def getNameByIndex(i: Double): String
  /** @returns the type of an attribute in the list (by position). Non-validating parsers may return CDATA only. */
  def getTypeByIndex(i: Double): String
  /** @returns the type of an attribute in the list (by name). Non-validating parsers may return CDATA only. */
  def getTypeByName(aName: String): String
  /** @returns the value of an attribute in the list (by position). */
  def getValueByIndex(i: Double): String
  /** @returns the value of an attribute in the list (by name). */
  def getValueByName(aName: String): String
}

object XAttributeList {
  @scala.inline
  def apply(
    Length: Double,
    acquire: () => Unit,
    getLength: () => Double,
    getNameByIndex: Double => String,
    getTypeByIndex: Double => String,
    getTypeByName: String => String,
    getValueByIndex: Double => String,
    getValueByName: String => String,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XAttributeList = {
    val __obj = js.Dynamic.literal(Length = Length.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getLength = js.Any.fromFunction0(getLength), getNameByIndex = js.Any.fromFunction1(getNameByIndex), getTypeByIndex = js.Any.fromFunction1(getTypeByIndex), getTypeByName = js.Any.fromFunction1(getTypeByName), getValueByIndex = js.Any.fromFunction1(getValueByIndex), getValueByName = js.Any.fromFunction1(getValueByName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XAttributeList]
  }
}

