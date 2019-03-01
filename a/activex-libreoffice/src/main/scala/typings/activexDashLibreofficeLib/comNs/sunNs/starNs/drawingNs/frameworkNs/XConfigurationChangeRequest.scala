package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.frameworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single explicit request for a configuration change.
  *
  * The requested change is committed to a configuration only when the {@link execute()} method is called. {@link Configuration} change requests are
  * executed asynchronously. This is done to avoid reentrance problems with objects that are registered as {@link XConfigurationChangeListener} and at the
  * same time make configuration change requests. When the requests were executed synchronously then the listeners would be notified of the changes while
  * their request call has not yet returned.
  *
  * This interface is typically used internally by the {@link XConfigurationController}
  * @see XConfigurationController
  */
trait XConfigurationChangeRequest extends js.Object {
  /**
    * Commit the configuration change request represented by the called object to the given configuration.
    * @param xConfiguration This is the configuration to commit the requested change to.
    */
  def execute(xConfiguration: XConfiguration): scala.Unit
}

object XConfigurationChangeRequest {
  @scala.inline
  def apply(execute: js.Function1[XConfiguration, scala.Unit]): XConfigurationChangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("execute")(execute)
    __obj.asInstanceOf[XConfigurationChangeRequest]
  }
}

