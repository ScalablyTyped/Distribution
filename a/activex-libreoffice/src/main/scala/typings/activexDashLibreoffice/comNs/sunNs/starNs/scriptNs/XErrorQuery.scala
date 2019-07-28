package typings.activexDashLibreoffice.comNs.sunNs.starNs.scriptNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XErrorQuery extends XInterface {
  /**
    * Returns whether this object has an error
    * @returns `boolean` indicating an error or not
    */
  def hasError(): Boolean
}

object XErrorQuery {
  @scala.inline
  def apply(
    acquire: () => Unit,
    hasError: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XErrorQuery = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), hasError = js.Any.fromFunction0(hasError), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XErrorQuery]
  }
}

