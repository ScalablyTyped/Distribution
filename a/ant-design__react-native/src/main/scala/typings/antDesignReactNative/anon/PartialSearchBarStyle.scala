package typings.antDesignReactNative.anon

import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@ant-design/react-native.@ant-design/react-native/lib/search-bar/style.SearchBarStyle> */
@js.native
trait PartialSearchBarStyle extends js.Object {
  
  var cancelText: js.UndefOr[TextStyle] = js.native
  
  var cancelTextContainer: js.UndefOr[ViewStyle] = js.native
  
  var input: js.UndefOr[TextStyle] = js.native
  
  var inputWrapper: js.UndefOr[ViewStyle] = js.native
  
  var search: js.UndefOr[TextStyle] = js.native
  
  var wrapper: js.UndefOr[ViewStyle] = js.native
}
object PartialSearchBarStyle {
  
  @scala.inline
  def apply(): PartialSearchBarStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSearchBarStyle]
  }
  
  @scala.inline
  implicit class PartialSearchBarStyleOps[Self <: PartialSearchBarStyle] (val x: Self) extends AnyVal {
    
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
    def deleteCancelText: Self = this.set("cancelText", js.undefined)
    
    @scala.inline
    def setCancelTextContainer(value: ViewStyle): Self = this.set("cancelTextContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelTextContainer: Self = this.set("cancelTextContainer", js.undefined)
    
    @scala.inline
    def setInput(value: TextStyle): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    
    @scala.inline
    def setInputWrapper(value: ViewStyle): Self = this.set("inputWrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputWrapper: Self = this.set("inputWrapper", js.undefined)
    
    @scala.inline
    def setSearch(value: TextStyle): Self = this.set("search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearch: Self = this.set("search", js.undefined)
    
    @scala.inline
    def setWrapper(value: ViewStyle): Self = this.set("wrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapper: Self = this.set("wrapper", js.undefined)
  }
}
