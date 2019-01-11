package typings
package atAngularCommonLib.srcI18nLocalizationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common/src/i18n/localization", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val DEPRECATED_PLURAL_FN: atAngularCoreLib.atAngularCoreMod.InjectionToken[scala.Boolean] = js.native
  def getPluralCase(locale: java.lang.String, nLike: java.lang.String): atAngularCommonLib.srcI18nLocaleUnderscoreDataUnderscoreApiMod.Plural = js.native
  def getPluralCase(locale: java.lang.String, nLike: scala.Double): atAngularCommonLib.srcI18nLocaleUnderscoreDataUnderscoreApiMod.Plural = js.native
  def getPluralCategory(
    value: scala.Double,
    cases: js.Array[java.lang.String],
    ngLocalization: atAngularCommonLib.srcI18nLocalizationMod.NgLocalization
  ): java.lang.String = js.native
  def getPluralCategory(
    value: scala.Double,
    cases: js.Array[java.lang.String],
    ngLocalization: atAngularCommonLib.srcI18nLocalizationMod.NgLocalization,
    locale: java.lang.String
  ): java.lang.String = js.native
}

