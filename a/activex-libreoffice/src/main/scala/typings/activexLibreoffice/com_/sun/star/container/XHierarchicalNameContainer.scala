package typings.activexLibreoffice.com_.sun.star.container

import typings.activexLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Insertion and removal of hierarchical elements. */
trait XHierarchicalNameContainer extends XHierarchicalNameReplace {
  /** inserts the element at the specified name. */
  def insertByHierarchicalName(aName: String, aElement: js.Any): Unit
  /** removes the element at the specified name. */
  def removeByHierarchicalName(Name: String): Unit
}

object XHierarchicalNameContainer {
  @scala.inline
  def apply(
    acquire: () => Unit,
    getByHierarchicalName: String => js.Any,
    hasByHierarchicalName: String => Boolean,
    insertByHierarchicalName: (String, js.Any) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeByHierarchicalName: String => Unit,
    replaceByHierarchicalName: (String, js.Any) => Unit
  ): XHierarchicalNameContainer = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getByHierarchicalName = js.Any.fromFunction1(getByHierarchicalName), hasByHierarchicalName = js.Any.fromFunction1(hasByHierarchicalName), insertByHierarchicalName = js.Any.fromFunction2(insertByHierarchicalName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByHierarchicalName = js.Any.fromFunction1(removeByHierarchicalName), replaceByHierarchicalName = js.Any.fromFunction2(replaceByHierarchicalName))
    __obj.asInstanceOf[XHierarchicalNameContainer]
  }
}

