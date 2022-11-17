package typings.angularCommon.mod

import typings.angularCore.mod.PipeTransform
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularCore.mod.ɵɵPipeDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common", "TitleCasePipe")
@js.native
open class TitleCasePipe ()
  extends StObject
     with PipeTransform {
  
  def transform(): Null = js.native
  /**
    * @param value The string to transform to title case.
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
object TitleCasePipe {
  
  @JSImport("@angular/common", "TitleCasePipe")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/common", "TitleCasePipe.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[TitleCasePipe, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[TitleCasePipe, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/common", "TitleCasePipe.\u0275pipe")
  @js.native
  def ɵpipe: ɵɵPipeDeclaration[TitleCasePipe, "titlecase", true] = js.native
  inline def ɵpipe_=(x: ɵɵPipeDeclaration[TitleCasePipe, "titlecase", true]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275pipe")(x.asInstanceOf[js.Any])
}
