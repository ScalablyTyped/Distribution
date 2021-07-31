package typings.antdMobileRn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object carouselPropsTypeMod {
  
  trait CarouselPropsType extends StObject {
    
    var autoplay: js.UndefOr[Boolean] = js.undefined
    
    var autoplayInterval: js.UndefOr[Double] = js.undefined
    
    var dots: js.UndefOr[Boolean] = js.undefined
    
    var infinite: js.UndefOr[Boolean] = js.undefined
    
    var initialSlideWidth: js.UndefOr[Double] = js.undefined
    
    var selectedIndex: js.UndefOr[Double] = js.undefined
    
    var vertical: js.UndefOr[Boolean] = js.undefined
  }
  object CarouselPropsType {
    
    @scala.inline
    def apply(): CarouselPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CarouselPropsType]
    }
    
    @scala.inline
    implicit class CarouselPropsTypeMutableBuilder[Self <: CarouselPropsType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoplayInterval(value: Double): Self = StObject.set(x, "autoplayInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoplayIntervalUndefined: Self = StObject.set(x, "autoplayInterval", js.undefined)
      
      @scala.inline
      def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      @scala.inline
      def setDots(value: Boolean): Self = StObject.set(x, "dots", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotsUndefined: Self = StObject.set(x, "dots", js.undefined)
      
      @scala.inline
      def setInfinite(value: Boolean): Self = StObject.set(x, "infinite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfiniteUndefined: Self = StObject.set(x, "infinite", js.undefined)
      
      @scala.inline
      def setInitialSlideWidth(value: Double): Self = StObject.set(x, "initialSlideWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialSlideWidthUndefined: Self = StObject.set(x, "initialSlideWidth", js.undefined)
      
      @scala.inline
      def setSelectedIndex(value: Double): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedIndexUndefined: Self = StObject.set(x, "selectedIndex", js.undefined)
      
      @scala.inline
      def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
}
