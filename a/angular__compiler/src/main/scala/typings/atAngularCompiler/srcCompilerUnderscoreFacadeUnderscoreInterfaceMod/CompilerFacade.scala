package typings.atAngularCompiler.srcCompilerUnderscoreFacadeUnderscoreInterfaceMod

import typings.atAngularCompiler.Anon_ResourceLoader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompilerFacade extends js.Object {
  var R3ResolvedDependencyType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof R3ResolvedDependencyType */ js.Any
  var ResourceLoader: Anon_ResourceLoader
  def compileBase(angularCoreEnv: CoreEnvironment, sourceMapUrl: String, meta: R3BaseMetadataFacade): js.Any
  def compileComponent(angularCoreEnv: CoreEnvironment, sourceMapUrl: String, meta: R3ComponentMetadataFacade): js.Any
  def compileDirective(angularCoreEnv: CoreEnvironment, sourceMapUrl: String, meta: R3DirectiveMetadataFacade): js.Any
  def compileInjectable(angularCoreEnv: CoreEnvironment, sourceMapUrl: String, meta: R3InjectableMetadataFacade): js.Any
  def compileInjector(angularCoreEnv: CoreEnvironment, sourceMapUrl: String, meta: R3InjectorMetadataFacade): js.Any
  def compileNgModule(angularCoreEnv: CoreEnvironment, sourceMapUrl: String, meta: R3NgModuleMetadataFacade): js.Any
  def compilePipe(angularCoreEnv: CoreEnvironment, sourceMapUrl: String, meta: R3PipeMetadataFacade): js.Any
  def createParseSourceSpan(kind: String, typeName: String, sourceUrl: String): ParseSourceSpan
}

object CompilerFacade {
  @scala.inline
  def apply(
    R3ResolvedDependencyType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof R3ResolvedDependencyType */ js.Any,
    ResourceLoader: Anon_ResourceLoader,
    compileBase: (CoreEnvironment, String, R3BaseMetadataFacade) => js.Any,
    compileComponent: (CoreEnvironment, String, R3ComponentMetadataFacade) => js.Any,
    compileDirective: (CoreEnvironment, String, R3DirectiveMetadataFacade) => js.Any,
    compileInjectable: (CoreEnvironment, String, R3InjectableMetadataFacade) => js.Any,
    compileInjector: (CoreEnvironment, String, R3InjectorMetadataFacade) => js.Any,
    compileNgModule: (CoreEnvironment, String, R3NgModuleMetadataFacade) => js.Any,
    compilePipe: (CoreEnvironment, String, R3PipeMetadataFacade) => js.Any,
    createParseSourceSpan: (String, String, String) => ParseSourceSpan
  ): CompilerFacade = {
    val __obj = js.Dynamic.literal(R3ResolvedDependencyType = R3ResolvedDependencyType, ResourceLoader = ResourceLoader, compileBase = js.Any.fromFunction3(compileBase), compileComponent = js.Any.fromFunction3(compileComponent), compileDirective = js.Any.fromFunction3(compileDirective), compileInjectable = js.Any.fromFunction3(compileInjectable), compileInjector = js.Any.fromFunction3(compileInjector), compileNgModule = js.Any.fromFunction3(compileNgModule), compilePipe = js.Any.fromFunction3(compilePipe), createParseSourceSpan = js.Any.fromFunction3(createParseSourceSpan))
  
    __obj.asInstanceOf[CompilerFacade]
  }
}

