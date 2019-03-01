package typings
package angularDashAgilityLib.aaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INotifyConfigProvider
  extends angularLib.angularMod.angularNs.IServiceProvider {
  var defaultNotifyConfig: java.lang.String
  var defaultTargetContainerName: java.lang.String
  var notifyConfigs: js.Any
  def addOrUpdateNotifyConfig(name: java.lang.String, opts: INotifyConfig): scala.Unit
  def optionsTransformer(options: INotifyOptions, $sce: angularLib.angularMod.angularNs.ISCEService): scala.Unit
}

object INotifyConfigProvider {
  @scala.inline
  def apply(
    $get: js.Any,
    addOrUpdateNotifyConfig: js.Function2[java.lang.String, INotifyConfig, scala.Unit],
    defaultNotifyConfig: java.lang.String,
    defaultTargetContainerName: java.lang.String,
    notifyConfigs: js.Any,
    optionsTransformer: js.Function2[INotifyOptions, angularLib.angularMod.angularNs.ISCEService, scala.Unit]
  ): INotifyConfigProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$get")($get)
    __obj.updateDynamic("addOrUpdateNotifyConfig")(addOrUpdateNotifyConfig)
    __obj.updateDynamic("defaultNotifyConfig")(defaultNotifyConfig)
    __obj.updateDynamic("defaultTargetContainerName")(defaultTargetContainerName)
    __obj.updateDynamic("notifyConfigs")(notifyConfigs)
    __obj.updateDynamic("optionsTransformer")(optionsTransformer)
    __obj.asInstanceOf[INotifyConfigProvider]
  }
}

