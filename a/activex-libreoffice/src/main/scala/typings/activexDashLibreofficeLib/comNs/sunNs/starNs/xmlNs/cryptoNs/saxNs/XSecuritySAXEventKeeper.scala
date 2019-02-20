package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.saxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface of Security SAX Event Keeper.
  *
  * This interface is an extension of the {@link XSAXEventKeeper} interface, some security related features are added.
  */
trait XSecuritySAXEventKeeper extends XSAXEventKeeper {
  /**
    * Adds a new element collector on the next element in the SAX event stream.
    * @param priority the priority of the element collector. See ConstOfPriority
    * @param modifyElement a flag representing whether the element collector will modify the content of its element after notification
    * @returns the keeper id of the new element collector
    */
  def addSecurityElementCollector(priority: ElementMarkPriority, modifyElement: scala.Boolean): scala.Double
  /**
    * Sets security id for an element mark.
    * @param id the keeper id of the element collector to be set
    * @param securityId the security id to be set
    */
  def setSecurityId(id: scala.Double, securityId: scala.Double): scala.Unit
}

