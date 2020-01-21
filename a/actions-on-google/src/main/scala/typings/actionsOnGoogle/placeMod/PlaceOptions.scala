package typings.actionsOnGoogle.placeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaceOptions extends js.Object {
  /**
    * This is the context for seeking permissions.
    * For example: "To find a place to pick you up"
    * Prompt to user: "*To find a place to pick you up*, I just need to check your location.
    *     Can I get that from Google?".
    * @public
    */
  var context: String
  /**
    * This is the initial response by location sub-dialog.
    * For example: "Where do you want to get picked up?"
    * @public
    */
  var prompt: String
}

object PlaceOptions {
  @scala.inline
  def apply(context: String, prompt: String): PlaceOptions = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], prompt = prompt.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PlaceOptions]
  }
}

