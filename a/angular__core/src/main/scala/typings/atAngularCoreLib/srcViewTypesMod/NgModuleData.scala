package typings
package atAngularCoreLib.srcViewTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atAngularCoreLib.srcLinkerNgUnderscoreModuleUnderscoreFactoryMod.NgModuleRef because Inheritance from two classes. Inlined injector, componentFactoryResolver, instance, destroy, onDestroy */ @js.native
trait NgModuleData
  extends atAngularCoreLib.srcDiMod.Injector {
  var _def: NgModuleDefinition = js.native
  var _parent: atAngularCoreLib.srcDiMod.Injector = js.native
  var _providers: js.Array[_] = js.native
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
  val instance: js.Any = js.native
  /**
    * Destroys the module instance and all of the data structures associated with it.
    */
  def destroy(): scala.Unit = js.native
  /**
    * Allows to register a callback that will be called when the module is destroyed.
    */
  def onDestroy(callback: js.Function0[scala.Unit]): scala.Unit = js.native
}

