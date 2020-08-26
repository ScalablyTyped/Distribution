package typings.agGrid.gridMod

import org.scalablytyped.runtime.StringDictionary
import typings.agGrid.iFrameworkFactoryMod.IFrameworkFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridParams extends js.Object {
  @JSName("$compile")
  var $compile: js.UndefOr[js.Any] = js.native
  @JSName("$scope")
  var $scope: js.UndefOr[js.Any] = js.native
  var frameworkFactory: js.UndefOr[IFrameworkFactory] = js.native
  var globalEventListener: js.UndefOr[js.Function] = js.native
  var quickFilterOnScope: js.UndefOr[js.Any] = js.native
  var seedBeanInstances: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object GridParams {
  @scala.inline
  def apply(): GridParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridParams]
  }
  @scala.inline
  implicit class GridParamsOps[Self <: GridParams] (val x: Self) extends AnyVal {
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
    def set$compile(value: js.Any): Self = this.set("$compile", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$compile: Self = this.set("$compile", js.undefined)
    @scala.inline
    def set$scope(value: js.Any): Self = this.set("$scope", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$scope: Self = this.set("$scope", js.undefined)
    @scala.inline
    def setFrameworkFactory(value: IFrameworkFactory): Self = this.set("frameworkFactory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrameworkFactory: Self = this.set("frameworkFactory", js.undefined)
    @scala.inline
    def setGlobalEventListener(value: js.Function): Self = this.set("globalEventListener", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobalEventListener: Self = this.set("globalEventListener", js.undefined)
    @scala.inline
    def setQuickFilterOnScope(value: js.Any): Self = this.set("quickFilterOnScope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuickFilterOnScope: Self = this.set("quickFilterOnScope", js.undefined)
    @scala.inline
    def setSeedBeanInstances(value: StringDictionary[js.Any]): Self = this.set("seedBeanInstances", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeedBeanInstances: Self = this.set("seedBeanInstances", js.undefined)
  }
  
}

