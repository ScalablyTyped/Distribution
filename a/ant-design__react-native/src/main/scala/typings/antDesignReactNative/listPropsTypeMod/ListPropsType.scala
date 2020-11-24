package typings.antDesignReactNative.listPropsTypeMod

import typings.antDesignReactNative.antDesignReactNativeBooleans.`false`
import typings.react.mod.ReactType
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPropsType extends js.Object {
  
  var children: js.UndefOr[`false` | Element | js.Array[Element]] = js.native
  
  var renderFooter: js.UndefOr[js.Function0[ReactType[_]] | String | Element] = js.native
  
  var renderHeader: js.UndefOr[js.Function0[ReactType[_]] | String | Element] = js.native
}
object ListPropsType {
  
  @scala.inline
  def apply(): ListPropsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPropsType]
  }
  
  @scala.inline
  implicit class ListPropsTypeOps[Self <: ListPropsType] (val x: Self) extends AnyVal {
    
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
    def setChildrenVarargs(value: Element*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: `false` | Element | js.Array[Element]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setRenderFooterFunction0(value: () => ReactType[_]): Self = this.set("renderFooter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRenderFooter(value: js.Function0[ReactType[_]] | String | Element): Self = this.set("renderFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderFooter: Self = this.set("renderFooter", js.undefined)
    
    @scala.inline
    def setRenderHeaderFunction0(value: () => ReactType[_]): Self = this.set("renderHeader", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRenderHeader(value: js.Function0[ReactType[_]] | String | Element): Self = this.set("renderHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderHeader: Self = this.set("renderHeader", js.undefined)
  }
}
