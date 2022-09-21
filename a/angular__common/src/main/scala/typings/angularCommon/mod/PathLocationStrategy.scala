package typings.angularCommon.mod

import typings.angularCommon.anon.Optional
import typings.angularCore.mod.OnDestroy
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularCore.mod.ɵɵInjectableDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common", "PathLocationStrategy")
@js.native
open class PathLocationStrategy protected ()
  extends LocationStrategy
     with OnDestroy {
  def this(_platformLocation: PlatformLocation) = this()
  def this(_platformLocation: PlatformLocation, href: String) = this()
  
  /* private */ var _baseHref: Any = js.native
  
  /* private */ var _platformLocation: Any = js.native
  
  /* private */ var _removeListenerFns: Any = js.native
  
  @JSName("historyGo")
  def historyGo_MPathLocationStrategy(): Unit = js.native
  @JSName("historyGo")
  def historyGo_MPathLocationStrategy(relativePosition: Double): Unit = js.native
  
  /**
    * A callback method that performs custom clean-up, invoked immediately
    * before a directive, pipe, or service instance is destroyed.
    */
  /* CompleteClass */
  override def ngOnDestroy(): Unit = js.native
}
/* static members */
object PathLocationStrategy {
  
  @JSImport("@angular/common", "PathLocationStrategy")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/common", "PathLocationStrategy.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[PathLocationStrategy, js.Tuple2[Null, Optional]] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[PathLocationStrategy, js.Tuple2[Null, Optional]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/common", "PathLocationStrategy.\u0275prov")
  @js.native
  def ɵprov: ɵɵInjectableDeclaration[PathLocationStrategy] = js.native
  inline def ɵprov_=(x: ɵɵInjectableDeclaration[PathLocationStrategy]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
}
