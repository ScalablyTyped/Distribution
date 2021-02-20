package typings.antdMobile

import typings.antdMobile.antdMobileStrings.lg
import typings.antdMobile.antdMobileStrings.md
import typings.antdMobile.antdMobileStrings.sm
import typings.antdMobile.antdMobileStrings.xl
import typings.antdMobile.antdMobileStrings.xs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object whiteSpacePropsTypeMod {
  
  @js.native
  trait WhiteSpacePropsType extends StObject {
    
    var size: js.UndefOr[xs | sm | md | lg | xl] = js.native
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
