package typings.angularCommon.mod

import typings.angularCommon.anon.Optional
import typings.angularCore.mod.OnDestroy
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularCore.mod.ɵɵInjectableDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common", "HashLocationStrategy")
@js.native
open class HashLocationStrategy protected ()
  extends LocationStrategy
     with OnDestroy {
  def this(_platformLocation: PlatformLocation) = this()
  def this(_platformLocation: PlatformLocation, _baseHref: String) = this()
  
  /* private */ var _baseHref: Any = js.native
  
  /* private */ var _platformLocation: Any = js.native
  
  /* private */ var _removeListenerFns: Any = js.native
  
  @JSName("historyGo")
  def historyGo_MHashLocationStrategy(): Unit = js.native
  @JSName("historyGo")
  def historyGo_MHashLocationStrategy(relativePosition: Double): Unit = js.native
  
  /**
    * A callback method that performs custom clean-up, invoked immediately
    * before a directive, pipe, or service instance is destroyed.
    */
  /* CompleteClass */
  override def ngOnDestroy(): Unit = js.native
}
/* static members */
object HashLocationStrategy {
  
  @JSImport("@angular/common", "HashLocationStrategy")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/common", "HashLocationStrategy.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[HashLocationStrategy, js.Tuple2[Null, Optional]] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[HashLocationStrategy, js.Tuple2[Null, Optional]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/common", "HashLocationStrategy.\u0275prov")
  @js.native
  def ɵprov: ɵɵInjectableDeclaration[HashLocationStrategy] = js.native
  inline def ɵprov_=(x: ɵɵInjectableDeclaration[HashLocationStrategy]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
}
