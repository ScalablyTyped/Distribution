package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies the fully qualified name of the object within a hierarchy.
  *
  * The name is generally globally unique in the hierarchy.
  * @see com.sun.star.container.XHierarchicalNameAccess
  * @see com.sun.star.container.XNamed
  */
trait XHierarchicalName
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns the fully qualified hierarchical name of the object. */
  val HierarchicalName: java.lang.String
  /**
    * builds the hierarchical name of an object, given a relative name
    *
    * Can be used to find the name of a descendant object in the hierarchy without actually accessing it.
    * @see XHierarchicalNameAccess.hasByHierarchicalName
    */
  def composeHierarchicalName(aRelativeName: java.lang.String): java.lang.String
  /** @returns the fully qualified hierarchical name of the object. */
  def getHierarchicalName(): java.lang.String
}

object XHierarchicalName {
  @scala.inline
  def apply(
    HierarchicalName: java.lang.String,
    acquire: js.Function0[scala.Unit],
    composeHierarchicalName: js.Function1[java.lang.String, java.lang.String],
    getHierarchicalName: js.Function0[java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XHierarchicalName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("HierarchicalName")(HierarchicalName)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("composeHierarchicalName")(composeHierarchicalName)
    __obj.updateDynamic("getHierarchicalName")(getHierarchicalName)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XHierarchicalName]
  }
}

