package typings.antd.spaceItemMod

import typings.antd.antdStrings.horizontal
import typings.antd.antdStrings.marginLeft
import typings.antd.antdStrings.marginRight
import typings.antd.antdStrings.vertical
import typings.antd.configProviderSizeContextMod.SizeType
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemProps extends js.Object {
  
  var children: ReactNode = js.native
  
  var className: String = js.native
  
  var direction: js.UndefOr[horizontal | vertical] = js.native
  
  var index: Double = js.native
  
  var marginDirection: marginLeft | marginRight = js.native
  
  var size: js.UndefOr[SizeType | Double] = js.native
  
  var split: js.UndefOr[String | ReactNode] = js.native
}
object ItemProps {
  
  @scala.inline
  def apply(className: String, index: Double, marginDirection: marginLeft | marginRight): ItemProps = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], marginDirection = marginDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemProps]
  }
  
  @scala.inline
  implicit class ItemPropsOps[Self <: ItemProps] (val x: Self) extends AnyVal {
    
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginDirection(value: marginLeft | marginRight): Self = this.set("marginDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setDirection(value: horizontal | vertical): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setSize(value: SizeType | Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setSplit(value: String | ReactNode): Self = this.set("split", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSplit: Self = this.set("split", js.undefined)
  }
}
