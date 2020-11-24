package typings.antDesignReactNative.anon

import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@ant-design/react-native.@ant-design/react-native/lib/card/style.CardStyle, 'footerContent' | 'footerExtra' | 'footerWrap'> */
@js.native
trait PickCardStylefooterConten extends js.Object {
  
  var footerContent: TextStyle = js.native
  
  var footerExtra: TextStyle = js.native
  
  var footerWrap: ViewStyle = js.native
}
object PickCardStylefooterConten {
  
  @scala.inline
  def apply(footerContent: TextStyle, footerExtra: TextStyle, footerWrap: ViewStyle): PickCardStylefooterConten = {
    val __obj = js.Dynamic.literal(footerContent = footerContent.asInstanceOf[js.Any], footerExtra = footerExtra.asInstanceOf[js.Any], footerWrap = footerWrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickCardStylefooterConten]
  }
  
  @scala.inline
  implicit class PickCardStylefooterContenOps[Self <: PickCardStylefooterConten] (val x: Self) extends AnyVal {
    
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
    def setFooterContent(value: TextStyle): Self = this.set("footerContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterExtra(value: TextStyle): Self = this.set("footerExtra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterWrap(value: ViewStyle): Self = this.set("footerWrap", value.asInstanceOf[js.Any])
  }
}
