package typings
package awsDashSdkLib.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tag extends js.Object {
  /**
    * The required name of the tag. The string value can be from 1 to 128 Unicode characters in length.
    */
  var key: TagKey
  /**
    * The optional value of the tag. The string value can be from 1 to 256 Unicode characters in length.
    */
  var value: TagValue
}

object Tag {
  @scala.inline
  def apply(key: TagKey, value: TagValue): Tag = {
    val __obj = js.Dynamic.literal(key = key, value = value)
  
    __obj.asInstanceOf[Tag]
  }
}

