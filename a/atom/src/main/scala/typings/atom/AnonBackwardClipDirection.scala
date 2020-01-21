package typings.atom

import typings.atom.atomStrings.backward
import typings.atom.atomStrings.closest
import typings.atom.atomStrings.forward
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBackwardClipDirection extends js.Object {
  var clipDirection: backward | forward | closest
}

object AnonBackwardClipDirection {
  @scala.inline
  def apply(clipDirection: backward | forward | closest): AnonBackwardClipDirection = {
    val __obj = js.Dynamic.literal(clipDirection = clipDirection.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBackwardClipDirection]
  }
}

