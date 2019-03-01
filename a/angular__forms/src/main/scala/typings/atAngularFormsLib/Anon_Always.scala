package typings
package atAngularFormsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Always extends js.Object {
  /** @deprecated as of v6 */ var warnOnDeprecatedNgFormSelector: js.UndefOr[
    atAngularFormsLib.atAngularFormsLibStrings.never | atAngularFormsLib.atAngularFormsLibStrings.once | atAngularFormsLib.atAngularFormsLibStrings.always
  ] = js.undefined
}

object Anon_Always {
  @scala.inline
  def apply(
    warnOnDeprecatedNgFormSelector: atAngularFormsLib.atAngularFormsLibStrings.never | atAngularFormsLib.atAngularFormsLibStrings.once | atAngularFormsLib.atAngularFormsLibStrings.always = null
  ): Anon_Always = {
    val __obj = js.Dynamic.literal()
    if (warnOnDeprecatedNgFormSelector != null) __obj.updateDynamic("warnOnDeprecatedNgFormSelector")(warnOnDeprecatedNgFormSelector.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Always]
  }
}

