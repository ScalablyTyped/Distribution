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

