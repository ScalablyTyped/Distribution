package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides functionality to enumerate the contents of a container.
  *
  * An object that implements the {@link XEnumeration} interface generates a series of elements, one at a time. Successive calls to the
  * `XEnumeration::nextElement` method return successive elements of the series.
  *
  * For example (Java), to print all elements of a vector **aVect** :
  *
  * {{program example here, see documentation}}
  *
  *
  *
  * If the object changed, the behavior of the enumeration is not specified. This is not a remote interface.
  */
trait XEnumeration
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** tests whether this enumeration contains more elements. */
  def hasMoreElements(): scala.Boolean
  /**
    * @returns the next element of this enumeration.
    * @throws NoSuchElementException if no more elements exist.
    * @throws com::sun::star::lang::WrappedTargetException If the implementation has internal reasons for exceptions, then wrap these in a {@link com.sun.star.
    */
  def nextElement(): js.Any
}

object XEnumeration {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    hasMoreElements: js.Function0[scala.Boolean],
    nextElement: js.Function0[js.Any],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XEnumeration = {
    val __obj = js.Dynamic.literal(acquire = acquire, hasMoreElements = hasMoreElements, nextElement = nextElement, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XEnumeration]
  }
}

