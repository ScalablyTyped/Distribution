package typings.angularCompiler.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Deps extends js.Object {
  var deps: js.UndefOr[js.Array[js.Object] | Null] = js.undefined
  var multi: js.UndefOr[Boolean] = js.undefined
  var useClass: js.UndefOr[typings.angularCompiler.coreMod.Type] = js.undefined
  var useExisting: js.UndefOr[js.Any] = js.undefined
  var useFactory: js.UndefOr[js.Function | Null] = js.undefined
  var useValue: js.UndefOr[js.Any] = js.undefined
}

object Deps {
  @scala.inline
  def apply(
    deps: js.UndefOr[Null | js.Array[js.Object]] = js.undefined,
    multi: js.UndefOr[Boolean] = js.undefined,
    useClass: typings.angularCompiler.coreMod.Type = null,
    useExisting: js.Any = null,
    useFactory: js.UndefOr[Null | js.Function] = js.undefined,
    useValue: js.Any = null
  ): Deps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deps)) __obj.updateDynamic("deps")(deps.asInstanceOf[js.Any])
    if (!js.isUndefined(multi)) __obj.updateDynamic("multi")(multi.get.asInstanceOf[js.Any])
    if (useClass != null) __obj.updateDynamic("useClass")(useClass.asInstanceOf[js.Any])
    if (useExisting != null) __obj.updateDynamic("useExisting")(useExisting.asInstanceOf[js.Any])
    if (!js.isUndefined(useFactory)) __obj.updateDynamic("useFactory")(useFactory.asInstanceOf[js.Any])
    if (useValue != null) __obj.updateDynamic("useValue")(useValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deps]
  }
}

