package typings.angularCommon.mod

import org.scalablytyped.runtime.StringDictionary
import typings.angularCore.mod.PipeTransform
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularCore.mod.ɵɵPipeDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common", "I18nSelectPipe")
@js.native
open class I18nSelectPipe ()
  extends StObject
     with PipeTransform {
  
  /**
    * @param value a string to be internationalized.
    * @param mapping an object that indicates the text that should be displayed
    * for different values of the provided `value`.
    */
  def transform(value: String, mapping: StringDictionary[String]): String = js.native
  /* CompleteClass */
  override def transform(value: Any, args: Any*): Any = js.native
  def transform(value: Null, mapping: StringDictionary[String]): String = js.native
  def transform(value: Unit, mapping: StringDictionary[String]): String = js.native
}
/* static members */
object I18nSelectPipe {
  
  @JSImport("@angular/common", "I18nSelectPipe")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/common", "I18nSelectPipe.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[I18nSelectPipe, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[I18nSelectPipe, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/common", "I18nSelectPipe.\u0275pipe")
  @js.native
  def ɵpipe: ɵɵPipeDeclaration[I18nSelectPipe, "i18nSelect", true] = js.native
  inline def ɵpipe_=(x: ɵɵPipeDeclaration[I18nSelectPipe, "i18nSelect", true]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275pipe")(x.asInstanceOf[js.Any])
}
