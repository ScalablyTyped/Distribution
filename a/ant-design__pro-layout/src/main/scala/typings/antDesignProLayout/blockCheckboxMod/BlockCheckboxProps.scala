package typings.antDesignProLayout.blockCheckboxMod

import typings.antDesignProLayout.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlockCheckboxProps extends js.Object {
  
  var configType: String = js.native
  
  var list: js.UndefOr[js.Array[Key]] = js.native
  
  def onChange(key: String): Unit = js.native
  
  var prefixCls: String = js.native
  
  var value: String = js.native
}
object BlockCheckboxProps {
  
  @scala.inline
  def apply(configType: String, onChange: String => Unit, prefixCls: String, value: String): BlockCheckboxProps = {
    val __obj = js.Dynamic.literal(configType = configType.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), prefixCls = prefixCls.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockCheckboxProps]
  }
  
  @scala.inline
  implicit class BlockCheckboxPropsOps[Self <: BlockCheckboxProps] (val x: Self) extends AnyVal {
    
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
    def setConfigType(value: String): Self = this.set("configType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnChange(value: String => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListVarargs(value: Key*): Self = this.set("list", js.Array(value :_*))
    
    @scala.inline
    def setList(value: js.Array[Key]): Self = this.set("list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteList: Self = this.set("list", js.undefined)
  }
}
