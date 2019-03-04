package typings
package angularDashToastyLib.toastyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToastyConfigProvider extends js.Object {
  @JSName("$get")
  def $get(): IGlobalConfig
  def setConfig(`override`: IGlobalConfig): scala.Unit
}

object IToastyConfigProvider {
  @scala.inline
  def apply($get: js.Function0[IGlobalConfig], setConfig: js.Function1[IGlobalConfig, scala.Unit]): IToastyConfigProvider = {
    val __obj = js.Dynamic.literal($get = $get, setConfig = setConfig)
  
    __obj.asInstanceOf[IToastyConfigProvider]
  }
}

