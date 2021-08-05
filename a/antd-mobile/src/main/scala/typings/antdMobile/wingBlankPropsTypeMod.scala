package typings.antdMobile

import typings.antdMobile.antdMobileStrings.lg
import typings.antdMobile.antdMobileStrings.md
import typings.antdMobile.antdMobileStrings.sm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wingBlankPropsTypeMod {
  
  trait WingBlankPropsType extends StObject {
    
    var size: js.UndefOr[sm | md | lg] = js.undefined
  }
  object WingBlankPropsType {
    
    inline def apply(): WingBlankPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WingBlankPropsType]
    }
    
    extension [Self <: WingBlankPropsType](x: Self) {
      
      inline def setSize(value: sm | md | lg): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
