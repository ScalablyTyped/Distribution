package typings.actionsOnGoogle.mod

import typings.actionsOnGoogle.conversationConversationMod.Intent
import typings.actionsOnGoogle.helperHelperMod.HelperOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google", "Helper")
@js.native
class Helper[TIntent /* <: Intent */, TValueSpec] protected ()
  extends typings.actionsOnGoogle.actionssdkMod.Helper[TIntent, TValueSpec] {
  def this(options: HelperOptions[TIntent, TValueSpec]) = this()
}

