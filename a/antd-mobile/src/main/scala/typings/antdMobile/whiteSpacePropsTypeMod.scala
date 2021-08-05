package typings.antdMobile

import typings.antdMobile.antdMobileStrings.lg
import typings.antdMobile.antdMobileStrings.md
import typings.antdMobile.antdMobileStrings.sm
import typings.antdMobile.antdMobileStrings.xl
import typings.antdMobile.antdMobileStrings.xs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object whiteSpacePropsTypeMod {
  
  trait WhiteSpacePropsType extends StObject {
    
    var size: js.UndefOr[xs | sm | md | lg | xl] = js.undefined
  }
  object WhiteSpacePropsType {
    
    inline def apply(): WhiteSpacePropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WhiteSpacePropsType]
    }
    
    extension [Self <: WhiteSpacePropsType](x: Self) {
      
      inline def setSize(value: xs | sm | md | lg | xl): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
