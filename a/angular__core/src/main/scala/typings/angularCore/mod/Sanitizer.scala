package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("@angular/core", "Sanitizer")
@js.native
open class Sanitizer () extends StObject {
  
  def sanitize(context: SecurityContext): String | Null = js.native
  def sanitize(context: SecurityContext, value: String): String | Null = js.native
  def sanitize(context: SecurityContext, value: js.Object): String | Null = js.native
}
/* static members */
object Sanitizer {
  
  @JSImport("@angular/core", "Sanitizer")
  @js.native
  val ^ : js.Any = js.native
  
  /** @nocollapse */
  @JSImport("@angular/core", "Sanitizer.\u0275prov")
  @js.native
  def ɵprov: Any = js.native
  inline def ɵprov_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
}
