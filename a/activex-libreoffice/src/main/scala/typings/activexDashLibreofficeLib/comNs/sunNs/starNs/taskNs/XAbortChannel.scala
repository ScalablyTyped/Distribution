package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Use this interface to abort a command asynchronously. For example, have a look at {@link com.sun.star.deployment.XPackageManager} . */
trait XAbortChannel extends js.Object {
  /** sends an abort notification to all commands associated with this channel. */
  def sendAbort(): scala.Unit
}

