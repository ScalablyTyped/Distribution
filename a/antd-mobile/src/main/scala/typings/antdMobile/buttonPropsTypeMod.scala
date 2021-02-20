package typings.antdMobile

import typings.antdMobile.antdMobileStrings.ghost
import typings.antdMobile.antdMobileStrings.large
import typings.antdMobile.antdMobileStrings.primary
import typings.antdMobile.antdMobileStrings.small
import typings.antdMobile.antdMobileStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonPropsTypeMod {
  
  @js.native
  trait ButtonPropsType extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var loading: js.UndefOr[Boolean] = js.native
    
    var size: js.UndefOr[large | small] = js.native
    
    var `type`: js.UndefOr[primary | warning | ghost] = js.native
  }
  object ButtonPropsType {
    
    @scala.inline
    def apply(): ButtonPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonPropsType]
    }
    
    @scala.inline
    implicit class ButtonPropsTypeMutableBuilder[Self <: ButtonPropsType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      @scala.inline
      def setSize(value: large | small): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setType(value: primary | warning | ghost): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
