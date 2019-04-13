package typings
package angularlocalstorageLib.angularMod.localStorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILocalStorageService extends js.Object {
  def bind($scope: angularLib.angularMod.IScope, key: java.lang.String): js.Any = js.native
  def bind(
    $scope: angularLib.angularMod.IScope,
    key: java.lang.String,
    opts: angularlocalstorageLib.Anon_DefaultValue
  ): js.Any = js.native
  def clearAll(): scala.Unit = js.native
  def get(key: java.lang.String): js.Any = js.native
  def remove(key: java.lang.String): scala.Boolean = js.native
  def set(key: java.lang.String, value: js.Any): js.Any = js.native
  def unbind($scope: angularLib.angularMod.IScope, key: java.lang.String): scala.Unit = js.native
  def unbind($scope: angularLib.angularMod.IScope, key: java.lang.String, storeName: java.lang.String): scala.Unit = js.native
}

