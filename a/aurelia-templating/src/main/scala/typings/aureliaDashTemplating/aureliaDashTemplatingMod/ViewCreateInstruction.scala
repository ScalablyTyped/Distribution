package typings.aureliaDashTemplating.aureliaDashTemplatingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewCreateInstruction extends js.Object {
  /**
    * Indicates that the view is being created by enhancing existing DOM.
    */
  var enhance: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies a key/value lookup of part replacements for the view being created.
    */
  var partReplacements: js.UndefOr[js.Object] = js.undefined
}

object ViewCreateInstruction {
  @scala.inline
  def apply(enhance: js.UndefOr[Boolean] = js.undefined, partReplacements: js.Object = null): ViewCreateInstruction = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enhance)) __obj.updateDynamic("enhance")(enhance.asInstanceOf[js.Any])
    if (partReplacements != null) __obj.updateDynamic("partReplacements")(partReplacements.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewCreateInstruction]
  }
}

