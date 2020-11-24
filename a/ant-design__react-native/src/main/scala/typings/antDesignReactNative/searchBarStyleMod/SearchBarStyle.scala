package typings.antDesignReactNative.searchBarStyleMod

import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchBarStyle extends js.Object {
  
  var cancelText: TextStyle = js.native
  
  var cancelTextContainer: ViewStyle = js.native
  
  var input: TextStyle = js.native
  
  var inputWrapper: ViewStyle = js.native
  
  var search: TextStyle = js.native
  
  var wrapper: ViewStyle = js.native
}
object SearchBarStyle {
  
  @scala.inline
  def apply(
    cancelText: TextStyle,
    cancelTextContainer: ViewStyle,
    input: TextStyle,
    inputWrapper: ViewStyle,
    search: TextStyle,
    wrapper: ViewStyle
  ): SearchBarStyle = {
    val __obj = js.Dynamic.literal(cancelText = cancelText.asInstanceOf[js.Any], cancelTextContainer = cancelTextContainer.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], inputWrapper = inputWrapper.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchBarStyle]
  }
  
  @scala.inline
  implicit class SearchBarStyleOps[Self <: SearchBarStyle] (val x: Self) extends AnyVal {
    
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
    def setCancelText(value: TextStyle): Self = this.set("cancelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelTextContainer(value: ViewStyle): Self = this.set("cancelTextContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInput(value: TextStyle): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputWrapper(value: ViewStyle): Self = this.set("inputWrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearch(value: TextStyle): Self = this.set("search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapper(value: ViewStyle): Self = this.set("wrapper", value.asInstanceOf[js.Any])
  }
}
