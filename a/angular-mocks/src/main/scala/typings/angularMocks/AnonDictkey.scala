package typings.angularMocks

import org.scalablytyped.runtime.StringDictionary
import typings.angular.mod.IScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDictkey
  extends /* key */ StringDictionary[js.Any] {
  @JSName("$scope")
  var $scope: js.UndefOr[IScope] = js.undefined
}

object AnonDictkey {
  @scala.inline
  def apply($scope: IScope = null, StringDictionary: /* key */ StringDictionary[js.Any] = null): AnonDictkey = {
    val __obj = js.Dynamic.literal()
    if ($scope != null) __obj.updateDynamic("$scope")($scope.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonDictkey]
  }
}

