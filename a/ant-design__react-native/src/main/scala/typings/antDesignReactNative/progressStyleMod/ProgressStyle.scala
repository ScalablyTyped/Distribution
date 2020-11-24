package typings.antDesignReactNative.progressStyleMod

import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProgressStyle extends js.Object {
  
  var progressBar: ViewStyle = js.native
  
  var progressOuter: ViewStyle = js.native
}
object ProgressStyle {
  
  @scala.inline
  def apply(progressBar: ViewStyle, progressOuter: ViewStyle): ProgressStyle = {
    val __obj = js.Dynamic.literal(progressBar = progressBar.asInstanceOf[js.Any], progressOuter = progressOuter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressStyle]
  }
  
  @scala.inline
  implicit class ProgressStyleOps[Self <: ProgressStyle] (val x: Self) extends AnyVal {
    
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
    def setProgressBar(value: ViewStyle): Self = this.set("progressBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressOuter(value: ViewStyle): Self = this.set("progressOuter", value.asInstanceOf[js.Any])
  }
}
