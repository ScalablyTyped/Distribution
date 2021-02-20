package typings.antdMobile

import typings.antdMobile.antdMobileStrings.large
import typings.antdMobile.antdMobileStrings.small
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object badgePropsTypeMod {
  
  @js.native
  trait BadgePropsTypes extends StObject {
    
    var corner: js.UndefOr[Boolean] = js.native
    
    var dot: js.UndefOr[Boolean] = js.native
    
    var overflowCount: js.UndefOr[Double] = js.native
    
    var size: js.UndefOr[large | small] = js.native
    
    var text: js.UndefOr[js.Any] = js.native
  }
  object BadgePropsTypes {
    
    @scala.inline
    def apply(): BadgePropsTypes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BadgePropsTypes]
    }
    
    @scala.inline
    implicit class BadgePropsTypesMutableBuilder[Self <: BadgePropsTypes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCorner(value: Boolean): Self = StObject.set(x, "corner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCornerUndefined: Self = StObject.set(x, "corner", js.undefined)
      
      @scala.inline
      def setDot(value: Boolean): Self = StObject.set(x, "dot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotUndefined: Self = StObject.set(x, "dot", js.undefined)
      
      @scala.inline
      def setOverflowCount(value: Double): Self = StObject.set(x, "overflowCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowCountUndefined: Self = StObject.set(x, "overflowCount", js.undefined)
      
      @scala.inline
      def setSize(value: large | small): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setText(value: js.Any): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
