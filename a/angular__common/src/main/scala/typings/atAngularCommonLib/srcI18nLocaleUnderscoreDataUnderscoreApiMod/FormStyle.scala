package typings
package atAngularCommonLib.srcI18nLocaleUnderscoreDataUnderscoreApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FormStyle extends js.Object

@JSImport("@angular/common/src/i18n/locale_data_api", "FormStyle")
@js.native
object FormStyle extends js.Object {
  @js.native
  sealed trait Format
    extends atAngularCommonLib.srcI18nLocaleUnderscoreDataUnderscoreApiMod.FormStyle
  
  @js.native
  sealed trait Standalone
    extends atAngularCommonLib.srcI18nLocaleUnderscoreDataUnderscoreApiMod.FormStyle
  
  /* 0 */ val Format: Format with scala.Double = js.native
  /* 1 */ val Standalone: Standalone with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    atAngularCommonLib.srcI18nLocaleUnderscoreDataUnderscoreApiMod.FormStyle with scala.Double
  ] = js.native
}

