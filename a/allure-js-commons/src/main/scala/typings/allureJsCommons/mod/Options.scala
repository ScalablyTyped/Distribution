package typings.allureJsCommons.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var targetDir: String
}

object Options {
  @scala.inline
  def apply(targetDir: String): Options = {
    val __obj = js.Dynamic.literal(targetDir = targetDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

