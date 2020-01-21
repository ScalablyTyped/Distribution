package typings.angularLocalStorage.mod.angularAugmentingMod.local.storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.angularLocalStorage.angularLocalStorageStrings.localStorage
  - typings.angularLocalStorage.angularLocalStorageStrings.sessionStorage
*/
trait StorageType extends js.Object

object StorageType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def localStorage: typings.angularLocalStorage.angularLocalStorageStrings.localStorage = this.cast("localStorage")
  @scala.inline
  def sessionStorage: typings.angularLocalStorage.angularLocalStorageStrings.sessionStorage = this.cast("sessionStorage")
}

