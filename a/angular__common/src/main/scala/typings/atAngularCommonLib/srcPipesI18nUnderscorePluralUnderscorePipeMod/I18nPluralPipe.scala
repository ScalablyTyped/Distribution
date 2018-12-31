package typings
package atAngularCommonLib.srcPipesI18nUnderscorePluralUnderscorePipeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common/src/pipes/i18n_plural_pipe", "I18nPluralPipe")
@js.native
class I18nPluralPipe protected ()
  extends atAngularCoreLib.srcChangeUnderscoreDetectionPipeUnderscoreTransformMod.PipeTransform {
  def this(_localization: atAngularCommonLib.srcI18nLocalizationMod.NgLocalization) = this()
  var _localization: js.Any = js.native
  /* CompleteClass */
  override def transform(value: js.Any, args: js.Any*): js.Any = js.native
  /**
    * @param value the number to be formatted
    * @param pluralMap an object that mimics the ICU format, see
    * http://userguide.icu-project.org/formatparse/messages.
    * @param locale a `string` defining the locale to use (uses the current {@link LOCALE_ID} by
    * default).
    */
  def transform(value: scala.Double, pluralMap: org.scalablytyped.runtime.StringDictionary[java.lang.String]): java.lang.String = js.native
  def transform(
    value: scala.Double,
    pluralMap: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    locale: java.lang.String
  ): java.lang.String = js.native
}

