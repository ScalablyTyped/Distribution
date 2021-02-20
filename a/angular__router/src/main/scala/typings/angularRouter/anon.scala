package typings.angularRouter

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.angularCore.mod.ComponentRef
import typings.angularCore.mod.InjectionToken
import typings.angularCore.mod.Injector
import typings.angularRouter.angularRouterStrings.disabled
import typings.angularRouter.angularRouterStrings.enabled
import typings.angularRouter.angularRouterStrings.top
import typings.angularRouter.mod.ɵangularPackagesRouterRouterH
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AnchorScrolling extends StObject {
    
    var anchorScrolling: js.UndefOr[disabled | enabled] = js.native
    
    var scrollPositionRestoration: js.UndefOr[disabled | enabled | top] = js.native
  }
  object AnchorScrolling {
    
    @scala.inline
    def apply(): AnchorScrolling = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnchorScrolling]
    }
    
    @scala.inline
    implicit class AnchorScrollingMutableBuilder[Self <: AnchorScrolling] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnchorScrolling(value: disabled | enabled): Self = StObject.set(x, "anchorScrolling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnchorScrollingUndefined: Self = StObject.set(x, "anchorScrolling", js.undefined)
      
      @scala.inline
      def setScrollPositionRestoration(value: disabled | enabled | top): Self = StObject.set(x, "scrollPositionRestoration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollPositionRestorationUndefined: Self = StObject.set(x, "scrollPositionRestoration", js.undefined)
    }
  }
  
  @js.native
  trait Deps extends StObject {
    
    var deps: js.Array[Instantiable1[/* injector */ Injector, ɵangularPackagesRouterRouterH]] = js.native
    
    var multi: Boolean = js.native
    
    var provide: InjectionToken[js.Array[js.Function0[Unit]]] = js.native
    
    var useExisting: js.UndefOr[scala.Nothing] = js.native
    
    def useFactory(r: ɵangularPackagesRouterRouterH): js.Function0[js.Promise[_]] = js.native
    @JSName("useFactory")
    var useFactory_Original: js.Function1[/* r */ ɵangularPackagesRouterRouterH, js.Function0[js.Promise[_]]] = js.native
  }
  
  @js.native
  trait Dictk
    extends /* k */ StringDictionary[js.Any] {
    
    var navigationId: Double = js.native
  }
  object Dictk {
    
    @scala.inline
    def apply(navigationId: Double): Dictk = {
      val __obj = js.Dynamic.literal(navigationId = navigationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictk]
    }
    
    @scala.inline
    implicit class DictkMutableBuilder[Self <: Dictk] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNavigationId(value: Double): Self = StObject.set(x, "navigationId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Exact extends StObject {
    
    var exact: Boolean = js.native
  }
  object Exact {
    
    @scala.inline
    def apply(exact: Boolean): Exact = {
      val __obj = js.Dynamic.literal(exact = exact.asInstanceOf[js.Any])
      __obj.asInstanceOf[Exact]
    }
    
    @scala.inline
    implicit class ExactMutableBuilder[Self <: Exact] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExact(value: Boolean): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Multi extends StObject {
    
    var deps: js.Array[Instantiable1[/* injector */ Injector, ɵangularPackagesRouterRouterH]] = js.native
    
    var multi: js.UndefOr[scala.Nothing] = js.native
    
    var provide: InjectionToken[js.Function1[/* compRef */ ComponentRef[_], Unit]] = js.native
    
    var useExisting: js.UndefOr[scala.Nothing] = js.native
    
    def useFactory(r: ɵangularPackagesRouterRouterH): js.Function1[/* bootstrappedComponentRef */ ComponentRef[_], Unit] = js.native
    @JSName("useFactory")
    var useFactory_Original: js.Function1[
        /* r */ ɵangularPackagesRouterRouterH, 
        js.Function1[/* bootstrappedComponentRef */ ComponentRef[_], Unit]
      ] = js.native
  }
  
  @js.native
  trait Provide extends StObject {
    
    var deps: js.UndefOr[scala.Nothing] = js.native
    
    var multi: Boolean = js.native
    
    var provide: InjectionToken[js.Array[js.Function1[/* compRef */ ComponentRef[_], Unit]]] = js.native
    
    var useExisting: InjectionToken[js.Function1[/* compRef */ ComponentRef[_], Unit]] = js.native
    
    var useFactory: js.UndefOr[scala.Nothing] = js.native
  }
  object Provide {
    
    @scala.inline
    def apply(
      multi: Boolean,
      provide: InjectionToken[js.Array[js.Function1[/* compRef */ ComponentRef[_], Unit]]],
      useExisting: InjectionToken[js.Function1[/* compRef */ ComponentRef[_], Unit]]
    ): Provide = {
      val __obj = js.Dynamic.literal(multi = multi.asInstanceOf[js.Any], provide = provide.asInstanceOf[js.Any], useExisting = useExisting.asInstanceOf[js.Any])
      __obj.asInstanceOf[Provide]
    }
    
    @scala.inline
    implicit class ProvideMutableBuilder[Self <: Provide] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMulti(value: Boolean): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvide(value: InjectionToken[js.Array[js.Function1[/* compRef */ ComponentRef[_], Unit]]]): Self = StObject.set(x, "provide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseExisting(value: InjectionToken[js.Function1[/* compRef */ ComponentRef[_], Unit]]): Self = StObject.set(x, "useExisting", value.asInstanceOf[js.Any])
    }
  }
}
