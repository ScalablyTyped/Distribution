package typings.antdMobile

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object slidesMod {
  
  @JSImport("antd-mobile/es/components/image-viewer/slides", "Slides")
  @js.native
  val Slides: ForwardRefExoticComponent[SlidesType & RefAttributes[SlidesRef]] = js.native
  
  @js.native
  trait SlidesRef extends StObject {
    
    def swipeTo(index: Double): Unit = js.native
    def swipeTo(index: Double, immediate: Boolean): Unit = js.native
  }
  
  trait SlidesType extends StObject {
    
    var defaultIndex: Double
    
    var images: js.Array[String]
    
    var maxZoom: Double
    
    var onIndexChange: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.undefined
    
    def onTap(): Unit
  }
  object SlidesType {
    
    inline def apply(defaultIndex: Double, images: js.Array[String], maxZoom: Double, onTap: () => Unit): SlidesType = {
      val __obj = js.Dynamic.literal(defaultIndex = defaultIndex.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], maxZoom = maxZoom.asInstanceOf[js.Any], onTap = js.Any.fromFunction0(onTap))
      __obj.asInstanceOf[SlidesType]
    }
    
    extension [Self <: SlidesType](x: Self) {
      
      inline def setDefaultIndex(value: Double): Self = StObject.set(x, "defaultIndex", value.asInstanceOf[js.Any])
      
      inline def setImages(value: js.Array[String]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      inline def setImagesVarargs(value: String*): Self = StObject.set(x, "images", js.Array(value*))
      
      inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
      
      inline def setOnIndexChange(value: /* index */ Double => Unit): Self = StObject.set(x, "onIndexChange", js.Any.fromFunction1(value))
      
      inline def setOnIndexChangeUndefined: Self = StObject.set(x, "onIndexChange", js.undefined)
      
      inline def setOnTap(value: () => Unit): Self = StObject.set(x, "onTap", js.Any.fromFunction0(value))
    }
  }
}
