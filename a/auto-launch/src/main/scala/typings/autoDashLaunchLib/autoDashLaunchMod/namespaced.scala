package typings
package autoDashLaunchLib.autoDashLaunchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("auto-launch", JSImport.Namespace)
@js.native
class namespaced protected () extends AutoLaunch {
  def this(options: AutoLaunchOptions) = this()
  /**
     * Disables auto-launch at start up.
     */
  /* CompleteClass */
  override def disable(): stdLib.Promise[scala.Unit] = js.native
  /**
     * Enables auto-launch at start up.
     */
  /* CompleteClass */
  override def enable(): stdLib.Promise[scala.Unit] = js.native
  /**
     * Returns true if auto-launch is enabled.
     */
  /* CompleteClass */
  override def isEnabled(): stdLib.Promise[scala.Boolean] = js.native
}

