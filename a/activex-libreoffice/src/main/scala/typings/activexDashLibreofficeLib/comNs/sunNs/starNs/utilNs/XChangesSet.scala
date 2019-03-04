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
  val AllChanges: activexDashInteropLib.SafeArray[ElementChange]
  /**
    * queries for all contained changes at once.
    * @returns an array of {@link ElementChange} holding information about each changes that is part of this object.
    */
  def getAllChanges(): activexDashInteropLib.SafeArray[ElementChange]
}

object XChangesSet {
  @scala.inline
  def apply(
    AllChanges: activexDashInteropLib.SafeArray[ElementChange],
    ElementType: activexDashLibreofficeLib.`type`,
    acquire: js.Function0[scala.Unit],
    getAllChanges: js.Function0[activexDashInteropLib.SafeArray[ElementChange]],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    hasElements: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XChangesSet = {
    val __obj = js.Dynamic.literal(AllChanges = AllChanges, ElementType = ElementType, acquire = acquire, getAllChanges = getAllChanges, getElementType = getElementType, hasElements = hasElements, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XChangesSet]
  }
}

