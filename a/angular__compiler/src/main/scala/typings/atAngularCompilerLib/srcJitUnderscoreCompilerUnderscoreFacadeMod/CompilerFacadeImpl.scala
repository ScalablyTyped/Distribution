package typings
package atAngularCompilerLib.srcJitUnderscoreCompilerUnderscoreFacadeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/jit_compiler_facade", "CompilerFacadeImpl")
@js.native
class CompilerFacadeImpl ()
  extends atAngularCompilerLib.srcCompilerUnderscoreFacadeUnderscoreInterfaceMod.CompilerFacade {
  def this(jitEvaluator: atAngularCompilerLib.srcOutputOutputUnderscoreJitMod.JitEvaluator) = this()
  /* CompleteClass */
  override var R3ResolvedDependencyType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof R3ResolvedDependencyType */ js.Any = js.native
  /* CompleteClass */
  override var ResourceLoader: atAngularCompilerLib.Anon_ResourceLoader = js.native
  @JSName("ResourceLoader")
  var ResourceLoader_CompilerFacadeImpl: org.scalablytyped.runtime.Instantiable0[atAngularCompilerLib.srcResourceUnderscoreLoaderMod.ResourceLoader] = js.native
  var elementSchemaRegistry: js.Any = js.native
  var jitEvaluator: js.Any = js.native
  /**
    * JIT compiles an expression and returns the result of executing that expression.
    *
    * @param def the definition which will be compiled and executed to get the value to patch
    * @param context an object map of @angular/core symbol names to symbols which will be available
    * in the context of the compiled expression
    * @param sourceUrl a URL to use for the source map of the compiled expression
    * @param preStatements a collection of statements that should be evaluated before the expression.
    */
  var jitExpression: js.Any = js.native
  /* CompleteClass */
  override def compileBase(
    angularCoreEnv: atAngularCompilerLib.srcCompilerUnderscoreFacadeUnderscoreInterfaceMod.CoreEnvironment,
    sourceMapUrl: java.lang.String,
    meta: atAngularCompilerLib.srcCompilerUnderscoreFacadeUnderscoreInterfaceMod.R3BaseMetadataFacade
  ): js.Any = js.native
  /* CompleteClass */
  override def compileComponent(
    angularCoreEnv: atAngularCompilerLib.srcCompilerUnderscoreFacadeUnderscoreInterfaceMod.CoreEnvironment,
    sourceMapUrl: java.lang.String,
    meta: atAngularCompilerLib.srcCompilerUnderscoreFacadeUnderscoreInterfaceMod.R3ComponentMetadataFacade
  ): js.Any = js.native
  /* CompleteClass */
  override def compileDirective(
    angularCoreEnv: atAngularCompilerLib.srcCompilerUnderscoreFacadeUnderscoreInterfaceMod.CoreEnvironment,
    sourceMapUrl: java.lang.String,
    meta: atAngularCompilerLib.srcCompilerUnderscoreFacadeUnderscoreInterfaceMod.R3DirectiveMetadataFacade
  ): js.Any = js.native
  /* CompleteClass */
  override def compileInjectable(
    angularCoreEnv: atAngularCompilerLib.srcCompilerUnderscoreFacadeUnderscoreInterfaceMod.CoreEnvironment,
    sourceMapUrl: java.lang.String,
    meta: atAngularCompilerLib.srcCompilerUnderscoreFacadeUnderscoreInterfaceMod.R3InjectableMetadataFacade
  ): js.Any = js.native
  /* CompleteClass */
  override def compileInjector(
    angularCoreEnv: atAngularCompilerLib.srcCompilerUnderscoreFacadeUnderscoreInterfaceMod.CoreEnvironment,
    sourceMapUrl: java.lang.String,
    meta: atAngularCompilerLib.srcCompilerUnderscoreFacadeUnderscoreInterfaceMod.R3InjectorMetadataFacade
  ): js.Any = js.native
  /* CompleteClass */
  override def compileNgModule(
    angularCoreEnv: atAngularCompilerLib.srcCompilerUnderscoreFacadeUnderscoreInterfaceMod.CoreEnvironment,
    sourceMapUrl: java.lang.String,
    meta: atAngularCompilerLib.srcCompilerUnderscoreFacadeUnderscoreInterfaceMod.R3NgModuleMetadataFacade
  ): js.Any = js.native
  /* CompleteClass */
  override def compilePipe(
    angularCoreEnv: atAngularCompilerLib.srcCompilerUnderscoreFacadeUnderscoreInterfaceMod.CoreEnvironment,
    sourceMapUrl: java.lang.String,
    meta: atAngularCompilerLib.srcCompilerUnderscoreFacadeUnderscoreInterfaceMod.R3PipeMetadataFacade
  ): js.Any = js.native
  /* CompleteClass */
  override def createParseSourceSpan(kind: java.lang.String, typeName: java.lang.String, sourceUrl: java.lang.String): atAngularCompilerLib.srcCompilerUnderscoreFacadeUnderscoreInterfaceMod.ParseSourceSpan = js.native
}

