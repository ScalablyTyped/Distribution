package typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
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
trait XHierarchicalName extends XInterface {
  /** @returns the fully qualified hierarchical name of the object. */
  val HierarchicalName: String
  /**
    * builds the hierarchical name of an object, given a relative name
    *
    * Can be used to find the name of a descendant object in the hierarchy without actually accessing it.
    * @see XHierarchicalNameAccess.hasByHierarchicalName
    */
  def composeHierarchicalName(aRelativeName: String): String
  /** @returns the fully qualified hierarchical name of the object. */
  def getHierarchicalName(): String
}

object XHierarchicalName {
  @scala.inline
  def apply(
    HierarchicalName: String,
    acquire: () => Unit,
    composeHierarchicalName: String => String,
    getHierarchicalName: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XHierarchicalName = {
    val __obj = js.Dynamic.literal(HierarchicalName = HierarchicalName, acquire = js.Any.fromFunction0(acquire), composeHierarchicalName = js.Any.fromFunction1(composeHierarchicalName), getHierarchicalName = js.Any.fromFunction0(getHierarchicalName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XHierarchicalName]
  }
}

