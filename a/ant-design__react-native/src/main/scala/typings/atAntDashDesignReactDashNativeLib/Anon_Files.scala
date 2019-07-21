package typings
package atAntDashDesignReactDashNativeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Files extends js.Object {
  var files: js.Array[scala.Nothing]
  var selectable: scala.Boolean
  def onChange(): scala.Unit
  def onFail(): scala.Unit
}

object Anon_Files {
  @scala.inline
  def apply(
    files: js.Array[scala.Nothing],
    onChange: () => scala.Unit,
    onFail: () => scala.Unit,
    selectable: scala.Boolean
  ): Anon_Files = {
    val __obj = js.Dynamic.literal(files = files, onChange = js.Any.fromFunction0(onChange), onFail = js.Any.fromFunction0(onFail), selectable = selectable)
  
    __obj.asInstanceOf[Anon_Files]
  }
}

