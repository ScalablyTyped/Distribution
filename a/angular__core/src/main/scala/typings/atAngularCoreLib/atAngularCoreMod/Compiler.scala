package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core", "Compiler")
@js.native
class Compiler () extends js.Object {
  /**
    * Clears all caches.
    */
  def clearCache(): scala.Unit = js.native
  /**
    * Clears the cache for the given component/ngModule.
    */
  def clearCacheFor(`type`: Type[_]): scala.Unit = js.native
  /**
    * Same as {@link #compileModuleAsync} but also creates ComponentFactories for all components.
    */
  def compileModuleAndAllComponentsAsync[T](moduleType: Type[T]): js.Promise[ModuleWithComponentFactories[T]] = js.native
  /**
    * Same as {@link #compileModuleSync} but also creates ComponentFactories for all components.
    */
  def compileModuleAndAllComponentsSync[T](moduleType: Type[T]): ModuleWithComponentFactories[T] = js.native
  /**
    * Compiles the given NgModule and all of its components
    */
  def compileModuleAsync[T](moduleType: Type[T]): js.Promise[NgModuleFactory[T]] = js.native
  /**
    * Compiles the given NgModule and all of its components. All templates of the components listed
    * in `entryComponents` have to be inlined.
    */
  def compileModuleSync[T](moduleType: Type[T]): NgModuleFactory[T] = js.native
  /**
    * Returns the id for a given NgModule, if one is defined and known to the compiler.
    */
  def getModuleId(moduleType: Type[_]): js.UndefOr[java.lang.String] = js.native
}

