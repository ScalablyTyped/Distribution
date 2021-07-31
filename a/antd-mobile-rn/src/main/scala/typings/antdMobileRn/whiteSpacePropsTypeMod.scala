package typings.antdMobileRn

import typings.antdMobileRn.antdMobileRnStrings.lg
import typings.antdMobileRn.antdMobileRnStrings.md
import typings.antdMobileRn.antdMobileRnStrings.sm
import typings.antdMobileRn.antdMobileRnStrings.xl
import typings.antdMobileRn.antdMobileRnStrings.xs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object whiteSpacePropsTypeMod {
  
  trait WhiteSpacePropsType extends StObject {
    
    var size: js.UndefOr[xs | sm | md | lg | xl] = js.undefined
  }
  object WhiteSpacePropsType {
    
    @scala.inline
    def apply(): WhiteSpacePropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WhiteSpacePropsType]
    }
    
    @scala.inline
    implicit class WhiteSpacePropsTypeMutableBuilder[Self <: WhiteSpacePropsType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: xs | sm | md | lg | xl): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
