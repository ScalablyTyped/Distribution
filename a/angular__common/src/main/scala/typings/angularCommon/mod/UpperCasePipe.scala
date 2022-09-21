package typings.angularCommon.mod

import typings.angularCommon.angularCommonBooleans.`true`
import typings.angularCommon.angularCommonStrings.uppercase
import typings.angularCore.mod.PipeTransform
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularCore.mod.ɵɵPipeDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common", "UpperCasePipe")
@js.native
open class UpperCasePipe ()
  extends StObject
     with PipeTransform {
  
  def transform(): Null = js.native
  /**
    * @param value The string to transform to upper case.
    */
  def transform(value: String): String = js.native
  /* CompleteClass */
  override def transform(value: Any, args: Any*): Any = js.native
  @JSName("transform")
  def transform_Union(): String | Null = js.native
  @JSName("transform")
  def transform_Union(value: String): String | Null = js.native
}
/* static members */
object UpperCasePipe {
  
  @JSImport("@angular/common", "UpperCasePipe")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/common", "UpperCasePipe.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[UpperCasePipe, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[UpperCasePipe, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/common", "UpperCasePipe.\u0275pipe")
  @js.native
  def ɵpipe: ɵɵPipeDeclaration[UpperCasePipe, uppercase, `true`] = js.native
  inline def ɵpipe_=(x: ɵɵPipeDeclaration[UpperCasePipe, uppercase, `true`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275pipe")(x.asInstanceOf[js.Any])
}
