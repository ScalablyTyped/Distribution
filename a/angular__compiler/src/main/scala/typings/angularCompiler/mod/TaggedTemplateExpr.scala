package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "TaggedTemplateExpr")
@js.native
open class TaggedTemplateExpr protected () extends Expression {
  def this(tag: Expression, template: TemplateLiteral) = this()
  def this(tag: Expression, template: TemplateLiteral, `type`: Type) = this()
  def this(tag: Expression, template: TemplateLiteral, `type`: Null, sourceSpan: ParseSourceSpan) = this()
  def this(tag: Expression, template: TemplateLiteral, `type`: Unit, sourceSpan: ParseSourceSpan) = this()
  def this(tag: Expression, template: TemplateLiteral, `type`: Type, sourceSpan: ParseSourceSpan) = this()
  
  var tag: Expression = js.native
  
  var template: TemplateLiteral = js.native
}
