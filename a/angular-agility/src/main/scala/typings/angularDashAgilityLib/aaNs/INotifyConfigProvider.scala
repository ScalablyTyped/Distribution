package typings
package angularDashAgilityLib.aaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INotifyConfigProvider
  extends angularLib.angularMod.IServiceProvider {
  var defaultNotifyConfig: java.lang.String
  var defaultTargetContainerName: java.lang.String
  var notifyConfigs: js.Any
  def addOrUpdateNotifyConfig(name: java.lang.String, opts: INotifyConfig): scala.Unit
  def optionsTransformer(options: INotifyOptions, $sce: angularLib.angularMod.ISCEService): scala.Unit
}

object INotifyConfigProvider {
  @scala.inline
  def apply(
    $get: js.Any,
    addOrUpdateNotifyConfig: (java.lang.String, INotifyConfig) => scala.Unit,
    defaultNotifyConfig: java.lang.String,
    defaultTargetContainerName: java.lang.String,
    notifyConfigs: js.Any,
    optionsTransformer: (INotifyOptions, angularLib.angularMod.ISCEService) => scala.Unit
  ): INotifyConfigProvider = {
    val __obj = js.Dynamic.literal($get = $get, addOrUpdateNotifyConfig = js.Any.fromFunction2(addOrUpdateNotifyConfig), defaultNotifyConfig = defaultNotifyConfig, defaultTargetContainerName = defaultTargetContainerName, notifyConfigs = notifyConfigs, optionsTransformer = js.Any.fromFunction2(optionsTransformer))
  
    __obj.asInstanceOf[INotifyConfigProvider]
  }
}

