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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AnchorScrolling extends StObject {
    
    var anchorScrolling: js.UndefOr[disabled | enabled] = js.undefined
    
    var scrollPositionRestoration: js.UndefOr[disabled | enabled | top] = js.undefined
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
  
  trait Deps extends StObject {
    
    var deps: js.Array[Instantiable1[/* injector */ Injector, ɵangularPackagesRouterRouterH]]
    
    var multi: Boolean
    
    var provide: InjectionToken[js.Array[js.Function0[Unit]]]
    
    var useExisting: Unit
    
    def useFactory(r: ɵangularPackagesRouterRouterH): js.Function0[js.Promise[js.Any]]
    @JSName("useFactory")
    var useFactory_Original: js.Function1[/* r */ ɵangularPackagesRouterRouterH, js.Function0[js.Promise[js.Any]]]
  }
  object Deps {
    
    @scala.inline
    def apply(
      deps: js.Array[Instantiable1[/* injector */ Injector, ɵangularPackagesRouterRouterH]],
      multi: Boolean,
      provide: InjectionToken[js.Array[js.Function0[Unit]]],
      useExisting: Unit,
      useFactory: /* r */ ɵangularPackagesRouterRouterH => js.Function0[js.Promise[js.Any]]
    ): Deps = {
      val __obj = js.Dynamic.literal(deps = deps.asInstanceOf[js.Any], multi = multi.asInstanceOf[js.Any], provide = provide.asInstanceOf[js.Any], useExisting = useExisting.asInstanceOf[js.Any], useFactory = js.Any.fromFunction1(useFactory))
      __obj.asInstanceOf[Deps]
    }
    
    @scala.inline
    implicit class DepsMutableBuilder[Self <: Deps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeps(value: js.Array[Instantiable1[/* injector */ Injector, ɵangularPackagesRouterRouterH]]): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDepsVarargs(value: (Instantiable1[/* injector */ Injector, ɵangularPackagesRouterRouterH])*): Self = StObject.set(x, "deps", js.Array(value :_*))
      
      @scala.inline
      def setMulti(value: Boolean): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvide(value: InjectionToken[js.Array[js.Function0[Unit]]]): Self = StObject.set(x, "provide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseExisting(value: Unit): Self = StObject.set(x, "useExisting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseFactory(value: /* r */ ɵangularPackagesRouterRouterH => js.Function0[js.Promise[js.Any]]): Self = StObject.set(x, "useFactory", js.Any.fromFunction1(value))
    }
  }
  
  trait Dictk
    extends StObject
       with /* k */ StringDictionary[js.Any] {
    
    var navigationId: Double
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
  
  trait Exact extends StObject {
    
    var exact: Boolean
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
  
  trait Multi extends StObject {
    
    var deps: js.Array[Instantiable1[/* injector */ Injector, ɵangularPackagesRouterRouterH]]
    
    var multi: Unit
    
    var provide: InjectionToken[js.Function1[/* compRef */ ComponentRef[js.Any], Unit]]
    
    var useExisting: Unit
    
    def useFactory(r: ɵangularPackagesRouterRouterH): js.Function1[/* bootstrappedComponentRef */ ComponentRef[js.Any], Unit]
    @JSName("useFactory")
    var useFactory_Original: js.Function1[
        /* r */ ɵangularPackagesRouterRouterH, 
        js.Function1[/* bootstrappedComponentRef */ ComponentRef[js.Any], Unit]
      ]
  }
  object Multi {
    
    @scala.inline
    def apply(
      deps: js.Array[Instantiable1[/* injector */ Injector, ɵangularPackagesRouterRouterH]],
      multi: Unit,
      provide: InjectionToken[js.Function1[/* compRef */ ComponentRef[js.Any], Unit]],
      useExisting: Unit,
      useFactory: /* r */ ɵangularPackagesRouterRouterH => js.Function1[/* bootstrappedComponentRef */ ComponentRef[js.Any], Unit]
    ): Multi = {
      val __obj = js.Dynamic.literal(deps = deps.asInstanceOf[js.Any], multi = multi.asInstanceOf[js.Any], provide = provide.asInstanceOf[js.Any], useExisting = useExisting.asInstanceOf[js.Any], useFactory = js.Any.fromFunction1(useFactory))
      __obj.asInstanceOf[Multi]
    }
    
    @scala.inline
    implicit class MultiMutableBuilder[Self <: Multi] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeps(value: js.Array[Instantiable1[/* injector */ Injector, ɵangularPackagesRouterRouterH]]): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDepsVarargs(value: (Instantiable1[/* injector */ Injector, ɵangularPackagesRouterRouterH])*): Self = StObject.set(x, "deps", js.Array(value :_*))
      
      @scala.inline
      def setMulti(value: Unit): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvide(value: InjectionToken[js.Function1[/* compRef */ ComponentRef[js.Any], Unit]]): Self = StObject.set(x, "provide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseExisting(value: Unit): Self = StObject.set(x, "useExisting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseFactory(
        value: /* r */ ɵangularPackagesRouterRouterH => js.Function1[/* bootstrappedComponentRef */ ComponentRef[js.Any], Unit]
      ): Self = StObject.set(x, "useFactory", js.Any.fromFunction1(value))
    }
  }
  
  trait Provide extends StObject {
    
    var deps: Unit
    
    var multi: Boolean
    
    var provide: InjectionToken[js.Array[js.Function1[/* compRef */ ComponentRef[js.Any], Unit]]]
    
    var useExisting: InjectionToken[js.Function1[/* compRef */ ComponentRef[js.Any], Unit]]
    
    var useFactory: Unit
  }
  object Provide {
    
    @scala.inline
    def apply(
      deps: Unit,
      multi: Boolean,
      provide: InjectionToken[js.Array[js.Function1[/* compRef */ ComponentRef[js.Any], Unit]]],
      useExisting: InjectionToken[js.Function1[/* compRef */ ComponentRef[js.Any], Unit]],
      useFactory: Unit
    ): Provide = {
      val __obj = js.Dynamic.literal(deps = deps.asInstanceOf[js.Any], multi = multi.asInstanceOf[js.Any], provide = provide.asInstanceOf[js.Any], useExisting = useExisting.asInstanceOf[js.Any], useFactory = useFactory.asInstanceOf[js.Any])
      __obj.asInstanceOf[Provide]
    }
    
    @scala.inline
    implicit class ProvideMutableBuilder[Self <: Provide] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeps(value: Unit): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMulti(value: Boolean): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvide(value: InjectionToken[js.Array[js.Function1[/* compRef */ ComponentRef[js.Any], Unit]]]): Self = StObject.set(x, "provide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseExisting(value: InjectionToken[js.Function1[/* compRef */ ComponentRef[js.Any], Unit]]): Self = StObject.set(x, "useExisting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseFactory(value: Unit): Self = StObject.set(x, "useFactory", value.asInstanceOf[js.Any])
    }
  }
}
