package typings.awsDashSdk.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tag extends js.Object {
  /**
    * The required name of the tag. The string value can be from 1 to 128 Unicode characters in length.
    */
  var key: TagKey = js.native
  /**
    * The optional value of the tag. The string value can be from 1 to 256 Unicode characters in length.
    */
  var value: TagValue = js.native
}

object Tag {
  @scala.inline
  def apply(key: TagKey, value: TagValue): Tag = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Tag]
  }
}

