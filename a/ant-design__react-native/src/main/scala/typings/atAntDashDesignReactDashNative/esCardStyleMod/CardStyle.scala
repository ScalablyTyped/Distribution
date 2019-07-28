package typings.atAntDashDesignReactDashNative.esCardStyleMod

import typings.reactDashNative.reactDashNativeMod.ImageStyle
import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardStyle extends js.Object {
  var body: ViewStyle
  var card: ViewStyle
  var footerContent: TextStyle
  var footerExtra: TextStyle
  var footerWrap: ViewStyle
  var full: ViewStyle
  var headerContent: TextStyle
  var headerContentWrap: ViewStyle
  var headerExtra: TextStyle
  var headerExtraWrap: ViewStyle
  var headerImage: ImageStyle
  var headerTitle: ViewStyle
  var headerWrap: ViewStyle
}

object CardStyle {
  @scala.inline
  def apply(
    body: ViewStyle,
    card: ViewStyle,
    footerContent: TextStyle,
    footerExtra: TextStyle,
    footerWrap: ViewStyle,
    full: ViewStyle,
    headerContent: TextStyle,
    headerContentWrap: ViewStyle,
    headerExtra: TextStyle,
    headerExtraWrap: ViewStyle,
    headerImage: ImageStyle,
    headerTitle: ViewStyle,
    headerWrap: ViewStyle
  ): CardStyle = {
    val __obj = js.Dynamic.literal(body = body, card = card, footerContent = footerContent, footerExtra = footerExtra, footerWrap = footerWrap, full = full, headerContent = headerContent, headerContentWrap = headerContentWrap, headerExtra = headerExtra, headerExtraWrap = headerExtraWrap, headerImage = headerImage, headerTitle = headerTitle, headerWrap = headerWrap)
  
    __obj.asInstanceOf[CardStyle]
  }
}

