package typings.atAngularCompiler.srcCoreMod

import typings.atAngularCompiler.atAngularCompilerStrings.root
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Injectable extends js.Object {
  var deps: js.UndefOr[js.Array[Type | js.Array[_]]] = js.undefined
  var providedIn: js.UndefOr[Type | root | js.Any] = js.undefined
  var useClass: js.UndefOr[Type | js.Any] = js.undefined
  var useExisting: js.UndefOr[Type | js.Any] = js.undefined
  var useFactory: js.UndefOr[Type | js.Any] = js.undefined
  var useValue: js.UndefOr[js.Any] = js.undefined
}

object Injectable {
  @scala.inline
  def apply(
    deps: js.Array[Type | js.Array[_]] = null,
    providedIn: Type | root | js.Any = null,
    useClass: Type | js.Any = null,
    useExisting: Type | js.Any = null,
    useFactory: Type | js.Any = null,
    useValue: js.Any = null
  ): Injectable = {
    val __obj = js.Dynamic.literal()
    if (deps != null) __obj.updateDynamic("deps")(deps)
    if (providedIn != null) __obj.updateDynamic("providedIn")(providedIn.asInstanceOf[js.Any])
    if (useClass != null) __obj.updateDynamic("useClass")(useClass.asInstanceOf[js.Any])
    if (useExisting != null) __obj.updateDynamic("useExisting")(useExisting.asInstanceOf[js.Any])
    if (useFactory != null) __obj.updateDynamic("useFactory")(useFactory.asInstanceOf[js.Any])
    if (useValue != null) __obj.updateDynamic("useValue")(useValue)
    __obj.asInstanceOf[Injectable]
  }
}

