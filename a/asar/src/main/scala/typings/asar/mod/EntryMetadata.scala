package typings.asar.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntryMetadata extends js.Object {
  var unpacked: Boolean
}

object EntryMetadata {
  @scala.inline
  def apply(unpacked: Boolean): EntryMetadata = {
    val __obj = js.Dynamic.literal(unpacked = unpacked.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EntryMetadata]
  }
}

