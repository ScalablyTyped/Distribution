package typings.angularCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUseFactory extends js.Object {
  var deps: js.UndefOr[js.Array[_]] = js.undefined
  var useFactory: js.UndefOr[js.Function] = js.undefined
  var useValue: js.UndefOr[js.Any] = js.undefined
}

object AnonUseFactory {
  @scala.inline
  def apply(deps: js.Array[_] = null, useFactory: js.Function = null, useValue: js.Any = null): AnonUseFactory = {
    val __obj = js.Dynamic.literal()
    if (deps != null) __obj.updateDynamic("deps")(deps.asInstanceOf[js.Any])
    if (useFactory != null) __obj.updateDynamic("useFactory")(useFactory.asInstanceOf[js.Any])
    if (useValue != null) __obj.updateDynamic("useValue")(useValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonUseFactory]
  }
}

