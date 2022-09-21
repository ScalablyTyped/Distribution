package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "Comment")
@js.native
open class Comment protected ()
  extends StObject
     with Comment2 {
  def this(value: String, sourceSpan: ParseSourceSpan) = this()
  def this(value: Null, sourceSpan: ParseSourceSpan) = this()
  
  /* CompleteClass */
  var sourceSpan: ParseSourceSpan = js.native
  
  /* CompleteClass */
  var value: String | Null = js.native
  
  /* CompleteClass */
  override def visit(visitor: Visitor, context: Any): Any = js.native
}
