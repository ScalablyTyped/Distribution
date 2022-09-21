package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "TmplAstReference")
@js.native
open class TmplAstReference protected ()
  extends StObject
     with TmplAstNode {
  def this(name: String, value: String, sourceSpan: ParseSourceSpan, keySpan: ParseSourceSpan) = this()
  def this(
    name: String,
    value: String,
    sourceSpan: ParseSourceSpan,
    keySpan: ParseSourceSpan,
    valueSpan: ParseSourceSpan
  ) = this()
  
  val keySpan: ParseSourceSpan = js.native
  
  var name: String = js.native
  
  /* CompleteClass */
  var sourceSpan: ParseSourceSpan = js.native
  
  var value: String = js.native
  
  var valueSpan: js.UndefOr[ParseSourceSpan] = js.native
  
  /* CompleteClass */
  override def visit[Result](visitor: Visitor3[Result]): Result = js.native
}
