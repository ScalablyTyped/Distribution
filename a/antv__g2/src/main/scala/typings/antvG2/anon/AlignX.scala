package typings.antvG2.anon

import typings.antvG2.antvG2Strings.bottom
import typings.antvG2.antvG2Strings.left
import typings.antvG2.antvG2Strings.middle
import typings.antvG2.antvG2Strings.right
import typings.antvG2.antvG2Strings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlignX extends StObject {
  
  var alignX: js.UndefOr[left | middle | right] = js.native
  
  var alignY: js.UndefOr[top | middle | bottom] = js.native
  
  /**
    * html 代码
    */
  var html: js.UndefOr[String] = js.native
  
  var offsetX: js.UndefOr[Double] = js.native
  
  var offsetY: js.UndefOr[Double] = js.native
  
  /**
    * html的起始位置，值为原始数据值，支持 callback
    */
  var position: js.UndefOr[js.Any | js.Function | (js.Array[String | Double])] = js.native
  
  var zIndex: js.UndefOr[Double] = js.native
}
object AlignX {
  
  @scala.inline
  def apply(): AlignX = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlignX]
  }
  
  @scala.inline
  implicit class AlignXMutableBuilder[Self <: AlignX] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignX(value: left | middle | right): Self = StObject.set(x, "alignX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignXUndefined: Self = StObject.set(x, "alignX", js.undefined)
    
    @scala.inline
    def setAlignY(value: top | middle | bottom): Self = StObject.set(x, "alignY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignYUndefined: Self = StObject.set(x, "alignY", js.undefined)
    
    @scala.inline
    def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
    
    @scala.inline
    def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
    
    @scala.inline
    def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
    
    @scala.inline
    def setPosition(value: js.Any | js.Function | (js.Array[String | Double])): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setPositionVarargs(value: (String | Double)*): Self = StObject.set(x, "position", js.Array(value :_*))
    
    @scala.inline
    def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
