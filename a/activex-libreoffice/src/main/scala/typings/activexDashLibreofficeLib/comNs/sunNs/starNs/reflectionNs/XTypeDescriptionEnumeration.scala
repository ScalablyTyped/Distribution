package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines an enumeration for type descriptions.
  * @since OOo 1.1.2
  */
trait XTypeDescriptionEnumeration
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumeration {
  /**
    * Returns the next element of the enumeration.
    * @returns the next element of this enumeration.
    * @throws com::sun::star::container::NoSuchElementException if no more elements exist.
    */
  def nextTypeDescription(): XTypeDescription
}

object XTypeDescriptionEnumeration {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    hasMoreElements: () => scala.Boolean,
    nextElement: () => js.Any,
    nextTypeDescription: () => XTypeDescription,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XTypeDescriptionEnumeration = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), hasMoreElements = js.Any.fromFunction0(hasMoreElements), nextElement = js.Any.fromFunction0(nextElement), nextTypeDescription = js.Any.fromFunction0(nextTypeDescription), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XTypeDescriptionEnumeration]
  }
}

