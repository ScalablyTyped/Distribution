package typings
package atAngularCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Factory extends js.Object {
  var imports: js.UndefOr[js.Array[_]] = js.undefined
  var providers: js.UndefOr[js.Array[_]] = js.undefined
  def factory(): js.Any
}

object Anon_Factory {
  @scala.inline
  def apply(factory: () => js.Any, imports: js.Array[_] = null, providers: js.Array[_] = null): Anon_Factory = {
    val __obj = js.Dynamic.literal(factory = js.Any.fromFunction0(factory))
    if (imports != null) __obj.updateDynamic("imports")(imports)
    if (providers != null) __obj.updateDynamic("providers")(providers)
    __obj.asInstanceOf[Anon_Factory]
  }
}

