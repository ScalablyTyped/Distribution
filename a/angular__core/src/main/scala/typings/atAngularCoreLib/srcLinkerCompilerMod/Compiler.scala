package typings
package atAngularCoreLib.srcLinkerCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/linker/compiler", "Compiler")
@js.native
class Compiler () extends js.Object {
  /**
    * Clears all caches.
    */
  def clearCache(): scala.Unit = js.native
  /**
    * Clears the cache for the given component/ngModule.
    */
  def clearCacheFor(`type`: atAngularCoreLib.srcTypeMod.Type[_]): scala.Unit = js.native
  /**
    * Same as {@link #compileModuleAsync} but also creates ComponentFactories for all components.
    */
  def compileModuleAndAllComponentsAsync[T](moduleType: atAngularCoreLib.srcTypeMod.Type[T]): js.Promise[ModuleWithComponentFactories[T]] = js.native
  /**
    * Same as {@link #compileModuleSync} but also creates ComponentFactories for all components.
    */
  def compileModuleAndAllComponentsSync[T](moduleType: atAngularCoreLib.srcTypeMod.Type[T]): ModuleWithComponentFactories[T] = js.native
  /**
    * Compiles the given NgModule and all of its components
    */
  def compileModuleAsync[T](moduleType: atAngularCoreLib.srcTypeMod.Type[T]): js.Promise[
    atAngularCoreLib.srcLinkerNgUnderscoreModuleUnderscoreFactoryMod.NgModuleFactory[T]
  ] = js.native
  /**
    * Compiles the given NgModule and all of its components. All templates of the components listed
    * in `entryComponents` have to be inlined.
    */
  def compileModuleSync[T](moduleType: atAngularCoreLib.srcTypeMod.Type[T]): atAngularCoreLib.srcLinkerNgUnderscoreModuleUnderscoreFactoryMod.NgModuleFactory[T] = js.native
  /**
    * Returns the id for a given NgModule, if one is defined and known to the compiler.
    */
  def getModuleId(moduleType: atAngularCoreLib.srcTypeMod.Type[_]): js.UndefOr[java.lang.String] = js.native
}

