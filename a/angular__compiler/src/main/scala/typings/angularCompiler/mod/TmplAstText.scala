package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "TmplAstText")
@js.native
open class TmplAstText protected ()
  extends StObject
     with TmplAstNode {
  def this(value: String, sourceSpan: ParseSourceSpan) = this()
  
  /* CompleteClass */
  var sourceSpan: ParseSourceSpan = js.native
  
  var value: String = js.native
  
  /* CompleteClass */
  override def visit[Result](visitor: Visitor3[Result]): Result = js.native
}
