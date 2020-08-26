package typings.algoliaCacheBrowserLocalStorage.mod

import typings.std.Storage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrowserLocalStorageOptions extends js.Object {
  /**
    * The cache key.
    */
  val key: String = js.native
  /**
    * The native local storage implementation.
    */
  val localStorage: js.UndefOr[Storage] = js.native
}

object BrowserLocalStorageOptions {
  @scala.inline
  def apply(key: String): BrowserLocalStorageOptions = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowserLocalStorageOptions]
  }
  @scala.inline
  implicit class BrowserLocalStorageOptionsOps[Self <: BrowserLocalStorageOptions] (val x: Self) extends AnyVal {
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocalStorage(value: Storage): Self = this.set("localStorage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalStorage: Self = this.set("localStorage", js.undefined)
  }
  
}

