package typings.angularCommon.mod

import org.scalablytyped.runtime.StringDictionary
import typings.angularCore.mod.PipeTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common", "I18nPluralPipe")
@js.native
class I18nPluralPipe protected ()
  extends StObject
     with PipeTransform {
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
  def transform(value: Null, pluralMap: StringDictionary[String]): String = js.native
  def transform(value: Null, pluralMap: StringDictionary[String], locale: String): String = js.native
  def transform(value: Unit, pluralMap: StringDictionary[String]): String = js.native
  def transform(value: Unit, pluralMap: StringDictionary[String], locale: String): String = js.native
}
