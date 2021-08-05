package typings.antdMobile

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardPropsTypeMod {
  
  trait CardFooterPropsType extends StObject {
    
    var content: js.UndefOr[ReactNode] = js.undefined
    
    var extra: js.UndefOr[ReactNode] = js.undefined
  }
  object CardFooterPropsType {
    
    inline def apply(): CardFooterPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardFooterPropsType]
    }
    
    extension [Self <: CardFooterPropsType](x: Self) {
      
      inline def setContent(value: ReactNode): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setExtra(value: ReactNode): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
    }
  }
  
  trait CardHeaderPropsType extends StObject {
    
    var extra: js.UndefOr[ReactNode] = js.undefined
    
    /** need url of img, if this is string. */
    var thumb: js.UndefOr[ReactNode] = js.undefined
    
    var title: js.UndefOr[ReactNode] = js.undefined
  }
  object CardHeaderPropsType {
    
    inline def apply(): CardHeaderPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardHeaderPropsType]
    }
    
    extension [Self <: CardHeaderPropsType](x: Self) {
      
      inline def setExtra(value: ReactNode): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      inline def setThumb(value: ReactNode): Self = StObject.set(x, "thumb", value.asInstanceOf[js.Any])
      
      inline def setThumbUndefined: Self = StObject.set(x, "thumb", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait CardPropsType extends StObject {
    
    var full: js.UndefOr[Boolean] = js.undefined
  }
  object CardPropsType {
    
    inline def apply(): CardPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardPropsType]
    }
    
    extension [Self <: CardPropsType](x: Self) {
      
      inline def setFull(value: Boolean): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
      
      inline def setFullUndefined: Self = StObject.set(x, "full", js.undefined)
    }
  }
}
