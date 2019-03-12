package typings
package atAngularCoreLib.srcRender3JitCompilerUnderscoreFacadeUnderscoreInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompilerFacade extends js.Object {
  var R3ResolvedDependencyType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof R3ResolvedDependencyType */ js.Any
  def compileComponent(angularCoreEnv: CoreEnvironment, sourceMapUrl: java.lang.String, meta: R3ComponentMetadataFacade): js.Any
  def compileDirective(angularCoreEnv: CoreEnvironment, sourceMapUrl: java.lang.String, meta: R3DirectiveMetadataFacade): js.Any
  def compileInjectable(angularCoreEnv: CoreEnvironment, sourceMapUrl: java.lang.String, meta: R3InjectableMetadataFacade): js.Any
  def compileInjector(angularCoreEnv: CoreEnvironment, sourceMapUrl: java.lang.String, meta: R3InjectorMetadataFacade): js.Any
  def compileNgModule(angularCoreEnv: CoreEnvironment, sourceMapUrl: java.lang.String, meta: R3NgModuleMetadataFacade): js.Any
  def compilePipe(angularCoreEnv: CoreEnvironment, sourceMapUrl: java.lang.String, meta: R3PipeMetadataFacade): js.Any
}

object CompilerFacade {
  @scala.inline
  def apply(
    R3ResolvedDependencyType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof R3ResolvedDependencyType */ js.Any,
    compileComponent: (CoreEnvironment, java.lang.String, R3ComponentMetadataFacade) => js.Any,
    compileDirective: (CoreEnvironment, java.lang.String, R3DirectiveMetadataFacade) => js.Any,
    compileInjectable: (CoreEnvironment, java.lang.String, R3InjectableMetadataFacade) => js.Any,
    compileInjector: (CoreEnvironment, java.lang.String, R3InjectorMetadataFacade) => js.Any,
    compileNgModule: (CoreEnvironment, java.lang.String, R3NgModuleMetadataFacade) => js.Any,
    compilePipe: (CoreEnvironment, java.lang.String, R3PipeMetadataFacade) => js.Any
  ): CompilerFacade = {
    val __obj = js.Dynamic.literal(R3ResolvedDependencyType = R3ResolvedDependencyType, compileComponent = js.Any.fromFunction3(compileComponent), compileDirective = js.Any.fromFunction3(compileDirective), compileInjectable = js.Any.fromFunction3(compileInjectable), compileInjector = js.Any.fromFunction3(compileInjector), compileNgModule = js.Any.fromFunction3(compileNgModule), compilePipe = js.Any.fromFunction3(compilePipe))
  
    __obj.asInstanceOf[CompilerFacade]
  }
}

