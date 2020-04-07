package typings.agGrid.gridMod

import org.scalablytyped.runtime.StringDictionary
import typings.agGrid.iFrameworkFactoryMod.IFrameworkFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridParams extends js.Object {
  @JSName("$compile")
  var $compile: js.UndefOr[js.Any] = js.undefined
  @JSName("$scope")
  var $scope: js.UndefOr[js.Any] = js.undefined
  var frameworkFactory: js.UndefOr[IFrameworkFactory] = js.undefined
  var globalEventListener: js.UndefOr[js.Function] = js.undefined
  var quickFilterOnScope: js.UndefOr[js.Any] = js.undefined
  var seedBeanInstances: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object GridParams {
  @scala.inline
  def apply(
    $compile: js.Any = null,
    $scope: js.Any = null,
    frameworkFactory: IFrameworkFactory = null,
    globalEventListener: js.Function = null,
    quickFilterOnScope: js.Any = null,
    seedBeanInstances: StringDictionary[js.Any] = null
  ): GridParams = {
    val __obj = js.Dynamic.literal()
    if ($compile != null) __obj.updateDynamic("$compile")($compile.asInstanceOf[js.Any])
    if ($scope != null) __obj.updateDynamic("$scope")($scope.asInstanceOf[js.Any])
    if (frameworkFactory != null) __obj.updateDynamic("frameworkFactory")(frameworkFactory.asInstanceOf[js.Any])
    if (globalEventListener != null) __obj.updateDynamic("globalEventListener")(globalEventListener.asInstanceOf[js.Any])
    if (quickFilterOnScope != null) __obj.updateDynamic("quickFilterOnScope")(quickFilterOnScope.asInstanceOf[js.Any])
    if (seedBeanInstances != null) __obj.updateDynamic("seedBeanInstances")(seedBeanInstances.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridParams]
  }
}

