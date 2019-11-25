package typings.angularDashRoute

import org.scalablytyped.runtime.StringDictionary
import typings.angular.angularMod.IScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Index
  extends /* index */ StringDictionary[js.Any] {
  @JSName("$scope")
  var $scope: IScope
  @JSName("$template")
  var $template: String
}

object Anon_Index {
  @scala.inline
  def apply($scope: IScope, $template: String, StringDictionary: /* index */ StringDictionary[js.Any] = null): Anon_Index = {
    val __obj = js.Dynamic.literal($scope = $scope.asInstanceOf[js.Any], $template = $template.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_Index]
  }
}

