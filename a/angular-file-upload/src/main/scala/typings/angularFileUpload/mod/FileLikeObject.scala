package typings.angularFileUpload.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileLikeObject extends js.Object {
  /**
    * Equals File.lastModifiedDate
    */
  var lastModifiedDate: js.Any
  /**
    * Equals File.name
    */
  var name: String
  /**
    * Equals Blob.size, in octet
    */
  var size: Double
  /**
    * Equals Blob.type, in octet
    */
  var `type`: String
}

object FileLikeObject {
  @scala.inline
  def apply(lastModifiedDate: js.Any, name: String, size: Double, `type`: String): FileLikeObject = {
    val __obj = js.Dynamic.literal(lastModifiedDate = lastModifiedDate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileLikeObject]
  }
}

