package typings
package adoneLib.adoneNs.fsNs.INs.DirectoryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddFileOptions extends js.Object {
  var contents: js.UndefOr[java.lang.String | nodeLib.Buffer] = js.undefined
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  var mode: js.UndefOr[scala.Double] = js.undefined
}

object AddFileOptions {
  @scala.inline
  def apply(
    contents: java.lang.String | nodeLib.Buffer = null,
    encoding: java.lang.String = null,
    mode: scala.Int | scala.Double = null
  ): AddFileOptions = {
    val __obj = js.Dynamic.literal()
    if (contents != null) __obj.updateDynamic("contents")(contents.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddFileOptions]
  }
}

