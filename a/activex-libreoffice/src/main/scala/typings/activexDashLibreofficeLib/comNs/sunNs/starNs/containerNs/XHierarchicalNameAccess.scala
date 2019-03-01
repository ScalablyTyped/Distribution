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
    acquire: js.Function0[scala.Unit],
    getByHierarchicalName: js.Function1[java.lang.String, js.Any],
    hasByHierarchicalName: js.Function1[java.lang.String, scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XHierarchicalNameAccess = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getByHierarchicalName")(getByHierarchicalName)
    __obj.updateDynamic("hasByHierarchicalName")(hasByHierarchicalName)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XHierarchicalNameAccess]
  }
}

