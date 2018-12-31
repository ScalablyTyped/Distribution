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

