package typings.antd.formListMod

import typings.antd.anon.Errors
import typings.rcFieldForm.interfaceMod.ValidatorRule
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormListProps extends js.Object {
  
  def children(fields: js.Array[FormListFieldData], operation: FormListOperation, meta: Errors): ReactNode = js.native
  
  var name: String | Double | (js.Array[String | Double]) = js.native
  
  var prefixCls: js.UndefOr[String] = js.native
  
  var rules: js.UndefOr[js.Array[ValidatorRule]] = js.native
}
object FormListProps {
  
  @scala.inline
  def apply(
    children: (js.Array[FormListFieldData], FormListOperation, Errors) => ReactNode,
    name: String | Double | (js.Array[String | Double])
  ): FormListProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction3(children), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormListProps]
  }
  
  @scala.inline
  implicit class FormListPropsOps[Self <: FormListProps] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: (js.Array[FormListFieldData], FormListOperation, Errors) => ReactNode): Self = this.set("children", js.Any.fromFunction3(value))
    
    @scala.inline
    def setNameVarargs(value: (String | Double)*): Self = this.set("name", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String | Double | (js.Array[String | Double])): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    
    @scala.inline
    def setRulesVarargs(value: ValidatorRule*): Self = this.set("rules", js.Array(value :_*))
    
    @scala.inline
    def setRules(value: js.Array[ValidatorRule]): Self = this.set("rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRules: Self = this.set("rules", js.undefined)
  }
}
