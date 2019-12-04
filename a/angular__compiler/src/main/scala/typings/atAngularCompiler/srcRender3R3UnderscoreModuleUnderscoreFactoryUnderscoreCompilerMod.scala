package typings.atAngularCompiler

import typings.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileNgModuleMetadata
import typings.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileTypeMetadata
import typings.atAngularCompiler.srcMetadataUnderscoreResolverMod.CompileMetadataResolver
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Expression
import typings.atAngularCompiler.srcUtilMod.OutputContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/render3/r3_module_factory_compiler", JSImport.Namespace)
@js.native
object srcRender3R3UnderscoreModuleUnderscoreFactoryUnderscoreCompilerMod extends js.Object {
  def compileModuleFactory(
    outputCtx: OutputContext,
    module: CompileNgModuleMetadata,
    backPatchReferenceOf: js.Function1[/* module */ CompileTypeMetadata, Expression],
    resolver: CompileMetadataResolver
  ): Unit = js.native
}

