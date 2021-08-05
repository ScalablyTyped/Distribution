package typings.angularStrap.mgcrea.ngStrap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

///////////////////////////////////////////////////////////////////////////
// Navbar
// see http://mgcrea.github.io/angular-strap/#/navbars
///////////////////////////////////////////////////////////////////////////
object navbar {
  
  trait INavbarOptions extends StObject {
    
    var activeClass: js.UndefOr[String] = js.undefined
    
    var routeAttr: js.UndefOr[String] = js.undefined
  }
  object INavbarOptions {
    
    inline def apply(): INavbarOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[INavbarOptions]
    }
    
    extension [Self <: INavbarOptions](x: Self) {
      
      inline def setActiveClass(value: String): Self = StObject.set(x, "activeClass", value.asInstanceOf[js.Any])
      
      inline def setActiveClassUndefined: Self = StObject.set(x, "activeClass", js.undefined)
      
      inline def setRouteAttr(value: String): Self = StObject.set(x, "routeAttr", value.asInstanceOf[js.Any])
      
      inline def setRouteAttrUndefined: Self = StObject.set(x, "routeAttr", js.undefined)
    }
  }
  
  trait INavbarProvider extends StObject {
    
    var defaults: INavbarOptions
  }
  object INavbarProvider {
    
    inline def apply(defaults: INavbarOptions): INavbarProvider = {
      val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any])
      __obj.asInstanceOf[INavbarProvider]
    }
    
    extension [Self <: INavbarProvider](x: Self) {
      
      inline def setDefaults(value: INavbarOptions): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    }
  }
  
  trait INavbarService extends StObject {
    
    var defaults: INavbarOptions
  }
  object INavbarService {
    
    inline def apply(defaults: INavbarOptions): INavbarService = {
      val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any])
      __obj.asInstanceOf[INavbarService]
    }
    
    extension [Self <: INavbarService](x: Self) {
      
      inline def setDefaults(value: INavbarOptions): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    }
  }
}
