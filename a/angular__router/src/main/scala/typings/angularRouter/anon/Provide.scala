package typings.angularRouter.anon

import typings.angularCore.mod.ComponentRef
import typings.angularCore.mod.InjectionToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Provide extends js.Object {
  var deps: js.UndefOr[scala.Nothing] = js.undefined
  var multi: Boolean
  var provide: InjectionToken[js.Array[js.Function1[/* compRef */ ComponentRef[_], Unit]]]
  var useExisting: InjectionToken[js.Function1[/* compRef */ ComponentRef[_], Unit]]
  var useFactory: js.UndefOr[scala.Nothing] = js.undefined
}

object Provide {
  @scala.inline
  def apply(
    multi: Boolean,
    provide: InjectionToken[js.Array[js.Function1[/* compRef */ ComponentRef[_], Unit]]],
    useExisting: InjectionToken[js.Function1[/* compRef */ ComponentRef[_], Unit]]
  ): Provide = {
    val __obj = js.Dynamic.literal(multi = multi.asInstanceOf[js.Any], provide = provide.asInstanceOf[js.Any], useExisting = useExisting.asInstanceOf[js.Any])
    __obj.asInstanceOf[Provide]
  }
}

