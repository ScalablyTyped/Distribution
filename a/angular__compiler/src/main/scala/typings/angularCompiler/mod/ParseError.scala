package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "ParseError")
@js.native
open class ParseError protected () extends StObject {
  def this(span: ParseSourceSpan, msg: String) = this()
  def this(span: ParseSourceSpan, msg: String, level: ParseErrorLevel) = this()
  
  def contextualMessage(): String = js.native
  
  var level: ParseErrorLevel = js.native
  
  var msg: String = js.native
  
  var span: ParseSourceSpan = js.native
}
