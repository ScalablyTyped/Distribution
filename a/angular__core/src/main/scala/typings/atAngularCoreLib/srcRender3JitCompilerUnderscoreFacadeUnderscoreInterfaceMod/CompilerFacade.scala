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
    compileComponent: js.Function3[CoreEnvironment, java.lang.String, R3ComponentMetadataFacade, js.Any],
    compileDirective: js.Function3[CoreEnvironment, java.lang.String, R3DirectiveMetadataFacade, js.Any],
    compileInjectable: js.Function3[CoreEnvironment, java.lang.String, R3InjectableMetadataFacade, js.Any],
    compileInjector: js.Function3[CoreEnvironment, java.lang.String, R3InjectorMetadataFacade, js.Any],
    compileNgModule: js.Function3[CoreEnvironment, java.lang.String, R3NgModuleMetadataFacade, js.Any],
    compilePipe: js.Function3[CoreEnvironment, java.lang.String, R3PipeMetadataFacade, js.Any]
  ): CompilerFacade = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("R3ResolvedDependencyType")(R3ResolvedDependencyType)
    __obj.updateDynamic("compileComponent")(compileComponent)
    __obj.updateDynamic("compileDirective")(compileDirective)
    __obj.updateDynamic("compileInjectable")(compileInjectable)
    __obj.updateDynamic("compileInjector")(compileInjector)
    __obj.updateDynamic("compileNgModule")(compileNgModule)
    __obj.updateDynamic("compilePipe")(compilePipe)
    __obj.asInstanceOf[CompilerFacade]
  }
}

