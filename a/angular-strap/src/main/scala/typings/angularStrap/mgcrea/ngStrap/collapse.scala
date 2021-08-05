package typings.angularStrap.mgcrea.ngStrap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

///////////////////////////////////////////////////////////////////////////
// Collapses
// see http://mgcrea.github.io/angular-strap/#/collapses
///////////////////////////////////////////////////////////////////////////
object collapse {
  
  trait ICollapseOptions extends StObject {
    
    var activeClass: js.UndefOr[String] = js.undefined
    
    var allowMultiple: js.UndefOr[Boolean] = js.undefined
    
    var animation: js.UndefOr[String] = js.undefined
    
    var disallowToggle: js.UndefOr[Boolean] = js.undefined
    
    var startCollapsed: js.UndefOr[Boolean] = js.undefined
  }
  object ICollapseOptions {
    
    inline def apply(): ICollapseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICollapseOptions]
    }
    
    extension [Self <: ICollapseOptions](x: Self) {
      
      inline def setActiveClass(value: String): Self = StObject.set(x, "activeClass", value.asInstanceOf[js.Any])
      
      inline def setActiveClassUndefined: Self = StObject.set(x, "activeClass", js.undefined)
      
      inline def setAllowMultiple(value: Boolean): Self = StObject.set(x, "allowMultiple", value.asInstanceOf[js.Any])
      
      inline def setAllowMultipleUndefined: Self = StObject.set(x, "allowMultiple", js.undefined)
      
      inline def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setDisallowToggle(value: Boolean): Self = StObject.set(x, "disallowToggle", value.asInstanceOf[js.Any])
      
      inline def setDisallowToggleUndefined: Self = StObject.set(x, "disallowToggle", js.undefined)
      
      inline def setStartCollapsed(value: Boolean): Self = StObject.set(x, "startCollapsed", value.asInstanceOf[js.Any])
      
      inline def setStartCollapsedUndefined: Self = StObject.set(x, "startCollapsed", js.undefined)
    }
  }
  
  trait ICollapseProvider extends StObject {
    
    var defaults: ICollapseOptions
  }
  object ICollapseProvider {
    
    inline def apply(defaults: ICollapseOptions): ICollapseProvider = {
      val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICollapseProvider]
    }
    
    extension [Self <: ICollapseProvider](x: Self) {
      
      inline def setDefaults(value: ICollapseOptions): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    }
  }
}
