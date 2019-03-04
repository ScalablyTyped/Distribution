package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Replacement of hierarchical elements. */
trait XHierarchicalNameReplace extends XHierarchicalNameAccess {
  /** replaces the element at the specified name. */
  def replaceByHierarchicalName(aName: java.lang.String, aElement: js.Any): scala.Unit
}

object XHierarchicalNameReplace {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    getByHierarchicalName: js.Function1[java.lang.String, js.Any],
    hasByHierarchicalName: js.Function1[java.lang.String, scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    replaceByHierarchicalName: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): XHierarchicalNameReplace = {
    val __obj = js.Dynamic.literal(acquire = acquire, getByHierarchicalName = getByHierarchicalName, hasByHierarchicalName = hasByHierarchicalName, queryInterface = queryInterface, release = release, replaceByHierarchicalName = replaceByHierarchicalName)
  
    __obj.asInstanceOf[XHierarchicalNameReplace]
  }
}

