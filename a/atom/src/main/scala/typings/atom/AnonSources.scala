package typings.atom

import typings.atom.mod.ScopeDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSources extends js.Object {
  var excludeSources: js.UndefOr[js.Array[String]] = js.undefined
  var scope: js.UndefOr[ScopeDescriptor] = js.undefined
  var sources: js.UndefOr[js.Array[String]] = js.undefined
}

object AnonSources {
  @scala.inline
  def apply(
    excludeSources: js.Array[String] = null,
    scope: ScopeDescriptor = null,
    sources: js.Array[String] = null
  ): AnonSources = {
    val __obj = js.Dynamic.literal()
    if (excludeSources != null) __obj.updateDynamic("excludeSources")(excludeSources.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (sources != null) __obj.updateDynamic("sources")(sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSources]
  }
}

