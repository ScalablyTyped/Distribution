package typings.antDesignReactNative

import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@ant-design/react-native.@ant-design/react-native/lib/card/style.CardStyle, 'headerContentWrap' | 'headerContent' | 'headerExtraWrap' | 'headerExtra' | 'headerImage' | 'headerTitle' | 'headerWrap'> */
trait PickCardStyleheaderConten extends js.Object {
  var headerContent: TextStyle
  var headerContentWrap: ViewStyle
  var headerExtra: TextStyle
  var headerExtraWrap: ViewStyle
  var headerImage: ImageStyle
  var headerTitle: ViewStyle
  var headerWrap: ViewStyle
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
}

