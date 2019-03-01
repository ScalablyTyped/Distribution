package typings
package atomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExcludeSources extends js.Object {
  var excludeSources: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var scope: js.UndefOr[js.Array[java.lang.String] | atomLib.atomMod.ScopeDescriptor] = js.undefined
  var sources: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Anon_ExcludeSources {
  @scala.inline
  def apply(
    excludeSources: js.Array[java.lang.String] = null,
    scope: js.Array[java.lang.String] | atomLib.atomMod.ScopeDescriptor = null,
    sources: js.Array[java.lang.String] = null
  ): Anon_ExcludeSources = {
    val __obj = js.Dynamic.literal()
    if (excludeSources != null) __obj.updateDynamic("excludeSources")(excludeSources)
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (sources != null) __obj.updateDynamic("sources")(sources)
    __obj.asInstanceOf[Anon_ExcludeSources]
  }
}

