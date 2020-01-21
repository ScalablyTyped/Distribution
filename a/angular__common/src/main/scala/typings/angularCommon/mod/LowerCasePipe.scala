package typings.angularCommon.mod

import typings.angularCore.mod.PipeTransform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common", "LowerCasePipe")
@js.native
class LowerCasePipe () extends PipeTransform {
  /**
    * @param value The string to transform to lower case.
    */
  def transform(value: String): String = js.native
  /* CompleteClass */
  override def transform(value: js.Any, args: js.Any*): js.Any = js.native
}

