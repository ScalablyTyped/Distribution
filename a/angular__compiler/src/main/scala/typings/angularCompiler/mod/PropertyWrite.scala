package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "PropertyWrite")
@js.native
open class PropertyWrite protected () extends ASTWithName {
  def this(
    span: ParseSpan,
    sourceSpan: AbsoluteSourceSpan,
    nameSpan: AbsoluteSourceSpan,
    receiver: AST,
    name: String,
    value: AST
  ) = this()
  
  var name: String = js.native
  
  var receiver: AST = js.native
  
  var value: AST = js.native
}
