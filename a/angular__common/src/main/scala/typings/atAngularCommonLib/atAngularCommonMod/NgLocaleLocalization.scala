package typings
package atAngularCommonLib.atAngularCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common", "NgLocaleLocalization")
@js.native
class NgLocaleLocalization protected () extends NgLocalization {
  def this(locale: java.lang.String) = this()
  def this(locale: java.lang.String, /** @deprecated from v5 */
  deprecatedPluralFn: js.Function2[/* locale */ java.lang.String, /* value */ java.lang.String | scala.Double, Plural]) = this()
  /** @deprecated from v5 */
  var deprecatedPluralFn: js.UndefOr[
    (js.Function2[/* locale */ java.lang.String, /* value */ java.lang.String | scala.Double, Plural]) | scala.Null
  ] = js.native
  var locale: java.lang.String = js.native
}

