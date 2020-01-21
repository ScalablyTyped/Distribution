package typings.arangodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLastModified extends js.Object {
  var lastModified: Boolean
}

object AnonLastModified {
  @scala.inline
  def apply(lastModified: Boolean): AnonLastModified = {
    val __obj = js.Dynamic.literal(lastModified = lastModified.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLastModified]
  }
}

