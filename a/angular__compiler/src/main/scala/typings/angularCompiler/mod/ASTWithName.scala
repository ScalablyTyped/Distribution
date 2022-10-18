package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("@angular/compiler", "ASTWithName")
@js.native
open class ASTWithName protected () extends AST {
  def this(span: ParseSpan, sourceSpan: AbsoluteSourceSpan, nameSpan: AbsoluteSourceSpan) = this()
  
  var nameSpan: AbsoluteSourceSpan = js.native
}
