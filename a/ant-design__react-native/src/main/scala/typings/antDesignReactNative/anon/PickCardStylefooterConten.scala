package typings.antDesignReactNative.anon

import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@ant-design/react-native.@ant-design/react-native/lib/card/style.CardStyle, 'footerContent' | 'footerExtra' | 'footerWrap'> */
trait PickCardStylefooterConten extends StObject {
  
  var footerContent: TextStyle
  
  var footerExtra: TextStyle
  
  var footerWrap: ViewStyle
}
object PickCardStylefooterConten {
  
  @scala.inline
  def apply(footerContent: TextStyle, footerExtra: TextStyle, footerWrap: ViewStyle): PickCardStylefooterConten = {
    val __obj = js.Dynamic.literal(footerContent = footerContent.asInstanceOf[js.Any], footerExtra = footerExtra.asInstanceOf[js.Any], footerWrap = footerWrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickCardStylefooterConten]
  }
  
  @scala.inline
  implicit class PickCardStylefooterContenMutableBuilder[Self <: PickCardStylefooterConten] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFooterContent(value: TextStyle): Self = StObject.set(x, "footerContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterExtra(value: TextStyle): Self = StObject.set(x, "footerExtra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterWrap(value: ViewStyle): Self = StObject.set(x, "footerWrap", value.asInstanceOf[js.Any])
  }
}
