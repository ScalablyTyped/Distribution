package typings.angularCommon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common", "NgLocaleLocalization")
@js.native
class NgLocaleLocalization protected () extends NgLocalization {
  def this(locale: String) = this()
  def this(
    locale: String,
    /** @deprecated from v5 */
  deprecatedPluralFn: js.Function2[/* locale */ String, /* value */ String | Double, Plural]
  ) = this()
  /** @deprecated from v5 */
  var deprecatedPluralFn: js.UndefOr[(js.Function2[/* locale */ String, /* value */ String | Double, Plural]) | Null] = js.native
  var locale: String = js.native
}

