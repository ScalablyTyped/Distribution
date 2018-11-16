package typings
package atAngularCommonLib.srcI18nLocaleUnderscoreDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CurrencyIndex extends js.Object

@JSImport("@angular/common/src/i18n/locale_data", "CurrencyIndex")
@js.native
object CurrencyIndex extends js.Object {
  @js.native
  sealed trait NbOfDigits
    extends atAngularCommonLib.srcI18nLocaleUnderscoreDataMod.CurrencyIndex
  
  @js.native
  sealed trait Symbol
    extends atAngularCommonLib.srcI18nLocaleUnderscoreDataMod.CurrencyIndex
  
  @js.native
  sealed trait SymbolNarrow
    extends atAngularCommonLib.srcI18nLocaleUnderscoreDataMod.CurrencyIndex
  
  /* 2 */ val NbOfDigits: NbOfDigits with scala.Double = js.native
  /* 0 */ val Symbol: Symbol with scala.Double = js.native
  /* 1 */ val SymbolNarrow: SymbolNarrow with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    atAngularCommonLib.srcI18nLocaleUnderscoreDataMod.CurrencyIndex with scala.Double
  ] = js.native
}

