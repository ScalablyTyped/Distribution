package typings.atApolloProtobufjs.atApolloProtobufjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToJSONOptions extends js.Object {
  /** Serializes comments. */
  var keepComments: js.UndefOr[Boolean] = js.undefined
}

object IToJSONOptions {
  @scala.inline
  def apply(keepComments: js.UndefOr[Boolean] = js.undefined): IToJSONOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(keepComments)) __obj.updateDynamic("keepComments")(keepComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[IToJSONOptions]
  }
}

