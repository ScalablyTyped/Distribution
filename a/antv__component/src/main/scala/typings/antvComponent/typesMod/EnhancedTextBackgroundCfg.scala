package typings.antvComponent.typesMod

import typings.antvGBase.typesMod.ShapeAttrs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnhancedTextBackgroundCfg extends js.Object {
  
  /** 文字内边距，同 css 盒模型 */
  var padding: js.UndefOr[Double | js.Array[Double]] = js.native
  
  /** 文字包围盒样式 */
  var style: js.UndefOr[ShapeAttrs] = js.native
}
object EnhancedTextBackgroundCfg {
  
  @scala.inline
  def apply(): EnhancedTextBackgroundCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnhancedTextBackgroundCfg]
  }
  
  @scala.inline
  implicit class EnhancedTextBackgroundCfgOps[Self <: EnhancedTextBackgroundCfg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPaddingVarargs(value: Double*): Self = this.set("padding", js.Array(value :_*))
    
    @scala.inline
    def setPadding(value: Double | js.Array[Double]): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setStyle(value: ShapeAttrs): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
