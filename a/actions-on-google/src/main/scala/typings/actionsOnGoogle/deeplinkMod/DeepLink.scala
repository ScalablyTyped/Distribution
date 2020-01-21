package typings.actionsOnGoogle.deeplinkMod

import typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotLINK
import typings.actionsOnGoogle.helperHelperMod.Helper
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2LinkValueSpec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/deeplink", "DeepLink")
@js.native
class DeepLink protected () extends Helper[actionsDotintentDotLINK, GoogleActionsV2LinkValueSpec] {
  /**
    * @param options DeepLink options
    * @deprecated
    * @public
    */
  def this(options: DeepLinkOptions) = this()
}

