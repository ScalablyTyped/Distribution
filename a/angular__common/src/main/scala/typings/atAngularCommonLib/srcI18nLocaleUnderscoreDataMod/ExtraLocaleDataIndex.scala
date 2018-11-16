package typings
package atAngularCommonLib.srcI18nLocaleUnderscoreDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ExtraLocaleDataIndex extends js.Object

@JSImport("@angular/common/src/i18n/locale_data", "ExtraLocaleDataIndex")
@js.native
object ExtraLocaleDataIndex extends js.Object {
  @js.native
  sealed trait ExtraDayPeriodFormats
    extends atAngularCommonLib.srcI18nLocaleUnderscoreDataMod.ExtraLocaleDataIndex
  
  @js.native
  sealed trait ExtraDayPeriodStandalone
    extends atAngularCommonLib.srcI18nLocaleUnderscoreDataMod.ExtraLocaleDataIndex
  
  @js.native
  sealed trait ExtraDayPeriodsRules
    extends atAngularCommonLib.srcI18nLocaleUnderscoreDataMod.ExtraLocaleDataIndex
  
  /* 0 */ val ExtraDayPeriodFormats: ExtraDayPeriodFormats with scala.Double = js.native
  /* 1 */ val ExtraDayPeriodStandalone: ExtraDayPeriodStandalone with scala.Double = js.native
  /* 2 */ val ExtraDayPeriodsRules: ExtraDayPeriodsRules with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    atAngularCommonLib.srcI18nLocaleUnderscoreDataMod.ExtraLocaleDataIndex with scala.Double
  ] = js.native
}

