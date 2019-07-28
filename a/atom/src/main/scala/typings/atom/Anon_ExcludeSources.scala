package typings.atom

import typings.atom.atomMod.ScopeDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExcludeSources extends js.Object {
  var excludeSources: js.UndefOr[js.Array[String]] = js.undefined
  var scope: js.UndefOr[js.Array[String] | ScopeDescriptor] = js.undefined
  var sources: js.UndefOr[js.Array[String]] = js.undefined
}

object Anon_ExcludeSources {
  @scala.inline
  def apply(
    excludeSources: js.Array[String] = null,
    scope: js.Array[String] | ScopeDescriptor = null,
    sources: js.Array[String] = null
  ): Anon_ExcludeSources = {
    val __obj = js.Dynamic.literal()
    if (excludeSources != null) __obj.updateDynamic("excludeSources")(excludeSources)
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (sources != null) __obj.updateDynamic("sources")(sources)
    __obj.asInstanceOf[Anon_ExcludeSources]
  }
}

