package typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is supported by objects with data that can be updated from a data source. */
trait XUpdatable extends XInterface {
  /** refreshes the data of the object from the connected data source. */
  def update(): Unit
}

object XUpdatable {
  @scala.inline
  def apply(acquire: () => Unit, queryInterface: `type` => js.Any, release: () => Unit, update: () => Unit): XUpdatable = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), update = js.Any.fromFunction0(update))
  
    __obj.asInstanceOf[XUpdatable]
  }
}

