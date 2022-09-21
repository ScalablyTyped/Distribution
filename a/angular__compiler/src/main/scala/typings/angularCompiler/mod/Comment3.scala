package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is an R3 `Node`-like wrapper for a raw `html.Comment` node. We do not currently
  * require the implementation of a visitor for Comments as they are only collected at
  * the top-level of the R3 AST, and only if `Render3ParseOptions['collectCommentNodes']`
  * is true.
  */
trait Comment3
  extends StObject
     with TmplAstNode {
  
  var value: String
}
object Comment3 {
  
  inline def apply(sourceSpan: ParseSourceSpan, value: String, visit: Visitor3[Any] => Any): Comment3 = {
    val __obj = js.Dynamic.literal(sourceSpan = sourceSpan.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], visit = js.Any.fromFunction1(visit))
    __obj.asInstanceOf[Comment3]
  }
  
  extension [Self <: Comment3](x: Self) {
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
