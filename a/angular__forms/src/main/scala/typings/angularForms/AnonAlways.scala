package typings.angularForms

import typings.angularForms.angularFormsStrings.always
import typings.angularForms.angularFormsStrings.never
import typings.angularForms.angularFormsStrings.once
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlways extends js.Object {
  /** @deprecated as of v6 */ var warnOnDeprecatedNgFormSelector: js.UndefOr[never | once | always] = js.undefined
}

object AnonAlways {
  @scala.inline
  def apply(warnOnDeprecatedNgFormSelector: never | once | always = null): AnonAlways = {
    val __obj = js.Dynamic.literal()
    if (warnOnDeprecatedNgFormSelector != null) __obj.updateDynamic("warnOnDeprecatedNgFormSelector")(warnOnDeprecatedNgFormSelector.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlways]
  }
}

