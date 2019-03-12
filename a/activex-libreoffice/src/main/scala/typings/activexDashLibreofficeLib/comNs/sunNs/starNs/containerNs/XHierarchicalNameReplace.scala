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
    acquire: () => scala.Unit,
    getByHierarchicalName: java.lang.String => js.Any,
    hasByHierarchicalName: java.lang.String => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    replaceByHierarchicalName: (java.lang.String, js.Any) => scala.Unit
  ): XHierarchicalNameReplace = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getByHierarchicalName = js.Any.fromFunction1(getByHierarchicalName), hasByHierarchicalName = js.Any.fromFunction1(hasByHierarchicalName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), replaceByHierarchicalName = js.Any.fromFunction2(replaceByHierarchicalName))
  
    __obj.asInstanceOf[XHierarchicalNameReplace]
  }
}

