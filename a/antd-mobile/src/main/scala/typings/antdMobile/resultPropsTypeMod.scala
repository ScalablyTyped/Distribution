package typings.antdMobile

import typings.antdMobile.antdMobileStrings.ghost
import typings.antdMobile.antdMobileStrings.primary
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resultPropsTypeMod {
  
  @js.native
  trait ResultPropsType extends StObject {
    
    var buttonText: js.UndefOr[String] = js.native
    
    var buttonType: js.UndefOr[primary | ghost] = js.native
    
    var img: js.UndefOr[ReactNode] = js.native
    
    var imgUrl: js.UndefOr[String] = js.native
    
    var message: js.UndefOr[ReactNode] = js.native
    
    var onButtonClick: js.UndefOr[js.Function0[Unit]] = js.native
    
    var title: js.UndefOr[ReactNode] = js.native
  }
  object ResultPropsType {
    
    @scala.inline
    def apply(): ResultPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResultPropsType]
    }
    
    @scala.inline
    implicit class ResultPropsTypeMutableBuilder[Self <: ResultPropsType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setButtonText(value: String): Self = StObject.set(x, "buttonText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonTextUndefined: Self = StObject.set(x, "buttonText", js.undefined)
      
      @scala.inline
      def setButtonType(value: primary | ghost): Self = StObject.set(x, "buttonType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonTypeUndefined: Self = StObject.set(x, "buttonType", js.undefined)
      
      @scala.inline
      def setImg(value: ReactNode): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImgUndefined: Self = StObject.set(x, "img", js.undefined)
      
      @scala.inline
      def setImgUrl(value: String): Self = StObject.set(x, "imgUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImgUrlUndefined: Self = StObject.set(x, "imgUrl", js.undefined)
      
      @scala.inline
      def setMessage(value: ReactNode): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setOnButtonClick(value: () => Unit): Self = StObject.set(x, "onButtonClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnButtonClickUndefined: Self = StObject.set(x, "onButtonClick", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
