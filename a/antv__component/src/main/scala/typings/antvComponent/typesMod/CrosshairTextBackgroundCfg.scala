package typings.antvComponent.typesMod

import typings.antvGBase.typesMod.ShapeAttrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CrosshairTextBackgroundCfg extends StObject {
  
  /**
    * 文本背景周围的留白
    * @type {number|number[]}
    */
  var padding: js.UndefOr[Double | js.Array[Double]] = js.native
  
  /**
    * 文本背景的样式
    * @type {ShapeAttrs}
    */
  var style: js.UndefOr[ShapeAttrs] = js.native
}
object CrosshairTextBackgroundCfg {
  
  @scala.inline
  def apply(): CrosshairTextBackgroundCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CrosshairTextBackgroundCfg]
  }
  
  @scala.inline
  implicit class CrosshairTextBackgroundCfgMutableBuilder[Self <: CrosshairTextBackgroundCfg] (val x: Self) extends AnyVal {
    
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
