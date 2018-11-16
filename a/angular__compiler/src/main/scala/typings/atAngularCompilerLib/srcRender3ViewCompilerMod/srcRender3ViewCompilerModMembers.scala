package typings
package atAngularCompilerLib.srcRender3ViewCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/render3/view/compiler", JSImport.Namespace)
@js.native
object srcRender3ViewCompilerModMembers extends js.Object {
  def compileBaseDefFromMetadata(meta: R3BaseRefMetaData): atAngularCompilerLib.Anon_ExpressionType = js.native
  def compileComponentFromMetadata(
    meta: atAngularCompilerLib.srcRender3ViewApiMod.R3ComponentMetadata,
    constantPool: atAngularCompilerLib.srcConstantUnderscorePoolMod.ConstantPool,
    bindingParser: atAngularCompilerLib.srcTemplateUnderscoreParserBindingUnderscoreParserMod.BindingParser
  ): atAngularCompilerLib.srcRender3ViewApiMod.R3ComponentDef = js.native
  def compileComponentFromRender2(
    outputCtx: atAngularCompilerLib.srcUtilMod.OutputContext,
    component: atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileDirectiveMetadata,
    render3Ast: atAngularCompilerLib.srcRender3R3UnderscoreTemplateUnderscoreTransformMod.Render3ParseResult,
    reflector: atAngularCompilerLib.srcCompileUnderscoreReflectorMod.CompileReflector,
    bindingParser: atAngularCompilerLib.srcTemplateUnderscoreParserBindingUnderscoreParserMod.BindingParser,
    directiveTypeBySel: stdLib.Map[java.lang.String, _],
    pipeTypeByName: stdLib.Map[java.lang.String, _]
  ): scala.Unit = js.native
  def compileDirectiveFromMetadata(
    meta: atAngularCompilerLib.srcRender3ViewApiMod.R3DirectiveMetadata,
    constantPool: atAngularCompilerLib.srcConstantUnderscorePoolMod.ConstantPool,
    bindingParser: atAngularCompilerLib.srcTemplateUnderscoreParserBindingUnderscoreParserMod.BindingParser
  ): atAngularCompilerLib.srcRender3ViewApiMod.R3DirectiveDef = js.native
  def compileDirectiveFromRender2(
    outputCtx: atAngularCompilerLib.srcUtilMod.OutputContext,
    directive: atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileDirectiveMetadata,
    reflector: atAngularCompilerLib.srcCompileUnderscoreReflectorMod.CompileReflector,
    bindingParser: atAngularCompilerLib.srcTemplateUnderscoreParserBindingUnderscoreParserMod.BindingParser
  ): scala.Unit = js.native
  def parseHostBindings(host: ScalablyTyped.runtime.StringDictionary[java.lang.String]): atAngularCompilerLib.Anon_AttributesKey = js.native
}

