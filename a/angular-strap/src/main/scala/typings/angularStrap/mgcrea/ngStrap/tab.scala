package typings.angularStrap.mgcrea.ngStrap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

///////////////////////////////////////////////////////////////////////////
// Tabs
// see http://mgcrea.github.io/angular-strap/#/tabs
///////////////////////////////////////////////////////////////////////////
object tab {
  
  trait ITabOptions extends StObject {
    
    var activeClass: js.UndefOr[String] = js.undefined
    
    var animation: js.UndefOr[String] = js.undefined
    
    var navClass: js.UndefOr[String] = js.undefined
    
    var template: js.UndefOr[String] = js.undefined
  }
  object ITabOptions {
    
    inline def apply(): ITabOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITabOptions]
    }
    
    extension [Self <: ITabOptions](x: Self) {
      
      inline def setActiveClass(value: String): Self = StObject.set(x, "activeClass", value.asInstanceOf[js.Any])
      
      inline def setActiveClassUndefined: Self = StObject.set(x, "activeClass", js.undefined)
      
      inline def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setNavClass(value: String): Self = StObject.set(x, "navClass", value.asInstanceOf[js.Any])
      
      inline def setNavClassUndefined: Self = StObject.set(x, "navClass", js.undefined)
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    }
  }
  
  trait ITabProvider extends StObject {
    
    var defaults: ITabOptions
  }
  object ITabProvider {
    
    inline def apply(defaults: ITabOptions): ITabProvider = {
      val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITabProvider]
    }
    
    extension [Self <: ITabProvider](x: Self) {
      
      inline def setDefaults(value: ITabOptions): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    }
  }
  
  trait ITabService extends StObject {
    
    var controller: Any
    
    var defaults: ITabOptions
  }
  object ITabService {
    
    inline def apply(controller: Any, defaults: ITabOptions): ITabService = {
      val __obj = js.Dynamic.literal(controller = controller.asInstanceOf[js.Any], defaults = defaults.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITabService]
    }
    
    extension [Self <: ITabService](x: Self) {
      
      inline def setController(value: Any): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
      
      inline def setDefaults(value: ITabOptions): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    }
  }
}
