package typings.antDesignReactNative.progressMod

import typings.antDesignReactNative.antDesignReactNativeStrings.fixed
import typings.antDesignReactNative.antDesignReactNativeStrings.normal
import typings.antDesignReactNative.libStyleMod.WithThemeStyles
import typings.antDesignReactNative.progressStyleMod.ProgressStyle
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProgressProps extends WithThemeStyles[ProgressStyle] {
  
  var appearTransition: js.UndefOr[Boolean] = js.native
  
  var barStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var percent: js.UndefOr[Double] = js.native
  
  var position: js.UndefOr[fixed | normal] = js.native
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var unfilled: js.UndefOr[Boolean] = js.native
  
  var wrapWidth: js.UndefOr[Double] = js.native
}
object ProgressProps {
  
  @scala.inline
  def apply(): ProgressProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressProps]
  }
  
  @scala.inline
  implicit class ProgressPropsOps[Self <: ProgressProps] (val x: Self) extends AnyVal {
    
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
    def setAppearTransition(value: Boolean): Self = this.set("appearTransition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppearTransition: Self = this.set("appearTransition", js.undefined)
    
    @scala.inline
    def setBarStyle(value: StyleProp[ViewStyle]): Self = this.set("barStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBarStyle: Self = this.set("barStyle", js.undefined)
    
    @scala.inline
    def setBarStyleNull: Self = this.set("barStyle", null)
    
    @scala.inline
    def setPercent(value: Double): Self = this.set("percent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePercent: Self = this.set("percent", js.undefined)
    
    @scala.inline
    def setPosition(value: fixed | normal): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
    
    @scala.inline
    def setUnfilled(value: Boolean): Self = this.set("unfilled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnfilled: Self = this.set("unfilled", js.undefined)
    
    @scala.inline
    def setWrapWidth(value: Double): Self = this.set("wrapWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapWidth: Self = this.set("wrapWidth", js.undefined)
  }
}
