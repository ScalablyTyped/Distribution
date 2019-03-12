package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is used to have hierarchical access to elements within a container.
  *
  * You address an object of a specific level in the hierarchy by giving its fully qualified name, e.g., "com.sun.star.uno.XInterface".
  *
  * To implement inaccurate name access, support the {@link com.sun.star.beans.XExactName} interface.
  * @see com.sun.star.beans.XExactName
  */
trait XHierarchicalNameAccess
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * @param aName the name of the object.
    * @returns the object with the specified name.
    * @throws NoSuchElementException if an element under Name does not exist.
    */
  def getByHierarchicalName(aName: java.lang.String): js.Any
  /**
    * @param aName the name of the object.
    * @returns `TRUE` if an element with this name is in the container, `FALSE` otherwise.  In many cases, the next call is {@link XNameAccess.getByName()} . Yo
    */
  def hasByHierarchicalName(aName: java.lang.String): scala.Boolean
}

object XHierarchicalNameAccess {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    getByHierarchicalName: java.lang.String => js.Any,
    hasByHierarchicalName: java.lang.String => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XHierarchicalNameAccess = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getByHierarchicalName = js.Any.fromFunction1(getByHierarchicalName), hasByHierarchicalName = js.Any.fromFunction1(hasByHierarchicalName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XHierarchicalNameAccess]
  }
}

