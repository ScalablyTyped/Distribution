package typings.angularStrap.mgcrea.ngStrap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

///////////////////////////////////////////////////////////////////////////
// Collapses
// see http://mgcrea.github.io/angular-strap/#/collapses
///////////////////////////////////////////////////////////////////////////
object collapse {
  
  @js.native
  trait ICollapseOptions extends StObject {
    
    var activeClass: js.UndefOr[String] = js.native
    
    var allowMultiple: js.UndefOr[Boolean] = js.native
    
    var animation: js.UndefOr[String] = js.native
    
    var disallowToggle: js.UndefOr[Boolean] = js.native
    
    var startCollapsed: js.UndefOr[Boolean] = js.native
  }
  object ICollapseOptions {
    
    @scala.inline
    def apply(): ICollapseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICollapseOptions]
    }
    
    @scala.inline
    implicit class ICollapseOptionsMutableBuilder[Self <: ICollapseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveClass(value: String): Self = StObject.set(x, "activeClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveClassUndefined: Self = StObject.set(x, "activeClass", js.undefined)
      
      @scala.inline
      def setAllowMultiple(value: Boolean): Self = StObject.set(x, "allowMultiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowMultipleUndefined: Self = StObject.set(x, "allowMultiple", js.undefined)
      
      @scala.inline
      def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      @scala.inline
      def setDisallowToggle(value: Boolean): Self = StObject.set(x, "disallowToggle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisallowToggleUndefined: Self = StObject.set(x, "disallowToggle", js.undefined)
      
      @scala.inline
      def setStartCollapsed(value: Boolean): Self = StObject.set(x, "startCollapsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartCollapsedUndefined: Self = StObject.set(x, "startCollapsed", js.undefined)
    }
  }
  
  @js.native
  trait ICollapseProvider extends StObject {
    
    var defaults: ICollapseOptions = js.native
  }
  object ICollapseProvider {
    
    @scala.inline
    def apply(defaults: ICollapseOptions): ICollapseProvider = {
      val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICollapseProvider]
    }
    
    @scala.inline
    implicit class ICollapseProviderMutableBuilder[Self <: ICollapseProvider] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaults(value: ICollapseOptions): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    }
  }
}
