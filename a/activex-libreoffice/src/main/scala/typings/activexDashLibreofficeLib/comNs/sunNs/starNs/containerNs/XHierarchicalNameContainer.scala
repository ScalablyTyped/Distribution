package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Insertion and removal of hierarchical elements. */
trait XHierarchicalNameContainer extends XHierarchicalNameReplace {
  /** inserts the element at the specified name. */
  def insertByHierarchicalName(aName: java.lang.String, aElement: js.Any): scala.Unit
  /** removes the element at the specified name. */
  def removeByHierarchicalName(Name: java.lang.String): scala.Unit
}

object XHierarchicalNameContainer {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    getByHierarchicalName: java.lang.String => js.Any,
    hasByHierarchicalName: java.lang.String => scala.Boolean,
    insertByHierarchicalName: (java.lang.String, js.Any) => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeByHierarchicalName: java.lang.String => scala.Unit,
    replaceByHierarchicalName: (java.lang.String, js.Any) => scala.Unit
  ): XHierarchicalNameContainer = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getByHierarchicalName = js.Any.fromFunction1(getByHierarchicalName), hasByHierarchicalName = js.Any.fromFunction1(hasByHierarchicalName), insertByHierarchicalName = js.Any.fromFunction2(insertByHierarchicalName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByHierarchicalName = js.Any.fromFunction1(removeByHierarchicalName), replaceByHierarchicalName = js.Any.fromFunction2(replaceByHierarchicalName))
  
    __obj.asInstanceOf[XHierarchicalNameContainer]
  }
}

