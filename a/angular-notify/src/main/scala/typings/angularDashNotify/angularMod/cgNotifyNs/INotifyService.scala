package typings.angularDashNotify.angularMod.cgNotifyNs

import typings.angularDashNotify.Anon_Classes
import typings.angularDashNotify.Anon_Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INotifyService extends js.Object {
  /**
    * The notify function can either be passed a string or an object.
    * This function will return an object with a close() method and a message property.
    * @param message
    */
  def apply(message: String): INotify = js.native
  /**
    * When passing an object, the object parameters can be:
    * @param option
    */
  def apply(option: Anon_Classes): INotify = js.native
  /**
    * Closes all currently open notifications.
    */
  def closeAll(): Unit = js.native
  /**
    * Call config to set the default configuration options for angular-notify.
    * The following options may be specified in the given object:
    * @param option
    */
  def config(option: Anon_Container): Unit = js.native
}

