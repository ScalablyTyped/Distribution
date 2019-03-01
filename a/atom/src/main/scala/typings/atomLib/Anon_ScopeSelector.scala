package typings
package atomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ScopeSelector extends js.Object {
  var scopeSelector: js.UndefOr[java.lang.String] = js.undefined
  var source: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ScopeSelector {
  @scala.inline
  def apply(scopeSelector: java.lang.String = null, source: java.lang.String = null): Anon_ScopeSelector = {
    val __obj = js.Dynamic.literal()
    if (scopeSelector != null) __obj.updateDynamic("scopeSelector")(scopeSelector)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[Anon_ScopeSelector]
  }
}

