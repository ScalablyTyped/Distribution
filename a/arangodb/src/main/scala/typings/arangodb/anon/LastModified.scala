package typings.arangodb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LastModified extends js.Object {
  var lastModified: Boolean
}

object LastModified {
  @scala.inline
  def apply(lastModified: Boolean): LastModified = {
    val __obj = js.Dynamic.literal(lastModified = lastModified.asInstanceOf[js.Any])
    __obj.asInstanceOf[LastModified]
  }
}

