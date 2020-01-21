package typings.angularCompiler

import typings.angularCompiler.compileMetadataMod.CompileDirectiveMetadata
import typings.angularCompiler.compileMetadataMod.CompilePipeSummary
import typings.angularCompiler.compilerOptionsMod.AotCompilerOptions
import typings.angularCompiler.outputAstMod.Statement
import typings.angularCompiler.srcUtilMod.OutputContext
import typings.angularCompiler.staticReflectorMod.StaticReflector
import typings.angularCompiler.staticSymbolMod.StaticSymbol
import typings.angularCompiler.templateAstMod.TemplateAst
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/view_compiler/type_check_compiler", JSImport.Namespace)
@js.native
object typeCheckCompilerMod extends js.Object {
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

