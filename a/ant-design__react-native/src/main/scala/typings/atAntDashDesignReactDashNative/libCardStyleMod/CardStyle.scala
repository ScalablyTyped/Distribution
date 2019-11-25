package typings.atAntDashDesignReactDashNative.libCardStyleMod

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
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], card = card.asInstanceOf[js.Any], footerContent = footerContent.asInstanceOf[js.Any], footerExtra = footerExtra.asInstanceOf[js.Any], footerWrap = footerWrap.asInstanceOf[js.Any], full = full.asInstanceOf[js.Any], headerContent = headerContent.asInstanceOf[js.Any], headerContentWrap = headerContentWrap.asInstanceOf[js.Any], headerExtra = headerExtra.asInstanceOf[js.Any], headerExtraWrap = headerExtraWrap.asInstanceOf[js.Any], headerImage = headerImage.asInstanceOf[js.Any], headerTitle = headerTitle.asInstanceOf[js.Any], headerWrap = headerWrap.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CardStyle]
  }
}

