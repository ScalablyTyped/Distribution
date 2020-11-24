package typings.antvComponent.typesMod

import typings.antvComponent.antvComponentStrings.head
import typings.antvComponent.antvComponentStrings.middle
import typings.antvComponent.antvComponentStrings.tail
import typings.antvGBase.typesMod.ShapeAttrs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnhancedTextCfg extends js.Object {
  
  /** 超出 maxLength 是否自动省略 */
  var autoEllipsis: js.UndefOr[Boolean] = js.native
  
  /** 文字包围盒样式设置 */
  var background: js.UndefOr[EnhancedTextBackgroundCfg] = js.native
  
  /** 文本标注内容 */
  var content: String | Double = js.native
  
  /** 文本截断的位置 */
  var ellipsisPosition: js.UndefOr[head | middle | tail] = js.native
  
  /** 文本在二维坐标系的显示位置，是沿着 x 轴显示 还是沿着 y 轴显示 */
  var isVertical: js.UndefOr[Boolean] = js.native
  
  /** 文本的最大长度 */
  var maxLength: js.UndefOr[Double] = js.native
  
  /** 旋转，弧度制 */
  var rotate: js.UndefOr[Double] = js.native
  
  /** 文本标注样式 */
  var style: js.UndefOr[ShapeAttrs] = js.native
}
object EnhancedTextCfg {
  
  @scala.inline
  def apply(content: String | Double): EnhancedTextCfg = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnhancedTextCfg]
  }
  
  @scala.inline
  implicit class EnhancedTextCfgOps[Self <: EnhancedTextCfg] (val x: Self) extends AnyVal {
    
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
    def setContent(value: String | Double): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoEllipsis(value: Boolean): Self = this.set("autoEllipsis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoEllipsis: Self = this.set("autoEllipsis", js.undefined)
    
    @scala.inline
    def setBackground(value: EnhancedTextBackgroundCfg): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    
    @scala.inline
    def setEllipsisPosition(value: head | middle | tail): Self = this.set("ellipsisPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEllipsisPosition: Self = this.set("ellipsisPosition", js.undefined)
    
    @scala.inline
    def setIsVertical(value: Boolean): Self = this.set("isVertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsVertical: Self = this.set("isVertical", js.undefined)
    
    @scala.inline
    def setMaxLength(value: Double): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxLength: Self = this.set("maxLength", js.undefined)
    
    @scala.inline
    def setRotate(value: Double): Self = this.set("rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotate: Self = this.set("rotate", js.undefined)
    
    @scala.inline
    def setStyle(value: ShapeAttrs): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
