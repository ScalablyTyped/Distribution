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

