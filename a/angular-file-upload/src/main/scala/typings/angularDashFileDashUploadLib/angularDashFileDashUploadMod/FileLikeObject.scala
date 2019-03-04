package typings
package angularDashFileDashUploadLib.angularDashFileDashUploadMod

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
  var name: java.lang.String
  /**
    * Equals Blob.size, in octet
    */
  var size: scala.Double
  /**
    * Equals Blob.type, in octet
    */
  var `type`: java.lang.String
}

object FileLikeObject {
  @scala.inline
  def apply(lastModifiedDate: js.Any, name: java.lang.String, size: scala.Double, `type`: java.lang.String): FileLikeObject = {
    val __obj = js.Dynamic.literal(lastModifiedDate = lastModifiedDate, name = name, size = size)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[FileLikeObject]
  }
}

