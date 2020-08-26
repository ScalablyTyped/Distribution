package typings.apolloProtobufjs.mod.common

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a google.protobuf.Any message. */
@js.native
trait IAny extends js.Object {
  var bytes: js.UndefOr[Uint8Array] = js.native
  var typeUrl: js.UndefOr[String] = js.native
}

object IAny {
  @scala.inline
  def apply(): IAny = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAny]
  }
  @scala.inline
  implicit class IAnyOps[Self <: IAny] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBytes(value: Uint8Array): Self = this.set("bytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBytes: Self = this.set("bytes", js.undefined)
    @scala.inline
    def setTypeUrl(value: String): Self = this.set("typeUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeUrl: Self = this.set("typeUrl", js.undefined)
  }
  
}

