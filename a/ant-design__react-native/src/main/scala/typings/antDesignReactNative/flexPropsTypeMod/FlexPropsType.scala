package typings.antDesignReactNative.flexPropsTypeMod

import typings.antDesignReactNative.antDesignReactNativeStrings.`column-reverse`
import typings.antDesignReactNative.antDesignReactNativeStrings.`row-reverse`
import typings.antDesignReactNative.antDesignReactNativeStrings.`wrap-reverse`
import typings.antDesignReactNative.antDesignReactNativeStrings.around
import typings.antDesignReactNative.antDesignReactNativeStrings.baseline
import typings.antDesignReactNative.antDesignReactNativeStrings.between
import typings.antDesignReactNative.antDesignReactNativeStrings.center
import typings.antDesignReactNative.antDesignReactNativeStrings.column
import typings.antDesignReactNative.antDesignReactNativeStrings.end
import typings.antDesignReactNative.antDesignReactNativeStrings.nowrap
import typings.antDesignReactNative.antDesignReactNativeStrings.row
import typings.antDesignReactNative.antDesignReactNativeStrings.start
import typings.antDesignReactNative.antDesignReactNativeStrings.stretch
import typings.antDesignReactNative.antDesignReactNativeStrings.wrap
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlexPropsType extends js.Object {
  
  var align: js.UndefOr[start | center | end | baseline | stretch] = js.native
  
  var children: js.UndefOr[ReactNode] = js.native
  
  var direction: js.UndefOr[row | `row-reverse` | column | `column-reverse`] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var justify: js.UndefOr[start | end | center | between | around] = js.native
  
  var wrap: js.UndefOr[
    nowrap | typings.antDesignReactNative.antDesignReactNativeStrings.wrap | `wrap-reverse`
  ] = js.native
}
object FlexPropsType {
  
  @scala.inline
  def apply(): FlexPropsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexPropsType]
  }
  
  @scala.inline
  implicit class FlexPropsTypeOps[Self <: FlexPropsType] (val x: Self) extends AnyVal {
    
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
    def setAlign(value: start | center | end | baseline | stretch): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setDirection(value: row | `row-reverse` | column | `column-reverse`): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setJustify(value: start | end | center | between | around): Self = this.set("justify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJustify: Self = this.set("justify", js.undefined)
    
    @scala.inline
    def setWrap(value: nowrap | wrap | `wrap-reverse`): Self = this.set("wrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrap: Self = this.set("wrap", js.undefined)
  }
}
