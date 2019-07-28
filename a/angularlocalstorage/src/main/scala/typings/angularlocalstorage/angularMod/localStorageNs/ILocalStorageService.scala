package typings.angularlocalstorage.angularMod.localStorageNs

import typings.angular.angularMod.IScope
import typings.angularlocalstorage.Anon_DefaultValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILocalStorageService extends js.Object {
  def bind($scope: IScope, key: String): js.Any = js.native
  def bind($scope: IScope, key: String, opts: Anon_DefaultValue): js.Any = js.native
  def clearAll(): Unit = js.native
  def get(key: String): js.Any = js.native
  def remove(key: String): Boolean = js.native
  def set(key: String, value: js.Any): js.Any = js.native
  def unbind($scope: IScope, key: String): Unit = js.native
  def unbind($scope: IScope, key: String, storeName: String): Unit = js.native
}

