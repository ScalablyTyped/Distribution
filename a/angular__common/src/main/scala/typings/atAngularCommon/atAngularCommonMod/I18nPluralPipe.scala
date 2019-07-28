package typings.atAngularCommon.atAngularCommonMod

import org.scalablytyped.runtime.StringDictionary
import typings.atAngularCore.atAngularCoreMod.PipeTransform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common", "I18nPluralPipe")
@js.native
class I18nPluralPipe protected () extends PipeTransform {
  def this(_localization: NgLocalization) = this()
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
  def transform(value: Double, pluralMap: StringDictionary[String]): String = js.native
  def transform(value: Double, pluralMap: StringDictionary[String], locale: String): String = js.native
}

