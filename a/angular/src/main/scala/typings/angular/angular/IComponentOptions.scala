package typings.angular.angular

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Supplement IComponentOptions from angular.d.ts with router-specific
// fields.
trait IComponentOptions extends js.Object {
  @JSName("$canActivate")
  var $canActivate: js.UndefOr[
    js.Function1[
      /* repeated */ js.Any, 
      Boolean | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IPromise<boolean> */ _)
    ]
  ] = js.undefined
  @JSName("$routeConfig")
  var $routeConfig: js.UndefOr[js.Array[RouteDefinition]] = js.undefined
}

object IComponentOptions {
  @scala.inline
  def apply(
    $canActivate: /* repeated */ js.Any => Boolean | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IPromise<boolean> */ _) = null,
    $routeConfig: js.Array[RouteDefinition] = null
  ): IComponentOptions = {
    val __obj = js.Dynamic.literal()
    if ($canActivate != null) __obj.updateDynamic("$canActivate")(js.Any.fromFunction1($canActivate))
    if ($routeConfig != null) __obj.updateDynamic("$routeConfig")($routeConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[IComponentOptions]
  }
}

