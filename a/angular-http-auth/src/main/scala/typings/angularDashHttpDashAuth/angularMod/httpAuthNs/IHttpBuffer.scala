package typings.angularDashHttpDashAuth.angularMod.httpAuthNs

import typings.angular.angularMod.Global.Function
import typings.angular.angularMod.IRequestConfig
import typings.angularDashHttpDashAuth.Anon_Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHttpBuffer extends js.Object {
  def append(config: IRequestConfig, deferred: Anon_Data): Unit = js.native
  def rejectAll(): Unit = js.native
  def rejectAll(reason: js.Any): Unit = js.native
  def retryAll(): Unit = js.native
  def retryAll(updater: Function): Unit = js.native
}

