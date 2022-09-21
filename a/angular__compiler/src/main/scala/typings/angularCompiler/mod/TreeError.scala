package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "TreeError")
@js.native
open class TreeError protected () extends ParseError {
  def this(elementName: String, span: ParseSourceSpan, msg: String) = this()
  def this(elementName: Null, span: ParseSourceSpan, msg: String) = this()
  
  var elementName: String | Null = js.native
}
/* static members */
object TreeError {
  
  @JSImport("@angular/compiler", "TreeError")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(elementName: String, span: ParseSourceSpan, msg: String): TreeError = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(elementName.asInstanceOf[js.Any], span.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[TreeError]
  inline def create(elementName: Null, span: ParseSourceSpan, msg: String): TreeError = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(elementName.asInstanceOf[js.Any], span.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[TreeError]
}
