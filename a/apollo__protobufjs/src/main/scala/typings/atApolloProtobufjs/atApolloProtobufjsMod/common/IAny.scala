package typings.atApolloProtobufjs.atApolloProtobufjsMod.common

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a google.protobuf.Any message. */
trait IAny extends js.Object {
  var bytes: js.UndefOr[Uint8Array] = js.undefined
  var typeUrl: js.UndefOr[String] = js.undefined
}

object IAny {
  @scala.inline
  def apply(bytes: Uint8Array = null, typeUrl: String = null): IAny = {
    val __obj = js.Dynamic.literal()
    if (bytes != null) __obj.updateDynamic("bytes")(bytes.asInstanceOf[js.Any])
    if (typeUrl != null) __obj.updateDynamic("typeUrl")(typeUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAny]
  }
}

