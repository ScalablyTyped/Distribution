package typings
package atAngularCompilerLib.srcViewUnderscoreCompilerTypeUnderscoreCheckUnderscoreCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/view_compiler/type_check_compiler", "TypeCheckCompiler")
@js.native
class TypeCheckCompiler protected () extends js.Object {
  def this(options: atAngularCompilerLib.srcAotCompilerUnderscoreOptionsMod.AotCompilerOptions, reflector: atAngularCompilerLib.srcAotStaticUnderscoreReflectorMod.StaticReflector) = this()
  var options: js.Any = js.native
  var reflector: js.Any = js.native
  /**
       * Important notes:
       * - This must not produce new `import` statements, but only refer to types outside
       *   of the file via the variables provided via externalReferenceVars.
       *   This allows Typescript to reuse the old program's structure as no imports have changed.
       * - This must not produce any exports, as this would pollute the .d.ts file
       *   and also violate the point above.
       */
  def compileComponent(
    componentId: java.lang.String,
    component: atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileDirectiveMetadata,
    template: js.Array[
      atAngularCompilerLib.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.TemplateAst
    ],
    usedPipes: js.Array[atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompilePipeSummary],
    externalReferenceVars: stdLib.Map[
      atAngularCompilerLib.srcAotStaticUnderscoreSymbolMod.StaticSymbol, 
      java.lang.String
    ],
    ctx: atAngularCompilerLib.srcUtilMod.OutputContext
  ): js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Statement] = js.native
}

