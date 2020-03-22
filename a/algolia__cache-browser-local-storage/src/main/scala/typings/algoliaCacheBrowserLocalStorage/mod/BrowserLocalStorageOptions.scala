package typings.algoliaCacheBrowserLocalStorage.mod

import typings.std.Storage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrowserLocalStorageOptions extends js.Object {
  /**
    * The cache key.
    */
  val key: String
  /**
    * The native local storage implementation.
    */
  val localStorage: js.UndefOr[Storage] = js.undefined
}

object BrowserLocalStorageOptions {
  @scala.inline
  def apply(key: String, localStorage: Storage = null): BrowserLocalStorageOptions = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (localStorage != null) __obj.updateDynamic("localStorage")(localStorage.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowserLocalStorageOptions]
  }
}

