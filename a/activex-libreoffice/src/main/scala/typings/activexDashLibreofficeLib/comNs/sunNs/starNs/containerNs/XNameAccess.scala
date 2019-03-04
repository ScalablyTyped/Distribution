package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is used to access named objects within a container.
  *
  * To implement inaccurate name access, support the {@link com.sun.star.beans.XExactName} interface.
  * @see com.sun.star.beans.XExactName
  */
trait XNameAccess extends XElementAccess {
  /** @returns a sequence of all element names in this container.  The order of the names is not specified. */
  val ElementNames: activexDashInteropLib.SafeArray[java.lang.String]
  /**
    * @param aName the name of the object.
    * @returns the object with the specified name.
    * @throws NoSuchElementException if an element under Name does not exist.
    * @throws com::sun::star::lang::WrappedTargetException If the implementation has internal reasons for exceptions, then wrap these in a {@link com.sun.star.
    */
  def getByName(aName: java.lang.String): js.Any
  /** @returns a sequence of all element names in this container.  The order of the names is not specified. */
  def getElementNames(): activexDashInteropLib.SafeArray[java.lang.String]
  /**
    * @param aName the name of the object.
    * @returns `TRUE` if an element with this name is in the container, `FALSE` otherwise.  In many cases the next call is {@link XNameAccess.getByName()} . You
    */
  def hasByName(aName: java.lang.String): scala.Boolean
}

object XNameAccess {
  @scala.inline
  def apply(
    ElementNames: activexDashInteropLib.SafeArray[java.lang.String],
    ElementType: activexDashLibreofficeLib.`type`,
    acquire: js.Function0[scala.Unit],
    getByName: js.Function1[java.lang.String, js.Any],
    getElementNames: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    hasByName: js.Function1[java.lang.String, scala.Boolean],
    hasElements: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XNameAccess = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames, ElementType = ElementType, acquire = acquire, getByName = getByName, getElementNames = getElementNames, getElementType = getElementType, hasByName = hasByName, hasElements = hasElements, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XNameAccess]
  }
}

