package typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** creates IDs which are unique within the container. */
trait XUniqueIDFactory extends XInterface {
  def createUniqueID(): String
}

object XUniqueIDFactory {
  @scala.inline
  def apply(
    acquire: () => Unit,
    createUniqueID: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XUniqueIDFactory = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createUniqueID = js.Any.fromFunction0(createUniqueID), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XUniqueIDFactory]
  }
}

