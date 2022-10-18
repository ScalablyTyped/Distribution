package typings.angularAria

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object angularMod {
  
  object aria {
    
    /* Rewritten from type alias, can be one of: 
      - typings.angularAria.angularAriaStrings.ariaHidden
      - typings.angularAria.angularAriaStrings.ariaChecked
      - typings.angularAria.angularAriaStrings.ariaReadonly
      - typings.angularAria.angularAriaStrings.ariaDisabled
      - typings.angularAria.angularAriaStrings.ariaRequired
      - typings.angularAria.angularAriaStrings.ariaInvalid
      - typings.angularAria.angularAriaStrings.ariaValue
      - typings.angularAria.angularAriaStrings.tabindex
      - typings.angularAria.angularAriaStrings.bindKeydown
      - typings.angularAria.angularAriaStrings.bindRoleForClick
    */
    trait IAriaAttribute extends StObject
    object IAriaAttribute {
      
      inline def ariaChecked: typings.angularAria.angularAriaStrings.ariaChecked = "ariaChecked".asInstanceOf[typings.angularAria.angularAriaStrings.ariaChecked]
      
      inline def ariaDisabled: typings.angularAria.angularAriaStrings.ariaDisabled = "ariaDisabled".asInstanceOf[typings.angularAria.angularAriaStrings.ariaDisabled]
      
      inline def ariaHidden: typings.angularAria.angularAriaStrings.ariaHidden = "ariaHidden".asInstanceOf[typings.angularAria.angularAriaStrings.ariaHidden]
      
      inline def ariaInvalid: typings.angularAria.angularAriaStrings.ariaInvalid = "ariaInvalid".asInstanceOf[typings.angularAria.angularAriaStrings.ariaInvalid]
      
      inline def ariaReadonly: typings.angularAria.angularAriaStrings.ariaReadonly = "ariaReadonly".asInstanceOf[typings.angularAria.angularAriaStrings.ariaReadonly]
      
      inline def ariaRequired: typings.angularAria.angularAriaStrings.ariaRequired = "ariaRequired".asInstanceOf[typings.angularAria.angularAriaStrings.ariaRequired]
      
      inline def ariaValue: typings.angularAria.angularAriaStrings.ariaValue = "ariaValue".asInstanceOf[typings.angularAria.angularAriaStrings.ariaValue]
      
      inline def bindKeydown: typings.angularAria.angularAriaStrings.bindKeydown = "bindKeydown".asInstanceOf[typings.angularAria.angularAriaStrings.bindKeydown]
      
      inline def bindRoleForClick: typings.angularAria.angularAriaStrings.bindRoleForClick = "bindRoleForClick".asInstanceOf[typings.angularAria.angularAriaStrings.bindRoleForClick]
      
      inline def tabindex: typings.angularAria.angularAriaStrings.tabindex = "tabindex".asInstanceOf[typings.angularAria.angularAriaStrings.tabindex]
    }
    
    /**
      * $ariaProvider (https://docs.angularjs.org/api/ngAria/provider/$ariaProvider).
      */
    trait IAriaProvider extends StObject {
      
      def config(config: IAriaProviderOptions): Unit
    }
    object IAriaProvider {
      
      inline def apply(config: IAriaProviderOptions => Unit): IAriaProvider = {
        val __obj = js.Dynamic.literal(config = js.Any.fromFunction1(config))
        __obj.asInstanceOf[IAriaProvider]
      }
      
      extension [Self <: IAriaProvider](x: Self) {
        
        inline def setConfig(value: IAriaProviderOptions => Unit): Self = StObject.set(x, "config", js.Any.fromFunction1(value))
      }
    }
    
    /* Inlined {[ key in angular-aria.angular.aria.IAriaAttribute ]:? boolean} */
    trait IAriaProviderOptions extends StObject {
      
      var ariaChecked: js.UndefOr[Boolean] = js.undefined
      
      var ariaDisabled: js.UndefOr[Boolean] = js.undefined
      
      var ariaHidden: js.UndefOr[Boolean] = js.undefined
      
      var ariaInvalid: js.UndefOr[Boolean] = js.undefined
      
      var ariaReadonly: js.UndefOr[Boolean] = js.undefined
      
      var ariaRequired: js.UndefOr[Boolean] = js.undefined
      
      var ariaValue: js.UndefOr[Boolean] = js.undefined
      
      var bindKeydown: js.UndefOr[Boolean] = js.undefined
      
      var bindRoleForClick: js.UndefOr[Boolean] = js.undefined
      
      var tabindex: js.UndefOr[Boolean] = js.undefined
    }
    object IAriaProviderOptions {
      
      inline def apply(): IAriaProviderOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IAriaProviderOptions]
      }
      
      extension [Self <: IAriaProviderOptions](x: Self) {
        
        inline def setAriaChecked(value: Boolean): Self = StObject.set(x, "ariaChecked", value.asInstanceOf[js.Any])
        
        inline def setAriaCheckedUndefined: Self = StObject.set(x, "ariaChecked", js.undefined)
        
        inline def setAriaDisabled(value: Boolean): Self = StObject.set(x, "ariaDisabled", value.asInstanceOf[js.Any])
        
        inline def setAriaDisabledUndefined: Self = StObject.set(x, "ariaDisabled", js.undefined)
        
        inline def setAriaHidden(value: Boolean): Self = StObject.set(x, "ariaHidden", value.asInstanceOf[js.Any])
        
        inline def setAriaHiddenUndefined: Self = StObject.set(x, "ariaHidden", js.undefined)
        
        inline def setAriaInvalid(value: Boolean): Self = StObject.set(x, "ariaInvalid", value.asInstanceOf[js.Any])
        
        inline def setAriaInvalidUndefined: Self = StObject.set(x, "ariaInvalid", js.undefined)
        
        inline def setAriaReadonly(value: Boolean): Self = StObject.set(x, "ariaReadonly", value.asInstanceOf[js.Any])
        
        inline def setAriaReadonlyUndefined: Self = StObject.set(x, "ariaReadonly", js.undefined)
        
        inline def setAriaRequired(value: Boolean): Self = StObject.set(x, "ariaRequired", value.asInstanceOf[js.Any])
        
        inline def setAriaRequiredUndefined: Self = StObject.set(x, "ariaRequired", js.undefined)
        
        inline def setAriaValue(value: Boolean): Self = StObject.set(x, "ariaValue", value.asInstanceOf[js.Any])
        
        inline def setAriaValueUndefined: Self = StObject.set(x, "ariaValue", js.undefined)
        
        inline def setBindKeydown(value: Boolean): Self = StObject.set(x, "bindKeydown", value.asInstanceOf[js.Any])
        
        inline def setBindKeydownUndefined: Self = StObject.set(x, "bindKeydown", js.undefined)
        
        inline def setBindRoleForClick(value: Boolean): Self = StObject.set(x, "bindRoleForClick", value.asInstanceOf[js.Any])
        
        inline def setBindRoleForClickUndefined: Self = StObject.set(x, "bindRoleForClick", js.undefined)
        
        inline def setTabindex(value: Boolean): Self = StObject.set(x, "tabindex", value.asInstanceOf[js.Any])
        
        inline def setTabindexUndefined: Self = StObject.set(x, "tabindex", js.undefined)
      }
    }
    
    /**
      * $aria service (https://docs.angularjs.org/api/ngAria/service/$aria).
      */
    trait IAriaService extends StObject {
      
      def config(attribute: IAriaAttribute): Boolean
    }
    object IAriaService {
      
      inline def apply(config: IAriaAttribute => Boolean): IAriaService = {
        val __obj = js.Dynamic.literal(config = js.Any.fromFunction1(config))
        __obj.asInstanceOf[IAriaService]
      }
      
      extension [Self <: IAriaService](x: Self) {
        
        inline def setConfig(value: IAriaAttribute => Boolean): Self = StObject.set(x, "config", js.Any.fromFunction1(value))
      }
    }
  }
}
