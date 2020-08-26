package typings.angular.angular

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Supplement IComponentOptions from angular.d.ts with router-specific
// fields.
@js.native
trait IComponentOptions extends js.Object {
  @JSName("$canActivate")
  var $canActivate: js.UndefOr[
    js.Function1[
      /* repeated */ js.Any, 
      Boolean | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IPromise<boolean> */ _)
    ]
  ] = js.native
  @JSName("$routeConfig")
  var $routeConfig: js.UndefOr[js.Array[RouteDefinition]] = js.native
}

object IComponentOptions {
  @scala.inline
  def apply(): IComponentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IComponentOptions]
  }
  @scala.inline
  implicit class IComponentOptionsOps[Self <: IComponentOptions] (val x: Self) extends AnyVal {
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
    def set$canActivate(
      value: /* repeated */ js.Any => Boolean | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IPromise<boolean> */ _)
    ): Self = this.set("$canActivate", js.Any.fromFunction1(value))
    @scala.inline
    def delete$canActivate: Self = this.set("$canActivate", js.undefined)
    @scala.inline
    def set$routeConfigVarargs(value: RouteDefinition*): Self = this.set("$routeConfig", js.Array(value :_*))
    @scala.inline
    def set$routeConfig(value: js.Array[RouteDefinition]): Self = this.set("$routeConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$routeConfig: Self = this.set("$routeConfig", js.undefined)
  }
  
}

