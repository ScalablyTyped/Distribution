package typings.angularCommon.mod

import typings.angularCore.mod.PipeTransform
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularCore.mod.ɵɵPipeDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common", "PercentPipe")
@js.native
open class PercentPipe protected ()
  extends StObject
     with PipeTransform {
  def this(_locale: String) = this()
  
  /* private */ var _locale: Any = js.native
  
  def transform(): Null = js.native
  def transform(value: String): String | Null = js.native
  def transform(value: String, digitsInfo: String): String | Null = js.native
  def transform(value: String, digitsInfo: String, locale: String): String | Null = js.native
  def transform(value: String, digitsInfo: Unit, locale: String): String | Null = js.native
  /* CompleteClass */
  override def transform(value: Any, args: Any*): Any = js.native
  def transform(value: Double): String | Null = js.native
  def transform(value: Double, digitsInfo: String): String | Null = js.native
  def transform(value: Double, digitsInfo: String, locale: String): String | Null = js.native
  def transform(value: Double, digitsInfo: Unit, locale: String): String | Null = js.native
  def transform(value: Null, digitsInfo: String): Null = js.native
  def transform(value: Null, digitsInfo: String, locale: String): Null = js.native
  def transform(value: Null, digitsInfo: Unit, locale: String): Null = js.native
  def transform(value: Unit, digitsInfo: String): Null = js.native
  def transform(value: Unit, digitsInfo: String, locale: String): Null = js.native
  def transform(value: Unit, digitsInfo: Unit, locale: String): Null = js.native
  @JSName("transform")
  def transform_Union(): String | Null = js.native
  @JSName("transform")
  def transform_Union(value: Null, digitsInfo: String): String | Null = js.native
  @JSName("transform")
  def transform_Union(value: Null, digitsInfo: String, locale: String): String | Null = js.native
  @JSName("transform")
  def transform_Union(value: Null, digitsInfo: Unit, locale: String): String | Null = js.native
  @JSName("transform")
  def transform_Union(value: Unit, digitsInfo: String): String | Null = js.native
  @JSName("transform")
  def transform_Union(value: Unit, digitsInfo: String, locale: String): String | Null = js.native
  @JSName("transform")
  def transform_Union(value: Unit, digitsInfo: Unit, locale: String): String | Null = js.native
}
/* static members */
object PercentPipe {
  
  @JSImport("@angular/common", "PercentPipe")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/common", "PercentPipe.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[PercentPipe, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[PercentPipe, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/common", "PercentPipe.\u0275pipe")
  @js.native
  def ɵpipe: ɵɵPipeDeclaration[PercentPipe, "percent", true] = js.native
  inline def ɵpipe_=(x: ɵɵPipeDeclaration[PercentPipe, "percent", true]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275pipe")(x.asInstanceOf[js.Any])
}
