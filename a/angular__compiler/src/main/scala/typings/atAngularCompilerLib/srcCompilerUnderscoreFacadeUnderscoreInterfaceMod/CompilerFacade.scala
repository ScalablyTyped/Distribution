package typings
package atAngularCompilerLib.srcCompilerUnderscoreFacadeUnderscoreInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompilerFacade extends js.Object {
  var R3ResolvedDependencyType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof @angular/compiler.@angular/compiler/src/compiler_facade_interface.R3ResolvedDependencyType */ js.Any
  def compileComponent(angularCoreEnv: CoreEnvironment, sourceMapUrl: java.lang.String, meta: R3ComponentMetadataFacade): js.Any
  def compileDirective(angularCoreEnv: CoreEnvironment, sourceMapUrl: java.lang.String, meta: R3DirectiveMetadataFacade): js.Any
  def compileInjectable(angularCoreEnv: CoreEnvironment, sourceMapUrl: java.lang.String, meta: R3InjectableMetadataFacade): js.Any
  def compileInjector(angularCoreEnv: CoreEnvironment, sourceMapUrl: java.lang.String, meta: R3InjectorMetadataFacade): js.Any
  def compileNgModule(angularCoreEnv: CoreEnvironment, sourceMapUrl: java.lang.String, meta: R3NgModuleMetadataFacade): js.Any
  def compilePipe(angularCoreEnv: CoreEnvironment, sourceMapUrl: java.lang.String, meta: R3PipeMetadataFacade): js.Any
}

