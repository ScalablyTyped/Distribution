package typings.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreParserMod

import typings.atAngularCompiler.Anon_TypeCompileTypeMetadata
import typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod.AST
import typings.atAngularCompiler.srcSelectorMod.CssSelector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/template_parser/template_parser", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createElementCssSelector(elementName: String, attributes: js.Array[js.Tuple2[String, String]]): CssSelector = js.native
  def isEmptyExpression(ast: AST): Boolean = js.native
  def removeSummaryDuplicates[T /* <: Anon_TypeCompileTypeMetadata */](items: js.Array[T]): js.Array[T] = js.native
  def splitClasses(classAttrValue: String): js.Array[String] = js.native
}

