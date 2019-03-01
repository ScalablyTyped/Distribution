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
    acquire: js.Function0[scala.Unit],
    hasMoreElements: js.Function0[scala.Boolean],
    nextElement: js.Function0[js.Any],
    nextTypeDescription: js.Function0[XTypeDescription],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XTypeDescriptionEnumeration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("hasMoreElements")(hasMoreElements)
    __obj.updateDynamic("nextElement")(nextElement)
    __obj.updateDynamic("nextTypeDescription")(nextTypeDescription)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XTypeDescriptionEnumeration]
  }
}

