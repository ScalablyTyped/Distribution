package typings
package angularDashRouteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Index
  extends /* index */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  @JSName("$scope")
  var $scope: angularLib.angularMod.IScope
  @JSName("$template")
  var $template: java.lang.String
}

object Anon_Index {
  @scala.inline
  def apply(
    $scope: angularLib.angularMod.IScope,
    $template: java.lang.String,
    StringDictionary: /* index */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Anon_Index = {
    val __obj = js.Dynamic.literal($scope = $scope, $template = $template)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_Index]
  }
}

