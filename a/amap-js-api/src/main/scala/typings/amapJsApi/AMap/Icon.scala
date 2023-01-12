package typings.amapJsApi.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Icon
  extends StObject
     with EventEmitter {
  
  /**
    * 获取图标图片大小
    */
  def getImageSize(): Size = js.native
  
  /**
    * 设置图标图片大小
    * @param size 大小
    */
  def setImageSize(size: SizeValue): Unit = js.native
}
object Icon {
  
  trait Options extends StObject {
    
    /**
      * 图标的取图地址
      */
    var image: js.UndefOr[String] = js.undefined
    
    /**
      * 图标取图偏移量
      */
    var imageOffset: js.UndefOr[Pixel] = js.undefined
    
    /**
      * 图标所用图片大小
      */
    var imageSize: js.UndefOr[SizeValue] = js.undefined
    
    /**
      * 图标尺寸
      */
    var size: js.UndefOr[SizeValue] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageOffset(value: Pixel): Self = StObject.set(x, "imageOffset", value.asInstanceOf[js.Any])
      
      inline def setImageOffsetUndefined: Self = StObject.set(x, "imageOffset", js.undefined)
      
      inline def setImageSize(value: SizeValue): Self = StObject.set(x, "imageSize", value.asInstanceOf[js.Any])
      
      inline def setImageSizeUndefined: Self = StObject.set(x, "imageSize", js.undefined)
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setSize(value: SizeValue): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
