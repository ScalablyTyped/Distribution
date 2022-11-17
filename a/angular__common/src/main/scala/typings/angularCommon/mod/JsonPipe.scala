package typings.angularCommon.mod

import typings.angularCore.mod.PipeTransform
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularCore.mod.ɵɵPipeDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common", "JsonPipe")
@js.native
open class JsonPipe ()
  extends StObject
     with PipeTransform {
  
  /**
    * @param value A value of any type to convert into a JSON-format string.
    */
  def transform(value: Any): String = js.native
  /* CompleteClass */
  override def transform(value: Any, args: Any*): Any = js.native
}
/* static members */
object JsonPipe {
  
  @JSImport("@angular/common", "JsonPipe")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/common", "JsonPipe.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[JsonPipe, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[JsonPipe, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/common", "JsonPipe.\u0275pipe")
  @js.native
  def ɵpipe: ɵɵPipeDeclaration[JsonPipe, "json", true] = js.native
  inline def ɵpipe_=(x: ɵɵPipeDeclaration[JsonPipe, "json", true]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275pipe")(x.asInstanceOf[js.Any])
}
