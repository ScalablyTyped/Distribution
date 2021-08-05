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
    
    inline def apply(
      checkPosition: () => Unit,
      checkPositionWithEventLoop: () => Unit,
      destroy: () => Unit,
      init: () => Unit
    ): IAffix = {
      val __obj = js.Dynamic.literal(checkPosition = js.Any.fromFunction0(checkPosition), checkPositionWithEventLoop = js.Any.fromFunction0(checkPositionWithEventLoop), destroy = js.Any.fromFunction0(destroy), init = js.Any.fromFunction0(init))
      __obj.asInstanceOf[IAffix]
    }
    
    extension [Self <: IAffix](x: Self) {
      
      inline def setCheckPosition(value: () => Unit): Self = StObject.set(x, "checkPosition", js.Any.fromFunction0(value))
      
      inline def setCheckPositionWithEventLoop(value: () => Unit): Self = StObject.set(x, "checkPositionWithEventLoop", js.Any.fromFunction0(value))
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
    }
  }
  
  trait IAffixOptions extends StObject {
    
    var offsetBottom: js.UndefOr[Double] = js.undefined
    
    var offsetParent: js.UndefOr[Double] = js.undefined
    
    var offsetTop: js.UndefOr[Double] = js.undefined
    
    var offsetUnpin: js.UndefOr[Double] = js.undefined
  }
  object IAffixOptions {
    
    inline def apply(): IAffixOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAffixOptions]
    }
    
    extension [Self <: IAffixOptions](x: Self) {
      
      inline def setOffsetBottom(value: Double): Self = StObject.set(x, "offsetBottom", value.asInstanceOf[js.Any])
      
      inline def setOffsetBottomUndefined: Self = StObject.set(x, "offsetBottom", js.undefined)
      
      inline def setOffsetParent(value: Double): Self = StObject.set(x, "offsetParent", value.asInstanceOf[js.Any])
      
      inline def setOffsetParentUndefined: Self = StObject.set(x, "offsetParent", js.undefined)
      
      inline def setOffsetTop(value: Double): Self = StObject.set(x, "offsetTop", value.asInstanceOf[js.Any])
      
      inline def setOffsetTopUndefined: Self = StObject.set(x, "offsetTop", js.undefined)
      
      inline def setOffsetUnpin(value: Double): Self = StObject.set(x, "offsetUnpin", value.asInstanceOf[js.Any])
      
      inline def setOffsetUnpinUndefined: Self = StObject.set(x, "offsetUnpin", js.undefined)
    }
  }
  
  trait IAffixProvider extends StObject {
    
    var defaults: IAffixOptions
  }
  object IAffixProvider {
    
    inline def apply(defaults: IAffixOptions): IAffixProvider = {
      val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any])
      __obj.asInstanceOf[IAffixProvider]
    }
    
    extension [Self <: IAffixProvider](x: Self) {
      
      inline def setDefaults(value: IAffixOptions): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    }
  }
  
  type IAffixService = js.Function2[/* element */ IAugmentedJQuery, /* options */ IAffixOptions, IAffix]
}
