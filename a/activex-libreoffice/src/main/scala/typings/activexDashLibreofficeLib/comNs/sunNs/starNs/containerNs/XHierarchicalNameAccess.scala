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

