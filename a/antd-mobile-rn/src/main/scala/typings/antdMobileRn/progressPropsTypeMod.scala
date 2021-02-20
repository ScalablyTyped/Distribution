package typings.antdMobileRn

import typings.antdMobileRn.antdMobileRnStrings.fixed
import typings.antdMobileRn.antdMobileRnStrings.normal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object progressPropsTypeMod {
  
  @js.native
  trait ProgressPropsType extends StObject {
    
    var appearTransition: js.UndefOr[Boolean] = js.native
    
    var percent: js.UndefOr[Double] = js.native
    
    var position: js.UndefOr[fixed | normal] = js.native
    
    var unfilled: js.UndefOr[Boolean] = js.native
  }
  object ProgressPropsType {
    
    @scala.inline
    def apply(): ProgressPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProgressPropsType]
    }
    
    @scala.inline
    implicit class ProgressPropsTypeMutableBuilder[Self <: ProgressPropsType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppearTransition(value: Boolean): Self = StObject.set(x, "appearTransition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppearTransitionUndefined: Self = StObject.set(x, "appearTransition", js.undefined)
      
      @scala.inline
      def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
      
      @scala.inline
      def setPosition(value: fixed | normal): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setUnfilled(value: Boolean): Self = StObject.set(x, "unfilled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnfilledUndefined: Self = StObject.set(x, "unfilled", js.undefined)
    }
  }
}
