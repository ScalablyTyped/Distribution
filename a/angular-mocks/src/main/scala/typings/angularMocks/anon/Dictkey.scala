package typings.angularMocks.anon

import org.scalablytyped.runtime.StringDictionary
import typings.angular.mod.IScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictkey
  extends /* key */ StringDictionary[js.Any] {
  @JSName("$scope")
  var $scope: js.UndefOr[IScope] = js.undefined
}

object Dictkey {
  @scala.inline
  def apply($scope: IScope = null, StringDictionary: /* name */ StringDictionary[js.Any] = null): Dictkey = {
    val __obj = js.Dynamic.literal()
    if ($scope != null) __obj.updateDynamic("$scope")($scope.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Dictkey]
  }
}

