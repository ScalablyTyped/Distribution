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

