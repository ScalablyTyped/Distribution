package typings.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseRichMod

import typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2RichResponse
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseSuggestionMod.Suggestions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk/conversation/response/rich", "RichResponse")
@js.native
class RichResponse protected () extends GoogleActionsV2RichResponse {
  /**
    * @param items RichResponse items
    * @public
    */
  def this(items: RichResponseItem*) = this()
  /**
    * @param items RichResponse items
    * @public
    */
  def this(items: js.Array[RichResponseItem]) = this()
  /**
    * @param options RichResponse options
    * @public
    */
  def this(options: RichResponseOptions) = this()
  /**
    * Add a RichResponse item
    * @public
    */
  def add(items: RichResponseItem*): this.type = js.native
  /**
    * Adds a single suggestion or list of suggestions to list of items.
    * @public
    */
  def addSuggestion(suggestions: (String | Suggestions)*): this.type = js.native
}

