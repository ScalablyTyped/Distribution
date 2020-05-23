package typings.atom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScopeSelector extends js.Object {
  var scopeSelector: js.UndefOr[String] = js.undefined
  var source: js.UndefOr[String] = js.undefined
}

object ScopeSelector {
  @scala.inline
  def apply(scopeSelector: String = null, source: String = null): ScopeSelector = {
    val __obj = js.Dynamic.literal()
    if (scopeSelector != null) __obj.updateDynamic("scopeSelector")(scopeSelector.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScopeSelector]
  }
}

