package typings.adone.adoneNs.utilNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorOptions extends js.Object {
  var editor: js.UndefOr[String] = js.undefined
  var ext: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object EditorOptions {
  @scala.inline
  def apply(editor: String = null, ext: String = null, path: String = null, text: String = null): EditorOptions = {
    val __obj = js.Dynamic.literal()
    if (editor != null) __obj.updateDynamic("editor")(editor)
    if (ext != null) __obj.updateDynamic("ext")(ext)
    if (path != null) __obj.updateDynamic("path")(path)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[EditorOptions]
  }
}

