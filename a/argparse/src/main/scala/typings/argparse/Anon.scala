package typings.argparse

import typings.argparse.argparseStrings.ActionConstructorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon extends js.Object {
  @JSName("_")
  var _underscore: ActionConstructorOptions
}

object Anon {
  @scala.inline
  def apply(_underscore: ActionConstructorOptions): Anon = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon]
  }
}

