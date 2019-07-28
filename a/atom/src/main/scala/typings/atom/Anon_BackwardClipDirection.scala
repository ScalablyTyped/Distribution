package typings.atom

import typings.atom.atomStrings.backward
import typings.atom.atomStrings.closest
import typings.atom.atomStrings.forward
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackwardClipDirection extends js.Object {
  var clipDirection: backward | forward | closest
}

object Anon_BackwardClipDirection {
  @scala.inline
  def apply(clipDirection: backward | forward | closest): Anon_BackwardClipDirection = {
    val __obj = js.Dynamic.literal(clipDirection = clipDirection.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_BackwardClipDirection]
  }
}

