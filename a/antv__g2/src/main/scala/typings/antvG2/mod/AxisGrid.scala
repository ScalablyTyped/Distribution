package typings.antvG2.mod

import typings.antvG2.antvG2Strings.center
import typings.antvG2.antvG2Strings.polygon
import typings.antvG2.mod.Styles.line
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AxisGrid extends js.Object {
  
  /**
    * 声明网格顶点从两个刻度中间开始，默认从刻度点开始
    */
  var align: js.UndefOr[center] = js.native
  
  /**
    * 当网格类型 type 为 polygon 时，使用 alternateColor 为网格设置交替的颜色。
    * 指定一个值则先渲染奇数层，两个值则交替渲染
    */
  var alternateColor: js.UndefOr[String | (js.Tuple2[String, String])] = js.native
  
  /**
    * 是否隐藏第一条网格线，默认为 false
    */
  var hideFirstLine: js.UndefOr[Boolean] = js.native
  
  /**
    * 是否隐藏最后一条网格线，默认为 false
    */
  var hideLastLine: js.UndefOr[Boolean] = js.native
  
  /**
    * 当网格类型 type 为 line 时，使用 lineStyle 设置样式
    */
  var lineStyle: js.UndefOr[line] = js.native
  
  /**
    * 声明网格的类型，line 表示线，polygon 表示矩形框
    */
  var `type`: js.UndefOr[typings.antvG2.antvG2Strings.line | polygon] = js.native
}
object AxisGrid {
  
  @scala.inline
  def apply(): AxisGrid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxisGrid]
  }
  
  @scala.inline
  implicit class AxisGridOps[Self <: AxisGrid] (val x: Self) extends AnyVal {
    
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
    def setAlign(value: center): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    
    @scala.inline
    def setAlternateColor(value: String | (js.Tuple2[String, String])): Self = this.set("alternateColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlternateColor: Self = this.set("alternateColor", js.undefined)
    
    @scala.inline
    def setHideFirstLine(value: Boolean): Self = this.set("hideFirstLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideFirstLine: Self = this.set("hideFirstLine", js.undefined)
    
    @scala.inline
    def setHideLastLine(value: Boolean): Self = this.set("hideLastLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideLastLine: Self = this.set("hideLastLine", js.undefined)
    
    @scala.inline
    def setLineStyle(value: line): Self = this.set("lineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineStyle: Self = this.set("lineStyle", js.undefined)
    
    @scala.inline
    def setType(value: typings.antvG2.antvG2Strings.line | polygon): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
