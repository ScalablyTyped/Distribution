package typings.arangodb.ArangoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateMetadata extends DocumentMetadata {
  var _oldRev: String = js.native
}

object UpdateMetadata {
  @scala.inline
  def apply(_id: String, _key: String, _oldRev: String, _rev: String): UpdateMetadata = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _key = _key.asInstanceOf[js.Any], _oldRev = _oldRev.asInstanceOf[js.Any], _rev = _rev.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMetadata]
  }
  @scala.inline
  implicit class UpdateMetadataOps[Self <: UpdateMetadata] (val x: Self) extends AnyVal {
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
    def set_oldRev(value: String): Self = this.set("_oldRev", value.asInstanceOf[js.Any])
  }
  
}

