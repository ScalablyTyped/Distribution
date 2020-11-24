package typings.antvComponent.typesMod

import typings.antvGBase.interfacesMod.IGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridBaseCfg extends GroupComponentCfg {
  
  /**
    * 两个栅格线间的填充色，必须是一个数组
    * @type {string|string[]}
    */
  var alternateColor: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * 栅格线是否封闭
    * @type {boolean}
    */
  var closed: js.UndefOr[Boolean] = js.native
  
  /**
    * 绘制 grid 需要的点的集合
    * @type {GridItem[]}
    */
  var items: js.Array[GridItem] = js.native
  
  /**
    * 线的样式
    * @type {object}
    */
  var line: js.UndefOr[GridLineCfg] = js.native
}
object GridBaseCfg {
  
  @scala.inline
  def apply(container: IGroup, items: js.Array[GridItem]): GridBaseCfg = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridBaseCfg]
  }
  
  @scala.inline
  implicit class GridBaseCfgOps[Self <: GridBaseCfg] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: GridItem*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[GridItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternateColorVarargs(value: String*): Self = this.set("alternateColor", js.Array(value :_*))
    
    @scala.inline
    def setAlternateColor(value: String | js.Array[String]): Self = this.set("alternateColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlternateColor: Self = this.set("alternateColor", js.undefined)
    
    @scala.inline
    def setClosed(value: Boolean): Self = this.set("closed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClosed: Self = this.set("closed", js.undefined)
    
    @scala.inline
    def setLine(value: GridLineCfg): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
  }
}
