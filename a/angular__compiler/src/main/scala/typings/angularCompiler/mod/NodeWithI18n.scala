package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("@angular/compiler", "NodeWithI18n")
@js.native
open class NodeWithI18n protected ()
  extends StObject
     with BaseNode {
  def this(sourceSpan: ParseSourceSpan) = this()
  def this(sourceSpan: ParseSourceSpan, i18n: I18nMeta2) = this()
  
  var i18n: js.UndefOr[I18nMeta2] = js.native
  
  /* CompleteClass */
  var sourceSpan: ParseSourceSpan = js.native
  
  /* CompleteClass */
  override def visit(visitor: Visitor, context: Any): Any = js.native
}
