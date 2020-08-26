package typings.angularRoute.anon

import org.scalablytyped.runtime.StringDictionary
import typings.angular.mod.IScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dictindex
  extends /* index */ StringDictionary[js.Any] {
  @JSName("$scope")
  var $scope: IScope = js.native
  @JSName("$template")
  var $template: String = js.native
}

object Dictindex {
  @scala.inline
  def apply($scope: IScope, $template: String): Dictindex = {
    val __obj = js.Dynamic.literal($scope = $scope.asInstanceOf[js.Any], $template = $template.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictindex]
  }
  @scala.inline
  implicit class DictindexOps[Self <: Dictindex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set$scope(value: IScope): Self = this.set("$scope", value.asInstanceOf[js.Any])
    @scala.inline
    def set$template(value: String): Self = this.set("$template", value.asInstanceOf[js.Any])
  }
  
}

