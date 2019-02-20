package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for running an action.
  * @since OOo 1.1.2
  */
trait XAction
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Action to be done.
    * @returns result
    * @throws com::sun::star::uno::Exception any UNO exception may be thrown
    */
  def run(): js.Any
}

