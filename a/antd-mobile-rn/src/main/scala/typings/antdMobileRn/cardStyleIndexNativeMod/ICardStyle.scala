package typings.antdMobileRn.cardStyleIndexNativeMod

import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
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
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], card = card.asInstanceOf[js.Any], footerContent = footerContent.asInstanceOf[js.Any], footerExtra = footerExtra.asInstanceOf[js.Any], footerWrap = footerWrap.asInstanceOf[js.Any], full = full.asInstanceOf[js.Any], headerContent = headerContent.asInstanceOf[js.Any], headerExtra = headerExtra.asInstanceOf[js.Any], headerImage = headerImage.asInstanceOf[js.Any], headerTitle = headerTitle.asInstanceOf[js.Any], headerWrap = headerWrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICardStyle]
  }
}

