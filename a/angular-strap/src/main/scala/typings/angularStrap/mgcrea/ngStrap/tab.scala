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
    
    @scala.inline
    def apply(): ITabOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITabOptions]
    }
    
    @scala.inline
    implicit class ITabOptionsMutableBuilder[Self <: ITabOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveClass(value: String): Self = StObject.set(x, "activeClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveClassUndefined: Self = StObject.set(x, "activeClass", js.undefined)
      
      @scala.inline
      def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      @scala.inline
      def setNavClass(value: String): Self = StObject.set(x, "navClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavClassUndefined: Self = StObject.set(x, "navClass", js.undefined)
      
      @scala.inline
      def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    }
  }
  
  trait ITabProvider extends StObject {
    
    var defaults: ITabOptions
  }
  object ITabProvider {
    
    @scala.inline
    def apply(defaults: ITabOptions): ITabProvider = {
      val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITabProvider]
    }
    
    @scala.inline
    implicit class ITabProviderMutableBuilder[Self <: ITabProvider] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaults(value: ITabOptions): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    }
  }
  
  trait ITabService extends StObject {
    
    var controller: js.Any
    
    var defaults: ITabOptions
  }
  object ITabService {
    
    @scala.inline
    def apply(controller: js.Any, defaults: ITabOptions): ITabService = {
      val __obj = js.Dynamic.literal(controller = controller.asInstanceOf[js.Any], defaults = defaults.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITabService]
    }
    
    @scala.inline
    implicit class ITabServiceMutableBuilder[Self <: ITabService] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setController(value: js.Any): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaults(value: ITabOptions): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    }
  }
}
