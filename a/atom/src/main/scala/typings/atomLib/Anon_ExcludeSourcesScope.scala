package typings
package atomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExcludeSourcesScope extends js.Object {
  var excludeSources: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var scope: js.UndefOr[atomLib.atomMod.ScopeDescriptor] = js.undefined
  var sources: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Anon_ExcludeSourcesScope {
  @scala.inline
  def apply(
    excludeSources: js.Array[java.lang.String] = null,
    scope: atomLib.atomMod.ScopeDescriptor = null,
    sources: js.Array[java.lang.String] = null
  ): Anon_ExcludeSourcesScope = {
    val __obj = js.Dynamic.literal()
    if (excludeSources != null) __obj.updateDynamic("excludeSources")(excludeSources)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (sources != null) __obj.updateDynamic("sources")(sources)
    __obj.asInstanceOf[Anon_ExcludeSourcesScope]
  }
}

