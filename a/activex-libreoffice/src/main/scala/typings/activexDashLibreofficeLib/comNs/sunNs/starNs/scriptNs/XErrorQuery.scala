package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XErrorQuery
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Returns whether this object has an error
    * @returns `boolean` indicating an error or not
    */
  def hasError(): scala.Boolean
}

object XErrorQuery {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    hasError: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XErrorQuery = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), hasError = js.Any.fromFunction0(hasError), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XErrorQuery]
  }
}

