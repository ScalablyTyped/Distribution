package typings
package angularDashMocksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  @JSName("$scope")
  var $scope: js.UndefOr[angularLib.angularMod.IScope] = js.undefined
}

object Anon_Key {
  @scala.inline
  def apply(
    $scope: angularLib.angularMod.IScope = null,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Anon_Key = {
    val __obj = js.Dynamic.literal()
    if ($scope != null) __obj.updateDynamic("$scope")($scope)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_Key]
  }
}

