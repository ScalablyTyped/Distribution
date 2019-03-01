package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.frameworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This service provides the means for constructing new configurations.
  *
  * Most likely use is the {@link XConfigurationController.restoreConfiguration()} method.
  * @see XConfiguration for a description of the configuration.
  */
trait Configuration extends XConfiguration {
  /**
    * Create an empty configuration.
    *
    * This should not be necessary very often. Changes to an existing configuration are more likely.
    */
  def create(): scala.Unit
}

object Configuration {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    addResource: js.Function1[XResourceId, scala.Unit],
    create: js.Function0[scala.Unit],
    createClone: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XCloneable],
    getResources: js.Function3[
      XResourceId, 
      java.lang.String, 
      AnchorBindingMode, 
      activexDashInteropLib.SafeArray[XResourceId]
    ],
    hasResource: js.Function1[XResourceId, scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeResource: js.Function1[XResourceId, scala.Unit]
  ): Configuration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addResource")(addResource)
    __obj.updateDynamic("create")(create)
    __obj.updateDynamic("createClone")(createClone)
    __obj.updateDynamic("getResources")(getResources)
    __obj.updateDynamic("hasResource")(hasResource)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeResource")(removeResource)
    __obj.asInstanceOf[Configuration]
  }
}

