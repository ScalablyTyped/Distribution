package typings.antdMobileRn.cardStyleIndexNativeMod

import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICardStyle extends js.Object {
  
  var body: ViewStyle = js.native
  
  var card: ViewStyle = js.native
  
  var footerContent: TextStyle = js.native
  
  var footerExtra: TextStyle = js.native
  
  var footerWrap: ViewStyle = js.native
  
  var full: ViewStyle = js.native
  
  var headerContent: TextStyle = js.native
  
  var headerExtra: TextStyle = js.native
  
  var headerImage: ImageStyle = js.native
  
  var headerTitle: ViewStyle = js.native
  
  var headerWrap: ViewStyle = js.native
}
object ICardStyle {
  
  @scala.inline
  def apply(
    body: ViewStyle,
    card: ViewStyle,
    footerContent: TextStyle,
    footerExtra: TextStyle,
    footerWrap: ViewStyle,
    full: ViewStyle,
    headerContent: TextStyle,
    headerExtra: TextStyle,
    headerImage: ImageStyle,
    headerTitle: ViewStyle,
    headerWrap: ViewStyle
  ): ICardStyle = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], card = card.asInstanceOf[js.Any], footerContent = footerContent.asInstanceOf[js.Any], footerExtra = footerExtra.asInstanceOf[js.Any], footerWrap = footerWrap.asInstanceOf[js.Any], full = full.asInstanceOf[js.Any], headerContent = headerContent.asInstanceOf[js.Any], headerExtra = headerExtra.asInstanceOf[js.Any], headerImage = headerImage.asInstanceOf[js.Any], headerTitle = headerTitle.asInstanceOf[js.Any], headerWrap = headerWrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICardStyle]
  }
  
  @scala.inline
  implicit class ICardStyleOps[Self <: ICardStyle] (val x: Self) extends AnyVal {
    
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
    def setBody(value: ViewStyle): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCard(value: ViewStyle): Self = this.set("card", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterContent(value: TextStyle): Self = this.set("footerContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterExtra(value: TextStyle): Self = this.set("footerExtra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterWrap(value: ViewStyle): Self = this.set("footerWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFull(value: ViewStyle): Self = this.set("full", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderContent(value: TextStyle): Self = this.set("headerContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderExtra(value: TextStyle): Self = this.set("headerExtra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderImage(value: ImageStyle): Self = this.set("headerImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderTitle(value: ViewStyle): Self = this.set("headerTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderWrap(value: ViewStyle): Self = this.set("headerWrap", value.asInstanceOf[js.Any])
  }
}
