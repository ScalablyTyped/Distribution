package typings.antdMobileRn

import typings.antdMobileRn.antdMobileRnStrings.lg
import typings.antdMobileRn.antdMobileRnStrings.md
import typings.antdMobileRn.antdMobileRnStrings.sm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libWingBlankPropsTypeMod {
  
  trait WingBlankPropsType extends StObject {
    
    var size: js.UndefOr[sm | md | lg] = js.undefined
  }
  object WingBlankPropsType {
    
    inline def apply(): WingBlankPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WingBlankPropsType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WingBlankPropsType] (val x: Self) extends AnyVal {
      
      inline def setSize(value: sm | md | lg): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
