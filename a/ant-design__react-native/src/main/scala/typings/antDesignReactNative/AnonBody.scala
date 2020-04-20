package typings.antDesignReactNative

import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.RegisteredStyle
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBody extends js.Object {
  var body: RegisteredStyle[ViewStyle]
  var card: RegisteredStyle[ViewStyle]
  var footerContent: RegisteredStyle[TextStyle]
  var footerExtra: RegisteredStyle[TextStyle]
  var footerWrap: RegisteredStyle[ViewStyle]
  var full: RegisteredStyle[ViewStyle]
  var headerContent: RegisteredStyle[TextStyle]
  var headerContentWrap: RegisteredStyle[ViewStyle]
  var headerExtra: RegisteredStyle[TextStyle]
  var headerExtraWrap: RegisteredStyle[ViewStyle]
  var headerImage: RegisteredStyle[ImageStyle]
  var headerTitle: RegisteredStyle[ViewStyle]
  var headerWrap: RegisteredStyle[ViewStyle]
}

object AnonBody {
  @scala.inline
  def apply(
    body: RegisteredStyle[ViewStyle],
    card: RegisteredStyle[ViewStyle],
    footerContent: RegisteredStyle[TextStyle],
    footerExtra: RegisteredStyle[TextStyle],
    footerWrap: RegisteredStyle[ViewStyle],
    full: RegisteredStyle[ViewStyle],
    headerContent: RegisteredStyle[TextStyle],
    headerContentWrap: RegisteredStyle[ViewStyle],
    headerExtra: RegisteredStyle[TextStyle],
    headerExtraWrap: RegisteredStyle[ViewStyle],
    headerImage: RegisteredStyle[ImageStyle],
    headerTitle: RegisteredStyle[ViewStyle],
    headerWrap: RegisteredStyle[ViewStyle]
  ): AnonBody = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], card = card.asInstanceOf[js.Any], footerContent = footerContent.asInstanceOf[js.Any], footerExtra = footerExtra.asInstanceOf[js.Any], footerWrap = footerWrap.asInstanceOf[js.Any], full = full.asInstanceOf[js.Any], headerContent = headerContent.asInstanceOf[js.Any], headerContentWrap = headerContentWrap.asInstanceOf[js.Any], headerExtra = headerExtra.asInstanceOf[js.Any], headerExtraWrap = headerExtraWrap.asInstanceOf[js.Any], headerImage = headerImage.asInstanceOf[js.Any], headerTitle = headerTitle.asInstanceOf[js.Any], headerWrap = headerWrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBody]
  }
}

