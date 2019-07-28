package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LifecycleEventConfiguration extends js.Object {
  /**
    * A ShutdownEventConfiguration object that specifies the Shutdown event configuration.
    */
  var Shutdown: js.UndefOr[ShutdownEventConfiguration] = js.undefined
}

object LifecycleEventConfiguration {
  @scala.inline
  def apply(Shutdown: ShutdownEventConfiguration = null): LifecycleEventConfiguration = {
    val __obj = js.Dynamic.literal()
    if (Shutdown != null) __obj.updateDynamic("Shutdown")(Shutdown)
    __obj.asInstanceOf[LifecycleEventConfiguration]
  }
}

