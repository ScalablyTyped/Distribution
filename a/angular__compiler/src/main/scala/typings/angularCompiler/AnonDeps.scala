package typings.angularCompiler

import typings.angularCompiler.coreMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDeps extends js.Object {
  var deps: js.UndefOr[js.Array[js.Object] | Null] = js.undefined
  var multi: js.UndefOr[Boolean] = js.undefined
  var useClass: js.UndefOr[Type] = js.undefined
  var useExisting: js.UndefOr[js.Any] = js.undefined
  var useFactory: js.UndefOr[js.Function | Null] = js.undefined
  var useValue: js.UndefOr[js.Any] = js.undefined
}

object AnonDeps {
  @scala.inline
  def apply(
    deps: js.Array[js.Object] = null,
    multi: js.UndefOr[Boolean] = js.undefined,
    useClass: Type = null,
    useExisting: js.Any = null,
    useFactory: js.Function = null,
    useValue: js.Any = null
  ): AnonDeps = {
    val __obj = js.Dynamic.literal()
    if (deps != null) __obj.updateDynamic("deps")(deps.asInstanceOf[js.Any])
    if (!js.isUndefined(multi)) __obj.updateDynamic("multi")(multi.asInstanceOf[js.Any])
    if (useClass != null) __obj.updateDynamic("useClass")(useClass.asInstanceOf[js.Any])
    if (useExisting != null) __obj.updateDynamic("useExisting")(useExisting.asInstanceOf[js.Any])
    if (useFactory != null) __obj.updateDynamic("useFactory")(useFactory.asInstanceOf[js.Any])
    if (useValue != null) __obj.updateDynamic("useValue")(useValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDeps]
  }
}

