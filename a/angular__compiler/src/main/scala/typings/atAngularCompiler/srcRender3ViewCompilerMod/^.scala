package typings.atAngularCompiler.srcRender3ViewCompilerMod

import org.scalablytyped.runtime.StringDictionary
import typings.atAngularCompiler.Anon_ExpressionType
import typings.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileDirectiveMetadata
import typings.atAngularCompiler.srcCompileUnderscoreReflectorMod.CompileReflector
import typings.atAngularCompiler.srcConstantUnderscorePoolMod.ConstantPool
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Expression
import typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseError
import typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
import typings.atAngularCompiler.srcRender3R3UnderscoreTemplateUnderscoreTransformMod.Render3ParseResult
import typings.atAngularCompiler.srcRender3ViewApiMod.R3ComponentDef
import typings.atAngularCompiler.srcRender3ViewApiMod.R3ComponentMetadata
import typings.atAngularCompiler.srcRender3ViewApiMod.R3DirectiveDef
import typings.atAngularCompiler.srcRender3ViewApiMod.R3DirectiveMetadata
import typings.atAngularCompiler.srcTemplateUnderscoreParserBindingUnderscoreParserMod.BindingParser
import typings.atAngularCompiler.srcUtilMod.OutputContext
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/render3/view/compiler", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def compileBaseDefFromMetadata(meta: R3BaseRefMetaData, constantPool: ConstantPool, bindingParser: BindingParser): Anon_ExpressionType = js.native
  def compileComponentFromMetadata(meta: R3ComponentMetadata, constantPool: ConstantPool, bindingParser: BindingParser): R3ComponentDef = js.native
  def compileComponentFromRender2(
    outputCtx: OutputContext,
    component: CompileDirectiveMetadata,
    render3Ast: Render3ParseResult,
    reflector: CompileReflector,
    bindingParser: BindingParser,
    directiveTypeBySel: Map[String, _],
    pipeTypeByName: Map[String, _]
  ): Unit = js.native
  def compileDirectiveFromMetadata(meta: R3DirectiveMetadata, constantPool: ConstantPool, bindingParser: BindingParser): R3DirectiveDef = js.native
  def compileDirectiveFromRender2(
    outputCtx: OutputContext,
    directive: CompileDirectiveMetadata,
    reflector: CompileReflector,
    bindingParser: BindingParser
  ): Unit = js.native
  def parseHostBindings(host: StringDictionary[String | Expression]): ParsedHostBindings = js.native
  def verifyHostBindings(bindings: ParsedHostBindings, sourceSpan: ParseSourceSpan): js.Array[ParseError] = js.native
}

