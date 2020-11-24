package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core", "Sanitizer")
@js.native
abstract class Sanitizer () extends js.Object {
  
  def sanitize(context: SecurityContext): String | Null = js.native
  def sanitize(context: SecurityContext, value: String): String | Null = js.native
  def sanitize(context: SecurityContext, value: js.Object): String | Null = js.native
}
