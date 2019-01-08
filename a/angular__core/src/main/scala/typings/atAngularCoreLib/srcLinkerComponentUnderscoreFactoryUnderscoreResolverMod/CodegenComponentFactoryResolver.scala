package typings
package atAngularCoreLib.srcLinkerComponentUnderscoreFactoryUnderscoreResolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/linker/component_factory_resolver", "CodegenComponentFactoryResolver")
@js.native
class CodegenComponentFactoryResolver protected () extends ComponentFactoryResolver {
  def this(factories: js.Array[atAngularCoreLib.srcLinkerComponentUnderscoreFactoryMod.ComponentFactory[_]], _parent: ComponentFactoryResolver, _ngModule: atAngularCoreLib.srcLinkerNgUnderscoreModuleUnderscoreFactoryMod.NgModuleRef[_]) = this()
  var _factories: js.Any = js.native
  var _ngModule: js.Any = js.native
  var _parent: js.Any = js.native
  def resolveComponentFactory[T](component: atAngularCoreLib.Anon_ArgsAnyT[T]): atAngularCoreLib.srcLinkerComponentUnderscoreFactoryMod.ComponentFactory[T] = js.native
}

