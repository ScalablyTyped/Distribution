package typings
package atAngularCoreLib.srcLinkerNgUnderscoreModuleUnderscoreFactoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/linker/ng_module_factory", "NgModuleRef")
@js.native
abstract class NgModuleRef[T] () extends js.Object {
  /**
       * The ComponentFactoryResolver to get hold of the ComponentFactories
       * declared in the `entryComponents` property of the module.
       */
  val componentFactoryResolver: atAngularCoreLib.srcLinkerComponentUnderscoreFactoryUnderscoreResolverMod.ComponentFactoryResolver = js.native
  /**
       * The injector that contains all of the providers of the NgModule.
       */
  val injector: atAngularCoreLib.srcDiInjectorMod.Injector = js.native
  /**
       * The NgModule instance.
       */
  val instance: T = js.native
  /**
       * Destroys the module instance and all of the data structures associated with it.
       */
  def destroy(): scala.Unit = js.native
  /**
       * Allows to register a callback that will be called when the module is destroyed.
       */
  def onDestroy(callback: js.Function0[scala.Unit]): scala.Unit = js.native
}

