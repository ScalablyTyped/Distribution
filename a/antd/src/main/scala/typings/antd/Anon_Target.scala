package typings.antd

import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Target extends js.Object {
  var target: js.Function0[
    (Window with (/* import warning: importer.ImportType#apply Failed type conversion: typeof globalThis */ js.Any)) | Null
  ]
}

object Anon_Target {
  @scala.inline
  def apply(
    target: () => (Window with (/* import warning: importer.ImportType#apply Failed type conversion: typeof globalThis */ js.Any)) | Null
  ): Anon_Target = {
    val __obj = js.Dynamic.literal(target = js.Any.fromFunction0(target))
  
    __obj.asInstanceOf[Anon_Target]
  }
}

