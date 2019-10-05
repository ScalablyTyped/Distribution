package typings.atAngularCompiler

import typings.atAngularCompiler.srcAotCompilerUnderscoreOptionsMod.AotCompilerOptions
import typings.atAngularCompiler.srcAotStaticUnderscoreReflectorMod.StaticReflector
import typings.atAngularCompiler.srcAotStaticUnderscoreSymbolMod.StaticSymbol
import typings.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileDirectiveMetadata
import typings.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompilePipeSummary
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Statement
import typings.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.TemplateAst
import typings.atAngularCompiler.srcUtilMod.OutputContext
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/view_compiler/type_check_compiler", JSImport.Namespace)
@js.native
object srcViewUnderscoreCompilerTypeUnderscoreCheckUnderscoreCompilerMod extends js.Object {
  @js.native
  class TypeCheckCompiler protected () extends js.Object {
    def this(options: AotCompilerOptions, reflector: StaticReflector) = this()
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
      componentId: String,
      component: CompileDirectiveMetadata,
      template: js.Array[TemplateAst],
      usedPipes: js.Array[CompilePipeSummary],
      externalReferenceVars: Map[StaticSymbol, String],
      ctx: OutputContext
    ): js.Array[Statement] = js.native
  }
  
}

