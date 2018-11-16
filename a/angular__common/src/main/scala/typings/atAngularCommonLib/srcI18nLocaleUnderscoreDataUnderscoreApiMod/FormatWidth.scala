package typings
package atAngularCommonLib.srcI18nLocaleUnderscoreDataUnderscoreApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FormatWidth extends js.Object

@JSImport("@angular/common/src/i18n/locale_data_api", "FormatWidth")
@js.native
object FormatWidth extends js.Object {
  @js.native
  sealed trait Full
    extends atAngularCommonLib.srcI18nLocaleUnderscoreDataUnderscoreApiMod.FormatWidth
  
  @js.native
  sealed trait Long
    extends atAngularCommonLib.srcI18nLocaleUnderscoreDataUnderscoreApiMod.FormatWidth
  
  @js.native
  sealed trait Medium
    extends atAngularCommonLib.srcI18nLocaleUnderscoreDataUnderscoreApiMod.FormatWidth
  
  @js.native
  sealed trait Short
    extends atAngularCommonLib.srcI18nLocaleUnderscoreDataUnderscoreApiMod.FormatWidth
  
  /* 3 */ val Full: Full with scala.Double = js.native
  /* 2 */ val Long: Long with scala.Double = js.native
  /* 1 */ val Medium: Medium with scala.Double = js.native
  /* 0 */ val Short: Short with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    atAngularCommonLib.srcI18nLocaleUnderscoreDataUnderscoreApiMod.FormatWidth with scala.Double
  ] = js.native
}

