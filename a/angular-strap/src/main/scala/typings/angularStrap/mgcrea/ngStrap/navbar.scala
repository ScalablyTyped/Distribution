package typings.angularStrap.mgcrea.ngStrap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

///////////////////////////////////////////////////////////////////////////
// Navbar
// see http://mgcrea.github.io/angular-strap/#/navbars
///////////////////////////////////////////////////////////////////////////
object navbar {
  
  @js.native
  trait INavbarOptions extends StObject {
    
    var activeClass: js.UndefOr[String] = js.native
    
    var routeAttr: js.UndefOr[String] = js.native
  }
  object INavbarOptions {
    
    @scala.inline
    def apply(): INavbarOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[INavbarOptions]
    }
    
    @scala.inline
    implicit class INavbarOptionsMutableBuilder[Self <: INavbarOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveClass(value: String): Self = StObject.set(x, "activeClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveClassUndefined: Self = StObject.set(x, "activeClass", js.undefined)
      
      @scala.inline
      def setRouteAttr(value: String): Self = StObject.set(x, "routeAttr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouteAttrUndefined: Self = StObject.set(x, "routeAttr", js.undefined)
    }
  }
  
  @js.native
  trait INavbarProvider extends StObject {
    
    var defaults: INavbarOptions = js.native
  }
  object INavbarProvider {
    
    @scala.inline
    def apply(defaults: INavbarOptions): INavbarProvider = {
      val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any])
      __obj.asInstanceOf[INavbarProvider]
    }
    
    @scala.inline
    implicit class INavbarProviderMutableBuilder[Self <: INavbarProvider] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaults(value: INavbarOptions): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait INavbarService extends StObject {
    
    var defaults: INavbarOptions = js.native
  }
  object INavbarService {
    
    @scala.inline
    def apply(defaults: INavbarOptions): INavbarService = {
      val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any])
      __obj.asInstanceOf[INavbarService]
    }
    
    @scala.inline
    implicit class INavbarServiceMutableBuilder[Self <: INavbarService] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaults(value: INavbarOptions): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    }
  }
}
