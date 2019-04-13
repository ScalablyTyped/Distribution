package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tag extends js.Object {
  /**
    * Name of the tag.
    */
  var Key: ObjectKey
  /**
    * Value of the tag.
    */
  var Value: awsDashSdkLib.clientsS3Mod.Value
}

object Tag {
  @scala.inline
  def apply(Key: ObjectKey, Value: Value): Tag = {
    val __obj = js.Dynamic.literal(Key = Key, Value = Value)
  
    __obj.asInstanceOf[Tag]
  }
}

