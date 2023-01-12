package typings.antdMobileRn

import typings.antdMobileRn.antdMobileRnStrings.large
import typings.antdMobileRn.antdMobileRnStrings.small
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBadgePropsTypeMod {
  
  trait BadgePropsTypes extends StObject {
    
    var corner: js.UndefOr[Boolean] = js.undefined
    
    var dot: js.UndefOr[Boolean] = js.undefined
    
    var overflowCount: js.UndefOr[Double] = js.undefined
    
    var size: js.UndefOr[large | small] = js.undefined
    
    var text: js.UndefOr[Any] = js.undefined
  }
  object BadgePropsTypes {
    
    inline def apply(): BadgePropsTypes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BadgePropsTypes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BadgePropsTypes] (val x: Self) extends AnyVal {
      
      inline def setCorner(value: Boolean): Self = StObject.set(x, "corner", value.asInstanceOf[js.Any])
      
      inline def setCornerUndefined: Self = StObject.set(x, "corner", js.undefined)
      
      inline def setDot(value: Boolean): Self = StObject.set(x, "dot", value.asInstanceOf[js.Any])
      
      inline def setDotUndefined: Self = StObject.set(x, "dot", js.undefined)
      
      inline def setOverflowCount(value: Double): Self = StObject.set(x, "overflowCount", value.asInstanceOf[js.Any])
      
      inline def setOverflowCountUndefined: Self = StObject.set(x, "overflowCount", js.undefined)
      
      inline def setSize(value: large | small): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setText(value: Any): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
