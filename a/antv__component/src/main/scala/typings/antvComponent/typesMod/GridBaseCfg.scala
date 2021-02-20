package typings.antvComponent.typesMod

import typings.antvGBase.interfacesMod.IGroup
import org.scalablytyped.runtime.StObject
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
  implicit class GridBaseCfgMutableBuilder[Self <: GridBaseCfg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlternateColor(value: String | js.Array[String]): Self = StObject.set(x, "alternateColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternateColorUndefined: Self = StObject.set(x, "alternateColor", js.undefined)
    
    @scala.inline
    def setAlternateColorVarargs(value: String*): Self = StObject.set(x, "alternateColor", js.Array(value :_*))
    
    @scala.inline
    def setClosed(value: Boolean): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClosedUndefined: Self = StObject.set(x, "closed", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[GridItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: GridItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setLine(value: GridLineCfg): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
  }
}
