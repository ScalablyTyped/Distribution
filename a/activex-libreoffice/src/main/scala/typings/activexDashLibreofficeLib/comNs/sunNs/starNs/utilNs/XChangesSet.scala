package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * this interface enables inspecting a set of changes forming one batch transaction.
  *
  * An object implementing this interface should implement more container interfaces to access individual changes as well.
  * @see XChangesBatch
  * @see ChangesEvent
  * @see XChangesListener
  * @see XChangesNotifier
  */
trait XChangesSet
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XElementAccess {
  /**
    * queries for all contained changes at once.
    * @returns an array of {@link ElementChange} holding information about each changes that is part of this object.
    */
  val AllChanges: stdLib.SafeArray[ElementChange]
  /**
    * queries for all contained changes at once.
    * @returns an array of {@link ElementChange} holding information about each changes that is part of this object.
    */
  def getAllChanges(): stdLib.SafeArray[ElementChange]
}

object XChangesSet {
  @scala.inline
  def apply(
    AllChanges: stdLib.SafeArray[ElementChange],
    ElementType: activexDashLibreofficeLib.`type`,
    acquire: () => scala.Unit,
    getAllChanges: () => stdLib.SafeArray[ElementChange],
    getElementType: () => activexDashLibreofficeLib.`type`,
    hasElements: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XChangesSet = {
    val __obj = js.Dynamic.literal(AllChanges = AllChanges, ElementType = ElementType, acquire = js.Any.fromFunction0(acquire), getAllChanges = js.Any.fromFunction0(getAllChanges), getElementType = js.Any.fromFunction0(getElementType), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XChangesSet]
  }
}

