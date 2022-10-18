package typings.antdMobileRn

import typings.antdMobileRn.antdMobileRnStrings.ghost
import typings.antdMobileRn.antdMobileRnStrings.primary
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libResultPropsTypeMod {
  
  trait ResultPropsType extends StObject {
    
    var buttonText: js.UndefOr[String] = js.undefined
    
    var buttonType: js.UndefOr[primary | ghost] = js.undefined
    
    var img: js.UndefOr[ReactNode] = js.undefined
    
    var imgUrl: js.UndefOr[String] = js.undefined
    
    var message: js.UndefOr[ReactNode] = js.undefined
    
    var onButtonClick: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var title: js.UndefOr[ReactNode] = js.undefined
  }
  object ResultPropsType {
    
    inline def apply(): ResultPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResultPropsType]
    }
    
    extension [Self <: ResultPropsType](x: Self) {
      
      inline def setButtonText(value: String): Self = StObject.set(x, "buttonText", value.asInstanceOf[js.Any])
      
      inline def setButtonTextUndefined: Self = StObject.set(x, "buttonText", js.undefined)
      
      inline def setButtonType(value: primary | ghost): Self = StObject.set(x, "buttonType", value.asInstanceOf[js.Any])
      
      inline def setButtonTypeUndefined: Self = StObject.set(x, "buttonType", js.undefined)
      
      inline def setImg(value: ReactNode): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
      
      inline def setImgUndefined: Self = StObject.set(x, "img", js.undefined)
      
      inline def setImgUrl(value: String): Self = StObject.set(x, "imgUrl", value.asInstanceOf[js.Any])
      
      inline def setImgUrlUndefined: Self = StObject.set(x, "imgUrl", js.undefined)
      
      inline def setMessage(value: ReactNode): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setOnButtonClick(value: () => Unit): Self = StObject.set(x, "onButtonClick", js.Any.fromFunction0(value))
      
      inline def setOnButtonClickUndefined: Self = StObject.set(x, "onButtonClick", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
