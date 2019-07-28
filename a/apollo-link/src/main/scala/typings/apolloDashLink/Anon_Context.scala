package typings.apolloDashLink

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Context[E, C] extends js.Object {
  var context: js.UndefOr[C] = js.undefined
  var extensions: js.UndefOr[E] = js.undefined
}

object Anon_Context {
  @scala.inline
  def apply[E, C](context: C = null, extensions: E = null): Anon_Context[E, C] = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Context[E, C]]
  }
}

