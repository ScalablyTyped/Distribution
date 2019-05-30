package typings
package atAngularCompilerLib.srcCompilerUnderscoreFacadeUnderscoreInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompilerFacade extends js.Object {
  var R3ResolvedDependencyType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof R3ResolvedDependencyType */ js.Any
  var ResourceLoader: atAngularCompilerLib.Anon_ResourceLoader
  def compileBase(angularCoreEnv: CoreEnvironment, sourceMapUrl: java.lang.String, meta: R3BaseMetadataFacade): js.Any
  def compileComponent(angularCoreEnv: CoreEnvironment, sourceMapUrl: java.lang.String, meta: R3ComponentMetadataFacade): js.Any
  def compileDirective(angularCoreEnv: CoreEnvironment, sourceMapUrl: java.lang.String, meta: R3DirectiveMetadataFacade): js.Any
  def compileInjectable(angularCoreEnv: CoreEnvironment, sourceMapUrl: java.lang.String, meta: R3InjectableMetadataFacade): js.Any
  def compileInjector(angularCoreEnv: CoreEnvironment, sourceMapUrl: java.lang.String, meta: R3InjectorMetadataFacade): js.Any
  def compileNgModule(angularCoreEnv: CoreEnvironment, sourceMapUrl: java.lang.String, meta: R3NgModuleMetadataFacade): js.Any
  def compilePipe(angularCoreEnv: CoreEnvironment, sourceMapUrl: java.lang.String, meta: R3PipeMetadataFacade): js.Any
  def createParseSourceSpan(kind: java.lang.String, typeName: java.lang.String, sourceUrl: java.lang.String): ParseSourceSpan
}

object CompilerFacade {
  @scala.inline
  def apply(
    R3ResolvedDependencyType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof R3ResolvedDependencyType */ js.Any,
    ResourceLoader: atAngularCompilerLib.Anon_ResourceLoader,
    compileBase: (CoreEnvironment, java.lang.String, R3BaseMetadataFacade) => js.Any,
    compileComponent: (CoreEnvironment, java.lang.String, R3ComponentMetadataFacade) => js.Any,
    compileDirective: (CoreEnvironment, java.lang.String, R3DirectiveMetadataFacade) => js.Any,
    compileInjectable: (CoreEnvironment, java.lang.String, R3InjectableMetadataFacade) => js.Any,
    compileInjector: (CoreEnvironment, java.lang.String, R3InjectorMetadataFacade) => js.Any,
    compileNgModule: (CoreEnvironment, java.lang.String, R3NgModuleMetadataFacade) => js.Any,
    compilePipe: (CoreEnvironment, java.lang.String, R3PipeMetadataFacade) => js.Any,
    createParseSourceSpan: (java.lang.String, java.lang.String, java.lang.String) => ParseSourceSpan
  ): CompilerFacade = {
    val __obj = js.Dynamic.literal(R3ResolvedDependencyType = R3ResolvedDependencyType, ResourceLoader = ResourceLoader, compileBase = js.Any.fromFunction3(compileBase), compileComponent = js.Any.fromFunction3(compileComponent), compileDirective = js.Any.fromFunction3(compileDirective), compileInjectable = js.Any.fromFunction3(compileInjectable), compileInjector = js.Any.fromFunction3(compileInjector), compileNgModule = js.Any.fromFunction3(compileNgModule), compilePipe = js.Any.fromFunction3(compilePipe), createParseSourceSpan = js.Any.fromFunction3(createParseSourceSpan))
  
    __obj.asInstanceOf[CompilerFacade]
  }
}

