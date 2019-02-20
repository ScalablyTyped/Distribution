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

