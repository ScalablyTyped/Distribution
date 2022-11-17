package typings.angularCommon.mod

import org.scalablytyped.runtime.StringDictionary
import typings.angularCore.mod.PipeTransform
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularCore.mod.ɵɵPipeDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common", "I18nPluralPipe")
@js.native
open class I18nPluralPipe protected ()
  extends StObject
     with PipeTransform {
  def this(_localization: NgLocalization) = this()
  
  /* private */ var _localization: Any = js.native
  
  /* CompleteClass */
  override def transform(value: Any, args: Any*): Any = js.native
  /**
    * @param value the number to be formatted
    * @param pluralMap an object that mimics the ICU format, see
    * https://unicode-org.github.io/icu/userguide/format_parse/messages/.
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
/* static members */
object I18nPluralPipe {
  
  @JSImport("@angular/common", "I18nPluralPipe")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/common", "I18nPluralPipe.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[I18nPluralPipe, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[I18nPluralPipe, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/common", "I18nPluralPipe.\u0275pipe")
  @js.native
  def ɵpipe: ɵɵPipeDeclaration[I18nPluralPipe, "i18nPlural", true] = js.native
  inline def ɵpipe_=(x: ɵɵPipeDeclaration[I18nPluralPipe, "i18nPlural", true]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275pipe")(x.asInstanceOf[js.Any])
}
