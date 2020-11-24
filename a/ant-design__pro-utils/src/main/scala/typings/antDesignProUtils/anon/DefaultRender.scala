package typings.antDesignProUtils.anon

import typings.antDesignProUtils.typingMod.ProSchemaComponentTypes
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultRender extends js.Object {
  
  def defaultRender(
    newItem: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @ant-design/pro-utils.@ant-design/pro-utils/lib/typing.ProSchema<T, U, Extra> */ js.Object
  ): Element | Null = js.native
  
  var onChange: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.native
  
  var onSelect: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.native
  
  var `type`: ProSchemaComponentTypes = js.native
  
  var value: js.UndefOr[js.Any] = js.native
}
object DefaultRender {
  
  @scala.inline
  def apply(
    defaultRender: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @ant-design/pro-utils.@ant-design/pro-utils/lib/typing.ProSchema<T, U, Extra> */ js.Object => Element | Null
  ): DefaultRender = {
    val __obj = js.Dynamic.literal(defaultRender = js.Any.fromFunction1(defaultRender))
    __obj.asInstanceOf[DefaultRender]
  }
  
  @scala.inline
  implicit class DefaultRenderOps[Self <: DefaultRender] (val x: Self) extends AnyVal {
    
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
    def setDefaultRender(
      value: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @ant-design/pro-utils.@ant-design/pro-utils/lib/typing.ProSchema<T, U, Extra> */ js.Object => Element | Null
    ): Self = this.set("defaultRender", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnChange(value: /* value */ js.Any => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnSelect(value: /* value */ js.Any => Unit): Self = this.set("onSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    
    @scala.inline
    def setType(value: ProSchemaComponentTypes): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
