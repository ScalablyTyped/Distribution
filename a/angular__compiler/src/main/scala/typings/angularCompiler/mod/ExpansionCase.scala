package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "ExpansionCase")
@js.native
open class ExpansionCase protected ()
  extends StObject
     with BaseNode
     with Node2 {
  def this(
    value: String,
    expression: js.Array[Node2],
    sourceSpan: ParseSourceSpan,
    valueSourceSpan: ParseSourceSpan,
    expSourceSpan: ParseSourceSpan
  ) = this()
  
  var expSourceSpan: ParseSourceSpan = js.native
  
  var expression: js.Array[Node2] = js.native
  
  /* CompleteClass */
  var sourceSpan: ParseSourceSpan = js.native
  
  var value: String = js.native
  
  var valueSourceSpan: ParseSourceSpan = js.native
  
  /* CompleteClass */
  override def visit(visitor: Visitor, context: Any): Any = js.native
}
