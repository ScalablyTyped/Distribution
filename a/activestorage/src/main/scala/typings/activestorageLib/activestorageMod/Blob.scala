package typings
package activestorageLib.activestorageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Blob extends js.Object {
  var byte_size: scala.Double
  var checksum: java.lang.String
  var content_type: java.lang.String
  var filename: java.lang.String
  var signed_id: java.lang.String
}

object Blob {
  @scala.inline
  def apply(
    byte_size: scala.Double,
    checksum: java.lang.String,
    content_type: java.lang.String,
    filename: java.lang.String,
    signed_id: java.lang.String
  ): Blob = {
    val __obj = js.Dynamic.literal(byte_size = byte_size, checksum = checksum, content_type = content_type, filename = filename, signed_id = signed_id)
  
    __obj.asInstanceOf[Blob]
  }
}

