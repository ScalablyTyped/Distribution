package typings.angularAgility.aa

import typings.angular.mod.ISCEService
import typings.angular.mod.IServiceProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INotifyConfigProvider extends IServiceProvider {
  var defaultNotifyConfig: String = js.native
  var defaultTargetContainerName: String = js.native
  var notifyConfigs: js.Any = js.native
  def addOrUpdateNotifyConfig(name: String, opts: INotifyConfig): Unit = js.native
  def optionsTransformer(options: INotifyOptions, $sce: ISCEService): Unit = js.native
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
    val __obj = js.Dynamic.literal($get = $get.asInstanceOf[js.Any], addOrUpdateNotifyConfig = js.Any.fromFunction2(addOrUpdateNotifyConfig), defaultNotifyConfig = defaultNotifyConfig.asInstanceOf[js.Any], defaultTargetContainerName = defaultTargetContainerName.asInstanceOf[js.Any], notifyConfigs = notifyConfigs.asInstanceOf[js.Any], optionsTransformer = js.Any.fromFunction2(optionsTransformer))
    __obj.asInstanceOf[INotifyConfigProvider]
  }
  @scala.inline
  implicit class INotifyConfigProviderOps[Self <: INotifyConfigProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddOrUpdateNotifyConfig(value: (String, INotifyConfig) => Unit): Self = this.set("addOrUpdateNotifyConfig", js.Any.fromFunction2(value))
    @scala.inline
    def setDefaultNotifyConfig(value: String): Self = this.set("defaultNotifyConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultTargetContainerName(value: String): Self = this.set("defaultTargetContainerName", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotifyConfigs(value: js.Any): Self = this.set("notifyConfigs", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptionsTransformer(value: (INotifyOptions, ISCEService) => Unit): Self = this.set("optionsTransformer", js.Any.fromFunction2(value))
  }
  
}

