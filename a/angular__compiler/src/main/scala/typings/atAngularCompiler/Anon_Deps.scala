package typings.atAngularCompiler

import typings.atAngularCompiler.srcCoreMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Deps extends js.Object {
  var deps: js.UndefOr[js.Array[js.Object] | Null] = js.undefined
  var multi: js.UndefOr[Boolean] = js.undefined
  var useClass: js.UndefOr[Type] = js.undefined
  var useExisting: js.UndefOr[js.Any] = js.undefined
  var useFactory: js.UndefOr[js.Function | Null] = js.undefined
  var useValue: js.UndefOr[js.Any] = js.undefined
}

object Anon_Deps {
  @scala.inline
  def apply(
    deps: js.Array[js.Object] = null,
    multi: js.UndefOr[Boolean] = js.undefined,
    useClass: Type = null,
    useExisting: js.Any = null,
    useFactory: js.Function = null,
    useValue: js.Any = null
  ): Anon_Deps = {
    val __obj = js.Dynamic.literal()
    if (deps != null) __obj.updateDynamic("deps")(deps)
    if (!js.isUndefined(multi)) __obj.updateDynamic("multi")(multi)
    if (useClass != null) __obj.updateDynamic("useClass")(useClass)
    if (useExisting != null) __obj.updateDynamic("useExisting")(useExisting)
    if (useFactory != null) __obj.updateDynamic("useFactory")(useFactory)
    if (useValue != null) __obj.updateDynamic("useValue")(useValue)
    __obj.asInstanceOf[Anon_Deps]
  }
}

