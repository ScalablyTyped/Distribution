package typings
package atAngularCommonLib.publicUnderscoreApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common/public_api", "NgLocaleLocalization")
@js.native
class NgLocaleLocalization protected ()
  extends atAngularCommonLib.srcCommonMod.NgLocaleLocalization {
  def this(locale: java.lang.String) = this()
  def this(locale: java.lang.String, /** @deprecated from v5 */
  deprecatedPluralFn: js.Function2[
      /* locale */ java.lang.String, 
      /* value */ java.lang.String | scala.Double, 
      atAngularCommonLib.srcI18nLocaleUnderscoreDataUnderscoreApiMod.Plural
    ]) = this()
}

