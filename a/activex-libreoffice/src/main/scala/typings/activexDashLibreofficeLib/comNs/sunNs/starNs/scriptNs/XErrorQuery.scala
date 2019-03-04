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
    acquire: js.Function0[scala.Unit],
    hasError: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XErrorQuery = {
    val __obj = js.Dynamic.literal(acquire = acquire, hasError = hasError, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XErrorQuery]
  }
}

