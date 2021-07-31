package typings.antDesignReactNative

import typings.antDesignReactNative.antDesignReactNativeStrings.ghost
import typings.antDesignReactNative.antDesignReactNativeStrings.primary
import typings.react.mod.ReactNode
import typings.reactNative.mod.ImagePropertiesSourceOptions
import typings.reactNative.mod.ImageURISource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resultPropsTypeMod {
  
  trait ResultPropsType extends StObject {
    
    var buttonText: js.UndefOr[String] = js.undefined
    
    var buttonType: js.UndefOr[primary | ghost] = js.undefined
    
    var img: js.UndefOr[ReactNode] = js.undefined
    
    var imgUrl: js.UndefOr[ImagePropertiesSourceOptions] = js.undefined
    
    var message: js.UndefOr[ReactNode] = js.undefined
    
    var onButtonClick: js.UndefOr[js.Function1[/* e */ js.Any, Unit]] = js.undefined
    
    var title: js.UndefOr[ReactNode] = js.undefined
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
      def setImgUrl(value: ImagePropertiesSourceOptions): Self = StObject.set(x, "imgUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImgUrlUndefined: Self = StObject.set(x, "imgUrl", js.undefined)
      
      @scala.inline
      def setImgUrlVarargs(value: ImageURISource*): Self = StObject.set(x, "imgUrl", js.Array(value :_*))
      
      @scala.inline
      def setMessage(value: ReactNode): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setOnButtonClick(value: /* e */ js.Any => Unit): Self = StObject.set(x, "onButtonClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnButtonClickUndefined: Self = StObject.set(x, "onButtonClick", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
