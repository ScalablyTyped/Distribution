package typings.angularCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Imports extends js.Object {
  var imports: js.UndefOr[js.Array[_]] = js.undefined
  var providers: js.UndefOr[js.Array[_]] = js.undefined
  def factory(): js.Any
}

object Imports {
  @scala.inline
  def apply(factory: () => js.Any, imports: js.Array[_] = null, providers: js.Array[_] = null): Imports = {
    val __obj = js.Dynamic.literal(factory = js.Any.fromFunction0(factory))
    if (imports != null) __obj.updateDynamic("imports")(imports.asInstanceOf[js.Any])
    if (providers != null) __obj.updateDynamic("providers")(providers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Imports]
  }
}

