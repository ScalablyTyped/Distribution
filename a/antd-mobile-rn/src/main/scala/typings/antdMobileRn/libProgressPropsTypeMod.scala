package typings.antdMobileRn

import typings.antdMobileRn.antdMobileRnStrings.fixed
import typings.antdMobileRn.antdMobileRnStrings.normal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libProgressPropsTypeMod {
  
  trait ProgressPropsType extends StObject {
    
    var appearTransition: js.UndefOr[Boolean] = js.undefined
    
    var percent: js.UndefOr[Double] = js.undefined
    
    var position: js.UndefOr[fixed | normal] = js.undefined
    
    var unfilled: js.UndefOr[Boolean] = js.undefined
  }
  object ProgressPropsType {
    
    inline def apply(): ProgressPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProgressPropsType]
    }
    
    extension [Self <: ProgressPropsType](x: Self) {
      
      inline def setAppearTransition(value: Boolean): Self = StObject.set(x, "appearTransition", value.asInstanceOf[js.Any])
      
      inline def setAppearTransitionUndefined: Self = StObject.set(x, "appearTransition", js.undefined)
      
      inline def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
      
      inline def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
      
      inline def setPosition(value: fixed | normal): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setUnfilled(value: Boolean): Self = StObject.set(x, "unfilled", value.asInstanceOf[js.Any])
      
      inline def setUnfilledUndefined: Self = StObject.set(x, "unfilled", js.undefined)
    }
  }
}
