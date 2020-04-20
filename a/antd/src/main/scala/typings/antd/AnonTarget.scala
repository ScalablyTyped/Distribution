package typings.antd

import typings.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTarget extends js.Object {
  var target: js.Function0[
    (Window_ with (/* import warning: importer.ImportType#apply Failed type conversion: typeof globalThis */ js.Any)) | Null
  ]
}

object AnonTarget {
  @scala.inline
  def apply(
    target: () => (Window_ with (/* import warning: importer.ImportType#apply Failed type conversion: typeof globalThis */ js.Any)) | Null
  ): AnonTarget = {
    val __obj = js.Dynamic.literal(target = js.Any.fromFunction0(target))
    __obj.asInstanceOf[AnonTarget]
  }
}

