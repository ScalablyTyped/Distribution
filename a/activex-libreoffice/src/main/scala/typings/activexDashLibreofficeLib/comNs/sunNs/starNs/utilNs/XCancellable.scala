package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * offers the possibility of canceling a job.
  *
  * This is supported by objects which represent a job.
  */
trait XCancellable
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** cancels the current job of the object. */
  def cancel(): scala.Unit
}

object XCancellable {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    cancel: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XCancellable = {
    val __obj = js.Dynamic.literal(acquire = acquire, cancel = cancel, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XCancellable]
  }
}

