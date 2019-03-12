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
  def apply($get: () => IGlobalConfig, setConfig: IGlobalConfig => scala.Unit): IToastyConfigProvider = {
    val __obj = js.Dynamic.literal($get = js.Any.fromFunction0($get), setConfig = js.Any.fromFunction1(setConfig))
  
    __obj.asInstanceOf[IToastyConfigProvider]
  }
}

