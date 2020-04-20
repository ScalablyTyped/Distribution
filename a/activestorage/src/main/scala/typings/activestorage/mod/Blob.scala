package typings.activestorage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Blob extends js.Object {
  var byte_size: Double
  var checksum: String
  var content_type: String
  var filename: String
  var signed_id: String
}

object Blob {
  @scala.inline
  def apply(byte_size: Double, checksum: String, content_type: String, filename: String, signed_id: String): Blob = {
    val __obj = js.Dynamic.literal(byte_size = byte_size.asInstanceOf[js.Any], checksum = checksum.asInstanceOf[js.Any], content_type = content_type.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], signed_id = signed_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Blob]
  }
}

