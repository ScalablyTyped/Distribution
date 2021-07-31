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
    
    @scala.inline
    def apply(): CardFooterPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardFooterPropsType]
    }
    
    @scala.inline
    implicit class CardFooterPropsTypeMutableBuilder[Self <: CardFooterPropsType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: ReactNode): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setExtra(value: ReactNode): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
    }
  }
  
  trait CardHeaderPropsType extends StObject {
    
    var extra: js.UndefOr[ReactNode] = js.undefined
    
    /** need url of img, if this is string. */
    var thumb: js.UndefOr[ReactNode] = js.undefined
    
    var title: js.UndefOr[ReactNode] = js.undefined
  }
  object CardHeaderPropsType {
    
    @scala.inline
    def apply(): CardHeaderPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardHeaderPropsType]
    }
    
    @scala.inline
    implicit class CardHeaderPropsTypeMutableBuilder[Self <: CardHeaderPropsType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtra(value: ReactNode): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      @scala.inline
      def setThumb(value: ReactNode): Self = StObject.set(x, "thumb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbUndefined: Self = StObject.set(x, "thumb", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait CardPropsType extends StObject {
    
    var full: js.UndefOr[Boolean] = js.undefined
  }
  object CardPropsType {
    
    @scala.inline
    def apply(): CardPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardPropsType]
    }
    
    @scala.inline
    implicit class CardPropsTypeMutableBuilder[Self <: CardPropsType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFull(value: Boolean): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullUndefined: Self = StObject.set(x, "full", js.undefined)
    }
  }
}
