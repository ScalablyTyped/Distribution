package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorDocument extends js.Object {
  /**
    * The object key name to use when a 4XX class error occurs.
    */
  var Key: ObjectKey
}

object ErrorDocument {
  @scala.inline
  def apply(Key: ObjectKey): ErrorDocument = {
    val __obj = js.Dynamic.literal(Key = Key)
  
    __obj.asInstanceOf[ErrorDocument]
  }
}

