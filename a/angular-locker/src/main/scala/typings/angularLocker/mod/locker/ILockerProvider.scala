package typings.angularLocker.mod.locker

import typings.angular.mod.IServiceProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILockerProvider extends IServiceProvider {
  /**
    * Allow the defaults to be specified via the `lockerProvider`
    *
    * @param {ILockerSettings}  lockerSettings  The defaults to override
    */
  def defaults(lockerSettings: ILockerSettings): Unit = js.native
}

object ILockerProvider {
  @scala.inline
  def apply($get: js.Any, defaults: ILockerSettings => Unit): ILockerProvider = {
    val __obj = js.Dynamic.literal($get = $get.asInstanceOf[js.Any], defaults = js.Any.fromFunction1(defaults))
    __obj.asInstanceOf[ILockerProvider]
  }
  @scala.inline
  implicit class ILockerProviderOps[Self <: ILockerProvider] (val x: Self) extends AnyVal {
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
    def setDefaults(value: ILockerSettings => Unit): Self = this.set("defaults", js.Any.fromFunction1(value))
  }
  
}

