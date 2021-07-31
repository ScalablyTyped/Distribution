package typings.angularStrap.mgcrea.ngStrap

import typings.angular.mod.IAugmentedJQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

///////////////////////////////////////////////////////////////////////////
// Affix
// see http://mgcrea.github.io/angular-strap/#/affix
///////////////////////////////////////////////////////////////////////////
object affix {
  
  trait IAffix extends StObject {
    
    def checkPosition(): Unit
    
    def checkPositionWithEventLoop(): Unit
    
    def destroy(): Unit
    
    def init(): Unit
  }
  object IAffix {
    
    @scala.inline
    def apply(
      checkPosition: () => Unit,
      checkPositionWithEventLoop: () => Unit,
      destroy: () => Unit,
      init: () => Unit
    ): IAffix = {
      val __obj = js.Dynamic.literal(checkPosition = js.Any.fromFunction0(checkPosition), checkPositionWithEventLoop = js.Any.fromFunction0(checkPositionWithEventLoop), destroy = js.Any.fromFunction0(destroy), init = js.Any.fromFunction0(init))
      __obj.asInstanceOf[IAffix]
    }
    
    @scala.inline
    implicit class IAffixMutableBuilder[Self <: IAffix] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheckPosition(value: () => Unit): Self = StObject.set(x, "checkPosition", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCheckPositionWithEventLoop(value: () => Unit): Self = StObject.set(x, "checkPositionWithEventLoop", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
    }
  }
  
  trait IAffixOptions extends StObject {
    
    var offsetBottom: js.UndefOr[Double] = js.undefined
    
    var offsetParent: js.UndefOr[Double] = js.undefined
    
    var offsetTop: js.UndefOr[Double] = js.undefined
    
    var offsetUnpin: js.UndefOr[Double] = js.undefined
  }
  object IAffixOptions {
    
    @scala.inline
    def apply(): IAffixOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAffixOptions]
    }
    
    @scala.inline
    implicit class IAffixOptionsMutableBuilder[Self <: IAffixOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOffsetBottom(value: Double): Self = StObject.set(x, "offsetBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetBottomUndefined: Self = StObject.set(x, "offsetBottom", js.undefined)
      
      @scala.inline
      def setOffsetParent(value: Double): Self = StObject.set(x, "offsetParent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetParentUndefined: Self = StObject.set(x, "offsetParent", js.undefined)
      
      @scala.inline
      def setOffsetTop(value: Double): Self = StObject.set(x, "offsetTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetTopUndefined: Self = StObject.set(x, "offsetTop", js.undefined)
      
      @scala.inline
      def setOffsetUnpin(value: Double): Self = StObject.set(x, "offsetUnpin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUnpinUndefined: Self = StObject.set(x, "offsetUnpin", js.undefined)
    }
  }
  
  trait IAffixProvider extends StObject {
    
    var defaults: IAffixOptions
  }
  object IAffixProvider {
    
    @scala.inline
    def apply(defaults: IAffixOptions): IAffixProvider = {
      val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any])
      __obj.asInstanceOf[IAffixProvider]
    }
    
    @scala.inline
    implicit class IAffixProviderMutableBuilder[Self <: IAffixProvider] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaults(value: IAffixOptions): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    }
  }
  
  type IAffixService = js.Function2[/* element */ IAugmentedJQuery, /* options */ IAffixOptions, IAffix]
}
