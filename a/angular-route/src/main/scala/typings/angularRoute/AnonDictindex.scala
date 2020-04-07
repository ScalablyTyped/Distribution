package typings.angularRoute

import org.scalablytyped.runtime.StringDictionary
import typings.angular.mod.IScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDictindex
  extends /* index */ StringDictionary[js.Any] {
  @JSName("$scope")
  var $scope: IScope
  @JSName("$template")
  var $template: String
}

object AnonDictindex {
  @scala.inline
  def apply($scope: IScope, $template: String, StringDictionary: /* index */ StringDictionary[js.Any] = null): AnonDictindex = {
    val __obj = js.Dynamic.literal($scope = $scope.asInstanceOf[js.Any], $template = $template.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonDictindex]
  }
}

