package typings.atom

import typings.atom.atomMod.ScopeDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExcludeSourcesScope extends js.Object {
  var excludeSources: js.UndefOr[js.Array[String]] = js.undefined
  var scope: js.UndefOr[ScopeDescriptor] = js.undefined
  var sources: js.UndefOr[js.Array[String]] = js.undefined
}

object Anon_ExcludeSourcesScope {
  @scala.inline
  def apply(
    excludeSources: js.Array[String] = null,
    scope: ScopeDescriptor = null,
    sources: js.Array[String] = null
  ): Anon_ExcludeSourcesScope = {
    val __obj = js.Dynamic.literal()
    if (excludeSources != null) __obj.updateDynamic("excludeSources")(excludeSources)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (sources != null) __obj.updateDynamic("sources")(sources)
    __obj.asInstanceOf[Anon_ExcludeSourcesScope]
  }
}

