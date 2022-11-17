package typings.angularCommon.mod

import typings.angularCore.mod.PipeTransform
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularCore.mod.ɵɵPipeDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common", "CurrencyPipe")
@js.native
open class CurrencyPipe protected ()
  extends StObject
     with PipeTransform {
  def this(_locale: String) = this()
  def this(_locale: String, _defaultCurrencyCode: String) = this()
  
  /* private */ var _defaultCurrencyCode: Any = js.native
  
  /* private */ var _locale: Any = js.native
  
  @JSName("transform")
  @scala.annotation.targetName("transform_code_symbol_symbolnarrow")
  def transform(
    value: js.UndefOr[Double | Null | String],
    currencyCode: js.UndefOr[String],
    display: js.UndefOr["code" | "symbol" | "symbol-narrow" | Boolean | String],
    digitsInfo: js.UndefOr[String],
    locale: js.UndefOr[String]
  ): String | Null = js.native
  @JSName("transform")
  @scala.annotation.targetName("transform_code_symbol_symbolnarrow")
  def transform(
    value: js.UndefOr[Null],
    currencyCode: js.UndefOr[String],
    display: js.UndefOr["code" | "symbol" | "symbol-narrow" | String | Boolean],
    digitsInfo: js.UndefOr[String],
    locale: js.UndefOr[String]
  ): Null = js.native
  /* CompleteClass */
  override def transform(value: Any, args: Any*): Any = js.native
}
/* static members */
object CurrencyPipe {
  
  @JSImport("@angular/common", "CurrencyPipe")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/common", "CurrencyPipe.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[CurrencyPipe, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[CurrencyPipe, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/common", "CurrencyPipe.\u0275pipe")
  @js.native
  def ɵpipe: ɵɵPipeDeclaration[CurrencyPipe, "currency", true] = js.native
  inline def ɵpipe_=(x: ɵɵPipeDeclaration[CurrencyPipe, "currency", true]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275pipe")(x.asInstanceOf[js.Any])
}
