package typings.angularCompiler.i18nAstMod

import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Node extends I18nMeta {
  
  var sourceSpan: ParseSourceSpan = js.native
  
  def visit(visitor: Visitor): js.Any = js.native
  def visit(visitor: Visitor, context: js.Any): js.Any = js.native
}
