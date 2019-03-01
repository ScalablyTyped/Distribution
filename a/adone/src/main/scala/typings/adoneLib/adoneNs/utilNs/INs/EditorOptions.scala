package typings
package adoneLib.adoneNs.utilNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorOptions extends js.Object {
  var editor: js.UndefOr[java.lang.String] = js.undefined
  var ext: js.UndefOr[java.lang.String] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object EditorOptions {
  @scala.inline
  def apply(
    editor: java.lang.String = null,
    ext: java.lang.String = null,
    path: java.lang.String = null,
    text: java.lang.String = null
  ): EditorOptions = {
    val __obj = js.Dynamic.literal()
    if (editor != null) __obj.updateDynamic("editor")(editor)
    if (ext != null) __obj.updateDynamic("ext")(ext)
    if (path != null) __obj.updateDynamic("path")(path)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[EditorOptions]
  }
}

