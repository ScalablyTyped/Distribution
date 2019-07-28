package typings.antdDashMobileDashRn.libCardStyleIndexDotNativeMod

import typings.reactDashNative.reactDashNativeMod.ImageStyle
import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICardStyle extends js.Object {
  var body: ViewStyle
  var card: ViewStyle
  var footerContent: TextStyle
  var footerExtra: TextStyle
  var footerWrap: ViewStyle
  var full: ViewStyle
  var headerContent: TextStyle
  var headerExtra: TextStyle
  var headerImage: ImageStyle
  var headerTitle: ViewStyle
  var headerWrap: ViewStyle
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
    val __obj = js.Dynamic.literal(body = body, card = card, footerContent = footerContent, footerExtra = footerExtra, footerWrap = footerWrap, full = full, headerContent = headerContent, headerExtra = headerExtra, headerImage = headerImage, headerTitle = headerTitle, headerWrap = headerWrap)
  
    __obj.asInstanceOf[ICardStyle]
  }
}

