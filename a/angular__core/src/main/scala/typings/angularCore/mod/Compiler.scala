package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core", "Compiler")
@js.native
open class Compiler () extends StObject {
  
  /**
    * Clears all caches.
    */
  def clearCache(): Unit = js.native
  
  /**
    * Clears the cache for the given component/ngModule.
    */
  def clearCacheFor(`type`: Type[Any]): Unit = js.native
  
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
  def getModuleId(moduleType: Type[Any]): js.UndefOr[String] = js.native
}
/* static members */
object Compiler {
  
  @JSImport("@angular/core", "Compiler")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/core", "Compiler.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[Compiler, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[Compiler, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/core", "Compiler.\u0275prov")
  @js.native
  def ɵprov: ɵɵInjectableDeclaration[Compiler] = js.native
  inline def ɵprov_=(x: ɵɵInjectableDeclaration[Compiler]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
}
