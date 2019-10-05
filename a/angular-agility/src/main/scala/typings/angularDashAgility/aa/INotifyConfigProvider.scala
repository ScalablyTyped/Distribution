package typings.angularDashAgility.aa

import typings.angular.angularMod.ISCEService
import typings.angular.angularMod.IServiceProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INotifyConfigProvider extends IServiceProvider {
  var defaultNotifyConfig: String
  var defaultTargetContainerName: String
  var notifyConfigs: js.Any
  def addOrUpdateNotifyConfig(name: String, opts: INotifyConfig): Unit
  def optionsTransformer(options: INotifyOptions, $sce: ISCEService): Unit
}

object INotifyConfigProvider {
  @scala.inline
  def apply(
    $get: js.Any,
    addOrUpdateNotifyConfig: (String, INotifyConfig) => Unit,
    defaultNotifyConfig: String,
    defaultTargetContainerName: String,
    notifyConfigs: js.Any,
    optionsTransformer: (INotifyOptions, ISCEService) => Unit
  ): INotifyConfigProvider = {
    val __obj = js.Dynamic.literal($get = $get, addOrUpdateNotifyConfig = js.Any.fromFunction2(addOrUpdateNotifyConfig), defaultNotifyConfig = defaultNotifyConfig, defaultTargetContainerName = defaultTargetContainerName, notifyConfigs = notifyConfigs, optionsTransformer = js.Any.fromFunction2(optionsTransformer))
  
    __obj.asInstanceOf[INotifyConfigProvider]
  }
}

