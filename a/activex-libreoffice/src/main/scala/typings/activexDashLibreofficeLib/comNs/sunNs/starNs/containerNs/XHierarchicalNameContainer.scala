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
    acquire: js.Function0[scala.Unit],
    getByHierarchicalName: js.Function1[java.lang.String, js.Any],
    hasByHierarchicalName: js.Function1[java.lang.String, scala.Boolean],
    insertByHierarchicalName: js.Function2[java.lang.String, js.Any, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeByHierarchicalName: js.Function1[java.lang.String, scala.Unit],
    replaceByHierarchicalName: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): XHierarchicalNameContainer = {
    val __obj = js.Dynamic.literal(acquire = acquire, getByHierarchicalName = getByHierarchicalName, hasByHierarchicalName = hasByHierarchicalName, insertByHierarchicalName = insertByHierarchicalName, queryInterface = queryInterface, release = release, removeByHierarchicalName = removeByHierarchicalName, replaceByHierarchicalName = replaceByHierarchicalName)
  
    __obj.asInstanceOf[XHierarchicalNameContainer]
  }
}

