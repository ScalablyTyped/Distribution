package typings.adone.adoneNs.fsNs.INs.DirectoryNs

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddFileOptions extends js.Object {
  var contents: js.UndefOr[String | Buffer] = js.undefined
  var encoding: js.UndefOr[String] = js.undefined
  var mode: js.UndefOr[Double] = js.undefined
}

object AddFileOptions {
  @scala.inline
  def apply(contents: String | Buffer = null, encoding: String = null, mode: Int | Double = null): AddFileOptions = {
    val __obj = js.Dynamic.literal()
    if (contents != null) __obj.updateDynamic("contents")(contents.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddFileOptions]
  }
}

