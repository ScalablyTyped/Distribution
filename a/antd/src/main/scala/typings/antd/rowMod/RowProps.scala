package typings.antd.rowMod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RowProps extends js.Object {
  
  var bordered: js.UndefOr[Boolean] = js.native
  
  var colon: Boolean = js.native
  
  var index: Double = js.native
  
  var prefixCls: String = js.native
  
  var row: js.Array[ReactElement] = js.native
  
  var vertical: Boolean = js.native
}
object RowProps {
  
  @scala.inline
  def apply(colon: Boolean, index: Double, prefixCls: String, row: js.Array[ReactElement], vertical: Boolean): RowProps = {
    val __obj = js.Dynamic.literal(colon = colon.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowProps]
  }
  
  @scala.inline
  implicit class RowPropsOps[Self <: RowProps] (val x: Self) extends AnyVal {
    
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
    def setColon(value: Boolean): Self = this.set("colon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowVarargs(value: ReactElement*): Self = this.set("row", js.Array(value :_*))
    
    @scala.inline
    def setRow(value: js.Array[ReactElement]): Self = this.set("row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertical(value: Boolean): Self = this.set("vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBordered(value: Boolean): Self = this.set("bordered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBordered: Self = this.set("bordered", js.undefined)
  }
}
