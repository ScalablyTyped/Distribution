package typings.antDesignReactNative.iconMod

import typings.antDesignReactNative.antDesignReactNativeStrings.lg
import typings.antDesignReactNative.antDesignReactNativeStrings.md
import typings.antDesignReactNative.antDesignReactNativeStrings.sm
import typings.antDesignReactNative.antDesignReactNativeStrings.xs
import typings.antDesignReactNative.antDesignReactNativeStrings.xxs
import typings.reactNative.mod.TextProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IconProps extends TextProps {
  
  var color: js.UndefOr[String] = js.native
  
  var name: IconNames = js.native
  
  var size: js.UndefOr[xxs | xs | sm | md | lg | Double] = js.native
}
object IconProps {
  
  @scala.inline
  def apply(name: IconNames): IconProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconProps]
  }
  
  @scala.inline
  implicit class IconPropsOps[Self <: IconProps] (val x: Self) extends AnyVal {
    
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
    def setName(value: IconNames): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setSize(value: xxs | xs | sm | md | lg | Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
