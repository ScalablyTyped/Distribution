package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core", "Sanitizer")
@js.native
abstract class Sanitizer () extends StObject {
  
  def sanitize(context: SecurityContext): String | Null = js.native
  def sanitize(context: SecurityContext, value: String): String | Null = js.native
  def sanitize(context: SecurityContext, value: js.Object): String | Null = js.native
}
