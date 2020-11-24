package typings.antDesignReactNative.anon

import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@ant-design/react-native.@ant-design/react-native/lib/card/style.CardStyle, 'headerContentWrap' | 'headerContent' | 'headerExtraWrap' | 'headerExtra' | 'headerImage' | 'headerTitle' | 'headerWrap'> */
@js.native
trait PickCardStyleheaderConten extends js.Object {
  
  var headerContent: TextStyle = js.native
  
  var headerContentWrap: ViewStyle = js.native
  
  var headerExtra: TextStyle = js.native
  
  var headerExtraWrap: ViewStyle = js.native
  
  var headerImage: ImageStyle = js.native
  
  var headerTitle: ViewStyle = js.native
  
  var headerWrap: ViewStyle = js.native
}
object PickCardStyleheaderConten {
  
  @scala.inline
  def apply(
    headerContent: TextStyle,
    headerContentWrap: ViewStyle,
    headerExtra: TextStyle,
    headerExtraWrap: ViewStyle,
    headerImage: ImageStyle,
    headerTitle: ViewStyle,
    headerWrap: ViewStyle
  ): PickCardStyleheaderConten = {
    val __obj = js.Dynamic.literal(headerContent = headerContent.asInstanceOf[js.Any], headerContentWrap = headerContentWrap.asInstanceOf[js.Any], headerExtra = headerExtra.asInstanceOf[js.Any], headerExtraWrap = headerExtraWrap.asInstanceOf[js.Any], headerImage = headerImage.asInstanceOf[js.Any], headerTitle = headerTitle.asInstanceOf[js.Any], headerWrap = headerWrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickCardStyleheaderConten]
  }
  
  @scala.inline
  implicit class PickCardStyleheaderContenOps[Self <: PickCardStyleheaderConten] (val x: Self) extends AnyVal {
    
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
    def setHeaderContent(value: TextStyle): Self = this.set("headerContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderContentWrap(value: ViewStyle): Self = this.set("headerContentWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderExtra(value: TextStyle): Self = this.set("headerExtra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderExtraWrap(value: ViewStyle): Self = this.set("headerExtraWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderImage(value: ImageStyle): Self = this.set("headerImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderTitle(value: ViewStyle): Self = this.set("headerTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderWrap(value: ViewStyle): Self = this.set("headerWrap", value.asInstanceOf[js.Any])
  }
}
