package typings.angularDashAgility.aa

import typings.angular.angularMod.ISCEService
import typings.angular.angularMod.IServiceProvider
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

