package typings.angularAria

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
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
      
      @scala.inline
      def ariaChecked: typings.angularAria.angularAriaStrings.ariaChecked = "ariaChecked".asInstanceOf[typings.angularAria.angularAriaStrings.ariaChecked]
      
      @scala.inline
      def ariaDisabled: typings.angularAria.angularAriaStrings.ariaDisabled = "ariaDisabled".asInstanceOf[typings.angularAria.angularAriaStrings.ariaDisabled]
      
      @scala.inline
      def ariaHidden: typings.angularAria.angularAriaStrings.ariaHidden = "ariaHidden".asInstanceOf[typings.angularAria.angularAriaStrings.ariaHidden]
      
      @scala.inline
      def ariaInvalid: typings.angularAria.angularAriaStrings.ariaInvalid = "ariaInvalid".asInstanceOf[typings.angularAria.angularAriaStrings.ariaInvalid]
      
      @scala.inline
      def ariaReadonly: typings.angularAria.angularAriaStrings.ariaReadonly = "ariaReadonly".asInstanceOf[typings.angularAria.angularAriaStrings.ariaReadonly]
      
      @scala.inline
      def ariaRequired: typings.angularAria.angularAriaStrings.ariaRequired = "ariaRequired".asInstanceOf[typings.angularAria.angularAriaStrings.ariaRequired]
      
      @scala.inline
      def ariaValue: typings.angularAria.angularAriaStrings.ariaValue = "ariaValue".asInstanceOf[typings.angularAria.angularAriaStrings.ariaValue]
      
      @scala.inline
      def bindKeydown: typings.angularAria.angularAriaStrings.bindKeydown = "bindKeydown".asInstanceOf[typings.angularAria.angularAriaStrings.bindKeydown]
      
      @scala.inline
      def bindRoleForClick: typings.angularAria.angularAriaStrings.bindRoleForClick = "bindRoleForClick".asInstanceOf[typings.angularAria.angularAriaStrings.bindRoleForClick]
      
      @scala.inline
      def tabindex: typings.angularAria.angularAriaStrings.tabindex = "tabindex".asInstanceOf[typings.angularAria.angularAriaStrings.tabindex]
    }
    
    /**
      * $ariaProvider (https://docs.angularjs.org/api/ngAria/provider/$ariaProvider).
      */
    trait IAriaProvider extends StObject {
      
      def config(config: IAriaProviderOptions): Unit
    }
    object IAriaProvider {
      
      @scala.inline
      def apply(config: IAriaProviderOptions => Unit): IAriaProvider = {
        val __obj = js.Dynamic.literal(config = js.Any.fromFunction1(config))
        __obj.asInstanceOf[IAriaProvider]
      }
      
      @scala.inline
      implicit class IAriaProviderMutableBuilder[Self <: IAriaProvider] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setConfig(value: IAriaProviderOptions => Unit): Self = StObject.set(x, "config", js.Any.fromFunction1(value))
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
      
      @scala.inline
      def apply(): IAriaProviderOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IAriaProviderOptions]
      }
      
      @scala.inline
      implicit class IAriaProviderOptionsMutableBuilder[Self <: IAriaProviderOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAriaChecked(value: Boolean): Self = StObject.set(x, "ariaChecked", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAriaCheckedUndefined: Self = StObject.set(x, "ariaChecked", js.undefined)
        
        @scala.inline
        def setAriaDisabled(value: Boolean): Self = StObject.set(x, "ariaDisabled", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAriaDisabledUndefined: Self = StObject.set(x, "ariaDisabled", js.undefined)
        
        @scala.inline
        def setAriaHidden(value: Boolean): Self = StObject.set(x, "ariaHidden", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAriaHiddenUndefined: Self = StObject.set(x, "ariaHidden", js.undefined)
        
        @scala.inline
        def setAriaInvalid(value: Boolean): Self = StObject.set(x, "ariaInvalid", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAriaInvalidUndefined: Self = StObject.set(x, "ariaInvalid", js.undefined)
        
        @scala.inline
        def setAriaReadonly(value: Boolean): Self = StObject.set(x, "ariaReadonly", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAriaReadonlyUndefined: Self = StObject.set(x, "ariaReadonly", js.undefined)
        
        @scala.inline
        def setAriaRequired(value: Boolean): Self = StObject.set(x, "ariaRequired", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAriaRequiredUndefined: Self = StObject.set(x, "ariaRequired", js.undefined)
        
        @scala.inline
        def setAriaValue(value: Boolean): Self = StObject.set(x, "ariaValue", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAriaValueUndefined: Self = StObject.set(x, "ariaValue", js.undefined)
        
        @scala.inline
        def setBindKeydown(value: Boolean): Self = StObject.set(x, "bindKeydown", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBindKeydownUndefined: Self = StObject.set(x, "bindKeydown", js.undefined)
        
        @scala.inline
        def setBindRoleForClick(value: Boolean): Self = StObject.set(x, "bindRoleForClick", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBindRoleForClickUndefined: Self = StObject.set(x, "bindRoleForClick", js.undefined)
        
        @scala.inline
        def setTabindex(value: Boolean): Self = StObject.set(x, "tabindex", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTabindexUndefined: Self = StObject.set(x, "tabindex", js.undefined)
      }
    }
    
    /**
      * $aria service (https://docs.angularjs.org/api/ngAria/service/$aria).
      */
    trait IAriaService extends StObject {
      
      def config(attribute: IAriaAttribute): Boolean
    }
    object IAriaService {
      
      @scala.inline
      def apply(config: IAriaAttribute => Boolean): IAriaService = {
        val __obj = js.Dynamic.literal(config = js.Any.fromFunction1(config))
        __obj.asInstanceOf[IAriaService]
      }
      
      @scala.inline
      implicit class IAriaServiceMutableBuilder[Self <: IAriaService] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setConfig(value: IAriaAttribute => Boolean): Self = StObject.set(x, "config", js.Any.fromFunction1(value))
      }
    }
  }
}
