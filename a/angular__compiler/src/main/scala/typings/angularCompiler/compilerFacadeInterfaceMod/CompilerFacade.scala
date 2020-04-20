package typings.angularCompiler.compilerFacadeInterfaceMod

import typings.angularCompiler.AnonInstantiableResourceLoader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompilerFacade extends js.Object {
  var R3FactoryTarget: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof R3FactoryTarget */ js.Any
  var R3ResolvedDependencyType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof R3ResolvedDependencyType */ js.Any
  var ResourceLoader: AnonInstantiableResourceLoader
  def compileComponent(angularCoreEnv: CoreEnvironment, sourceMapUrl: String, meta: R3ComponentMetadataFacade): js.Any
  def compileDirective(angularCoreEnv: CoreEnvironment, sourceMapUrl: String, meta: R3DirectiveMetadataFacade): js.Any
  def compileFactory(angularCoreEnv: CoreEnvironment, sourceMapUrl: String, meta: R3FactoryDefMetadataFacade): js.Any
  def compileInjectable(angularCoreEnv: CoreEnvironment, sourceMapUrl: String, meta: R3InjectableMetadataFacade): js.Any
  def compileInjector(angularCoreEnv: CoreEnvironment, sourceMapUrl: String, meta: R3InjectorMetadataFacade): js.Any
  def compileNgModule(angularCoreEnv: CoreEnvironment, sourceMapUrl: String, meta: R3NgModuleMetadataFacade): js.Any
  def compilePipe(angularCoreEnv: CoreEnvironment, sourceMapUrl: String, meta: R3PipeMetadataFacade): js.Any
  def createParseSourceSpan(kind: String, typeName: String, sourceUrl: String): ParseSourceSpan
}

object CompilerFacade {
  @scala.inline
  def apply(
    R3FactoryTarget: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof R3FactoryTarget */ js.Any,
    R3ResolvedDependencyType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof R3ResolvedDependencyType */ js.Any,
    ResourceLoader: AnonInstantiableResourceLoader,
    compileComponent: (CoreEnvironment, String, R3ComponentMetadataFacade) => js.Any,
    compileDirective: (CoreEnvironment, String, R3DirectiveMetadataFacade) => js.Any,
    compileFactory: (CoreEnvironment, String, R3FactoryDefMetadataFacade) => js.Any,
    compileInjectable: (CoreEnvironment, String, R3InjectableMetadataFacade) => js.Any,
    compileInjector: (CoreEnvironment, String, R3InjectorMetadataFacade) => js.Any,
    compileNgModule: (CoreEnvironment, String, R3NgModuleMetadataFacade) => js.Any,
    compilePipe: (CoreEnvironment, String, R3PipeMetadataFacade) => js.Any,
    createParseSourceSpan: (String, String, String) => ParseSourceSpan
  ): CompilerFacade = {
    val __obj = js.Dynamic.literal(R3FactoryTarget = R3FactoryTarget.asInstanceOf[js.Any], R3ResolvedDependencyType = R3ResolvedDependencyType.asInstanceOf[js.Any], ResourceLoader = ResourceLoader.asInstanceOf[js.Any], compileComponent = js.Any.fromFunction3(compileComponent), compileDirective = js.Any.fromFunction3(compileDirective), compileFactory = js.Any.fromFunction3(compileFactory), compileInjectable = js.Any.fromFunction3(compileInjectable), compileInjector = js.Any.fromFunction3(compileInjector), compileNgModule = js.Any.fromFunction3(compileNgModule), compilePipe = js.Any.fromFunction3(compilePipe), createParseSourceSpan = js.Any.fromFunction3(createParseSourceSpan))
    __obj.asInstanceOf[CompilerFacade]
  }
}

