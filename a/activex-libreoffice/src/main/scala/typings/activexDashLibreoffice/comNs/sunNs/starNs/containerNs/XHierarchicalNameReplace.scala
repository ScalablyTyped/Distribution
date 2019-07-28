package typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs

import typings.activexDashLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Replacement of hierarchical elements. */
trait XHierarchicalNameReplace extends XHierarchicalNameAccess {
  /** replaces the element at the specified name. */
  def replaceByHierarchicalName(aName: String, aElement: js.Any): Unit
}

object XHierarchicalNameReplace {
  @scala.inline
  def apply(
    acquire: () => Unit,
    getByHierarchicalName: String => js.Any,
    hasByHierarchicalName: String => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    replaceByHierarchicalName: (String, js.Any) => Unit
  ): XHierarchicalNameReplace = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getByHierarchicalName = js.Any.fromFunction1(getByHierarchicalName), hasByHierarchicalName = js.Any.fromFunction1(hasByHierarchicalName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), replaceByHierarchicalName = js.Any.fromFunction2(replaceByHierarchicalName))
  
    __obj.asInstanceOf[XHierarchicalNameReplace]
  }
}

