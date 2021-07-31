package typings.antvComponent.typesMod

import typings.antvGBase.typesMod.ShapeAttrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnhancedTextBackgroundCfg extends StObject {
  
  /** 文字内边距，同 css 盒模型 */
  var padding: js.UndefOr[Double | js.Array[Double]] = js.undefined
  
  /** 文字包围盒样式 */
  var style: js.UndefOr[ShapeAttrs] = js.undefined
}
object EnhancedTextBackgroundCfg {
  
  @scala.inline
  def apply(): EnhancedTextBackgroundCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnhancedTextBackgroundCfg]
  }
  
  @scala.inline
  implicit class EnhancedTextBackgroundCfgMutableBuilder[Self <: EnhancedTextBackgroundCfg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPadding(value: Double | js.Array[Double]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setPaddingVarargs(value: Double*): Self = StObject.set(x, "padding", js.Array(value :_*))
    
    @scala.inline
    def setStyle(value: ShapeAttrs): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
