package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Implement this interface to give access to the attributes of a text.
  * @since OOo 2.0.4
  */
trait XAccessibleTextAttributes extends js.Object {
  /**
    * Get the default attribute set for the text.
    *
    * Returns a set of all default paragraph and default character attributes that are associated for the text. To prevent the method from returning
    * possibly large sets of attributes that the caller is not interested in the caller can provide a list of attributes that he wants to be returned.
    * @param RequestedAttributes This string sequence defines the set of attributes that the caller is interested in. When there are requested attributes that
    * @returns Returns the requested attributes of the text. Each attribute is represented by a {@link com.sun.star.beans.PropertyValue} object.
    */
  def getDefaultAttributes(RequestedAttributes: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]): stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  /**
    * Get the run attribute set for the specified position.
    *
    * Returns a set of character attributes that are associated for the character at the given index and are directly set or are set via a character style.
    * To prevent the method from returning all of these attributes the caller can provide a list of attributes that he wants to be returned.
    * @param Index The index of the character for which to return its attributes. The valid range is 0..length of text-1.
    * @param RequestedAttributes This string sequence defines the set of attributes that the caller is interested in. When there are requested attributes that
    * @returns Returns the requested attributes of the specified character. Each attribute is represented by a {@link com.sun.star.beans.PropertyValue} object.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the index is invalid
    */
  def getRunAttributes(
    Index: scala.Double,
    RequestedAttributes: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]
  ): stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
}

object XAccessibleTextAttributes {
  @scala.inline
  def apply(
    getDefaultAttributes: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String] => stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    getRunAttributes: (scala.Double, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]) => stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): XAccessibleTextAttributes = {
    val __obj = js.Dynamic.literal(getDefaultAttributes = js.Any.fromFunction1(getDefaultAttributes), getRunAttributes = js.Any.fromFunction2(getRunAttributes))
  
    __obj.asInstanceOf[XAccessibleTextAttributes]
  }
}

