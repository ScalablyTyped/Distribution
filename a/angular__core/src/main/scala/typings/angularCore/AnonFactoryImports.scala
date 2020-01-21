package typings.angularCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFactoryImports extends js.Object {
  var imports: js.UndefOr[js.Array[_]] = js.undefined
  var providers: js.UndefOr[js.Array[_]] = js.undefined
  def factory(): js.Any
}

object AnonFactoryImports {
  @scala.inline
  def apply(factory: () => js.Any, imports: js.Array[_] = null, providers: js.Array[_] = null): AnonFactoryImports = {
    val __obj = js.Dynamic.literal(factory = js.Any.fromFunction0(factory))
    if (imports != null) __obj.updateDynamic("imports")(imports.asInstanceOf[js.Any])
    if (providers != null) __obj.updateDynamic("providers")(providers.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFactoryImports]
  }
}

