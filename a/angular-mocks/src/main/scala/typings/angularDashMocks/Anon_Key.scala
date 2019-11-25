package typings.angularDashMocks

import org.scalablytyped.runtime.StringDictionary
import typings.angular.angularMod.IScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key
  extends /* key */ StringDictionary[js.Any] {
  @JSName("$scope")
  var $scope: js.UndefOr[IScope] = js.undefined
}

object Anon_Key {
  @scala.inline
  def apply($scope: IScope = null, StringDictionary: /* key */ StringDictionary[js.Any] = null): Anon_Key = {
    val __obj = js.Dynamic.literal()
    if ($scope != null) __obj.updateDynamic("$scope")($scope.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_Key]
  }
}

