package typings.antDesignReactNative.anon

import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@ant-design/react-native.@ant-design/react-native/lib/card/style.CardStyle, 'footerContent' | 'footerExtra' | 'footerWrap'> */
trait PickCardStylefooterConten extends js.Object {
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
}

