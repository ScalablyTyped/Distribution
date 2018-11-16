package typings
package atAngularCommonLib.srcI18nLocaleUnderscoreDataUnderscoreApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NumberFormatStyle extends js.Object

@JSImport("@angular/common/src/i18n/locale_data_api", "NumberFormatStyle")
@js.native
object NumberFormatStyle extends js.Object {
  @js.native
  sealed trait Currency
    extends atAngularCommonLib.srcI18nLocaleUnderscoreDataUnderscoreApiMod.NumberFormatStyle
  
  @js.native
  sealed trait Decimal
    extends atAngularCommonLib.srcI18nLocaleUnderscoreDataUnderscoreApiMod.NumberFormatStyle
  
  @js.native
  sealed trait Percent
    extends atAngularCommonLib.srcI18nLocaleUnderscoreDataUnderscoreApiMod.NumberFormatStyle
  
  @js.native
  sealed trait Scientific
    extends atAngularCommonLib.srcI18nLocaleUnderscoreDataUnderscoreApiMod.NumberFormatStyle
  
  /* 2 */ val Currency: Currency with scala.Double = js.native
  /* 0 */ val Decimal: Decimal with scala.Double = js.native
  /* 1 */ val Percent: Percent with scala.Double = js.native
  /* 3 */ val Scientific: Scientific with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    atAngularCommonLib.srcI18nLocaleUnderscoreDataUnderscoreApiMod.NumberFormatStyle with scala.Double
  ] = js.native
}

