package typings.antdMobileRn.searchBarIndexNativeMod

import typings.antdMobileRn.anon.NativeEvent
import typings.antdMobileRn.searchBarPropsTypeMod.SearchBarPropsType
import typings.antdMobileRn.searchBarStyleIndexNativeMod.ISearchBarStyle
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchBarNativeProps extends SearchBarPropsType {
  
  var onChangeText: js.UndefOr[js.Function1[/* text */ String, Unit]] = js.native
  
  var onSubmitEditing: js.UndefOr[js.Function1[/* event */ NativeEvent, Unit]] = js.native
  
  var style: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  @JSName("styles")
  var styles_SearchBarNativeProps: ISearchBarStyle = js.native
}
object SearchBarNativeProps {
  
  @scala.inline
  def apply(styles: ISearchBarStyle): SearchBarNativeProps = {
    val __obj = js.Dynamic.literal(styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchBarNativeProps]
  }
  
  @scala.inline
  implicit class SearchBarNativePropsOps[Self <: SearchBarNativeProps] (val x: Self) extends AnyVal {
    
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
    def setStyles(value: ISearchBarStyle): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnChangeText(value: /* text */ String => Unit): Self = this.set("onChangeText", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChangeText: Self = this.set("onChangeText", js.undefined)
    
    @scala.inline
    def setOnSubmitEditing(value: /* event */ NativeEvent => Unit): Self = this.set("onSubmitEditing", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSubmitEditing: Self = this.set("onSubmitEditing", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[TextStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
  }
}
