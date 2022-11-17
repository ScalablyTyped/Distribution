package typings.angularRouter

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.Instantiable5
import org.scalablytyped.runtime.StringDictionary
import typings.angularCore.mod.ChangeDetectorRef
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.ModuleWithProviders
import typings.angularCore.mod.Renderer2
import typings.angularCore.mod.ɵɵComponentDeclaration
import typings.angularCore.mod.ɵɵDirectiveDeclaration
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularCore.mod.ɵɵInjectorDeclaration
import typings.angularCore.mod.ɵɵNgModuleDeclaration
import typings.angularRouter.mod.ExtraOptions
import typings.angularRouter.mod.Router
import typings.angularRouter.mod.RouterLink
import typings.angularRouter.mod.RouterLinkActive
import typings.angularRouter.mod.RouterModule
import typings.angularRouter.mod.RouterOutlet
import typings.angularRouter.mod.Routes
import typings.angularRouter.mod.ɵEmptyOutletComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ActivateEvents extends StObject {
    
    var activateEvents: "activate"
    
    var attachEvents: "attach"
    
    var deactivateEvents: "deactivate"
    
    var detachEvents: "detach"
  }
  object ActivateEvents {
    
    inline def apply(): ActivateEvents = {
      val __obj = js.Dynamic.literal(activateEvents = "activate", attachEvents = "attach", deactivateEvents = "deactivate", detachEvents = "detach")
      __obj.asInstanceOf[ActivateEvents]
    }
    
    extension [Self <: ActivateEvents](x: Self) {
      
      inline def setActivateEvents(value: "activate"): Self = StObject.set(x, "activateEvents", value.asInstanceOf[js.Any])
      
      inline def setAttachEvents(value: "attach"): Self = StObject.set(x, "attachEvents", value.asInstanceOf[js.Any])
      
      inline def setDeactivateEvents(value: "deactivate"): Self = StObject.set(x, "deactivateEvents", value.asInstanceOf[js.Any])
      
      inline def setDetachEvents(value: "detach"): Self = StObject.set(x, "detachEvents", value.asInstanceOf[js.Any])
    }
  }
  
  trait AriaCurrentWhenActive extends StObject {
    
    var ariaCurrentWhenActive: "ariaCurrentWhenActive"
    
    var routerLinkActive: "routerLinkActive"
    
    var routerLinkActiveOptions: "routerLinkActiveOptions"
  }
  object AriaCurrentWhenActive {
    
    inline def apply(): AriaCurrentWhenActive = {
      val __obj = js.Dynamic.literal(ariaCurrentWhenActive = "ariaCurrentWhenActive", routerLinkActive = "routerLinkActive", routerLinkActiveOptions = "routerLinkActiveOptions")
      __obj.asInstanceOf[AriaCurrentWhenActive]
    }
    
    extension [Self <: AriaCurrentWhenActive](x: Self) {
      
      inline def setAriaCurrentWhenActive(value: "ariaCurrentWhenActive"): Self = StObject.set(x, "ariaCurrentWhenActive", value.asInstanceOf[js.Any])
      
      inline def setRouterLinkActive(value: "routerLinkActive"): Self = StObject.set(x, "routerLinkActive", value.asInstanceOf[js.Any])
      
      inline def setRouterLinkActiveOptions(value: "routerLinkActiveOptions"): Self = StObject.set(x, "routerLinkActiveOptions", value.asInstanceOf[js.Any])
    }
  }
  
  trait Attribute extends StObject {
    
    var attribute: "tabindex"
  }
  object Attribute {
    
    inline def apply(): Attribute = {
      val __obj = js.Dynamic.literal(attribute = "tabindex")
      __obj.asInstanceOf[Attribute]
    }
    
    extension [Self <: Attribute](x: Self) {
      
      inline def setAttribute(value: "tabindex"): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    }
  }
  
  trait Dictk
    extends StObject
       with /* k */ StringDictionary[Any] {
    
    var navigationId: Double
  }
  object Dictk {
    
    inline def apply(navigationId: Double): Dictk = {
      val __obj = js.Dynamic.literal(navigationId = navigationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictk]
    }
    
    extension [Self <: Dictk](x: Self) {
      
      inline def setNavigationId(value: Double): Self = StObject.set(x, "navigationId", value.asInstanceOf[js.Any])
    }
  }
  
  trait Exact extends StObject {
    
    var exact: Boolean
  }
  object Exact {
    
    inline def apply(exact: Boolean): Exact = {
      val __obj = js.Dynamic.literal(exact = exact.asInstanceOf[js.Any])
      __obj.asInstanceOf[Exact]
    }
    
    extension [Self <: Exact](x: Self) {
      
      inline def setExact(value: Boolean): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
    }
  }
  
  trait Fragment extends StObject {
    
    var fragment: "fragment"
    
    var preserveFragment: "preserveFragment"
    
    var queryParams: "queryParams"
    
    var queryParamsHandling: "queryParamsHandling"
    
    var relativeTo: "relativeTo"
    
    var replaceUrl: "replaceUrl"
    
    var routerLink: "routerLink"
    
    var skipLocationChange: "skipLocationChange"
    
    var state: "state"
    
    var target: "target"
  }
  object Fragment {
    
    inline def apply(): Fragment = {
      val __obj = js.Dynamic.literal(fragment = "fragment", preserveFragment = "preserveFragment", queryParams = "queryParams", queryParamsHandling = "queryParamsHandling", relativeTo = "relativeTo", replaceUrl = "replaceUrl", routerLink = "routerLink", skipLocationChange = "skipLocationChange", state = "state", target = "target")
      __obj.asInstanceOf[Fragment]
    }
    
    extension [Self <: Fragment](x: Self) {
      
      inline def setFragment(value: "fragment"): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
      
      inline def setPreserveFragment(value: "preserveFragment"): Self = StObject.set(x, "preserveFragment", value.asInstanceOf[js.Any])
      
      inline def setQueryParams(value: "queryParams"): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
      
      inline def setQueryParamsHandling(value: "queryParamsHandling"): Self = StObject.set(x, "queryParamsHandling", value.asInstanceOf[js.Any])
      
      inline def setRelativeTo(value: "relativeTo"): Self = StObject.set(x, "relativeTo", value.asInstanceOf[js.Any])
      
      inline def setReplaceUrl(value: "replaceUrl"): Self = StObject.set(x, "replaceUrl", value.asInstanceOf[js.Any])
      
      inline def setRouterLink(value: "routerLink"): Self = StObject.set(x, "routerLink", value.asInstanceOf[js.Any])
      
      inline def setSkipLocationChange(value: "skipLocationChange"): Self = StObject.set(x, "skipLocationChange", value.asInstanceOf[js.Any])
      
      inline def setState(value: "state"): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: "target"): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  trait IsActiveChange extends StObject {
    
    var isActiveChange: "isActiveChange"
  }
  object IsActiveChange {
    
    inline def apply(): IsActiveChange = {
      val __obj = js.Dynamic.literal(isActiveChange = "isActiveChange")
      __obj.asInstanceOf[IsActiveChange]
    }
    
    extension [Self <: IsActiveChange](x: Self) {
      
      inline def setIsActiveChange(value: "isActiveChange"): Self = StObject.set(x, "isActiveChange", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name extends StObject {
    
    var name: "name"
  }
  object Name {
    
    inline def apply(): Name = {
      val __obj = js.Dynamic.literal(name = "name")
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: "name"): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Optional extends StObject {
    
    var optional: true
  }
  object Optional {
    
    inline def apply(): Optional = {
      val __obj = js.Dynamic.literal(optional = true)
      __obj.asInstanceOf[Optional]
    }
    
    extension [Self <: Optional](x: Self) {
      
      inline def setOptional(value: true): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypeofRouterLink extends StObject {
    
    /* static member */
    var ɵdir: ɵɵDirectiveDeclaration[
        RouterLink, 
        "[routerLink]", 
        scala.Nothing, 
        Fragment, 
        js.Object, 
        scala.Nothing, 
        scala.Nothing, 
        true, 
        scala.Nothing
      ]
    
    /* static member */
    var ɵfac: ɵɵFactoryDeclaration[RouterLink, js.Tuple6[Null, Null, Attribute, Null, Null, Null]]
  }
  object TypeofRouterLink {
    
    inline def apply(
      ɵdir: ɵɵDirectiveDeclaration[
          RouterLink, 
          "[routerLink]", 
          scala.Nothing, 
          Fragment, 
          js.Object, 
          scala.Nothing, 
          scala.Nothing, 
          true, 
          scala.Nothing
        ],
      ɵfac: ɵɵFactoryDeclaration[RouterLink, js.Tuple6[Null, Null, Attribute, Null, Null, Null]]
    ): TypeofRouterLink = {
      val __obj = js.Dynamic.literal(ɵdir = ɵdir.asInstanceOf[js.Any], ɵfac = ɵfac.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofRouterLink]
    }
    
    extension [Self <: TypeofRouterLink](x: Self) {
      
      inline def setƟdir(
        value: ɵɵDirectiveDeclaration[
              RouterLink, 
              "[routerLink]", 
              scala.Nothing, 
              Fragment, 
              js.Object, 
              scala.Nothing, 
              scala.Nothing, 
              true, 
              scala.Nothing
            ]
      ): Self = StObject.set(x, "\u0275dir", value.asInstanceOf[js.Any])
      
      inline def setƟfac(value: ɵɵFactoryDeclaration[RouterLink, js.Tuple6[Null, Null, Attribute, Null, Null, Null]]): Self = StObject.set(x, "\u0275fac", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofRouterLinkActive
    extends StObject
       with Instantiable4[
          /* router */ Router, 
          /* element */ ElementRef[Any], 
          /* renderer */ Renderer2, 
          /* cdr */ ChangeDetectorRef, 
          RouterLinkActive
        ]
       with Instantiable5[
          /* router */ Router, 
          /* element */ ElementRef[Any], 
          /* renderer */ Renderer2, 
          /* cdr */ ChangeDetectorRef, 
          /* link */ RouterLink, 
          RouterLinkActive
        ] {
    
    var ɵdir: ɵɵDirectiveDeclaration[
        RouterLinkActive, 
        "[routerLinkActive]", 
        js.Array["routerLinkActive"], 
        AriaCurrentWhenActive, 
        IsActiveChange, 
        js.Array["links"], 
        scala.Nothing, 
        true, 
        scala.Nothing
      ] = js.native
    
    var ɵfac: ɵɵFactoryDeclaration[RouterLinkActive, js.Tuple5[Null, Null, Null, Null, Optional]] = js.native
  }
  
  @js.native
  trait TypeofRouterModule
    extends StObject
       with Instantiable1[/* guard */ Any, RouterModule] {
    
    /**
      * Creates a module with all the router directives and a provider registering routes,
      * without creating a new Router service.
      * When registering for submodules and lazy-loaded submodules, create the NgModule as follows:
      *
      * ```
      * @NgModule({
      *   imports: [RouterModule.forChild(ROUTES)]
      * })
      * class MyNgModule {}
      * ```
      *
      * @param routes An array of `Route` objects that define the navigation paths for the submodule.
      * @return The new NgModule.
      *
      */
    def forChild(routes: Routes): ModuleWithProviders[RouterModule] = js.native
    
    /**
      * Creates and configures a module with all the router providers and directives.
      * Optionally sets up an application listener to perform an initial navigation.
      *
      * When registering the NgModule at the root, import as follows:
      *
      * ```
      * @NgModule({
      *   imports: [RouterModule.forRoot(ROUTES)]
      * })
      * class MyNgModule {}
      * ```
      *
      * @param routes An array of `Route` objects that define the navigation paths for the application.
      * @param config An `ExtraOptions` configuration object that controls how navigation is performed.
      * @return The new `NgModule`.
      *
      */
    def forRoot(routes: Routes): ModuleWithProviders[RouterModule] = js.native
    def forRoot(routes: Routes, config: ExtraOptions): ModuleWithProviders[RouterModule] = js.native
    
    var ɵfac: ɵɵFactoryDeclaration[RouterModule, js.Array[Optional]] = js.native
    
    var ɵinj: ɵɵInjectorDeclaration[RouterModule] = js.native
    
    var ɵmod: ɵɵNgModuleDeclaration[
        RouterModule, 
        scala.Nothing, 
        js.Tuple4[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof i1.RouterOutlet */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: typeof i2.RouterLink */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: typeof i3.RouterLinkActive */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: typeof i4.ɵEmptyOutletComponent */ js.Any
        ], 
        js.Tuple4[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof i1.RouterOutlet */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: typeof i2.RouterLink */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: typeof i3.RouterLinkActive */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: typeof i4.ɵEmptyOutletComponent */ js.Any
        ]
      ] = js.native
  }
  
  @js.native
  trait TypeofRouterOutlet
    extends StObject
       with Instantiable0[RouterOutlet] {
    
    var ɵdir: ɵɵDirectiveDeclaration[
        RouterOutlet, 
        "router-outlet", 
        js.Array["outlet"], 
        Name, 
        ActivateEvents, 
        scala.Nothing, 
        scala.Nothing, 
        true, 
        scala.Nothing
      ] = js.native
    
    var ɵfac: ɵɵFactoryDeclaration[RouterOutlet, scala.Nothing] = js.native
  }
  
  @js.native
  trait TypeofɵEmptyOutletCompone
    extends StObject
       with Instantiable0[ɵEmptyOutletComponent] {
    
    var ɵcmp: ɵɵComponentDeclaration[
        ɵEmptyOutletComponent, 
        "ng-component", 
        scala.Nothing, 
        js.Object, 
        js.Object, 
        scala.Nothing, 
        scala.Nothing, 
        true, 
        scala.Nothing
      ] = js.native
    
    var ɵfac: ɵɵFactoryDeclaration[ɵEmptyOutletComponent, scala.Nothing] = js.native
  }
}
