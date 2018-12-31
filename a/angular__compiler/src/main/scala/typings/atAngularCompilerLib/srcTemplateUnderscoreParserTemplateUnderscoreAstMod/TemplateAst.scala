package typings
package atAngularCompilerLib.srcTemplateUnderscoreParserTemplateUnderscoreAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateAst extends js.Object {
  /**
    * The source span from which this node was parsed.
    */
  var sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan
  /**
    * Visit this node and possibly transform it.
    */
  def visit(visitor: TemplateAstVisitor, context: js.Any): js.Any
}

