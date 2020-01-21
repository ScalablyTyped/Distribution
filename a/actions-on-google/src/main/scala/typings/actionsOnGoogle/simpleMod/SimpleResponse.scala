package typings.actionsOnGoogle.simpleMod

import typings.actionsOnGoogle.richMod._RichResponseItem
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2SimpleResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk/conversation/response/simple", "SimpleResponse")
@js.native
class SimpleResponse protected ()
  extends _RichResponseItem
     with GoogleActionsV2SimpleResponse {
  def this(options: String) = this()
  /**
    * @param options SimpleResponse options
    * @public
    */
  def this(options: SimpleResponseOptions) = this()
}

