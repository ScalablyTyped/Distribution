package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This is the generic interface for supporting the replacement of elements with unique identifiers. */
trait XIdentifierReplace extends XIdentifierAccess {
  /**
    * replaces the element with the specified identifier.
    * @param Identifier specifies the identifier of the element that should be retrieved.
    * @param aElement the new element that replaces the old element for the specified identifier.
    * @throws com::sun::star::lang::IllegalArgumentException If the argument is not valid for this container.
    * @throws com::sun::star::lang::NoSuchElementException If the identifier is not existing.
    * @throws com::sun::star::lang::WrappedTargetException If the implementation has internal reasons for exceptions, then wrap these in a {@link com.sun.star.
    */
  def replaceByIdentifer(Identifier: scala.Double, aElement: js.Any): scala.Unit
}

