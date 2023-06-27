package typings.aeroSanitizer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aero/sanitizer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](input: String): String | T = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any]).asInstanceOf[String | T]
  inline def default[T](input: String, fallback: T): String | T = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[String | T]
}
